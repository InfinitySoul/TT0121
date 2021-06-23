package com.michelAdrien.AMTT0121.view.list

import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.michelAdrien.AMTT0121.databinding.FragmentDeviceListBinding
import dagger.hilt.android.AndroidEntryPoint

//The fragment of the home page
@AndroidEntryPoint
class DeviceListFragment() : Fragment() {

    private var _binding: FragmentDeviceListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentDeviceListBinding.inflate(inflater, container, false)
        val root = binding.root

        //val viewModelFactory = context?.let { ListViewModelFactory(JsonRepository(it)) }!!
        //val pagerViewModel = ViewModelProvider(this, viewModelFactory).get(DeviceListViewModel::class.java)

        val sectionsPagerAdapter = context?.let { SectionsPagerAdapter(it, childFragmentManager) }
        val viewPager: ViewPager = binding.viewPager
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = binding.tabs
        tabs.setupWithViewPager(viewPager)

        return root
    }
}