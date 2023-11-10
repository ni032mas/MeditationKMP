package org.meditation

import android.app.Application
import android.content.Context

class MediationApp : Application() {
    companion object {
        lateinit var appContext: Context
    }

    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext
    }

}