package com.aprian1337.wonderfulbwi

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class ProfileActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var back: ImageView
    private lateinit var touch_me: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        back = findViewById(R.id.back)
        back.setOnClickListener(this)

        touch_me = findViewById(R.id.touch_me)
        touch_me.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.back -> {
                this.finish()
            }
            R.id.touch_me -> {
                var subject = "[WonderfulBWI App] Your Subject"
                val intent = Intent(
                    Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "dwikyapriyan@gmail.com", null
                    )
                )
                intent.putExtra(Intent.EXTRA_SUBJECT, subject);
                startActivity(Intent.createChooser(intent, "Choose an Email client :"))
            }
        }
    }
}