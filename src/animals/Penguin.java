package animals;


import classes.Bird;
import interfaces.Increase;

import javax.swing.*;
import java.awt.*;

public class Penguin extends Bird implements Increase {
    public Penguin(String name, int age, int weight, int flightHeight, int airSpeed, boolean fly) {
        super(name, age, weight, flightHeight, airSpeed, fly);
        setImage("/images/penguin.png");
    }

    @Override
    public void onIncrease(int increase) {
        Image img = new ImageIcon(getClass().getResource("/images/penguin.png")).getImage().
                getScaledInstance(getImage().getIconWidth() + increase, getImage().getIconHeight() + increase, Image.SCALE_DEFAULT);
        setImage(new ImageIcon(img));
    }
}