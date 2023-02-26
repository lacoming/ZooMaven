package Zoo;

import java.util.Scanner;

public class enterNumberOfMenu {

    public int enterNumberOfMenu(){
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {

            for(Menu menu : Menu.values()){
                System.out.println(menu.zoo);
            }
            System.out.println("Введите номер существа: ");
            number = scanner.nextInt();

            if(number == 0){
                break;
            }

            if (number < 1 || number > 9){
                System.out.println("Такого номера не существует.");
                System.out.println();
            } else {
                break;
            }
        }
        return number;
    }
}
