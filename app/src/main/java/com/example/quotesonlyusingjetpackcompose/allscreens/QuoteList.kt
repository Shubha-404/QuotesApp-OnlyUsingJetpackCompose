package com.example.quotesonlyusingjetpackcompose.allscreens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.quotesonlyusingjetpackcompose.models.Quote


@Composable
fun QuoteList(data: Array<Quote>, onClick : ()-> Unit) {
    LazyColumn(content = {
        items(data){
            QuoteListItem(q = it) {
                onClick()
            }
        }
    })

}