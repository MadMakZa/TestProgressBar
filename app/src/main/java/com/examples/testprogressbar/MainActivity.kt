package com.examples.testprogressbar

import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {

    lateinit var progressBar: ProgressBar
    lateinit var btnBoom: Button
    var currentProgress = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        progressBar = findViewById(R.id.progressBar)
        btnBoom = findViewById(R.id.btn_dmg)

        progressBar.max = 500



        btnBoom.setOnClickListener{

            currentProgress +=10
            ObjectAnimator.ofInt(progressBar, "progress", currentProgress)
                .setDuration(100)
                .start()

            progressFinish()
        }
    }

    private fun progressFinish(){
        if (currentProgress == 500){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }


}