package com.example.chatapplication.navigation


import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.chatapplication.screens.ChatScreen
import com.example.chatapplication.screens.HomeScreen
import com.example.chatapplication.screens.StartScreen
import com.example.chatapplication.signin.ProfileScreen
import com.example.chatapplication.signin.SignInScreen


@Composable
fun MainNavController(


    navController: NavHostController,
) {




    val context = LocalContext.current


    val coroutineScope = rememberCoroutineScope()






    NavHost(
        navController = navController,
        startDestination = Screens.SplashScreen.route,
    ) {








        composable(Screens.StartScreen.route) {
            StartScreen(navController = navController)
        }


        composable(Screens.HomeScreen.route) {
            HomeScreen(navHostController = navController)
        }


        composable(Screens.SplashScreen.route) {
            SplashScreen(navController = navController)
        }


        composable(Screens.ChatScreen.route) {
            ChatScreen(navController = navController)
        }


        composable(Screens.ProfileScreen.route) {
            ProfileScreen(navController = navController)
        }


        composable(Screens.SignInScreen.route) {
            SignInScreen(navController = navController)
        }

 


    }
}
