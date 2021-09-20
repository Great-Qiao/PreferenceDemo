package com.example.myapplication

import android.os.Bundle
import android.preference.PreferenceActivity
import android.preference.Preference

class DetailsActivity : PreferenceActivity() {
    private lateinit var tangcuyu: Preference
    private lateinit var kaoyu: Preference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.details_activity_layout)
        addPreferencesFromResource(R.xml.details_preference)
        initPreferences()
    }

    private fun initPreferences() {
        tangcuyu = findPreference("tangcu_pref")
        kaoyu = findPreference("kaoyu_pref")
        tangcuyu.setOnPreferenceClickListener {
            finish()
            true
        }
        kaoyu.setOnPreferenceClickListener {
            finish()
            true
        }
    }
}