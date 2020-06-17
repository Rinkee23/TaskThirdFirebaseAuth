package `in`.surelocal.taskthirdfirebaseauth.login

import `in`.surelocal.taskthirdfirebaseauth.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportFragmentManager.beginTransaction()
            .replace(R.id.login_container,LoginScreenFragment.newInstance())
            .commit()
    }
}
