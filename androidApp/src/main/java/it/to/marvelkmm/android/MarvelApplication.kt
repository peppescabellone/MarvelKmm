package it.to.marvelkmm.android

import android.app.Application
import it.to.marvelkmm.data.di.initKoin
import org.koin.core.component.KoinComponent

class MarvelApplication : Application(), KoinComponent {

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }
}