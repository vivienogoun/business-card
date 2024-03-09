package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Card()
                }
            }
        }
    }
}

@Composable
fun Card(modifier: Modifier = Modifier) {
    Column(
        modifier
            .background(color = Color(red = 0F, green = 1F, blue = 0F, alpha = 0.1F))
            .padding(bottom = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Column(
            modifier.weight(3F),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(modifier.background(Color(red = 0F, green = 0F, blue = 0F, alpha = 0.8F))) {
                Image(
                    painter = painterResource(id = R.drawable.android_logo),
                    contentDescription = "android logo",
                    modifier.size(112.dp)
                )
                Text(text = stringResource(R.string.android))
            }
            Text(
                text = stringResource(R.string.fullname),
                fontSize = 40.sp,
                modifier = Modifier.padding(top = 4.dp, bottom = 8.dp)
            )
            Text(text = stringResource(R.string.title), color = Color.Blue, fontWeight = FontWeight(500))
        }
        Column(modifier.weight(1F), verticalArrangement = Arrangement.Bottom) {
            Row {
                Icon(
                    Icons.Default.Phone,
                    contentDescription = "phone icon",
                    tint = Color.Blue
                )
                Text(text = stringResource(R.string.phone), modifier.padding(start = 20.dp))
            }
            Row(modifier.padding(top = 16.dp, bottom = 16.dp)) {
                Icon(
                    Icons.Default.Share,
                    contentDescription = "share icon",
                    tint = Color.Blue
                )
                Text(text = stringResource(R.string.username), modifier.padding(start = 20.dp))
            }
            Row {
                Icon(
                    Icons.Default.Email,
                    contentDescription = "email icon",
                    tint = Color.Blue
                )
                Text(text = stringResource(R.string.email), modifier.padding(start = 20.dp))
            }
        }
    }
}
