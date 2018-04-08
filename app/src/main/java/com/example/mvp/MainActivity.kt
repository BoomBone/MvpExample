package com.example.mvp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.mvp.data.Name
import com.example.mvp.present.MainPresent
import com.example.mvp.present.view.MainView
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity(), MainView {
    override fun result(inputName: Name) {
        toast(inputName.name + "————————————————————————————————————" + inputName.hobby)
    }

    /**
     * 创建Present
     */
    lateinit var present: MainPresent<MainView>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initPresent()
        initView()
    }

    private fun initPresent() {
        present = MainPresent()
        present.mView = this
    }

    private fun initView() {
        mButton.setOnClickListener {
            val name = mName.text.toString()
            val hobby = mName.text.toString()
            present.show(name, hobby)
        }
    }
}
