package com.rolando.tmdbthemoviedatabase

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MovieDetailsViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
    private val repository: TheMovieDatabaseRepository,
): ViewModel() {
    private val _state = MutableStateFlow("")
    val state: StateFlow<String> = _state

    init {
        val id = savedStateHandle.get<Long>("id")
        val name = savedStateHandle.get<String>("name")
        viewModelScope.launch {
            _state.emit("Name: $name, ID: $id")
        }
    }


}