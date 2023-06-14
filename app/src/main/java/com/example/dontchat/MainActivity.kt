package com.example.dontchat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.dontchat.adapter.viewpageradapter
import com.example.dontchat.ui.callFragment
import com.example.dontchat.ui.chatFragment
import com.example.dontchat.ui.statusFragment
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val vp =findViewById<ViewPager>(R.id.vp)
        val tab = findViewById<TabLayout>(R.id.tab)

        val fragarraylist = ArrayList<Fragment>()
        fragarraylist.add(chatFragment())
        fragarraylist.add(statusFragment())
        fragarraylist.add(callFragment())

        val adapter=viewpageradapter(this,supportFragmentManager,fragarraylist)
        vp.adapter=adapter
        tab.setupWithViewPager(vp)

    }
}