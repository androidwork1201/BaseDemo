package com.example.basedemo

import com.example.basedemo.databinding.ActivityDemoBinding

class DemoActivity: BaseActivity<ActivityDemoBinding>() {
    override fun getLayoutRes(): Int {
        return R.layout.activity_demo
    }

    override fun initView() {

    }

    override fun initial() {

        supportFragmentManager.beginTransaction()
            .replace(binding.container.id, DemoFragment())
            .commit()
    }
}