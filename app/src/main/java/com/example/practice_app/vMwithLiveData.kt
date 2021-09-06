package com.example.practice_app

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer

class vMwithLiveData : Fragment() {
    private val viewModel : VMwithLiveDataViewModel by viewModels()
    companion object {
        fun newInstance() = vMwithLiveData()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.v_mwith_live_data_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val addButton : Button = view.findViewById(R.id.addButton2)
        val currentCount : TextView = view.findViewById(R.id.curentCount2)
        addButton.setOnClickListener{
            viewModel.addOneToCount()
        }
        viewModel.count.observe(viewLifecycleOwner, Observer{
            newCount -> currentCount.text = viewModel.count.value.toString()
        })
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        // TODO: Use the ViewModel
    }

}