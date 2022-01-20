package com.sharma.growb.addingFragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.sharma.growb.ScrollingFragments.Purchase
import com.sharma.growb.ScrollingFragments.Saless
import com.sharma.growb.ScrollingFragments.Stock

class AddPageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 3;
    }

    override fun getItem(position: Int): Fragment {
        when(position) {
            0 -> {
                return AddSales()
            }
            1 -> {
                return AddPurchase()
            }
            2 -> {
                return CheckStock()
            }
            else -> {
                return AddSales()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position) {
            0 -> {
                return "Add Sales"
            }
            1 -> {
                return "Add Purchase"
            }
            2 -> {
                return "Check Stock"
            }

        }
        return super.getPageTitle(position)
    }

}