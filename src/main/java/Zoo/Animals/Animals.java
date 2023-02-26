package Zoo.Animals;

import Zoo.Breath;
import Zoo.Move;

public class Animals implements Breath, Move {
    @Override
    public void breath() {
        System.out.println("Дышу лёгкими.");
    }

    @Override
    public void move() {
        System.out.println("Передвигаюсь на двух или более конечностях.");
    }
}
