package com.tian.utilsproject

import android.os.Bundle
import com.tian.utils.inflateBinding
import com.tian.utilsproject.base.BaseActivity
import com.tian.utilsproject.databinding.ActivityMainBinding
import kotlin.properties.Delegates

/**
 * @author: TXZ
 * @version: 1.0
 * @date: created by 2024/1/1 22:11
 */
class MainActivity : BaseActivity() {
    private var title: String by Delegates.observable("MainActivity") { property, oldValue, newValue ->
        binding.title.title = title
    }

    private val binding: ActivityMainBinding by inflateBinding()
    private var id = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btn.setOnClickListener {
            id++
            title = "Title" + id
        }
    }
}