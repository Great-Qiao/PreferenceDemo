package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.preference.Preference
import android.preference.PreferenceActivity

class SettingsActivity : PreferenceActivity() {
    private lateinit var fish: Preference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings_activity_layout)
        addPreferencesFromResource(R.xml.preference)
        initPreference()
    }

    private fun initPreference() {
        fish = findPreference("fish_selection_pref")
        fish.setOnPreferenceClickListener {
            val intent = Intent(this, DetailsActivity::class.java)
            startActivity(intent)
            true
        }
    }
}