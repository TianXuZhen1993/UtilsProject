package com.example.utilsproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.utilsproject.R
import com.example.utilsproject.databinding.FragmentExampleBinding

/**
 * @author: TXZ
 * @version: 1.0
 * @date: created by 2023/11/12 23:06
 */
class ExampleFragment : Fragment(R.layout.fragment_example) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = FragmentExampleBinding.inflate(layoutInflater)
        return super.onCreateView(inflater, container, savedInstanceState)

    }
}