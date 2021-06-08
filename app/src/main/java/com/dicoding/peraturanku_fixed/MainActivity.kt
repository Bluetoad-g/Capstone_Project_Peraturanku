package com.dicoding.peraturanku_fixed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.TextKeyListener.clear
import android.widget.SearchView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.dicoding.peraturanku_fixed.Adapter.PeraturanAdapter
import com.dicoding.peraturanku_fixed.Fragment.CollectionFragment
import com.dicoding.peraturanku_fixed.Fragment.HomeFragment
import com.dicoding.peraturanku_fixed.Fragment.ProfileFragment
import com.dicoding.peraturanku_fixed.Fragment.SurfFragment
import com.google.firebase.database.*
import com.dicoding.peraturanku_fixed.data_class.PeraturanData
import com.google.firebase.database.core.RepoManager.clear
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_row.*

class MainActivity : AppCompatActivity() {
    lateinit var mDataBase: DatabaseReference
    private lateinit var peraturanList: ArrayList<PeraturanData>
    private lateinit var mAdapter: PeraturanAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        peraturanList = ArrayList()
        mAdapter = PeraturanAdapter(this, peraturanList)
        recyclerPeraturan.layoutManager = LinearLayoutManager(this)
        recyclerPeraturan.setHasFixedSize(true)
        recyclerPeraturan.adapter = mAdapter
        getPeraturanData()


        val homeFragment = HomeFragment()
        val collectionFragment = CollectionFragment()
        val profileFragment = ProfileFragment()
        val surfFragment = SurfFragment()

        makeCurrentFragment(homeFragment)

        bottom_nav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home_frg -> makeCurrentFragment(homeFragment)
                R.id.surf_frg -> makeCurrentFragment(surfFragment)
                R.id.collection_frg -> makeCurrentFragment(collectionFragment)
                R.id.profile_frg -> makeCurrentFragment(profileFragment)
            }
            true
        }
    }

    private fun getPeraturanData(){
        mDataBase = FirebaseDatabase.getInstance().getReference("peraturandki")
        mDataBase.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if(snapshot.exists()){
                    for (peraturanSnapshot in snapshot.children){
                        val peraturan = peraturanSnapshot.getValue(PeraturanData::class.java)
                        peraturanList.add(peraturan!!)
                    }
                    recyclerPeraturan.adapter = mAdapter
                }
            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(this@MainActivity,error.message, Toast.LENGTH_SHORT).show()
            }
        })
    }

    private fun makeCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.nav_wrapper,  fragment)
            commit()
        }


}