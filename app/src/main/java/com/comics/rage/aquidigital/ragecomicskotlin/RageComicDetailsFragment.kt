package com.comics.rage.aquidigital.ragecomicskotlin

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.comics.rage.aquidigital.ragecomicskotlin.extensions.inflate

/**
 * Created by aquidigitalltd on 14/01/2018.
 */
class RageComicDetailsFragment: Fragment(){

    companion object {
        fun newInstance(): RageComicDetailsFragment{
            return RageComicDetailsFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return container?.inflate(R.layout.fragment_rage_comic_details)
    }
}