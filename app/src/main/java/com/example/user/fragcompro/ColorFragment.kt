package com.example.user.fragcompro


import android.app.Activity
import android.os.Bundle
import android.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton

class ColorFragment : Fragment() {

    var c: my_color? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var v: View = inflater!!.inflate(R.layout.fragment_color, container, false)
        var rr = v.findViewById<RadioButton>(R.id.rdo_red)
        var rg = v.findViewById<RadioButton>(R.id.rdo_green)
        var rb = v.findViewById<RadioButton>(R.id.rdo_blue)

        rr.setOnClickListener { c?.setColor(1) }
        rg.setOnClickListener { c?.setColor(2) }
        rb.setOnClickListener { c?.setColor(3) }

        return v
    }

    interface my_color {
        fun setColor(x: Int)
    }

    override fun onAttach(activity: Activity?) {
        super.onAttach(activity)
        c = activity as my_color
    }

}
