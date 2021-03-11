package com.aprian1337.wonderfulbwi

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.TextView

class PreHome : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        if (Build.VERSION.SDK_INT < 16) {
            window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)
        }else{
            actionBar?.hide()
        }

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pre_home)

        val moveActivity: TextView = findViewById(R.id.start)
        moveActivity.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.start -> {
                val moveIntent = Intent(this@PreHome, Home::class.java)
                startActivity(moveIntent)
            }
        }
    }
}