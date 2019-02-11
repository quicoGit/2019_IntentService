package com.plumbaria.e_8_9_intentservice

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.os.SystemClock
import kotlinx.android.synthetic.main.activity_main.salida

class ServicioOperacion : Service(){
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        var n : Double = intent?.extras?.getDouble("numero")!!
        SystemClock.sleep(25000)
        MainActivity().Salida.append(""+ n*n + "\n");
        return START_NOT_STICKY
    }

    override fun onBind(p0: Intent?): IBinder {
        return null!!
    }
}