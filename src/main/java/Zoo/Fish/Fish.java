package Zoo.Fish;

import Zoo.Breath;
import Zoo.Move;

public class Fish implements Breath, Move {
    @Override
    public void move() {
        System.out.println("Я ж рыба, я плаваю.");
    }

    @Override
    public void breath() {
        System.out.println("Дышу жабрами.");
    }
}
