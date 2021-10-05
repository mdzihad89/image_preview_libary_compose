package com.example.imagepreviewlibrary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.imagepreviewlibrary.ui.theme.ImagePreviewLibraryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImagePreviewLibraryTheme {


            }

        }
    }
}

