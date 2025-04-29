package br.edu.ifsp.scl.sdm.currencyconverter.model.api

import br.edu.ifsp.scl.sdm.currencyconverter.model.domain.ConversionResult
import br.edu.ifsp.scl.sdm.currencyconverter.model.domain.CurrencyList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface CurrencyConverterApiService {
    @Headers(
        "X-RapidAPI-Host: currency-converter5.p.rapidapi.com",
        "X-RapidAPI-Key: e434c38802mshbd8157ed242f797p186831jsn08599618c10e"
    )
    @GET("list")
    fun getCurrencies(): Call<CurrencyList>

    @Headers(
        "X-RapidAPI-Host: currency-converter5.p.rapidapi.com",
        "X-RapidAPI-Key: e434c38802mshbd8157ed242f797p186831jsn08599618c10e"
    )
    @GET("convert")
    fun convert(
        @Query("from") from: String,
        @Query("to") to: String,
        @Query("amount") amount: String
    ): Call<ConversionResult>
}