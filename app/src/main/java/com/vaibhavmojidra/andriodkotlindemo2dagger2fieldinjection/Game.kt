package com.vaibhavmojidra.andriodkotlindemo2dagger2fieldinjection

import android.util.Log
import javax.inject.Inject


class Game  @Inject constructor() {

    init {
        Log.i("MyTag","Game Class is initialized.")
    }

    fun isGameDownloaded(){
        Log.i("MyTag","Game is already downloaded.")
    }
}
