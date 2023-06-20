package com.vaibhavmojidra.andriodkotlindemo2dagger2fieldinjection

import android.util.Log
import javax.inject.Inject

class SmartPhone @Inject constructor(battery:Battery) {
    init {
        battery.isBatteryCharged()
        Log.i("MyTag","SmartPhone Class is initialized.")
    }

    fun isSmartPhoneAvailable(){
        Log.i("MyTag","SmartPhone is available.")
    }
}
