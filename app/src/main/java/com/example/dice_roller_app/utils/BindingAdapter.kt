package com.example.dice_roller_app.utils

import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.example.dice_roller_app.R


@BindingAdapter(value = ["app:valueResource"])
fun setImageResource(imgView: ImageView, valueResource: Int?) {
    AnimationUtils.loadAnimation(imgView.context, R.anim.shake_animation).apply {
        imgView.startAnimation(this)
        setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(arg0: Animation) {}
            override fun onAnimationRepeat(arg0: Animation) {}
            override fun onAnimationEnd(arg0: Animation) {
                valueResource?.let { imgView.setImageResource(it) }
            }
        })
    }


}