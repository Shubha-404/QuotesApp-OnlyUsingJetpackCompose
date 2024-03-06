package com.example.quotesonlyusingjetpackcompose

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import com.example.quotesonlyusingjetpackcompose.models.Quote
import com.google.gson.Gson

object DataManager {


    //Process to use json file in app
    //Read the json file
    var currentQuote : Quote? = null
    var data = emptyArray<Quote>()
    var isDataLoaded= mutableStateOf(false)
    fun loadAssetsFromFile(context: Context){
        val inputStream = context.assets.open("quotes.json")  //access the "quotes.json" file from the assets folder & open that
        val size: Int=inputStream.available()   //retrives number of bytes available in the input stream
        val buffer=ByteArray(size)  //size of the input stream
        inputStream.read(buffer)    //reads the content of the file into the byte array
        inputStream.close()         //close the input stream
        var json=String(buffer,Charsets.UTF_8)  //the byte array i.e buffer, is converted to string using the UTF_8 char set
        var gson = Gson()   //Gson class is created
        data= gson.fromJson(json, Array<Quote>::class.java) //the result is assigned to the variable "data"
        isDataLoaded.value=true
    }



    var currentScreen = mutableStateOf(ScreenState.QUOTELISTSCREEN)
    fun switchScreen(q: Quote?){
        if(currentScreen.value == ScreenState.QUOTELISTSCREEN){
            currentQuote=q
            currentScreen.value = ScreenState.QUOTEDETAILSSCREEN
        }
        else{
            currentScreen.value = ScreenState.QUOTELISTSCREEN
        }
    }
}