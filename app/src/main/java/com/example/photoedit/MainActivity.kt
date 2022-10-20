package com.example.photoedit

import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.Color
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import android.widget.SeekBar
import androidx.core.app.ActivityCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (ActivityCompat.checkSelfPermission(
                this,
                android.Manifest.permission.CAMERA
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(android.Manifest.permission.CAMERA),
                111
            )
        }

        val button: Button = findViewById(R.id.takePicture)
        button.setOnClickListener {
            var i = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(i, 101)
        }

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
        val blue = findViewById<SeekBar>(R.id.blueFilterBar)

        var Red: Int = 0
        var Green: Int = 0
        var Blue: Int = 0
        var Opacity: Int = 255

        red.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                Red = p1
                imageMain.getDrawable().setColorFilter(Color.argb(Opacity, Red, Green, Blue), PorterDuff.Mode.SRC_ATOP)
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
                imageMain.getDrawable().setColorFilter(Color.argb(Opacity, Red, Green, Blue), PorterDuff.Mode.SRC_ATOP)
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
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                // i love
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                // code bro
            }
        })

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 101) {
            var image: Bitmap? = data?.getParcelableExtra("data")
            findViewById<ImageView>(R.id.mainImage).setImageBitmap(image)
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 111 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            setContentView(R.layout.activity_main)
        }
    }

}