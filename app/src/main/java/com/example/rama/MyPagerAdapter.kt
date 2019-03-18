package com.example.rama

import android.support.v4.app.FragmentManager
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentPagerAdapter

class MyPagerAdapter(fm:FragmentManager):FragmentPagerAdapter(fm){
    private val pages= listOf(
        FirstFragment(),
        secondfragment(),
        thirdfragment(),
        fourthfragment()
    )

    override fun getItem(position: Int): Fragment {
        return pages[position]
    }
    override fun getCount(): Int {
        return pages.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position){
            0-> "Cari Jodoh"
            1-> "Game Dadu"
            2-> "Nama Hewan"
            else ->"Profil"
        }
    }
}