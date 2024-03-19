package com.example.sool_sool_card_game

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 게임 시작
        // game_start_button 클릭 시 Game_Activity로 이동
        val game_start_button: Button = findViewById(R.id.game_start_button)

        game_start_button.setOnClickListener {
            val intent = Intent(this, card_game::class.java)
            startActivity(intent)
        }
    }
}
