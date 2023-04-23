package ru.badmitry.world.di.modules.fragmentmodules

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import ru.badmitry.world.di.annotations.ViewModelKey
import ru.badmitry.world.viewmodels.SelectCategoriesViewModel

@Module
interface SelectCategoriesFragmentModule {
    @Binds
    @IntoMap
    @ViewModelKey(SelectCategoriesViewModel::class)
    fun selectCategoriesViewModel(fragmentViewModel: SelectCategoriesViewModel): ViewModel
}
