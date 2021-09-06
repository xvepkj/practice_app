package com.example.practice_app

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.viewModels

class vMFragment : Fragment() {
    private val viewModel : VMViewModel by viewModels()
    companion object {
        fun newInstance() = vMFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("vM","Fragment Created")
        return inflater.inflate(R.layout.v_m_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val addButton : Button = view.findViewById(R.id.addButton)
        val currentCount : TextView = view.findViewById(R.id.curentCount)

        currentCount.text = viewModel.count.toString()
        addButton.setOnClickListener{
            viewModel.addOneToCount()
            currentCount.text = viewModel.count.toString()
        }
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("vM","Fragment Destroyed!")
    }
}