package com.rolando.tmdbthemoviedatabase

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun MovieDetailsScreen(
    title: String,
) {
    Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
        Text(text = title, modifier = Modifier.align(Alignment.Center))
    }
}