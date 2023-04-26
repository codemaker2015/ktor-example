package com.example.ktorexample.core

import androidx.activity.ComponentActivity
import com.example.ktorexample.data.remote.Config

open class MainApplication : ComponentActivity() {
     val service = Config().create()
}