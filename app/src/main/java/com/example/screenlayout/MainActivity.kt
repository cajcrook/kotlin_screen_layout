package com.example.screenlayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.screenlayout.ui.theme.ScreenLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ScreenLayoutTheme {
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    ScreenLayout(
                    )
                }
            }
        }
    }
}

@Composable
fun ScreenLayout() {
    // A Column to arrange the rows vertically
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        // First Row
        Row(
            modifier = Modifier
                .weight(3f) // Takes up equal height of the screen
                .fillMaxWidth(), // Fills width of the parent
            horizontalArrangement = Arrangement.SpaceEvenly // Space squares evenly in the row
        ) {
            // Square 1 - White
            Box(
                modifier = Modifier
                    .weight(1f) // Each box takes equal weight
                    .fillMaxHeight() // Fill the height of the row
                    .background(Color.White)
            )
            // Square 2 - Yellow
            Box(
                modifier = Modifier
                    .weight(3f) // Each box takes equal weight
                    .fillMaxHeight() // Fill the height of the row
                    .background(Color.Yellow)
            )
        }

        // Second Row
        Row(
            modifier = Modifier
                .weight(3f) // Takes up equal height of the screen
                .fillMaxWidth(), // Fills width of the parent
            horizontalArrangement = Arrangement.SpaceEvenly // Space squares evenly in the row
        ) {

            // Square 4 - Blue
            Box(
                modifier = Modifier
                    .weight(1f) // Each box takes equal weight
                    .fillMaxHeight() // Fill the height of the row
                    .background(Color.Blue)
            )
        }
        Row(
            modifier = Modifier
                .weight(1f) // Takes up equal height of the screen
                .fillMaxWidth(), // Fills width of the parent
            horizontalArrangement = Arrangement.SpaceEvenly // Space squares evenly in the row
        ) {
            // Square 4 - White
            Box(
                modifier = Modifier
                    .weight(1f) // Each box takes equal weight
                    .fillMaxHeight() // Fill the height of the row
                    .background(Color.Green)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ScreenLayoutPreview() {
    ScreenLayoutTheme {
        ScreenLayout()
    }
}