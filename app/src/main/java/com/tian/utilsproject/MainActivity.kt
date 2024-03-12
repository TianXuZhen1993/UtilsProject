package com.tian.utilsproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import com.tian.utils.inflateBinding
import com.tian.utilsproject.databinding.ActivityMainBinding
import com.tian.utilsproject.fragment.OneFragment
import com.tian.utilsproject.fragment.TwoFragment

/**
 * @author: TXZ
 * @version: 1.0
 * @date: created by 2024/1/1 22:11
 */
class MainActivity : AppCompatActivity() {
    companion object {
        private const val TAG = "MainActivity"
    }

    private val binding: ActivityMainBinding by inflateBinding()
//    private val binding: ActivityMainBinding by binding(ActivityMainBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val oneFragment = OneFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(binding.layoutFragment.id, oneFragment)
        transaction.commit()
        val twoFragment = TwoFragment()
        binding.title.setOnClickListener {
            supportFragmentManager.commit {
                replace(binding.layoutFragment.id, twoFragment)
                addToBackStack("")
            }
        }

    }


}