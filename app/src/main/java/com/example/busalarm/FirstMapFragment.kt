package com.example.busalarm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.gms.maps.SupportMapFragment


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [FirstMapFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [FirstMapFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class FirstMapFragment : SupportMapFragment() {

    fun newInstance(): FirstMapFragment {
        return FirstMapFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var root = super.onCreateView(inflater, container, savedInstanceState)
        return root
    }

}
