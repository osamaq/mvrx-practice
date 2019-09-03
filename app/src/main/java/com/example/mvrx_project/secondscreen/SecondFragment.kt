package com.example.mvrx_project.secondscreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.airbnb.mvrx.existingViewModel
import com.example.mvrx_project.FormViewModel
import com.example.mvrx_project.R
import com.example.mvrx_project.core.BaseFragment
import kotlinx.android.synthetic.main.second_fragment.*

class SecondFragment : BaseFragment() {

    private val viewModel: FormViewModel by existingViewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.second_fragment, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonTwo.setOnClickListener {
            it.findNavController().navigate(R.id.action_secondFragment_to_thirdFragment)
        }

    }

    override fun invalidate() {
    }
}