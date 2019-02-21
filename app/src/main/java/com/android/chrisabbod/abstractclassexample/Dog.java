package com.android.chrisabbod.abstractclassexample;

import android.content.Context;
import android.widget.Toast;

/**
 * The Dog class is a subclass of the Animal abstract class. This means that it inherits all the
 * methods of the Animal class such as eat, sleep, and makeNoise. Only makeNoise is defined here
 * because makeNoise is an abstract method. It was made an abstract method in the Animal class to
 * allow each subclass to implement it uniquely.
 */

public class Dog extends Animal {

    public void makeNoise(Context context) {
        Toast.makeText(context.getApplicationContext(), "BARK", Toast.LENGTH_SHORT).show();
    }
}
