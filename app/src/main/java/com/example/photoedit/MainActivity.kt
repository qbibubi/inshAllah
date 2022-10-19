package com.example.photoedit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.SeekBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // image view
        val imageMain = findViewById<ImageView>(R.id.mainImage)

        // rotation seek bars
        val rotateX = findViewById<SeekBar>(R.id.rotationX)
        val rotateY = findViewById<SeekBar>(R.id.rotationY)

        rotateX.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                imageMain.rotationX = p1.toFloat()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                // i love
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                // code bro
            }
        })

        rotateY.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                imageMain.rotationY = p1.toFloat()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                // i love
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                // code bro
            }
        })

        // hue seek bars
        val red = findViewById<SeekBar>(R.id.redFilterBar)
        val green = findViewById<SeekBar>(R.id.greenFilterBar)
        val blue = findViewById<SeekBar>(R.id.redFilterBar)

        red.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                // change red hue
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                // i love
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                // code bro
            }
        })

        green.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                // change green hue
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                // i love
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                // code bro
            }
        })

        blue.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                // change blue hue
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                // i love
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                // code bro
            }
        })
    }
}