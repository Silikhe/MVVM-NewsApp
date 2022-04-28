package com.silikhe.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.silikhe.R

class NewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        bottomNavigationView.setupWithNavController(newsNavHostFragment.findNavController())
    }
}