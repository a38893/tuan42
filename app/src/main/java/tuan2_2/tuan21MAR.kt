package tuan2_2

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tinh_tong.R

class tuan21MAR : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tuan21_mar)
        var tvKQ=findViewById<TextView>(R.id.tuan2Tvkq)
        val i1=intent
        val chuoi1= i1.extras!!.getString("so1")
        val so1= chuoi1!!.toFloat()
        val chuoi2= i1.extras!!.getString("so2")
        val so2=chuoi2!!.toFloat()
        val tong=so1+so2
        tvKQ!!.text=tong.toString()
    }
}