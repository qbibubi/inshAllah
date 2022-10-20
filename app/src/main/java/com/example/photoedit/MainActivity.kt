package com.example.photoedit

import android.graphics.Color
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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

        var Red = 0
        var Green = 0
        var Blue = 0
        var Opacity = 0

        red.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                Red = p1
                imageMain.setColorFilter(Color.argb(Opacity, Red, Green, Blue), PorterDuff.Mode.SRC_ATOP)
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
                Green = p1
                imageMain.setColorFilter(Color.argb(Opacity, Red, Green, Blue), PorterDuff.Mode.SRC_ATOP)
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
                Blue = p1
                imageMain.getDrawable().setColorFilter(Color.argb(Opacity, Red, Green, Blue), PorterDuff.Mode.SRC_ATOP)
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                // i love
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                // code bro
            }
        })

        // opacity bar
        val opacity = findViewById<SeekBar>(R.id.opacityBar)

        opacity.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                Opacity = p1
                imageMain.getDrawable().setColorFilter(Color.argb(Opacity, Red, Green, Blue), PorterDuff.Mode.SRC_ATOP)
                Log.d("R: ", Red.toString())
                Log.d("R: ", Green.toString())
                Log.d("R: ", Blue.toString())
                Log.d("R: ", Opacity.toString())
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