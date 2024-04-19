package com.example.tinh_tong.tuan3

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tinh_tong.R

class T3ListViewMainActivity : AppCompatActivity() {
    var aadapter: T3Aadapter? = null
    var ls = ArrayList<T3Contact>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_t3_list_view_main)
        var lv = findViewById<ListView>(R.id.t3Listview)
        ls.add(T3Contact("Nguyen Van A","20", R.drawable.facebook))
        ls.add(T3Contact("Nguyen Van B","26", R.drawable.messenger))
        ls.add(T3Contact("Nguyen Van C","25", R.drawable.facebook))
        ls.add(T3Contact("Nguyen Van D","23", R.drawable.facebook))
        ls.add(T3Contact("Nguyen Van E","21", R.drawable.messenger))
        ls.add(T3Contact("Nguyen Van F","22", R.drawable.messenger))
        ls.add(T3Contact("Nguyen Van F","22", R.drawable.messenger))
        ls.add(T3Contact("Nguyen Van F","22", R.drawable.messenger))
        ls.add(T3Contact("Nguyen Van F","22", R.drawable.messenger))
        ls.add(T3Contact("Nguyen Van F","22", R.drawable.messenger))
        ls.add(T3Contact("Nguyen Van F","22", R.drawable.messenger))
        ls.add(T3Contact("Nguyen Van F","22", R.drawable.messenger))
        aadapter= T3Aadapter(ls, this)
        lv!!.adapter= aadapter
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}