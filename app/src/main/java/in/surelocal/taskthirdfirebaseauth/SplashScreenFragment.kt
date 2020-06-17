package `in`.surelocal.taskthirdfirebaseauth

import `in`.surelocal.taskthirdfirebaseauth.login.LoginActivity
import android.content.Intent
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.login_screen_fragment.*


class SplashScreenFragment : Fragment() {
   val firebase= FirebaseAuth .getInstance()
    companion object {
        fun newInstance() = SplashScreenFragment()
    }

    private lateinit var viewModel: SplashScreenViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.splash_screen_fragment, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SplashScreenViewModel::class.java)
       Handler().postDelayed({
           if (firebase !=null) {
               val intent = Intent(requireContext(), LoginActivity::class.java)
               startActivity(intent)
               (requireContext() as SplashScreenActivity).finish()
           }else{
               val intent = Intent(requireContext(), MainActivity::class.java)
               startActivity(intent)
               (requireContext() as SplashScreenActivity).finish()

           }
        },1000)
    }



}
