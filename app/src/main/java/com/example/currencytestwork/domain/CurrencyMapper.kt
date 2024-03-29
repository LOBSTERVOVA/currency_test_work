package com.example.currencytestwork.domain

import android.util.Log
import com.example.currencytestwork.data.entity.CommonCurrencyInfo
import com.example.currencytestwork.domain.entity.CurrencyModel
import com.example.currencytestwork.data.entity.Entity

class CurrencyMapper {
    fun convert(entity: Entity): CurrencyModel {
        val valutes = entity.Valute
        Log.d("Convertion", "started")
        val list: List<CommonCurrencyInfo> = listOf(
            valutes.AED,
            valutes.AMD,
            valutes.AUD,
            valutes.AZN,
            valutes.BGN,
            valutes.BRL,
            valutes.BYN,
            valutes.CAD,
            valutes.CHF,
            valutes.CNY,
            valutes.CZK,
            valutes.DKK,
            valutes.EGP,
            valutes.EUR,
            valutes.GBP,
            valutes.GEL,
            valutes.HKD,
            valutes.HUF,
            valutes.IDR,
            valutes.INR,
            valutes.JPY,
            valutes.KGS,
            valutes.KRW,
            valutes.KZT,
            valutes.MDL,
            valutes.NOK,
            valutes.NZD,
            valutes.PLN,
            valutes.QAR,
            valutes.RON,
            valutes.RSD,
            valutes.SEK,
            valutes.SGD,
            valutes.THB,
            valutes.TJS,
            valutes.TMT,
            valutes.TRY,
            valutes.UAH,
            valutes.USD,
            valutes.UZS,
            valutes.VND,
            valutes.XDR,
            valutes.ZAR
            )

        return CurrencyModel(
            date = entity.Date,
            previousDate = entity.PreviousDate,
            previousURL = entity.PreviousURL,
            timestamp = entity.Timestamp,
            currencies = list
        )
    }
}