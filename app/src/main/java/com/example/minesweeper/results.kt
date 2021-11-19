package com.example.minesweeper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_results.*
//This activity is responsible for getting the result and displaying it
class results : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)

        var intent = getIntent()
        var showName = intent.getStringExtra("player_name")
        var showResult = intent.getStringExtra("result")


        show_name.text = showName
        show_result.text = showResult

        home.setOnClickListener {
            Toast.makeText(this,"Thank You For Playing", Toast.LENGTH_SHORT).show()
            val intent= Intent(this, MainActivity::class.java).apply{

            }
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        finishAffinity()
    }
}