package com.example.cristalboll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cristalboll.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvText.setOnClickListener {
            binding.tvText.text=getPre()
        }
    }

    private fun getPre():String{
     return resources.getStringArray(R.array.aPrediction)[randomNumber()]
    }

private fun randomNumber():Int{
    val size=resources.getStringArray(R.array.aPrediction).size-1
    return (0..size).random()
}
}