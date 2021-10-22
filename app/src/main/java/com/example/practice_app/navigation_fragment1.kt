package com.example.practice_app

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [navigation_fragment1.newInstance] factory method to
 * create an instance of this fragment.
 */
class navigation_fragment1 : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_navigation_fragment1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navigateToFragment2 : Button = view.findViewById(R.id.nav_button1)
        val navigateHome : ImageButton = view.findViewById(R.id.navigate_Home)
        val navtoviewModelFragment : Button = view.findViewById(R.id.nav_viewModelFragment)
        val navToViewModelWithLiveDataFragment : Button = view.findViewById(R.id.viewModelwithLiveData)
        val navtoVBF : Button = view.findViewById(R.id.nav_VBFragment)
        val navtoRL : Button = view.findViewById(R.id.nav_relativeLayout)

        navigateToFragment2.setOnClickListener{
            findNavController().navigate(R.id.action_navigation_fragment1_to_navigation_fragment2)
        }

        navigateHome.setOnClickListener{
            val Intent = Intent(activity, MainActivity::class.java)
            startActivity(Intent)
        }

        navtoviewModelFragment.setOnClickListener{
            findNavController().navigate(R.id.action_navigation_fragment1_to_vMFragment)
        }

        navToViewModelWithLiveDataFragment.setOnClickListener{
            findNavController().navigate(R.id.action_navigation_fragment1_to_vMwithLiveData)
        }
        navtoVBF.setOnClickListener{
            findNavController().navigate(R.id.action_navigation_fragment1_to_VBFragment2)
        }
        navtoRL.setOnClickListener{
            findNavController().navigate(R.id.action_navigation_fragment1_to_relative_layout)
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment navigation_fragment1.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            navigation_fragment1().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}