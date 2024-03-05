package com.example.quotesonlyusingjetpackcompose.allscreens

import android.graphics.Paint.Style
import android.icu.text.TimeZoneFormat
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quotesonlyusingjetpackcompose.models.Quote

@Composable
fun QuoteListScreen(data: Array<Quote>, onClick: () -> Unit) {
    Column(
        modifier = Modifier
            .background(Color(255,255,255))
    ) {
        Text(
            text = "Quotes App",
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            color = Color(153,0,200),
            fontWeight = FontWeight(700),
            modifier = Modifier
                .padding(top = 2.dp, bottom = 6.dp, start = 5.dp, end = 5.dp)
                .fillMaxWidth(1f)

        )
        QuoteList(data = data) {
            onClick()
        }

    }
}