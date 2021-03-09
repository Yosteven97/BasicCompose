package com.example.canary

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsStory()

        }
    }


    @Composable
    fun NewsStory() {

        val image = painterResource(R.drawable.hill)
        MaterialTheme {
            val typography = MaterialTheme.typography
            Column(
                modifier = Modifier.padding(16.dp)
            ) {

                val imageModifier = Modifier
                    .height(180.dp)
                    .fillMaxHeight()
                    .clip(shape = RoundedCornerShape(4.dp))

                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = imageModifier,
                    contentScale = ContentScale.Crop)

                Spacer(modifier = Modifier.height(16.dp))
                Text("A day wandering through the SandHills " +
                        "in Shark Fin Cove, and a few of the " +
                        "sights I saw",
                    style = typography.h6,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis)
                Text("Jakarta, Indonesia",
                    style = typography.body2)
                Text("March 2021",
                    style = typography.body2)
            }
        }

    }

    @Preview
    @Composable
    fun DefaultPreview() {
        NewsStory()
    }
}