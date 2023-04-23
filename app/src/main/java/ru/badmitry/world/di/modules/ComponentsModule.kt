package ru.badmitry.world.di.modules

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ru.badmitry.world.MainActivity
import ru.badmitry.world.di.modules.fragmentmodules.MainFragmentModule
import ru.badmitry.world.di.modules.fragmentmodules.SelectCategoriesFragmentModule
import ru.badmitry.world.fragments.FragmentMain
import ru.badmitry.world.fragments.FragmentSelectCategories

@Module
interface ComponentsModule {

    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    fun mainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [SelectCategoriesFragmentModule::class])
    fun fragmentSelectCategories(): FragmentSelectCategories

    @ContributesAndroidInjector(modules = [MainFragmentModule::class])
    fun fragmentMain(): FragmentMain
}
