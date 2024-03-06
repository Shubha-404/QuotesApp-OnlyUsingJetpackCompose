package com.example.quotesonlyusingjetpackcompose.allscreens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quotesonlyusingjetpackcompose.DataManager
import com.example.quotesonlyusingjetpackcompose.models.Quote

@Composable
fun QuoteDetails(q : Quote) {
    BackHandler {
        DataManager.switchScreen(null)
    }
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth(1f)
            .background(
                Brush.sweepGradient(
                    colors = listOf(
                        Color(255, 150, 200),
                        Color(255, 255, 255),
                        Color(200, 200, 255),
                    )
                )
            )
    ){
        Card(
            elevation = CardDefaults.cardElevation(100.dp),
            shape = MaterialTheme.shapes.medium,
            border = BorderStroke(
                1.8.dp,
                Brush.sweepGradient(
                    colors = listOf(
                        Color(100, 100, 255),
                        Color(255, 100, 150),
                    )
            )),

            modifier = Modifier
                .padding(36.dp)

        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .background(Color.Black)
                    .padding(16.dp, 24.dp)
            ) {
                Image(
                    imageVector = Icons.Filled.FavoriteBorder,
                    contentDescription = "",
                    alignment = Alignment.CenterStart,
                    colorFilter = ColorFilter.tint(Color(200,50,150)),
                    modifier = Modifier
                        .size(40.dp)
                        .rotate(0F)
                        .background(Color(0, 0, 0, 1))
                )

                //Spacer is used to give space between items----> I can also use padding instead of Spacer
                Spacer(modifier = Modifier.padding(10.dp))

                Column(
                ) {
                    Text(
                        text = q.quote,
                        style = MaterialTheme.typography.titleMedium,
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(bottom = 8.dp)
                    )
                    Text(
                        text = q.author,
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

}
