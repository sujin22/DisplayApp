package com.example.displayapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val settingView = layoutInflater.inflate(R.layout.setting_layout,null)
        val settingDialog = BottomSheetDialog(this)
        settingDialog.setContentView(settingView)

        findViewById<Button>(R.id.btn_setting).setOnClickListener{
            settingDialog.show()
        }
    }
}