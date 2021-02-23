package com.example.android.dagger.di

import com.example.android.dagger.registration.RegistrationActivity
import dagger.Component

/**
 * Definition of a Dagger component.
 */
@Component
interface AppComponent {

    // Classes that can be injected by this component.
    fun inject(activity: RegistrationActivity)
}