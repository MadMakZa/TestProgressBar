package com.examples.testprogressbar

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {

    lateinit var progressBar: ProgressBar
    lateinit var btnBoom: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        progressBar = findViewById(R.id.progressBar)
        btnBoom = findViewById(R.id.btn_dmg)

        progressBar.max = 500
        var currentProgress = 0


        btnBoom.setOnClickListener{
            currentProgress ++
            ObjectAnimator.ofInt(progressBar, "progress", currentProgress)
                .setDuration(0)
                .start()
        }
    }


}