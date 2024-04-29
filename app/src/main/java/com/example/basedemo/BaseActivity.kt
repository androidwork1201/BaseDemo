package com.example.basedemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<B : ViewDataBinding> : AppCompatActivity() {

    open lateinit var binding: B

    abstract fun getLayoutRes(): Int

    /**
     * 初始化View
     * */
    abstract fun initView()

    /**
     * 初始化觀察者、監聽器等等在這實現
     * */
    abstract fun initial()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, getLayoutRes())
        binding.lifecycleOwner = this

        initView()
        initial()
    }
}