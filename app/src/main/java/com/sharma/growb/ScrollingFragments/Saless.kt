package com.sharma.growb.ScrollingFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.sharma.growb.R
import com.sharma.growb.database.database
import com.sharma.growb.database.sales_entity
import com.sharma.growb.listener
import com.sharma.growb.sales_adapter
import kotlinx.android.synthetic.main.fragment_saless.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Saless.newInstance] factory method to
 * create an instance of this fragment.
 */
class Saless : Fragment(),listener {
    //Starts Manually added code
    val db by lazy {
        context?.let { database.getDatabase(it) }
    }
    val list = arrayListOf<sales_entity>()
    var adapter = sales_adapter(list,this)

    //Ends Manually added code

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

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_saless, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        sales_recycler.layoutManager= LinearLayoutManager(context)
        var Adapter =sales_recycler.adapter
        sales_recycler.adapter=adapter


        db?.Dao()?.get_all()?.observe(viewLifecycleOwner, Observer {

            list.clear()
            list.addAll(it)
            adapter.notifyDataSetChanged()


        })
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Saless.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
                Saless().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }

    override fun delete_task(input: sales_entity) {
        TODO("Not yet implemented")
    }

    override fun share(input: sales_entity) {
        TODO("Not yet implemented")
    }

    override fun update_task(input: sales_entity) {
        TODO("Not yet implemented")
    }
}