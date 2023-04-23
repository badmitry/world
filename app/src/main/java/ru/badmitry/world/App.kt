package ru.badmitry.world

import ru.badmitry.world.di.DaggerAppComponent
import dagger.android.DaggerApplication


class App : DaggerApplication() {

    override fun applicationInjector() = DaggerAppComponent.builder()
        .application(this)
        .build()
}