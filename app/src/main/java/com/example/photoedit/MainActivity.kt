package com.e

import android.media.Image
import com.example.photoedit.R

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.SeekBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // image view
        val imageMain = findViewById<ImageView>(R.id.mainImage);

        // rotation seek bars
        val rotateX = findViewById<SeekBar>(R.id.rotationX);
        val rotateY = findViewById<SeekBar>(R.id.rotationY);

        rotateX?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                imageMain.rotationX = p1.toFloat()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                TODO("Not yet implemented")
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                TODO("Not yet implemented")
            }
        })

    }
}