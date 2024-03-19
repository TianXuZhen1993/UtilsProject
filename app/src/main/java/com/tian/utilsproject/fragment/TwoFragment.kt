package com.tian.utilsproject.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.tian.utilsproject.databinding.FragmentOneBinding
import com.tian.utilsproject.databinding.FragmentTwoBinding


/**
 * @author: TXZ
 * @version: 1.0
 * @date: created by 2023/11/12 23:06
 */
class TwoFragment : Fragment(com.tian.utilsproject.R.layout.fragment_two) {
    private val TAG = "TwoFragment"

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate")
    }

    private lateinit var binding: FragmentTwoBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d(TAG, "onCreateView")
        binding = FragmentTwoBinding.inflate(inflater, container, false)
        Log.d(TAG, binding.toString())
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "onViewCreated")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
        // Fragment is visible and interacting with the user
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
        // Another activity is becoming visible, this one is no longer interacting with the user
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
        // Fragment is no longer visible
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView")
        // Fragment's view has been destroyed, but Fragment instance is still alive
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
        // Fragment instance is being destroyed
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "onDetach")
        // Fragment is detached from the activity
    }
}
