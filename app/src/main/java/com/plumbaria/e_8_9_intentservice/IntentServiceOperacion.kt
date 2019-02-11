package com.plumbaria.e_8_9_intentservice

import android.annotation.SuppressLint
import android.app.IntentService
import android.content.Intent
import android.content.Context
import android.os.SystemClock



class IntentServiceOperacion() : IntentService("IntentServiceOperacion") {

    //@SuppressLint("WrongThread")
    override fun onHandleIntent(p0: Intent?) {
        var n : Double = p0?.extras?.getDouble("numero")!!
        SystemClock.sleep(5000)
        //MainActivity().Salida.append(""+ n*n + "\n")
        var i : Intent = Intent()
        i.setAction(MainActivity().ReceptorOperacion().ACTION_RESP)
        i.addCategory(Intent.CATEGORY_DEFAULT)
        i.putExtra("resultado",n*n)
        sendBroadcast(i)
    }
}