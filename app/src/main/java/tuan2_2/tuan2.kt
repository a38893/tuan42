package tuan2_2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tinh_tong.R

class tuan2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tuan2)
        var txt1 = findViewById<EditText>(R.id.tuan2_1txt1)
        var txt2 = findViewById<EditText>(R.id.tuan2_1txt1)
        var btn1 = findViewById<Button>(R.id.tuan2btn1)
        btn1!!.setOnClickListener{
            var i=Intent(this, tuan21MAR::class.java)
            i.putExtra("so1", txt1!!.text.toString())
            i.putExtra("so2", txt2!!.text.toString())
        }
    }
}