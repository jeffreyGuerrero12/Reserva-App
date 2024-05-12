package com.jeffreyguerrero.reservapp.ui.detalle

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jeffreyguerrero.reservapp.databinding.FragmentDetalleBinding

class DetalleFragment : Fragment() {

    private var _binding: FragmentDetalleBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetalleBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}