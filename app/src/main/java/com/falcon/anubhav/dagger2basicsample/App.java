package com.falcon.anubhav.dagger2basicsample;

import android.app.Application;

/**
 * Created by anubhav on 11/03/18.
 */

public class App extends Application {

    private static App app;
    private MemberDataComponent memberDataComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;

        memberDataComponent = DaggerMemberDataComponent.builder()
                .memberDataModule(new MemberDataModule())
                .build();

    }

    public static App getApp() {
        return app;
    }

    public MemberDataComponent getMemberDataComponent() {
        return memberDataComponent;
    }
}
