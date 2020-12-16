package com.example.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.viewpager.fragment.Fragment1
import com.example.viewpager.fragment.Fragment2
import com.example.viewpager.fragment.Fragment3

class ViewPagerAdapter(fragmentManager: FragmentManager) :  FragmentPagerAdapter(fragmentManager) {

    val PAGE_MAX_COUNT = 3

    override fun getCount(): Int {
        return PAGE_MAX_COUNT
    }

    override fun getItem(position: Int): Fragment {
       val fragment : Fragment = when(position) {
           1 -> Fragment2.newInstance()
           2 -> Fragment3.newInstance()
           else -> Fragment1.newInstance()
       }
        return fragment
       }

    override fun getPageTitle(position: Int): CharSequence? {

        val title: String = when(position) {
            1 -> "one"
            2 -> "two"
            3 -> "three"
            else -> "main"
        }
        return title
    }
}