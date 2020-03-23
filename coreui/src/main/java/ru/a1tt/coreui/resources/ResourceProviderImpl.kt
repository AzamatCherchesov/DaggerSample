package ru.a1tt.coreui.resources

import android.content.Context

internal class ResourceProviderImpl(private val context: Context) : ResourceProvider {

    override fun getString(resId: Int) =
        context.getString(resId)

    override fun getString(resId: Int, vararg formatArgs: Any) =
        context.getString(resId, *formatArgs)

    override fun getStringArray(resId: Int): Array<String> =
        context.resources.getStringArray(resId)

    override fun getQuantityString(pluralId: Int, quantity: Int, vararg formatArgs: Any) =
        context.resources.getQuantityString(pluralId, quantity, *formatArgs)
}