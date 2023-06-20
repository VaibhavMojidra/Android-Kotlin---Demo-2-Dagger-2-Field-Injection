package com.vaibhavmojidra.andriodkotlindemo2dagger2fieldinjection

import dagger.Component

@Component
interface PlayGameComponent {

    fun inject(mainActivity: MainActivity)
}