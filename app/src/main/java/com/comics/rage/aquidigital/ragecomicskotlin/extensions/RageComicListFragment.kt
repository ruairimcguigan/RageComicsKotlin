package com.comics.rage.aquidigital.ragecomicskotlin.extensions

import android.app.Fragment
import android.content.Context
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.comics.rage.aquidigital.ragecomicskotlin.R
import com.comics.rage.aquidigital.ragecomicskotlin.adapter.RageComicAdapter
import kotlinx.android.synthetic.main.fragment_rage_comic_list.*

/**
 * Created by aquidigitalltd on 14/01/2018.
 */
class RageComicListFragment: Fragment() {

    private lateinit var imageResIds: IntArray
    private lateinit var names: Array<String>
    private lateinit var descriptions: Array<String>
    private lateinit var urls: Array<String>

    companion object {

        fun newInstance(): RageComicListFragment {
            return RageComicListFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val activity = activity
        recyclerView.layoutManager = GridLayoutManager(activity, 2)
        recyclerView.adapter = RageComicAdapter(activity)

        return container?.inflate(R.layout.fragment_rage_comic_list)
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)

        getRageFaceDetails(context)
        getRageFaceImages()
    }

    private fun getRageFaceDetails(context: Context?) {
        // Get rage face names and descriptions.
        val resources = context!!.resources
        names = resources.getStringArray(R.array.names)
        descriptions = resources.getStringArray(R.array.descriptions)
        urls = resources.getStringArray(R.array.urls)
    }

    private fun getRageFaceImages() {
        val typedArray = resources.obtainTypedArray(R.array.images)
        val imageCount = names.size
        imageResIds = IntArray(imageCount)

        for (i in 0 until imageCount){
            imageResIds[i] = typedArray.getResourceId(i, 0)
        }
        typedArray.recycle()
    }

}