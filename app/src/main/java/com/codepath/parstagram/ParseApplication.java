package com.codepath.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("qyr7gX6jcyWuJOjIkz614K0ZOYyjEBemMqWscHPc")
                .clientKey("46EKrdM7NX26VR1bILLN0wQMB7pq6LFLC737bJ45")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
