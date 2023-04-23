package ru.badmitry.world.di.modules

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import ru.badmitry.world.di.annotations.ViewModelKey
import ru.badmitry.world.viewmodels.MainViewModel

@Module
interface MainActivityModule {
    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    fun userDevicesViewModel(viewModel: MainViewModel): ViewModel
}
