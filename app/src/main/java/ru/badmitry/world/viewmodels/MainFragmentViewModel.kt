package ru.badmitry.world.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.github.terrakok.cicerone.Router
import com.yandex.metrica.YandexMetrica
import ru.badmitry.world.navigation.Screens
import ru.badmitry.world.navigation.WorldTasks
import javax.inject.Inject

class MainFragmentViewModel @Inject constructor(
    private val router: Router,
    app: Application
) : AndroidViewModel(app) {

    fun onItemClick(task: WorldTasks) {
        YandexMetrica.reportEvent("001_choose_game", mapOf("TIPE" to task.name))
        router.navigateTo(Screens.selectScreen(task))
    }
}