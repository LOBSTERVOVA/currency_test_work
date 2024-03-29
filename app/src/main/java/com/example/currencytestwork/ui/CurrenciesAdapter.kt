package com.example.currencytestwork.ui

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.currencytestwork.R
import com.example.currencytestwork.databinding.CurrencyElementBinding
import com.example.currencytestwork.domain.entity.CurrencyModel

class CurrenciesAdapter(var currencyModel: CurrencyModel?) : RecyclerView.Adapter<AdapterViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterViewHolder {
        val binding = CurrencyElementBinding.inflate(LayoutInflater.from(parent.context))
        return AdapterViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return currencyModel?.currencies?.size ?: 0
    }

    override fun onBindViewHolder(holder: AdapterViewHolder, position: Int) {
        if (currencyModel==null)return
        with(holder.binding){
            charName.text = "${currencyModel!!.currencies[position].Nominal} ${currencyModel!!.currencies[position].CharCode}"
            fullname.text = currencyModel!!.currencies[position].Name
            value.text = currencyModel!!.currencies[position].Value.toString()
            Log.d("Comparing n/o", "${currencyModel!!.currencies[position].Value!!} ${currencyModel!!.currencies[position].Previous!!}")
            if(currencyModel!!.currencies[position].Value!!>=currencyModel!!.currencies[position].Previous!!){
                Glide.with(trendImage.context)
                    .load(R.drawable.arrow_up)
                    .into(trendImage)
            } else {
                Glide.with(trendImage.context)
                    .load(R.drawable.arrow_down)
                    .into(trendImage)
            }
        }
    }

    fun refresh(newCurrencyModel: CurrencyModel?){
        if (newCurrencyModel==null)return
        currencyModel = newCurrencyModel
        notifyItemRangeChanged(0, newCurrencyModel.currencies.size)
    }

}

class AdapterViewHolder(val binding: CurrencyElementBinding) : RecyclerView.ViewHolder(binding.root)