package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.registration.RegistrationActivity
import com.example.android.dagger.registration.RegistrationComponent
import com.example.android.dagger.registration.enterdetails.EnterDetailsFragment
import com.example.android.dagger.registration.termsandconditions.TermsAndConditionsFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

/**
 * Definition of a Dagger component that ads info from the storageModule to the graph.
 *
 * Modules includes subcomponents.
 */
@Singleton
@Component(modules = [StorageModule::class, AppSubcomponents::class])
interface AppComponent {

    // Factory to create instances of the AppComponent.
    @Component.Factory
    interface Factory {
        // With @BindInstance, the Context passed in will be available in the graph.
        fun create(@BindsInstance context: Context): AppComponent
    }

    // Expose RegistrationComponent factory from the graph
    fun registrationComponent(): RegistrationComponent.Factory

    // Classes that can be injected by this component.
    fun inject(activity: MainActivity)
}