package com.sachin.mvpexample;


import com.sachin.mvpexample.login.LoginActivity;
import com.sachin.mvpexample.login.LoginModule;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {ApplicationModule.class, LoginModule.class})
public interface ApplicationComponent {

    void inject(LoginActivity target);

}
