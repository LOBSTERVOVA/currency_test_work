package com.example.currencytestwork.data.entity

import com.example.currencytestwork.data.entity.Valute
import com.google.gson.annotations.SerializedName


data class Entity(

    @SerializedName("Date") var Date: String? = null,
    @SerializedName("PreviousDate") var PreviousDate: String? = null,
    @SerializedName("PreviousURL") var PreviousURL: String? = null,
    @SerializedName("Timestamp") var Timestamp: String? = null,
    @SerializedName("Valute") var Valute: Valute = Valute()

)