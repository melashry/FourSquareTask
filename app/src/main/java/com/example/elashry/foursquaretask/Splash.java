package com.example.elashry.foursquaretask;

import android.content.Intent;

import com.daimajia.androidanimations.library.Techniques;
import com.viksaa.sssplash.lib.activity.AwesomeSplash;
import com.viksaa.sssplash.lib.model.ConfigSplash;


public class Splash extends AwesomeSplash {


    @Override
    public void initSplash(ConfigSplash configSplash) {


        configSplash.setBackgroundColor(R.color.colorPrimary); //any color you want form colors.xml
        configSplash.setAnimCircularRevealDuration(2000); //int ms
        configSplash.setLogoSplash(R.drawable.logo); //or any other drawable
        configSplash.setAnimLogoSplashDuration(4000); //int ms
        configSplash.setAnimLogoSplashTechnique(Techniques.Bounce);
        configSplash.setOriginalHeight(400); //in relation to your svg (path) resource
        configSplash.setOriginalWidth(400); //in relation to your svg (path) resource
        configSplash.setAnimPathStrokeDrawingDuration(3000);
        configSplash.setPathSplashStrokeSize(3); //I advise value be <5
        configSplash.setPathSplashStrokeColor(R.color.colorPrimary); //any color you want form colors.xml
        configSplash.setAnimPathFillingDuration(3000);
        configSplash.setPathSplashFillColor(R.color.colorPrimary); //path object filling color

//Customize Title
        configSplash.setTitleSplash("Nearby Place");
        configSplash.setTitleTextColor(R.color.colorAccent);
        configSplash.setTitleTextSize(30f); //float value
        configSplash.setAnimTitleDuration(3000);
        configSplash.setAnimTitleTechnique(Techniques.FlipInX);


    }

    @Override
    public void animationsFinished() {

            Intent i =new Intent(this,MainActivity.class);
            startActivity(i);

    }

}
