package com.sharma.growb.ScrollingFragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class page_adapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 3;
    }

    override fun getItem(position: Int): Fragment {
        when(position) {
            0 -> {
                return Saless()
            }
            1 -> {
                return Purchase()
            }
            2 -> {
            return Stock()
        }
            else -> {
                return Saless()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position) {
            0 -> {
                return "Sales"
            }
            1 -> {
                return "Purchase"
            }
            2 -> {
                return "Stock"
            }

        }
        return super.getPageTitle(position)
    }

}