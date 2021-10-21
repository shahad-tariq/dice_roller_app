package com.example.dice_roller_app.ui.fragment.home

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.example.dice_roller_app.R
import com.example.dice_roller_app.databinding.FragmentHomeBinding
import com.example.dice_roller_app.ui.base.BaseFragment
import java.util.*


class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    override val layoutId: Int = R.layout.fragment_home
    override val LOG_TAG: String = "HOME_FRAGMENT"
    override val viewModel: HomeViewModel by viewModels()

    override val bindingInflater: (LayoutInflater, Int, ViewGroup?, Boolean) ->
    FragmentHomeBinding = DataBindingUtil::inflate

    override fun setUp() {
        binding?.apply {
            lifecycleOwner = viewLifecycleOwner
            viewModelHome = this@HomeFragment.viewModel
        }
    }

}