package com.android.chrisabbod.abstractclassexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * When/why should I use an abstract class? https://stackoverflow.com/questions/3344816/when-and-why-to-use-abstract-classes-methods
 * This project was made to understand how abstract classes work. It contains an abstract Animal
 * class which contains the base functionality of an animal.
 */
public class MainActivity extends AppCompatActivity {

    private Button mDogEatButton, mDogSleepButton, mDogBarkButton;
    private Button mCatEatButton, mCatSleepButton, mCatMeowButton;

    private Dog mDog = new Dog();
    private Cat mCat = new Cat();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDogEatButton = findViewById(R.id.dog_eat_button);
        mDogSleepButton = findViewById(R.id.dog_sleep_button);
        mDogBarkButton = findViewById(R.id.dog_bark_button);
        mCatEatButton = findViewById(R.id.cat_eat_button);
        mCatSleepButton = findViewById(R.id.cat_sleep_button);
        mCatMeowButton = findViewById(R.id.cat_meow_button);

        /**
         * The dog class extends from the animal class so it immediately has access to the eat
         * and sleep functions from the animal class.
         */

        mDogEatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDog.eat(getApplicationContext());
            }
        });

        mDogSleepButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDog.sleep(getApplicationContext());
            }
        });

        /**
         * The make noise function is an abstract method in the animal class. The method is declared
         * but the implementation is left up to the Dog class because it will need to use the
         * makeNoise() function differently than other Animal subclasses
         */

        mDogBarkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDog.makeNoise(getApplicationContext());
            }
        });

        /**
         * The cat class also extends from Animal so it shares the same eat and sleep methods.
         * The makeNoise() method in the Animal class is an abstract method because each subclass
         * needs to use it differently.
         */

        mCatEatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCat.eat(getApplicationContext());
            }
        });

        mCatSleepButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCat.sleep(getApplicationContext());
            }
        });

        mCatMeowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCat.makeNoise(getApplicationContext());
            }
        });
    }
}
