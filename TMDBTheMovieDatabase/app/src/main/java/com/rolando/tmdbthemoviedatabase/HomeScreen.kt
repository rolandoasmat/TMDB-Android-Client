package com.rolando.tmdbthemoviedatabase

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage

@Composable
fun HomeScreen(
    state: HomeScreenViewState,
    onImageTap: (Long) -> Unit,
    modifier: Modifier,
) {

    LazyColumn(modifier = modifier.fillMaxWidth().fillMaxHeight()) {
        items(state.movies) { item ->
            Box(modifier = Modifier.fillMaxWidth().height(200.dp)) {
                AsyncImage(
                    modifier = Modifier.clickable {
                        onImageTap(item.id)
                    },
                    model = item.imageUrl,
                    contentDescription = null,
                )

            }
        }


    }

}