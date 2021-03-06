package com.asura.permissiontest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment


class PermissionFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_permission, container, false)
        view.findViewById<Button>(R.id.button1).setOnClickListener {
            PermissionDialogFragment().show(childFragmentManager, "PermissionDialogFragment")
        }

        view.findViewById<Button>(R.id.button2).setOnClickListener {
            PermissionBottomFragment().show(childFragmentManager, "PermissionBottomFragment")
        }
        return view
    }
}