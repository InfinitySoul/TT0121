package com.michelAdrien.AMTT0121.view.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.michelAdrien.AMTT0121.databinding.FragmentProfileBinding


class ProfileFragment() : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!



    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {

        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        val root = binding.root

        binding.tvProfile.text = "Profile"

        return root
    }
}