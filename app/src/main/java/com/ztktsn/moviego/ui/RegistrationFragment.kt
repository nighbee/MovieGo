package com.ztktsn.moviego.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ztktsn.moviego.R
import com.ztktsn.moviego.databinding.FragmentLoginBinding
import com.ztktsn.moviego.databinding.FragmentRegistrationBinding
import com.ztktsn.moviego.userData.UserData




class RegistrationFragment : Fragment() {
    private var _binding: FragmentRegistrationBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRegistrationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.createAccount.setOnClickListener {
            val login = binding.emailInput.text.toString()
            val password = binding.passwordInput.text.toString()

            UserData(requireContext()).setAuthorized()

            findNavController().navigate(R.id.action_registration_to_home)
        }
        binding.haveLogin.setOnClickListener({
            findNavController().navigate(R.id.action_registration_to_login)
        })
    }


}