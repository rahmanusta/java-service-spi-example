package com.kodcu;

import com.kodcu.spi.RandomServiceProvider;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by usta on 20.02.2015.
 */
public class ThreadedRandomProvider implements RandomServiceProvider {

    @Override
    public Integer random(int start, int end) {
        int randomInt = ThreadLocalRandom.current().nextInt(start,end);
        return randomInt;
    }
}
