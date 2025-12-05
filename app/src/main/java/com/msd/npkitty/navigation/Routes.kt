package com.msd.npkitty.navigation

import kotlinx.serialization.Serializable

@Serializable
object Routes {

    @Serializable
    data object Webpage

    @Serializable
    data object Offline
}