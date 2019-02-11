package com.plumbaria.e_8_9_intentservice

import android.annotation.SuppressLint
import android.app.IntentService
import android.content.Intent
import android.content.Context
import android.os.SystemClock



class IntentServiceOperacion() : IntentService("IntentServiceOperacion") {

    @SuppressLint("WrongThread")
    override fun onHandleIntent(p0: Intent?) {
        var n : Double = p0?.extras?.getDouble("numero")!!
        SystemClock.sleep(5000)
        MainActivity().Salida.append(""+ n*n + "\n")
    }
}