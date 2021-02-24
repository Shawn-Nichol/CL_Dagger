package com.example.android.dagger.registration

import com.example.android.dagger.registration.enterdetails.EnterDetailsFragment
import com.example.android.dagger.registration.termsandconditions.TermsAndConditionsFragment
import dagger.Subcomponent


/**
 * Subcomponent of AppComponent,
 *
 * Subcomponents are components that inherit and extend the object graph of a parent component.
 * Thus all objects providedin the parent component will be provided in the subcomponent too. in t
 * his way, an object form a subcomponent can depend on an object provided by the parent component
 */
@Subcomponent
interface RegistrationComponent {

    @Subcomponent.Factory
    interface  Factory {
        fun create(): RegistrationComponent
    }

    // Classes that can be injected by this component.
    fun inject(activity: RegistrationActivity)
    fun inject(fragment: EnterDetailsFragment)
    fun inject(fragment: TermsAndConditionsFragment)
}