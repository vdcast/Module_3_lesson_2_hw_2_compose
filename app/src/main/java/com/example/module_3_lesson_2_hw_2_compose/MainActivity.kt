package com.example.module_3_lesson_2_hw_2_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.module_3_lesson_2_hw_2_compose.ui.theme.Module_3_Lesson_2_hw_2_ComposeTheme
import com.example.module_3_lesson_2_hw_2_compose.ui.theme.Pink40
import com.example.module_3_lesson_2_hw_2_compose.ui.theme.Pink50
import com.example.module_3_lesson_2_hw_2_compose.ui.theme.PurpleGrey40

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Module_3_Lesson_2_hw_2_ComposeTheme {

                MainScreen()


            }
        }
    }
}


@Composable
fun MainScreen() {
    
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        // Top Bar text
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
                .background(Pink50),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Photo Filters", style = TextStyle(fontSize = 20.sp))
        }

        // Main image full view
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Pink40),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.husqvarna_ee_5_800x600),
                contentDescription = "Main image",
                modifier = Modifier.scale(0.95f)
            )
        }

        // Preview of images with filters
        Row(
            modifier = Modifier
                .horizontalScroll(rememberScrollState())
                .wrapContentHeight()
//                .weight(1f)
                .background(PurpleGrey40),

        ) {
            Column(
                modifier = Modifier
                    .padding(all = 8.dp)
                    .size(160.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround
            ) {
                Image(
                    painter = painterResource(id = R.drawable.husqvarna_ee_5_800x600),
                    contentDescription = "Preview 1"
                )
                Text(text = "Original")
            }
            Column(
                modifier = Modifier
                    .padding(all = 8.dp)
                    .size(160.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround
            ) {
                Image(
                    painter = painterResource(id = R.drawable.husqvarna_ee_5_800x600),
                    contentDescription = "Preview 2"
                )
                Text(text = "ColorShift")
            }
            Column(
                modifier = Modifier
                    .padding(all = 8.dp)
                    .size(160.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround
            ) {
                Image(
                    painter = painterResource(id = R.drawable.husqvarna_ee_5_800x600),
                    contentDescription = "Preview 3"
                )
                Text(text = "Sepia")
            }
            Column(
                modifier = Modifier
                    .padding(all = 8.dp)
                    .size(160.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround
            ) {
                Image(
                    painter = painterResource(id = R.drawable.husqvarna_ee_5_800x600),
                    contentDescription = "Preview 4"
                )
                Text(text = "Saturation")
            }
            Column(
                modifier = Modifier
                    .padding(all = 8.dp)
                    .size(160.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround
            ) {
                Image(
                    painter = painterResource(id = R.drawable.husqvarna_ee_5_800x600),
                    contentDescription = "Preview 5"
                )
                Text(text = "Snow")
            }
        }

        // Bottom Bar icons
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .background(Pink50),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Image(
                imageVector = ImageVector.vectorResource(id = R.drawable.baseline_insert_photo_24),
                contentDescription = "Insert photo",
                modifier = Modifier.size(32.dp)
            )
            Image(
                imageVector = ImageVector.vectorResource(id = R.drawable.baseline_camera_alt_24),
                contentDescription = "Open camera",
                modifier = Modifier.size(32.dp)
            )
            Image(
                imageVector = ImageVector.vectorResource(id = R.drawable.baseline_save_alt_24),
                contentDescription = "Save photo",
                modifier = Modifier.size(32.dp)
            )
        }
        
    }
    
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Module_3_Lesson_2_hw_2_ComposeTheme {
//        Greeting("Android")
    }
}