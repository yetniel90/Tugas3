package com.example.rama


import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_firstfragment.*
import kotlin.random.Random


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        val fragmentView =inflater.inflate(R.layout.fragment_firstfragment, container, false)
       val cari_button : Button= fragmentView.findViewById(R.id.btn_cari)
        cari_button.setOnClickListener {
            cowok()
            cewek()
        }
        // Inflate the layout for this fragment
        return fragmentView
    }
    private fun cowok() {

        val randomInt=Random.nextInt(20)+1
        val drawableResource=when(randomInt){
            1->R.drawable.a
            2->R.drawable.b
            3->R.drawable.c
            4->R.drawable.d
            5->R.drawable.e
            6->R.drawable.f
            7->R.drawable.g
            8->R.drawable.h
            9->R.drawable.i
            10->R.drawable.j
            11->R.drawable.k
            12->R.drawable.l
            13->R.drawable.m
            14->R.drawable.n
            15->R.drawable.o
            16->R.drawable.p
            17->R.drawable.q
            18->R.drawable.r
            19->R.drawable.s
            else->R.drawable.t
        }

        cowok_image.setImageResource(drawableResource)
    }
    private fun cewek() {
        val randomInt=Random.nextInt(7)+1
        val drawableResource=when(randomInt){
            1->R.drawable.aa
            2->R.drawable.bb
            3->R.drawable.cc
            4->R.drawable.dd
            5->R.drawable.ee
            6->R.drawable.ff
            else->R.drawable.gg
        }
        cewek_image.setImageResource(drawableResource)
    }
}
