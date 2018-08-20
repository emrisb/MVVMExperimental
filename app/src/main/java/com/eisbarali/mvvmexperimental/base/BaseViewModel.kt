package com.eisbarali.mvvmexperimental.base

import android.arch.lifecycle.ViewModel
import com.eisbarali.mvvmexperimental.di.component.DaggerViewModelInjector
import com.eisbarali.mvvmexperimental.di.component.ViewModelInjector
import com.eisbarali.mvvmexperimental.di.module.NetworkModule
import com.eisbarali.mvvmexperimental.ui.post.PostListViewModel

abstract class BaseViewModel : ViewModel() {
    private val injector: ViewModelInjector = DaggerViewModelInjector
            .builder()
            .networkModule(NetworkModule)
            .build()

    init {
        inject()
    }

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
        }
    }
}