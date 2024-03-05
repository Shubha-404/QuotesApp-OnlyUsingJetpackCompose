package com.example.quotesonlyusingjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.quotesonlyusingjetpackcompose.allscreens.QuoteListScreen
import com.example.quotesonlyusingjetpackcompose.ui.theme.QuotesOnlyUsingJetpackComposeTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Background Thread
        CoroutineScope(Dispatchers.IO).launch {
            delay(1500)
            DataManager.loadAssetsFromFile(applicationContext)
        }

        //Mail Thread
//        DataManager.loadAssetsFromFile(this)

        setContent {
            QuotesOnlyUsingJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    app()
                }
            }
        }
    }
}

@Preview
@Composable
fun app(){
    if(DataManager.isDataLoaded.value){
        QuoteListScreen(data = DataManager.data) {

        }
    }
    else{
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.background(Color.White)
        ) {
            Text(
                text = "Loading...",
                fontSize = 25.sp,
                color = Color(0,0,0),
                fontWeight = FontWeight(300),
                )
        }
    }
}
