package com.nmssalman.autolinktextviewv2new

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.nmssalman.autolinktextviewv2.AutoLinkTextView
import com.nmssalman.autolinktextviewv2.MODE_HASHTAG
import com.nmssalman.autolinktextviewv2.MODE_URL
import com.nmssalman.autolinktextviewv2new.ui.theme.AutoLinkTextViewV2NewTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val item = findViewById<AutoLinkTextView>(R.id.autolinkTextView)
        item.addAutoLinkMode(
            MODE_HASHTAG,
            MODE_URL)
        item.setText("https://srilanka.lk hello #srilanka")
    }
}
