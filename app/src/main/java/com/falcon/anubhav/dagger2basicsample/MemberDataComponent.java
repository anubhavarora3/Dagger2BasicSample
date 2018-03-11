package com.falcon.anubhav.dagger2basicsample;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by anubhav on 11/03/18.
 */

@Singleton
@Component(modules = {
        MemberDataModule.class
})
public interface MemberDataComponent {
    void inject(MainActivity mainActivity);
}
