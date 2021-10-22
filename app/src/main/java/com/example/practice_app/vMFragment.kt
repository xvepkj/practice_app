package com.example.practice_app

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController

class vMFragment : Fragment() {
    private val viewModel : VMViewModel by viewModels()
    companion object {
        fun newInstance() = vMFragment()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Fragment LifeCycle","onCreate Called!")
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("Fragment LifeCycle","onCreateView Called!")
        return inflater.inflate(R.layout.v_m_fragment, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Fragment LifeCycle","onViewCreated Called!")
        val addButton : Button = view.findViewById(R.id.addButton)
        val implicitActionButton : Button = view.findViewById(R.id.implicit_action_button)
        val navToAnotherFragment : Button = view.findViewById(R.id.nav_AnotherFrag)
        val currentCount : TextView = view.findViewById(R.id.curentCount)
        currentCount.text = viewModel.count.toString()
        addButton.setOnClickListener{
            viewModel.addOneToCount()
            currentCount.text = viewModel.count.toString()
        }
        implicitActionButton.setOnClickListener{
            val sendIntent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "Hi")
                type = "text/plain"
            }
            startActivity(sendIntent)
        }
        navToAnotherFragment.setOnClickListener{

            findNavController().navigate(R.id.action_vMFragment_to_VBFragment2)

        }
    }
    override fun onStart() {
        super.onStart()
        Log.d("Fragment LifeCycle","onStart Called!")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Fragment LifeCycle","onResume Called!")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Fragment LifeCycle","onPause Called!")
    }
    override fun onStop() {
        super.onStop()
        Log.d("Fragment LifeCycle", "onStop Called!")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Fragment LifeCycle","onDestroyView Called!")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Fragment LifeCycle","onDestroy Called!")
    }
}