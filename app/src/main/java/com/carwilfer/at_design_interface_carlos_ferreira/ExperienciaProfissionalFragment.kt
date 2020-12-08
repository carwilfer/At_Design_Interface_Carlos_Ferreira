package com.carwilfer.at_design_interface_carlos_ferreira

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ExperienciaProfissionalFragment : Fragment() {

    companion object {
        fun newInstance() = ExperienciaProfissionalFragment()
    }

    private lateinit var viewModel: ExperienciaProfissionalViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.experiencia_profissional_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ExperienciaProfissionalViewModel::class.java)
        // TODO: Use the ViewModel
    }

}