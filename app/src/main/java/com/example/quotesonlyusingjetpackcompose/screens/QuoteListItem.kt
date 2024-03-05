package com.example.quotesonlyusingjetpackcompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quotesonlyusingjetpackcompose.R


@Composable
fun QuoteListItem() {
    Card(
//        elevation  = 4.dp,
        modifier = Modifier
            .padding(all = 8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(16.dp)
        ) {
            Image(
                imageVector = Icons.Filled.Favorite,
                contentDescription = "",
                alignment = Alignment.CenterStart,
                modifier = Modifier
                    .size(40.dp)
                    .rotate(0F)
                    .background(Color(0, 0, 0, 1))
            )

            //Spacer is used to give space between items----> I can also use padding instead of Spacer
            Spacer(modifier = Modifier.padding(10.dp))

            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "Life is a race not a journey.",
                    style = MaterialTheme.typography.titleMedium,
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(bottom = 8.dp)
                    )
                Box(
                    modifier = Modifier
                        .background(Color(0, 0, 0))
                        .fillMaxWidth(0.5f)
                        .height(1.dp)
                )
                Text(
                    text = "Rana",
                    style = MaterialTheme.typography.titleSmall,
                    fontStyle = FontStyle.Italic,
                    fontSize = 15.sp,
                    modifier = Modifier
                        .padding(top = 8.dp)

                )
            }
        }
    }
}

@Preview(showSystemUi = false, showBackground = true)
@Composable
fun QuoteDetails() {
    Column{
        Text(
            text = "Testing Font ojuju",
            fontFamily = FontFamily(Font(R.font.ojuju)),
            fontSize = 40.sp,
            color = Color(0,55,255),
            fontWeight = FontWeight(700)
        )
        Text(
            text = "Testing Font swirly",
            fontFamily = FontFamily(Font(R.font.swirly)) ,
            fontSize = 40.sp,
            color = Color(255,55,155),
            fontWeight = FontWeight(400)
        )
    }

}