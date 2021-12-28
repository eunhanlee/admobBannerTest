package com.example.adbannertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class MainActivity : AppCompatActivity() {

    lateinit var mAdView : AdView // lateinit for admob banner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MobileAds.initialize(this) {} //add admob banner
        mAdView = findViewById(R.id.adView)

        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

    }


}