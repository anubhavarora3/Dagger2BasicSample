package com.falcon.anubhav.dagger2basicsample;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by anubhav on 11/03/18.
 */

@Module
public class MemberDataModule {

    @Singleton
    @Provides
    MemberDataManager provideMemberDataManager() {
        return new MemberDataManager();
    }
}
