package ru.badmitry.world.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.github.terrakok.cicerone.Router
import ru.badmitry.world.navigation.Screens
import ru.badmitry.world.navigation.Tasks
import javax.inject.Inject

class SelectCategoriesViewModel @Inject constructor(
    private val router: Router,
    app: Application
) : AndroidViewModel(app) {
    val titleLiveData: MutableLiveData<Int> = MutableLiveData()
    private var task = Tasks.LEARN
    fun setTask(taskId: Int) {
        task = Tasks.values().findLast { it.ordinal == taskId } ?: Tasks.LEARN
        titleLiveData.postValue(task.taskNameId)
    }

    fun onItemClick(id: Int) {
        when (task) {
            Tasks.LEARN -> router.navigateTo(Screens.learnScreen(id))
            Tasks.WRITE -> router.navigateTo(Screens.writeScreen(id))
            Tasks.FIND -> router.navigateTo(Screens.findScreen(id))
        }
    }
}