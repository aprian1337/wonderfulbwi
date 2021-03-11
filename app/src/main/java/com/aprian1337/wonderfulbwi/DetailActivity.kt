package com.aprian1337.wonderfulbwi

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.drawable.toBitmap

class DetailActivity : AppCompatActivity(), View.OnClickListener {
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DESC = "extra_desc"
        const val EXTRA_IMG = "extra_img"
    }

    private lateinit var back : ImageView
    private lateinit var share : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvNameReceived: TextView = findViewById(R.id.name)
        val tvDescReceived: TextView = findViewById(R.id.desc)
        val tvImgReceived: ImageView = findViewById(R.id.img)

        back = findViewById(R.id.back)
        back.setOnClickListener(this)

        share = findViewById(R.id.share)
        share.setOnClickListener(this)

        val name = intent.getStringExtra(EXTRA_NAME)
        val desc = intent.getStringExtra(EXTRA_DESC)
        val img = intent.getIntExtra(EXTRA_IMG, 0)
        name.also { tvNameReceived.text = it }
        desc.also { tvDescReceived.text = it }
        tvImgReceived.setImageResource(img)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.back -> {
                this.finish()
            }
            R.id.share -> {
                shareIntent()
            }
        }
    }

    private fun shareIntent(){
        val imageDraw : Drawable = resources.getDrawable(intent.getIntExtra(EXTRA_IMG, 0))
        val imageBitmap : Bitmap =imageDraw.toBitmap()
        val path = MediaStore.Images.Media.insertImage(contentResolver, imageBitmap, "share", null)
        val uriPath : Uri = Uri.parse(path)
        val nameDestination = intent.getStringExtra(EXTRA_NAME)
        val shareTo = Intent(Intent.ACTION_SEND)
        val text : String = """
            *$nameDestination*
            Look at this tourist destination, it's so beautiful!
            
            Let's go to Banyuwangi!
            
            [Generated from WonderfulBWI App]
        """.trimIndent()
        shareTo.setType("image/*")
        shareTo.putExtra(Intent.EXTRA_STREAM, uriPath)
        shareTo.putExtra(Intent.EXTRA_TEXT, text)
        shareTo.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
        startActivity(shareTo)
    }
}