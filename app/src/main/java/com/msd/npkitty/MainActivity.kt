package com.msd.npkitty

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.msd.npkitty.core.common.NetworkConnectivity
import com.msd.npkitty.core.theme.NPKittyTheme
import com.msd.npkitty.navigation.AppNavigation
import com.msd.npkitty.navigation.Routes

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val startDestination = if (NetworkConnectivity.isOnline(this)) {
            Routes.Webpage
        } else {
            Routes.Offline
        }

        setContent {
            NPKittyTheme {
                AppNavigation(startDestination = startDestination)
            }
        }
    }
}
