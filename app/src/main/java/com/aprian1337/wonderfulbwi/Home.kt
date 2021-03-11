package com.aprian1337.wonderfulbwi

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView


class Home : AppCompatActivity(), View.OnClickListener {
    private lateinit var rvWisata: RecyclerView
    private lateinit var profile: CircleImageView
    private var list: ArrayList<Wisata> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        rvWisata = findViewById(R.id.rv_wisata)
        rvWisata.setHasFixedSize(true)
        profile = findViewById(R.id.profile_image)
        profile.setOnClickListener(this)

        list.addAll(WisataData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvWisata.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListWisataAdapter(list)
        rvWisata.adapter = listHeroAdapter
    }

    private fun setWindowFlag(bits: Int, on: Boolean) {
        val win = window
        val winParams = win.attributes
        if (on) {
            winParams.flags = winParams.flags or bits
        } else {
            winParams.flags = winParams.flags and bits.inv()
        }
        win.attributes = winParams
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.profile_image -> {
                val moveIntent = Intent(this@Home, ProfileActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}