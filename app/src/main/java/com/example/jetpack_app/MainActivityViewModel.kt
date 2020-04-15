package com.example.jetpack_app

import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random
import kotlin.random.Random.Default.nextInt

class MainActivityViewModel : ViewModel(){

    val currentRandomFruitName : LiveData<String>
    get() = FakeRepository.currentRandomFruitName

    fun onChangeRandomFruitClick() = FakeRepository.changeCurrentRandomFruitName()


    val editTextContent = MutableLiveData<String>()

    private val _displayedEditTextContent = MutableLiveData<String>()
    val displayedEditTextContent : LiveData<String>
    get() = _displayedEditTextContent

    fun onDisplayEditTextContentClick(){
        _displayedEditTextContent.value = editTextContent.value
    }

    fun onSelectRandomEditTextFruit(){
        editTextContent.value = FakeRepository.getRandomFruitName()
    }

//    // Create a LiveData with a String
//    val currentName: MutableLiveData<String> by lazy {
//        MutableLiveData<String>()
//    }
//
//    private lateinit var count : MutableLiveData<Int>
//
//    fun getInitialCount() : MutableLiveData<Int>{
//        count = MutableLiveData<Int>()
//        count.value = 0
//        return  count
//    }
//
//    fun getCount() : MutableLiveData<Int>{
////        val random = java.util.Random();
////        val value = random.nextInt(5)+1;
//        count.value = count.value?.plus(1)
//        return count
//    }
}