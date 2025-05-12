package com.example.retrofitlearning.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofitlearning.data.api.model.Characters
import com.example.retrofitlearning.data.repository.CharacterRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val characterRepo : CharacterRepo) : ViewModel(){
    private val _state = MutableStateFlow(emptyList<Characters>())

    val state : StateFlow<List<Characters>>
        get() = _state

    init {
        viewModelScope.launch {
            val characters = characterRepo.getCharacter()
            _state.value = characters
        }
    }
}