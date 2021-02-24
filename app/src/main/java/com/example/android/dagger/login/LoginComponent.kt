package com.example.android.dagger.login

import com.example.android.dagger.di.ActivityScope
import dagger.Subcomponent

// Scope annotation that the Login Component uses, LoginComponent will have the same lifetime as LoginActivity.
// Classes annotated with @ActivityScope will have a uniqque instance in this scope.
@ActivityScope
// Definition of a Dagger subcomponent
@Subcomponent
interface LoginComponent {

    // Factory to create instances of LoginComponent
    @Subcomponent.Factory
    interface Factory {
        fun create(): LoginComponent
    }

    // Classes that can be injected by this component.
    fun inject(activity: LoginActivity)
}