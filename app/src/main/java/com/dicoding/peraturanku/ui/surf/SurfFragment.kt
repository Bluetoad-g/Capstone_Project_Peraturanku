package com.dicoding.peraturanku.ui.surf

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.dicoding.peraturanku.R

class SurfFragment : Fragment() {

    private lateinit var dashboardViewModel: SurfViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
                ViewModelProvider(this).get(SurfViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_surf, container, false)
        val textView: TextView = root.findViewById(R.id.text_surf)
        dashboardViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}