package com.example.rama


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.fragment_thirdfragment.*
import java.lang.StringBuilder


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class thirdfragment : Fragment() {
 private val list : Array<User>
     get()=
         arrayOf(User("Singa",R.drawable.singa),
         User("Gajah",R.drawable.gajah),
             User("Ayam",R.drawable.ayam),
             User("Ular",R.drawable.ular),
             User("Harimau",R.drawable.harimau),
             User("Srigala",R.drawable.srigala),
             User("Babi",R.drawable.babi),
             User("Sapi",R.drawable.sapi),
             User("Panda",R.drawable.panda)
         )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentView = inflater.inflate(R.layout.fragment_thirdfragment,container,false)
        val reyciclerView = fragmentView.findViewById(R.id.mRecyclerView) as RecyclerView
        reyciclerView.layoutManager = LinearLayoutManager(context,LinearLayout.VERTICAL,false)

                val adapter = RecycleAdapter(list)
                adapter.notifyDataSetChanged()
                reyciclerView.adapter=adapter


        return fragmentView
    }


}