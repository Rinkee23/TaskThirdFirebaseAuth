package `in`.surelocal.taskthirdfirebaseauth.login

import `in`.surelocal.taskthirdfirebaseauth.MainActivity
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import `in`.surelocal.taskthirdfirebaseauth.R
import `in`.surelocal.taskthirdfirebaseauth.signup.SignUpActivity
import `in`.surelocal.taskthirdfirebaseauth.signup.SignUpFragment
import android.content.Intent
import android.util.Patterns
import android.util.Patterns.EMAIL_ADDRESS
import android.widget.Toast
import androidx.core.util.PatternsCompat.EMAIL_ADDRESS
import kotlinx.android.synthetic.main.login_screen_fragment.*
import kotlinx.android.synthetic.main.sign_up_fragment.*
import java.util.regex.Pattern

class LoginScreenFragment : Fragment() {

    companion object {
        fun newInstance() = LoginScreenFragment()
    }

    private lateinit var viewModel: LoginScreenViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.login_screen_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(LoginScreenViewModel::class.java)

        login_screen_create_btn.setOnClickListener() {
            val email = login_screen_fragment_email.text.toString().trim()
            val  password = login_screen_fragment_password.text.toString().trim()
            if (email.isEmpty()){
                login_screen_fragment_inputLayout.error="Empty"
                login_screen_fragment_inputLayout.requestFocus()
            }else if (password.isEmpty()){
                login_screen_fragment_inputLayoutTwo.error="Empty"
                login_screen_fragment_inputLayoutTwo.requestFocus()
            }else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                login_screen_fragment_inputLayout.error="invalid Email"
                login_screen_fragment_inputLayout.requestFocus()
            }else{
                Toast.makeText(requireContext(),"login Successful",Toast.LENGTH_SHORT).show()
                val intent = Intent(requireContext(),MainActivity::class.java)
                startActivity(intent)
                (requireContext() as SignUpActivity).finish()
            }
        }
        login_screen_create_account.setOnClickListener(){
            Toast.makeText(requireContext(),"login Successful",Toast.LENGTH_SHORT).show()
            val intent = Intent(requireContext(),SignUpActivity::class.java)
            startActivity(intent)
            (requireContext() as LoginActivity).finish()
        }

    }

}
