package com.example.currencytestwork.data.entity

import com.example.example.AMD
import com.example.example.AUD
import com.example.example.AZN
import com.example.example.BGN
import com.example.example.BRL
import com.example.example.BYN
import com.example.example.CAD
import com.example.example.CHF
import com.example.example.CNY
import com.example.example.CZK
import com.example.example.DKK
import com.example.example.EGP
import com.example.example.EUR
import com.example.example.GBP
import com.example.example.GEL
import com.example.example.HKD
import com.example.example.HUF
import com.example.example.IDR
import com.example.example.INR
import com.example.example.JPY
import com.example.example.KGS
import com.example.example.KRW
import com.example.example.KZT
import com.example.example.MDL
import com.example.example.NOK
import com.example.example.NZD
import com.example.example.PLN
import com.example.example.QAR
import com.example.example.RON
import com.example.example.RSD
import com.example.example.SEK
import com.example.example.SGD
import com.example.example.THB
import com.example.example.TJS
import com.example.example.TMT
import com.example.example.TRY
import com.example.example.UAH
import com.example.example.USD
import com.example.example.UZS
import com.example.example.VND
import com.example.example.XDR
import com.example.example.ZAR
import com.google.gson.annotations.SerializedName


data class Valute (
  @SerializedName("AUD" ) var AUD : AUD = AUD(),
  @SerializedName("AZN" ) var AZN : AZN = AZN(),
  @SerializedName("GBP" ) var GBP : GBP = GBP(),
  @SerializedName("AMD" ) var AMD : AMD = AMD(),
  @SerializedName("BYN" ) var BYN : BYN = BYN(),
  @SerializedName("BGN" ) var BGN : BGN = BGN(),
  @SerializedName("BRL" ) var BRL : BRL = BRL(),
  @SerializedName("HUF" ) var HUF : HUF = HUF(),
  @SerializedName("VND" ) var VND : VND = VND(),
  @SerializedName("HKD" ) var HKD : HKD = HKD(),
  @SerializedName("GEL" ) var GEL : GEL = GEL(),
  @SerializedName("DKK" ) var DKK : DKK = DKK(),
  @SerializedName("AED" ) var AED : AED = AED(),
  @SerializedName("USD" ) var USD : USD = USD(),
  @SerializedName("EUR" ) var EUR : EUR = EUR(),
  @SerializedName("EGP" ) var EGP : EGP = EGP(),
  @SerializedName("INR" ) var INR : INR = INR(),
  @SerializedName("IDR" ) var IDR : IDR = IDR(),
  @SerializedName("KZT" ) var KZT : KZT = KZT(),
  @SerializedName("CAD" ) var CAD : CAD = CAD(),
  @SerializedName("QAR" ) var QAR : QAR = QAR(),
  @SerializedName("KGS" ) var KGS : KGS = KGS(),
  @SerializedName("CNY" ) var CNY : CNY = CNY(),
  @SerializedName("MDL" ) var MDL : MDL = MDL(),
  @SerializedName("NZD" ) var NZD : NZD = NZD(),
  @SerializedName("NOK" ) var NOK : NOK = NOK(),
  @SerializedName("PLN" ) var PLN : PLN = PLN(),
  @SerializedName("RON" ) var RON : RON = RON(),
  @SerializedName("XDR" ) var XDR : XDR = XDR(),
  @SerializedName("SGD" ) var SGD : SGD = SGD(),
  @SerializedName("TJS" ) var TJS : TJS = TJS(),
  @SerializedName("THB" ) var THB : THB = THB(),
  @SerializedName("TRY" ) var TRY : TRY = TRY(),
  @SerializedName("TMT" ) var TMT : TMT = TMT(),
  @SerializedName("UZS" ) var UZS : UZS = UZS(),
  @SerializedName("UAH" ) var UAH : UAH = UAH(),
  @SerializedName("CZK" ) var CZK : CZK = CZK(),
  @SerializedName("SEK" ) var SEK : SEK = SEK(),
  @SerializedName("CHF" ) var CHF : CHF = CHF(),
  @SerializedName("RSD" ) var RSD : RSD = RSD(),
  @SerializedName("ZAR" ) var ZAR : ZAR = ZAR(),
  @SerializedName("KRW" ) var KRW : KRW = KRW(),
  @SerializedName("JPY" ) var JPY : JPY = JPY()
)