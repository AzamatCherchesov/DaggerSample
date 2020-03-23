package ru.a1tt.coreui.resources

import androidx.annotation.ArrayRes
import androidx.annotation.PluralsRes
import androidx.annotation.StringRes

interface ResourceProvider {
    fun getString(@StringRes resId: Int): String
    fun getString(@StringRes resId: Int, vararg formatArgs: Any): String
    fun getStringArray(@ArrayRes resId: Int): Array<String>
    fun getQuantityString(@PluralsRes pluralId: Int, quantity: Int, vararg formatArgs: Any): String
}