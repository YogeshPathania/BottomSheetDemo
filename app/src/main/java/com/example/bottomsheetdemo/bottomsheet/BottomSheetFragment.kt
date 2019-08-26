package com.example.bottomsheetdemo.bottomsheet

import android.app.Dialog
import android.os.Bundle
import com.example.bottomsheetdemo.R
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

open class BottomSheetFragment: BottomSheetDialogFragment() {

    override fun getTheme(): Int = R.style.BottomSheetDialogTheme

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog = BottomSheetDialog(requireContext(),theme)
}
