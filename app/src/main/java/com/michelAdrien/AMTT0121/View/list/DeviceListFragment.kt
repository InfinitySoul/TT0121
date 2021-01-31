package com.michelAdrien.AMTT0121.View.list

import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.michelAdrien.AMTT0121.databinding.FragmentDeviceListBinding

class DeviceListFragment(val test : String) : Fragment() {

    private var _binding: FragmentDeviceListBinding? = null
    private val binding get() = _binding!!


    //We informa that we want to change the menu
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentDeviceListBinding.inflate(inflater, container, false)
        val root = binding.root

        //binding.tvList.text = "List + "+ test

        val sectionsPagerAdapter = context?.let { SectionsPagerAdapter(it, childFragmentManager) }
        val viewPager: ViewPager = binding.viewPager
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = binding.tabs
        tabs.setupWithViewPager(viewPager)

        return root
    }
}