package com.example.minesweeper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_custom_board.*
//This activity helps in passing the input values of the height, width, and number of mines to the GamePlay activity(which sets up the board according to the input values)
class CustomBoard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_board)



        submit.setOnClickListener {
            var height = Integer.parseInt(hi.text.toString())
            var width = Integer.parseInt(wi.text.toString())
            var mine = Integer.parseInt(mi.text.toString())

            val intent = Intent(this, GamePlay::class.java).apply {
                putExtra("height", height)
                putExtra("width", width)
                putExtra("mines", mine)
            }
            startActivity(intent)
        }
    }
}