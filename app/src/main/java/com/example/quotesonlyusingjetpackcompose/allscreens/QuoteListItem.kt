package com.example.quotesonlyusingjetpackcompose.allscreens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
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
import com.example.quotesonlyusingjetpackcompose.models.Quote



@Composable
fun QuoteListItem(q: Quote, onClick: (q: Quote) -> Unit) {
    Card(
        elevation = CardDefaults.cardElevation(100.dp),
        shape = MaterialTheme.shapes.medium,
        border = BorderStroke(
            1.dp,
            Brush.sweepGradient(
                colors = listOf(
                    Color(100, 100, 255),
                    Color(255, 100, 150),
                )
            )),
        modifier = Modifier
            .padding(10.dp)
            .clickable { onClick(q) }
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .background(Color.White)
                .padding(all = 5.dp)
        ) {
            Image(
                imageVector = Icons.Filled.Create,
                colorFilter = ColorFilter.tint(Color(153,0,200)),
                contentDescription = "",
                alignment = Alignment.CenterStart,
                modifier = Modifier
                    .size(40.dp)
                    .rotate(0F)
            )

            //Spacer is used to give space between items----> I can also use padding instead of Spacer
            Spacer(modifier = Modifier
                .padding(10.dp)
            )

            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .weight(1f)
            ) {
                Text(
                    text = q.quote,
                    style = MaterialTheme.typography.titleMedium,
                    fontSize = 20.sp,
                    color = Color(0,0,0),
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
                    text = q.author,
                    style = MaterialTheme.typography.titleSmall,
                    fontStyle = FontStyle.Italic,
                    fontSize = 15.sp,
                    color = Color(0,0,0),
                    modifier = Modifier
                        .padding(top = 8.dp)

                )
            }
        }
    }
}




