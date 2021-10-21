package com.example.dice_roller_app.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB : ViewBinding>() : Fragment() {

    abstract val layoutId: Int
    abstract val LOG_TAG: String
    lateinit var binding: VB
        private set
    abstract val viewModel: BaseViewModel
    abstract val bindingInflater: (LayoutInflater, Int, ViewGroup?, Boolean) -> VB

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ) = bindingInflater(inflater, layoutId, container, false).apply { binding = this }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUp()
    }

    abstract fun setUp()

}