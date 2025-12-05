package com.msd.npkitty.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.msd.npkitty.features.offline.presentation.OfflineScreen
import com.msd.npkitty.features.webpage.presentation.WebpageScreen

@Composable
fun AppNavigation(
    navController: NavHostController = rememberNavController(),
    startDestination: Any = Routes.Webpage
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable<Routes.Webpage> {
            WebpageScreen()
        }
        composable<Routes.Offline> {
            OfflineScreen()
        }
    }
}