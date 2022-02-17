package com.asura.permissiontest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class PermissionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_permission)
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.content, PermissionFragment())
        transaction.commit()
    }
}