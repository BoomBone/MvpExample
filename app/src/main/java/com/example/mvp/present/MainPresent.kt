package com.example.mvp.present

import com.example.mvp.data.Name
import com.example.mvp.present.view.MainView

/**
 * Created by pc on 2018/4/8.
 */
class MainPresent<T : MainView> {
    lateinit var mView: T
    fun show(name: String, hobby: String) {
        val uName = Name(name, hobby)
        mView.result(uName)
    }
}