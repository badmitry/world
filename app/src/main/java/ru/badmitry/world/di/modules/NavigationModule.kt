package ru.badmitry.world.di.modules

import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.Router
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class NavigationModule {

    @Singleton
    @Provides
    fun getMainCicerone() = Cicerone.create()

    @Singleton
    @Provides
    fun getMainRouter(cicerone: Cicerone<Router>) = cicerone.router

    @Singleton
    @Provides
    fun getMainNavigatorHolder(cicerone: Cicerone<Router>) =
        cicerone.getNavigatorHolder()
}
