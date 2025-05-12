package com.example.retrofitlearning.data.repository

import com.example.retrofitlearning.data.api.CharacterApi
import com.example.retrofitlearning.data.api.model.Characters
import javax.inject.Inject

class CharacterRepo @Inject constructor(
    private val characterApi : CharacterApi
){
    suspend fun getCharacter() : List<Characters>{
        return characterApi.getCharacter()
    }
}