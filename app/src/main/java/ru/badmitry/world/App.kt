package ru.badmitry.world

import com.yandex.metrica.YandexMetrica
import com.yandex.metrica.YandexMetricaConfig
import dagger.android.DaggerApplication
import ru.badmitry.world.di.DaggerAppComponent


class App : DaggerApplication() {

    override fun applicationInjector() = DaggerAppComponent.builder()
        .application(this)
        .build()

    override fun onCreate() {
        super.onCreate()
        // Creating an extended library configuration.
        val config = YandexMetricaConfig.newConfigBuilder(APP_METRICA_API_KEY).build()
        // Initializing the AppMetrica SDK.
        YandexMetrica.activate(applicationContext, config)
        // Automatic tracking of user activity.
        YandexMetrica.enableActivityAutoTracking(this)
    }

    companion object {
        const val APP_METRICA_API_KEY = "47265c53-3ce2-429e-aa74-dc09c6267ce9"
    }
}