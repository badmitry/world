package ru.badmitry.world.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.github.terrakok.cicerone.Router
import ru.badmitry.world.navigation.Screens
import ru.badmitry.world.navigation.WorldTasks
import javax.inject.Inject

class MainFragmentViewModel @Inject constructor(
    private val router: Router,
    app: Application
) : AndroidViewModel(app) {

    fun onItemClick(task: WorldTasks) {
        router.navigateTo(Screens.selectScreen(task))
    }
}