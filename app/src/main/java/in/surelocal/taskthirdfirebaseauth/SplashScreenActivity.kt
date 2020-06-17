package `in`.surelocal.taskthirdfirebaseauth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        supportFragmentManager.beginTransaction().replace(R.id.splash_container,SplashScreenFragment.newInstance())
            .commit()
    }
}
