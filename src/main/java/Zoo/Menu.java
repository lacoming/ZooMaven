package Zoo;

public enum Menu {
    ELEPHANT("1. Слон"),
    LION("2. Лев"),
    RAT("3. Крыса"),
    EAGLE("4. Орёл"),
    GOOSE("5. Гусь"),
    PENGUIN("6. Пингвин"),
    GOLDEN("7. Золотая рыбка"),
    SALMON("8. Лосось"),
    SHARK("9. Акула"),
    EXIT("0. Выход");

    String zoo;

    Menu(String zoo) {
        this.zoo = zoo;
    }
}
