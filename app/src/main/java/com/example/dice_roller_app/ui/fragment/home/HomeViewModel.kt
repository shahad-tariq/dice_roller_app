package com.example.dice_roller_app.ui.fragment.home

import androidx.lifecycle.MutableLiveData
import com.example.dice_roller_app.repository.Repository
import com.example.dice_roller_app.ui.base.BaseViewModel


class HomeViewModel : BaseViewModel() {

    var imgResourceDice: MutableLiveData<Int?> =
        MutableLiveData(Repository.getImageRandomDice())
        private set

    fun getRandomImageDice() =
        imgResourceDice.postValue(Repository.getImageRandomDice())


}