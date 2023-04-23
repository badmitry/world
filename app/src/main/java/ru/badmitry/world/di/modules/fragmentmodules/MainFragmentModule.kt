package ru.badmitry.world.di.modules.fragmentmodules

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import ru.badmitry.world.di.annotations.ViewModelKey
import ru.badmitry.world.viewmodels.MainFragmentViewModel

@Module
interface MainFragmentModule {
    @Binds
    @IntoMap
    @ViewModelKey(MainFragmentViewModel::class)
    fun mainFragmentViewModel(fragmentViewModel: MainFragmentViewModel): ViewModel
}
