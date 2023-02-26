package Zoo.Birds;

import Zoo.Breath;
import Zoo.Move;

public class Birds implements Breath, Move {

    @Override
    public void breath() {
        System.out.println("Дышу лёгкими, ну и воздушные мешки помогают.");
    }

    @Override
    public void move() {
        System.out.println("Есть ноги, но большую часть жизни летаем.");
    }
}
