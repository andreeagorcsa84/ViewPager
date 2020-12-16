package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var images : List<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createImageList()
        initAdapter()
    }

    fun createImageList() {

        images = listOf(
            R.drawable.angel,
            R.drawable.ballerina,
            R.drawable.eclipse
        )
    }

    fun initAdapter() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = "Tab ${position + 1}"
        }.attach()
    }
}