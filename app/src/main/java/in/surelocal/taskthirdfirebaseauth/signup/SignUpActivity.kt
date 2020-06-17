package `in`.surelocal.taskthirdfirebaseauth.signup

import `in`.surelocal.taskthirdfirebaseauth.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        supportFragmentManager.beginTransaction()
            .replace(R.id.signUp_container,SignUpFragment.newInstance())
            .commit()
    }
}


