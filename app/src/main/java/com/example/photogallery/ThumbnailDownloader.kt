package com.example.photogallery

import android.os.HandlerThread
import android.util.Log
import androidx.lifecycle.*

class ThumbnailDownloader<in T> : HandlerThread(TAG), DefaultLifecycleObserver {
    companion object {
        private const val TAG = "ThumbnailDownloader"
    }

    private var hasQuit = false


    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        Log.i(TAG, "Starting background thread")
        start()
        looper
    }

    override fun onDestroy(owner: LifecycleOwner) {
        super.onDestroy(owner)
        Log.i(TAG, "Destroying background thread")
        quit()
    }

    override fun quit(): Boolean {
        hasQuit = true
        return super.quit()
    }

    fun queueThumbnail(target: T, url: String) {
        Log.i(TAG, "queueThumbnail: Got a URL: $url")
    }
}