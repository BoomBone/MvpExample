package com.example.mvp.present

import com.example.mvp.present.view.MainView

/**
 * Created by pc on 2018/4/8.
 */
class MainPresent<T : MainView> {
    lateinit var mView: T
    fun show() {
        mView.result()
    }
}