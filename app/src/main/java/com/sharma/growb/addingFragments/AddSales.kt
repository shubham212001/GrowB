package com.sharma.growb.addingFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.sharma.growb.R
import com.sharma.growb.add_sales_item_recycler_adapter
import com.sharma.growb.database.database
import com.sharma.growb.database.item
import com.sharma.growb.database.sales_entity
import kotlinx.android.synthetic.main.fragment_add_sales.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AddSales.newInstance] factory method to
 * create an instance of this fragment.
 */
class AddSales : Fragment() {


    val db by lazy {
        context?.let { database.getDatabase(it) }
    }
    var PayAmt_variable:Int=0;
    val list = arrayListOf<item>()
    var adapter = add_sales_item_recycler_adapter(list)

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
        return inflater.inflate(R.layout.fragment_add_sales, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        //var collective_sales_entity = sales_entity(cust_name_variable, bill_no_variable, PayAmt_variable)

        add_item_in_sales.setOnClickListener {
            var bill_no_variable = bill_no.text.toString()
            var customer_ID_variable = customer_id.text.toString()
            var cust_name_variable = cust_name.text.toString()
            var item_id_variable = item_id.text.toString()
            var item_qty_variable = nop.text.toString()
            var item_price_variable = item_price.text.toString()
            var collective_item_data = item(bill_no_variable, item_id_variable, customer_ID_variable, cust_name_variable, item_qty_variable, item_price_variable)
            if(!item_price_variable.isNullOrEmpty() && !item_qty_variable.isNullOrEmpty()){
                var amt = Integer.parseInt(item_price_variable)
                var qty = Integer.parseInt(item_qty_variable)
            }
            list.add(collective_item_data)
            //PayAmt_variable += amt * qty
            add_item_in_sales_recyclerview.layoutManager = LinearLayoutManager(context)
            var Adapter = add_item_in_sales_recyclerview.adapter
            add_item_in_sales_recyclerview.adapter = adapter
            item_id.setText("")
            item_name.setText("")
            nop.setText("")
            item_price.setText("")

        }

//        save_bill.setOnClickListener {
//
//            GlobalScope.launch(Dispatchers.Main) {
//                val id = withContext(Dispatchers.IO) {
//
//                    db?.Dao()?.add_sales(collective_sales_entity)
//
//                }
//            }
//            Toast.makeText(activity, "Bill Saved Successfully", Toast.LENGTH_LONG).show()
//
//
//        }
//        companion object {
//            /**
//             * Use this factory method to create a new instance of
//             * this fragment using the provided parameters.
//             *
//             * @param param1 Parameter 1.
//             * @param param2 Parameter 2.
//             * @return A new instance of fragment AddSales.
//             */
//            // TODO: Rename and change types and number of parameters
//            @JvmStatic
//            fun newInstance(param1: String, param2: String) =
//                    AddSales().apply {
//                        arguments = Bundle().apply {
//                            putString(ARG_PARAM1, param1)
//                            putString(ARG_PARAM2, param2)
//                        }
//                    }
//        }
    }
}