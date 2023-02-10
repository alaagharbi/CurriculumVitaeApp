package com.example.curriculumvitaeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.SeekBar

class MainActivity : AppCompatActivity() {


    private var fullnametf: ImageView? = null
    private var emailtf: ImageView? = null
    private var numtf: ImageView? = null
    private var gender: ImageView? = null
    private var iosprog: SeekBar? = null
    private var androprog: SeekBar? = null
    private var flutterprog: SeekBar? = null
    private var submitbtn: Button? = null
    private var resetbtn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}