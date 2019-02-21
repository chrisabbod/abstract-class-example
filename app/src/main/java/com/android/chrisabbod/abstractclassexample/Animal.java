package com.android.chrisabbod.abstractclassexample;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * The Animal class is an abstract class that defines the base functions of an Animal. All animals
 * must eat and sleep and because they all eat and sleep (mostly) the same way the methods are
 * implemented. The makeNoise() method is different. All animals make noise but they all do so
 * differently. For this reason the makeNoise() method was made into an abstract method with no
 * implementation. This way each subclass will get access to the method but have the ability to
 * implement it how they need.
 */

public abstract class Animal {

    public void eat(Context context) {
        Toast.makeText(context.getApplicationContext(), "EATING", Toast.LENGTH_SHORT).show();
        Log.d("ANIMAL", "EAT");
    }

    public void sleep(Context context) {
        Toast.makeText(context.getApplicationContext(), "SLEEPING", Toast.LENGTH_SHORT).show();
        Log.d("ANIMAL", "SLEEP");
    }

    public abstract void makeNoise(Context context);
}
