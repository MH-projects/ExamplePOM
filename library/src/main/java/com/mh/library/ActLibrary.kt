package com.mh.library

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.mh.library2.ActLibrary2

class ActLibrary : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_library)

        findViewById<Button>(R.id.btn1).setOnClickListener {
            startActivity(Intent(this, ActLibrary2::class.java))
        }
    }
}