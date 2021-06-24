package com.michelAdrien.AMTT0121.view.list

import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.tabs.TabLayout
import com.michelAdrien.AMTT0121.R
import com.michelAdrien.AMTT0121.databinding.FragmentDeviceListBinding
import com.michelAdrien.AMTT0121.view.TabOrder
import com.michelAdrien.AMTT0121.viewModel.DeviceListViewModel
import dagger.hilt.android.AndroidEntryPoint

//The fragment of the home page
@AndroidEntryPoint
class DeviceListFragment() : Fragment() { //clickListener: (IDevice) -> Unit


    private val deviceListViewModel: DeviceListViewModel by viewModels()

    private var _binding: FragmentDeviceListBinding? = null
    private val binding get() = _binding!!

    private lateinit var recyclerView: RecyclerView
    private var section_number = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentDeviceListBinding.inflate(inflater, container, false)
        val root = binding.root

        deviceListViewModel.setIndex(section_number)
        recyclerView = root.findViewById<RecyclerView>(R.id.rv_list_devices).apply {
            this.setHasFixedSize(true)
        }
        recyclerView.layoutManager = LinearLayoutManager(context)
        deviceListViewModel.timerLiveData.observe(viewLifecycleOwner, {
            val viewAdapter = DeviceAdapter(it)
            recyclerView.adapter = viewAdapter
        })

        //val sectionsPagerAdapter = context?.let { SectionsPagerAdapter(it, childFragmentManager) }
        //val viewPager: ViewPager = binding.viewPager
        //viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = binding.tabs
        //tabs.setupWithViewPager(viewPager)
        for(tabName in TabOrder.TAB_TITLES){
            tabs.addTab(tabs.newTab().setText(tabName))
        }
        tabs.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                //appeler pagerViewModel.setIndex(section_number)
                tab?.let { deviceListViewModel.setIndex(it.position) }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }
            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })

        return root
    }
}