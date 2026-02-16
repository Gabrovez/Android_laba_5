package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun TitleBlock() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Пример Compose-приложения",
            fontSize = 16.sp
        )
        Text(
            text = "Row, Column, Size, ARGB",
            fontSize = 14.sp
        )
    }
}
@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TitleBlock()

        Spacer(modifier = Modifier.height(32.dp))

        ColorRow()

        Spacer(modifier = Modifier.height(32.dp))

        CombinedBlock()
    }
}

@Composable
fun ColorRow() {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        ColorBox(color = Color(0xFFFF0000))
        ColorBox(color = Color(0xFF00FF00))
        ColorBox(color = Color(0x806969D9))
    }
}

@Composable
fun ColorBox(color: Color) {
    Box(
        modifier = Modifier
            .size(100.dp)
            .background(color)
    )
}

@Composable
fun CombinedBlock() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFC0C0C0))
            .padding(8.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(text = "Левая колонка")
                Text(text = "Текст 1")
            }
            Column(horizontalAlignment = Alignment.End) {
                Text(text = "Правая колонка")
                Text(text = "Текст 2")
            }
        }
    }
}




//Scaffold(
//                topBar = {
//                    TopAppBar(
//                        title = { Text(text = "Scaffold example")}
//                    )
//                },
//                floatingActionButton = {
//                    FloatingActionButton(onClick = {}) {
//                        Text(text = "+")
//                    }
//                }
//            ) {paddingValues ->
//                Column(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .padding(paddingValues),
//                    verticalArrangement = Arrangement.Center,
//                    horizontalAlignment = Alignment.CenterHorizontally
//                ) {
//                    Text(text = "Основное содержиоме экрана")
//                }
//
//            }




//Column(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .background(Color.White)
//                    .padding(16.dp),
//                verticalArrangement = Arrangement.SpaceEvenly,
//                horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//                Box(
//                    modifier = Modifier
//                        .size(100.dp)
//                        .background(Color(0xFFFF0000))
//                )
//                Box(
//                    modifier = Modifier
//                        .size(100.dp)
//                        .background(Color(0x80FF0000))
//                )
//
//            }


//
//            val symbols = "Hello world!".filter {it.isLetter()}
//            Column(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .background(color = Color.Green)
//                    .padding(8.dp),
//                verticalArrangement = Arrangement.SpaceEvenly,
//                horizontalAlignment = Alignment.CenterHorizontally
//            ){
//                Row(
//                    modifier = Modifier.fillMaxWidth(),
//                    horizontalArrangement = Arrangement.SpaceEvenly
//                ) {
//                    for(char in symbols){
//                        Text(
//                            text = char.toString(),
//                            fontWeight = FontWeight.ExtraBold,
//                            color = Color.Blue,
//                            fontSize = 20.sp,
//                            letterSpacing = 24.sp
//                        )
//                    }
//                }
//                Spacer(modifier = Modifier.height(16.dp))
//                Row(
//                    modifier = Modifier.fillMaxWidth(),
//                    horizontalArrangement = Arrangement.SpaceEvenly
//                ) {
//                    for(char in symbols.reversed()){
//                        Text(
//                            text = char.toString(),
//                            fontWeight = FontWeight.ExtraBold,
//                            color = Color.Red,
//                            fontSize = 20.sp,
//                            letterSpacing = 24.sp
//                        )
//                    }
//                }
//            }