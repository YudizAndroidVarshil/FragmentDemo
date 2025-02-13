package com.example.fragmentdemo.viewPagerAdapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.fragmentdemo.fragments.FragmentA
import com.example.fragmentdemo.fragments.FragmentB
import com.example.fragmentdemo.fragments.FragmentC

class ViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    // List of fragments to display in ViewPager
    private val fragments = listOf(FragmentA(), FragmentB(), FragmentC())

    // Returns the number of fragments
    override fun getItemCount(): Int = fragments.size

    // Returns the fragment corresponding to the given position
    override fun createFragment(position: Int): Fragment = fragments[position]
}