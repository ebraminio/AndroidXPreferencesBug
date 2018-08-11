package com.byagowi.androidxpreferencesbug

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.preference.PreferenceFragmentCompat

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setContentView(R.layout.activity_main)

    getSupportFragmentManager().beginTransaction().add(
        R.id.preference_fragment_holder,
        PreferenceFragment.newInstance(), "TAG").commit()
  }

  class PreferenceFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
      addPreferencesFromResource(R.xml.preference)
    }

    companion object {
      internal fun newInstance(): PreferenceFragment {
        return PreferenceFragment()
      }
    }
  }
}