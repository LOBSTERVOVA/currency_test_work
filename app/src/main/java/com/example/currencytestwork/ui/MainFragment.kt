package com.example.currencytestwork.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.currencytestwork.databinding.FragmentMainBinding
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.Locale

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentMainBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this@MainFragment)[MainViewModel::class.java]
        binding.recycler.layoutManager = LinearLayoutManager(requireContext())
        binding.recycler.adapter = viewModel.adapter
        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.currencyModel.collect{
                Log.d("CURRENCY MODEL", it?.currencies?.get(0).toString() ?: "null")
                if(it==null)return@collect
                viewModel.adapter.refresh(it)
            }
        }
        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.error.collect{
                if(it==true){
                    //error
                    Log.d("LoadResult", "FAILED")
                    Toast.makeText(requireContext(), "Check your internet connection", Toast.LENGTH_LONG).show()
                    binding.progressBar.visibility = View.GONE
                    binding.refresh.visibility = View.VISIBLE
                    binding.refresh.setOnClickListener {
                        binding.refresh.visibility = View.GONE
                        viewModel.infiniteGetModel()
                    }
                } else if(it==null){
                    //loading
                    Log.d("LoadResult", "LOADING...")
                    binding.progressBar.visibility = View.VISIBLE
                } else {
                    //it is ok
                    binding.progressBar.visibility = View.GONE
                    val timeInMillis = System.currentTimeMillis()
                    val dateFormat = SimpleDateFormat("yyyy:MM:dd HH:mm", Locale.getDefault())
                    val formattedDate = dateFormat.format(timeInMillis)
                    binding.time.text = formattedDate
                    Log.d("LoadResult", "success")
                }
            }
        }
        return binding.root
    }

}