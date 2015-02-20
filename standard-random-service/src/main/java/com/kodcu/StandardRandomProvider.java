package com.kodcu;

import com.kodcu.spi.RandomServiceProvider;

import java.util.Random;

/**
 * Created by usta on 20.02.2015.
 */
public class StandardRandomProvider implements RandomServiceProvider {

    @Override
    public Integer random(int start, int end) {
        Random random = new Random();
        int randomInt = random.nextInt((end - start + 1)) + start;
        return randomInt;
    }

}
