package com.carwilfer.at_design_interface_carlos_ferreira

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FormacaoFragment : Fragment() {

    companion object {
        fun newInstance() = FormacaoFragment()
    }

    private lateinit var viewModel: FormacaoViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.formacao_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FormacaoViewModel::class.java)
        // TODO: Use the ViewModel
    }

}