package com.tian.utilsproject

import android.os.Bundle
import com.blankj.utilcode.util.ActivityUtils
import com.blankj.utilcode.util.LogUtils
import com.tian.utilsproject.base.BaseActivity
import com.tian.utilsproject.databinding.ActivityMainBinding
import com.tian.utilsproject.utils.inflate

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
        initView()
        initData()


    }

    private fun initView() {
        ActivityUtils.getActivityList().forEach {
            LogUtils.d(it.localClassName)
        }
        LogUtils.getCurrentLogFilePath().apply {
            LogUtils.d(this)
        }
    }

    private fun initData() {

    }
}