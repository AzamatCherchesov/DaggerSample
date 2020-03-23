package ru.a1tt.coreui.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.Reusable
import ru.a1tt.coreui.resources.ResourceProvider
import ru.a1tt.coreui.resources.ResourceProviderImpl

@Module
internal class UiModule {

    @Reusable
    @Provides
    fun provideResourceProvider(context: Context): ResourceProvider =
        ResourceProviderImpl(context)
}