package com.example.jetpack_app

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.jetpack_app.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

   private lateinit var binding: ActivityMainBinding
//
//    // private  lateinit var viewModel: MainActivityViewModel
//    // Use the 'by viewModels()' Kotlin property delegate
//    // from the activity-ktx artifact
    private lateinit var vModel: MainActivityViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        vModel = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)
        binding = DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main).apply{
            this.setLifecycleOwner(this@MainActivity)
            this.viewmodel = vModel
        }

        vModel.editTextContent.observe(this, Observer {
            Toast.makeText(this,it,Toast.LENGTH_SHORT).show()
        }
        )
    }
}


