package com.example.currencytestwork.domain.entity

import com.example.currencytestwork.data.entity.CommonCurrencyInfo

data class CurrencyModel(
    var date: String? = null,
    var previousDate: String? = null,
    var previousURL: String? = null,
    var timestamp: String? = null,
    var currencies: List<CommonCurrencyInfo>
)
