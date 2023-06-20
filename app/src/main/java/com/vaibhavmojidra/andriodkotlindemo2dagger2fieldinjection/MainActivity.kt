package com.vaibhavmojidra.andriodkotlindemo2dagger2fieldinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var playGame: PlayGame
    @Inject lateinit var smartPhone: SmartPhone

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerPlayGameComponent.create().inject(this)

        playGame.playGame()

        Log.i("MyTag","----------")

        smartPhone.isSmartPhoneAvailable()

    }
}