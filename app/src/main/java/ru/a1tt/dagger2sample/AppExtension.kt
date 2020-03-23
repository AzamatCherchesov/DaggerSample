package ru.a1tt.dagger2sample

import android.app.Application
import ru.a1tt.coreui.di.DaggerUiComponent
import ru.a1tt.coreui.di.UiComponent
import ru.a1tt.coreui.di.UiComponentProvider

class AppExtension: Application(),
    UiComponentProvider {

    override val uiComponent: UiComponent by lazy { DaggerUiComponent.factory().create(this) }

}