package Zoo;

import Zoo.Animals.Animals;
import Zoo.Animals.Elephant;
import Zoo.Animals.Lion;
import Zoo.Animals.Rat;
import Zoo.Birds.Birds;
import Zoo.Birds.Eagle;
import Zoo.Birds.Goose;
import Zoo.Birds.Penguin;
import Zoo.Fish.Fish;
import Zoo.Fish.Golden;
import Zoo.Fish.Salmon;
import Zoo.Fish.Shark;

public class menuInfo {

    public void menuInfo(int number){

        switch (number){
            case 0:
                System.out.println("До новых встреч!");
                break;
            case 1:
                Animals elephant = new Elephant();
                elephant.breath();
                elephant.move();
                System.out.println();
                break;
            case 2:
                Animals lion = new Lion();
                lion.breath();
                lion.move();
                System.out.println();
                break;
            case 3:
                Animals rat = new Rat();
                rat.breath();
                rat.move();
                System.out.println();
                break;
            case 4:
                Birds eagle = new Eagle();
                eagle.breath();
                eagle.move();
                System.out.println();
                break;
            case 5:
                Birds goose = new Goose();
                goose.breath();
                goose.move();
                System.out.println();
                break;
            case 6:
                Birds penguin = new Penguin();
                penguin.breath();
                penguin.move();
                System.out.println();
                break;
            case 7:
                Fish golden = new Golden();
                golden.breath();
                golden.move();
                System.out.println();
                break;
            case 8:
                Fish salmon = new Salmon();
                salmon.breath();
                salmon.move();
                System.out.println();
                break;
            case 9:
                Fish shark = new Shark();
                shark.breath();
                shark.move();
                System.out.println();
                break;
        }
    }
}
