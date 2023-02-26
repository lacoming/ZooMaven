package Zoo;

public class Main {

    public static void main (String[] args){

        enterNumberOfMenu get = new enterNumberOfMenu();

        while (true){
            int number = get.enterNumberOfMenu();
            menuInfo info = new menuInfo();

            if(number == 0){
                break;
            }
            info.menuInfo(number);
        }
    }
}

