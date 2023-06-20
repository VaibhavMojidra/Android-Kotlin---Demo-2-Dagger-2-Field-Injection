package com.vaibhavmojidra.andriodkotlindemo2dagger2fieldinjection

import android.util.Log
import javax.inject.Inject

class PlayGame @Inject constructor(game:Game, smartPhone:SmartPhone){

    init {
        game.isGameDownloaded()
        smartPhone.isSmartPhoneAvailable()
        Log.i("MyTag","PlayGame Class is initialized.")
    }

    fun playGame(){
        Log.i("MyTag","Starting game...")
    }
}