package com.example.android.dagger.di

import com.example.android.dagger.login.LoginComponent
import com.example.android.dagger.registration.RegistrationComponent
import dagger.Module

/**
 * This tells AppComponent which are its subcomponents.
 */
@Module(subcomponents = [RegistrationComponent::class, LoginComponent::class])
class AppSubcomponents {

}