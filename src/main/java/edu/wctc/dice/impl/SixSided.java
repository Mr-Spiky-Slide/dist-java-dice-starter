package edu.wctc.dice.impl;

import edu.wctc.dice.iface.DieRoller;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class SixSided implements DieRoller {

    @Override
    public int rollDie() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
