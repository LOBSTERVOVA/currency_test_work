package com.example.example

import com.example.currencytestwork.data.entity.CommonCurrencyInfo
import com.google.gson.annotations.SerializedName


data class AMD(
    @SerializedName("ID") override var ID: String? = null,
    @SerializedName("NumCode") override var NumCode: String? = null,
    @SerializedName("CharCode") override var CharCode: String? = null,
    @SerializedName("Nominal") override var Nominal: Int? = null,
    @SerializedName("Name") override var Name: String? = null,
    @SerializedName("Value") override var Value: Double? = null,
    @SerializedName("Previous") override var Previous: Double? = null
): CommonCurrencyInfo