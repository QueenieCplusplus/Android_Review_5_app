package com.katepatty.katesprogressor

//import android.R
import android.os.Bundle
//import android.view.View
import androidx.appcompat.app.AppCompatActivity

import com.kofigyan.stateprogressbar.StateProgressBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    var descriptionData = arrayOf("南港站", "市府站", "國父紀念館站", "忠孝復興站")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spb.setStateDescriptionData(descriptionData)
        btn.setOnClickListener{ progressor()}
    }

    private fun progressor(){

        when (spb.currentStateNumber) {
            1 -> spb.setCurrentStateNumber(StateProgressBar.StateNumber.TWO)
            2 -> spb.setCurrentStateNumber(StateProgressBar.StateNumber.THREE)
            3 -> spb.setCurrentStateNumber(StateProgressBar.StateNumber.FOUR)
            4 -> spb.setAllStatesCompleted(true)
        }



    }
}