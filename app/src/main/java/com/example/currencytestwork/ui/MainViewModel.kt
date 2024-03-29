package com.example.currencytestwork.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.currencytestwork.data.network.RetrofitServices
import com.example.currencytestwork.domain.CurrencyMapper
import com.example.currencytestwork.domain.entity.CurrencyModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val _currencyModel = MutableStateFlow<CurrencyModel?>(null)
    val currencyModel: Flow<CurrencyModel?> = _currencyModel
    private val _error = MutableStateFlow<Boolean?>(false)
    val error: Flow<Boolean?> = _error
    val adapter = CurrenciesAdapter(null)

    init {
        infiniteGetModel()
    }

    fun infiniteGetModel() {
        Log.d("infiniteGetModel", "STARTED")
        viewModelScope.launch {
            var a = 0
            do{
                if (getModel()) {
                    _error.value = false
                    delay(30_000)
                } else {
                    _error.value = true
                    a = 1
                }
            }while (a==0)
            Log.d("infiniteGetModel", "ENDED")
        }
    }

    suspend fun getModel(): Boolean {
        Log.d("getModel()", "STARTED")
        return try {
            _error.value = null
            val response = RetrofitServices.currencyApi.getCurrencies()
            if (response.isSuccessful) {
                val entity = response.body()
                _currencyModel.value = null
                delay(100)
                _currencyModel.value = CurrencyMapper().convert(entity!!)
                Log.d("getModel()", "SUCCESSED")
                true
            } else {
                Log.d("Error occured", response.errorBody().toString())
                false
            }
        } catch (e: Exception) {
            Log.d("Error catched", e.toString())
            false
        }
    }
}