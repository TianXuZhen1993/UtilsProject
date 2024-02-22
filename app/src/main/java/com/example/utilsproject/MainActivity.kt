package com.example.utilsproject

import android.os.Bundle
import com.example.utilsproject.base.BaseActivity
import com.example.utilsproject.databinding.ActivityMainBinding
import com.example.utilsproject.utils.inflate

/**
 * @author: TXZ
 * @version: 1.0
 * @date: created by 2024/1/1 22:11
 */
class MainActivity : BaseActivity() {
    private val binding: ActivityMainBinding by inflate()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}