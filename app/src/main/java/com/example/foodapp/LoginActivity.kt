package com.example.foodapp

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import com.example.foodapp.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth
import org.w3c.dom.Text

class LoginActivity : AppCompatActivity() {
//
//    //    viewbinding
//    private lateinit var binding: ActivityLoginBinding
////
//    //    actionbar
//    private lateinit var actionBar: ActionBar
//
//    //    progressdialog
//    private lateinit var progressDialog: ProgressDialog
//
//    //    firebaseauth
//    private lateinit var firebaseAuth: FirebaseAuth
//    private  var email = ""
//    private var password = ""
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_login)

//        //    configure actionbar
//        actionBar = supportActionBar!!
//        actionBar.title = "Login"
//
////    configure progress dialog
//        progressDialog = ProgressDialog(this)
//        progressDialog.setTitle("Please wait")
//        progressDialog.setMessage("Logging In....")
//        progressDialog.setCanceledOnTouchOutside(false)
//
////        init firebaseAuth
//        firebaseAuth = FirebaseAuth.getInstance()
//        checkUser()
//
////        handle click, open signupactivity
//        binding.noAccountTv.setOnClickListener{
//            startActivity(Intent(this, SignUpActivity::class.java))
//        }
////
////        handle click, begin login
//        binding.loginBtn.setOnClickListener {
////            validateData()
//        }
//
//
//    }
//
//    private fun validateData() {
////        get data
//        email = binding.emailEt.text.toString().trim()
//        password = binding.passwordEt.text.toString().trim()
//
////        validate data
//        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
//            binding.emailEt.error = "Invalid email format"
//        }
//        else if (TextUtils.isEmpty(password)){
//            binding.passwordEt.error = "Please enter password"
//        }
//        else{
////            data validated begin login
//            firebaseLogin()
//        }
//    }
        val buttonClick =findViewById<Button>(R.id.loginBtn)
        buttonClick.setOnClickListener {
            val intent =Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

//        val noacc =findViewById<Button>(R.id.noAccountTv)
//        noacc.setOnClickListener {
//            val intent =Intent(this, SignUpActivity::class.java)
//            startActivity(intent)
//            finish()
//        }

//    private fun firebaseLogin() {
////        show progress
//        progressDialog.show()
//        firebaseAuth.signInWithEmailAndPassword(email, password)
//            .addOnSuccessListener {
////                login successful
//                progressDialog.dismiss()
//                val firebaseUser = firebaseAuth.currentUser
//                val email = firebaseUser!!.email
//                Toast.makeText(this, "LoggedIn as$email", Toast.LENGTH_SHORT).show()
//
////                open profile
//                startActivity(Intent(this, IntroActivity::class.java))
//                finish()
//            }
//            .addOnFailureListener { e->
////                login failed
//                progressDialog.dismiss()
//                Toast.makeText(this, "Login failed due to ${e.message}", Toast.LENGTH_SHORT).show()
//            }
//    }
//
//    private fun checkUser() {
////        if user is already logged in to profile activity
////        get current user
//        val firebaseUser = firebaseAuth.currentUser
//        if (firebaseUser != null){
////            user already logged in
//            startActivity(Intent(this, IntroActivity::class.java ))
//            finish()
//        }
    }

}