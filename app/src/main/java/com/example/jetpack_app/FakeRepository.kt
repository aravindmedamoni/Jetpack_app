package com.example.jetpack_app

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import java.util.*

object FakeRepository {

    private val fruits : List<String> = listOf(
        "Apple","Banana","Orange","Kiwi","Grapes","Fig","Pear","Strawberry","Gooseberry","Raspberry"
    )

    private val _currentRandomFruitName = MutableLiveData<String>()
    val currentRandomFruitName : LiveData<String>
    get() = _currentRandomFruitName

    init {
        _currentRandomFruitName.value = fruits.first()
    }

   fun getRandomFruitName():String{
        val  random = Random()
       return  fruits[random.nextInt(fruits.size)]
    }

    fun changeCurrentRandomFruitName(){
        _currentRandomFruitName.value = getRandomFruitName()
    }
}