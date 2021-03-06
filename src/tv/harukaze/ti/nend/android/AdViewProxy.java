/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package tv.harukaze.ti.nend.android;

import org.appcelerator.kroll.annotations.Kroll;

import org.appcelerator.titanium.view.TiUIView;
import org.appcelerator.titanium.proxy.TiViewProxy;

import android.app.Activity;
import tv.harukaze.ti.nend.android.AdView;

// This proxy can be created by calling Timedibaad4android.createExample({message: "hello world"})
@Kroll.proxy(creatableInModule=Tinend4androidModule.class)
public class AdViewProxy extends TiViewProxy
{
    // Standard Debugging variables
    private AdView adView;
    
    // Constructor
    public AdViewProxy() {
        super();
    }

    @Override
    public TiUIView createView(Activity arg0) {
        adView = new AdView(this);
        return adView;
    }
    
    @Kroll.method
    public void loadAd(){
        return;
    }
    
    @Kroll.method
    public void pauseAd(){
        adView.pauseAd();
    }
    
    @Kroll.method
    public void resumeAd(){
        adView.resumeAd();
    }
}
