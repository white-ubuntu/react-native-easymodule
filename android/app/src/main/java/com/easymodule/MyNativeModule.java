package com.easymodule;

import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/**
 * Created by ijoy on 16-7-13.
 */
public class MyNativeModule extends ReactContextBaseJavaModule {
    @Override
    public String getName() {
        return "MyNativeModule";
    }

    public MyNativeModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @ReactMethod
    public void show(String message, int times) {
        Toast.makeText(getReactApplicationContext(), message, times).show();

    }
}
