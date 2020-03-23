package ru.a1tt.coreui.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import ru.a1tt.coreui.resources.ResourceProvider

@Component(
    modules = [
        UiModule::class
    ]
)
interface UiComponent {
    fun getResourceProvider(): ResourceProvider

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): UiComponent
    }
}