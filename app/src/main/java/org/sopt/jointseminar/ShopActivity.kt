package org.sopt.jointseminar

import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import kotlinx.android.synthetic.main.fragment_shop_menu.*

import java.util.ArrayList

class ShopActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop)

        val viewPager = findViewById<ViewPager>(R.id.shop_viewpager)
        viewPager.adapter = ShopFragmentPagerAdapter(supportFragmentManager, this@ShopActivity)

        val tabLayout = findViewById<View>(R.id.sliding_tabs) as TabLayout
        tabLayout.setupWithViewPager(viewPager)
    }
}
