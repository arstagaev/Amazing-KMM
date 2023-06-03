package com.arstagaev.testkmm10.android.component

sealed class Screen(val route: String) {
    object Main: Screen(route = "home_screen")
    object Detail: Screen(route = "detail_screen/{id}")
}