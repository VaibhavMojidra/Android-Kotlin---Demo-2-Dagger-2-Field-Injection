package com.vaibhavmojidra.andriodkotlindemo2dagger2fieldinjection

import android.util.Log
import javax.inject.Inject

class Battery @Inject constructor() {
    init {
        Log.i("MyTag","Battery Class is initialized.")
    }

    fun isBatteryCharged(){
        Log.i("MyTag","Battery is fully charged.")
    }
}
