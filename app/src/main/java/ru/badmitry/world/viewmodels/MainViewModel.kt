package ru.badmitry.world.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.github.terrakok.cicerone.Navigator
import com.github.terrakok.cicerone.NavigatorHolder
import com.github.terrakok.cicerone.Router
import ru.badmitry.world.navigation.Screens
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val router: Router,
    private val navigatorHolder: NavigatorHolder,
    app: Application
) : AndroidViewModel(app) {

    fun showMainScreen() {
        router.replaceScreen(Screens.mainScreen())
    }

    fun setNavigator(navigator: Navigator) {
        navigatorHolder.setNavigator(navigator)
    }

    fun onBackPressed() {
        router.exit()
    }
}