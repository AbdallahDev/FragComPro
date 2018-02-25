package com.example.user.fragcompro

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ColorFragment.my_color {

    override fun setColor(x: Int) {
        if (x == 1) screen.setBackgroundColor(Color.RED)
        else if (x == 2) screen.setBackgroundColor(Color.GREEN)
        else if (x == 3) screen.setBackgroundColor(Color.BLUE)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tr = fragmentManager.beginTransaction()
        var obj = ColorFragment()
        tr.replace(R.id.container, obj)
        tr.commit()

    }
}
