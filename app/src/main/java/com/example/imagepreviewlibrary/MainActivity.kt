package com.example.imagepreviewlibrary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.example.image_preview.ImagePreview
import com.example.imagepreviewlibrary.ui.theme.ImagePreviewLibraryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImagePreviewLibraryTheme {
                Box(
                    modifier = Modifier.fillMaxSize()
                ) {




                }

            }
        }
    }
}

