package ru.a1tt.coreui.di

import android.content.Context
import androidx.fragment.app.Fragment
import java.lang.IllegalArgumentException

val Context.uiComponent: UiComponent
    get() {
        return (this.applicationContext as? UiComponentProvider)?.uiComponent
            ?: throw IllegalArgumentException("Application must implement UiComponentProvider")
    }

val Fragment.uiComponent: UiComponent?
    get() = context?.uiComponent