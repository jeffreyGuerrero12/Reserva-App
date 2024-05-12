package com.jeffreyguerrero.reservapp.ui.reserva

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jeffreyguerrero.reservapp.databinding.FragmentReservaBinding

class ReservaFragment : Fragment() {

    private var _binding: FragmentReservaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentReservaBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}