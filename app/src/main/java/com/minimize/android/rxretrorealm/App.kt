package com.minimize.android.rxretrorealm

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration

/**
 * Created by ahmedrizwan on 15/03/2016.
 *
 */
class App : Application() {
  override fun onCreate() {
    super.onCreate()
    val realmConfig = RealmConfiguration.Builder(
        this).deleteRealmIfMigrationNeeded().build()
    Realm.setDefaultConfiguration(realmConfig)
  }
}