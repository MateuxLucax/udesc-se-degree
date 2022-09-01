package dev.mateux.socket.test.socket

import android.os.Handler
import android.os.Looper
import android.util.Log
import java.io.IOException
import java.io.InputStream
import java.net.InetSocketAddress
import java.net.Socket
import java.util.concurrent.Executors

class Client(private val hostAddress: String = "10.0.2.2", private val port: Int = 80) : Thread() {

    private lateinit var inputStream: InputStream
    private lateinit var socket: Socket
    private var response: String = ""

    override fun run() {
        try {
            socket = Socket()
            socket.connect(InetSocketAddress(hostAddress, port), 500)
            inputStream = socket.getInputStream()
        } catch (e: IOException) {
            Log.e(e.message, e.stackTraceToString())
        }

        val executor = Executors.newSingleThreadExecutor()
        val handler = Handler(Looper.getMainLooper())

        executor.execute(kotlinx.coroutines.Runnable {
            kotlin.run {
                val buffer = ByteArray(1024)
                var byte: Int
                while (true) {
                    try {
                        byte = inputStream.read(buffer)
                        if (byte > 0) {
                            val finalBytes = byte
                            handler.post(Runnable {
                                kotlin.run {
                                    val message = String(buffer, 0, finalBytes)
                                    response = message

                                    Log.i("Client", message)
                                }
                            })
                        }
                    } catch (e: IOException) {
                        Log.e(e.message, e.stackTraceToString())
                    }
                }
            }
        })
    }

    fun getMessage(): String {
        return response
    }

}