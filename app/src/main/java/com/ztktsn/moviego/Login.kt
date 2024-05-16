package com.ztktsn.moviego



import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController

import com.ztktsn.moviego.databinding.ActivityLoginBinding
import com.ztktsn.moviego.ui.HomeFragment
import com.ztktsn.moviego.userData.User
import com.ztktsn.moviego.userData.UserData

class Login : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.loginButton.setOnClickListener {
//            val email = emailInput.text.toString()
//            val password = passwordInput.text.toString()
//
//            val intent = Intent(this, HomeFragment::class.java)
//            intent.putExtra("email", email)
//            intent.putExtra("password", password)
//            startActivity(intent)
            val fragment = HomeFragment()
            supportFragmentManager.beginTransaction().replace(R.id.home,
                fragment).commit()
        }

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        binding = ActivityLoginBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        OnClickListener
//        setupNavigation()
//    }
//
//    private fun setupNavigation() {
//        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navigation) as NavHostFragment
//        navController = navHostFragment.navController
//
//        val navGraph = navController.navInflater.inflate(R.navigation.navigation)
//        when {
//            UserData(this).isAuthorized() -> { navGraph.setStartDestination(R.id.movie_list_fragment)
//            }
//
//            UserData(this).isAuthorized() -> {
//                navGraph.setStartDestination(R.id.login_fragment)
//            }
//        }
//        navController.graph = navGraph
//    }
//
//    override fun onBackPressed() {
//        super.onBackPressed()
//    }

//    fun onLoginClicked(view: View) {
//
//        val homeFragment = HomeFragment()
//
//        val fragmentContainer = findViewById<FrameLayout>(R.id.homeFragment)
//
//        supportFragmentManager.beginTransaction()
//            .replace(fragmentContainer.id, homeFragment)
//            .commit()
//    }
        }
    }
