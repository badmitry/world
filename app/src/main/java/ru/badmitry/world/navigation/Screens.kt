package ru.badmitry.world.navigation

import com.github.terrakok.cicerone.androidx.FragmentScreen
import ru.badmitry.world.fragments.*

object Screens {
    fun mainScreen() = FragmentScreen {
        FragmentMain()
    }

    fun selectScreen(task: WorldTasks) = FragmentScreen {
        FragmentSelectCategories.newInstance(task.ordinal)
    }

    fun learnScreen(id: Int) = FragmentScreen {
        FragmentLearn.newInstance(id)
    }

    fun writeScreen(id: Int) = FragmentScreen {
        FragmentWrite.newInstance(id)
    }

    fun findScreen(id: Int) = FragmentScreen {
        FragmentFind.newInstance(id)
    }
}