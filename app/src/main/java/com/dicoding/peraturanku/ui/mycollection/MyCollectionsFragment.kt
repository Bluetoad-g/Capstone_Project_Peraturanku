package com.dicoding.peraturanku.ui.mycollection

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.dicoding.peraturanku.R

class MyCollectionsFragment : Fragment() {

    private lateinit var notificationsViewModel: MyCollectionsViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        notificationsViewModel =
                ViewModelProvider(this).get(MyCollectionsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_mycollections, container, false)
        val textView: TextView = root.findViewById(R.id.text_collections)
        notificationsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}