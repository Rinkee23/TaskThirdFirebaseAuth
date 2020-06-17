package `in`.surelocal.taskthirdfirebaseauth.signup

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import `in` .surelocal.taskthirdfirebaseauth.R
import kotlinx.android.synthetic.main.login_screen_fragment.*
import kotlinx.android.synthetic.main.sign_up_fragment.*

class SignUpFragment : Fragment() {

    companion object {
        fun newInstance() = SignUpFragment()
    }

    private lateinit var viewModel: SignUpViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.sign_up_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SignUpViewModel::class.java)

        // SignUp Code

        login_screen_create_account.setOnClickListener(){
            val name = sign_up_fragment_name.text.toString()
            val mobileNom = sign_up_fragment_mblNo.text.toString()
            val emailId= sign_up_fragment_EmailId.text.toString()
            val pass = sign_up_fragment_password.text.toString()
            val confirmPass = sign_up_fragment_confirm_password.text.toString()
            if (name.isEmpty()){
                

            }
        }
    }

}
