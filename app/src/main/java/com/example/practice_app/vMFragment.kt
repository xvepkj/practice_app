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

class vMFragment : Fragment() {
    private val viewModel : VMViewModel by viewModels()
    companion object {
        fun newInstance() = vMFragment()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Fragment","onCreate Called!")
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("Fragment","onCreateView Called!")
        return inflater.inflate(R.layout.v_m_fragment, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Fragment","onViewCreated Called!")
        val addButton : Button = view.findViewById(R.id.addButton)
        val implicitActionButton : Button = view.findViewById(R.id.implicit_action_button)
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
    }
    override fun onStart() {
        super.onStart()
        Log.d("Fragment","onStart Called!")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Fragment","onResume Called!")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Fragment","onPause Called!")
    }
    override fun onStop() {
        super.onStop()
        Log.d("Fragment", "onStop Called!")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Fragment","onDestroyView Called!")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Fragment","onDestroy Called!")
    }
}