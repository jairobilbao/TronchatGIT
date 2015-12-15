package com.jairobilbao.tronchatv1;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by Jairo on 14/12/2015.
 */
public class TronchatApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //Parse.enableLocalDatastore(this);

        //Parse.initialize(this);
    }
}
