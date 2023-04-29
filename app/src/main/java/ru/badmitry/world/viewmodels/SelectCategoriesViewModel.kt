package ru.badmitry.world.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.github.terrakok.cicerone.Router
import ru.badmitry.world.navigation.Screens
import ru.badmitry.world.navigation.WorldTasks
import javax.inject.Inject

class SelectCategoriesViewModel @Inject constructor(
    private val router: Router,
    app: Application
) : AndroidViewModel(app) {
    val titleLiveData: MutableLiveData<Int> = MutableLiveData()
    private var task = WorldTasks.LEARN
    fun setTask(taskId: Int) {
        task = WorldTasks.values().findLast { it.ordinal == taskId } ?: WorldTasks.LEARN
        titleLiveData.postValue(task.taskNameId)
    }

    fun onItemClick(id: Int) {
        when (task) {
            WorldTasks.LEARN -> router.navigateTo(Screens.learnScreen(id))
            WorldTasks.WRITE -> router.navigateTo(Screens.writeScreen(id))
            WorldTasks.FIND -> router.navigateTo(Screens.findScreen(id))
        }
    }
}