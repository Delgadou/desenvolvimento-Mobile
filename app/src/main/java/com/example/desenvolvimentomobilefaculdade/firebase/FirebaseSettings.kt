package com.example.desenvolvimentomobilefaculdade.firebase

import com.google.firebase.firestore.ktx.firestoreSettings
import com.google.firebase.remoteconfig.ktx.BuildConfig
import com.google.firebase.remoteconfig.ktx.remoteConfigSettings

val remoteConfigSettings = remoteConfigSettings {
    if (BuildConfig.DEBUG) {
        minimumFetchIntervalInSeconds = 3_600
    } else {
        fetchTimeoutInSeconds = 5
    }
}

val firestoreSettings = firestoreSettings {
    isPersistenceEnabled = false
}