package сome.shop.work.model;


import java.util.Scanner;


public class Menu {
    private int x = 0;
    private String s = "";
    private final Scanner scanner;
    private Shop shop;

    public Menu(Scanner scanner, Shop shop) {
        this.scanner = scanner;
        this.shop = shop;
           }


    public void printMenu() {
        System.out.println("Welcome to Shop Max!!!");
        System.out.println("1. Показать товар в магазине.");
        System.out.println("2. Добавить товар.");
        System.out.println("3. Пополнить товар.");
        System.out.println("4. Удалить  товар.");
        System.out.println("5. Редактировать товар.");
        System.out.println("6. Купить товар.");
        System.out.println("7. Бухгалтерия.");
        System.out.println("8. Выход.");
    }

    public void start() {
        if (this.scanner != null) {
            int key;
            do {
                printMenu();
                System.out.println("Inter number of menu!");
                key = this.scanner.nextInt();
                switch (key) {
                    case 1:
                        shop.getProducts();
                        shop.infoShop();
                        break;
                    case 2:


                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        System.out.println("Finish program!");
                        break;
                    default:
                        System.out.println("Error number!!! \n");
                }
            } while ((key != 8));
        }
    }
}
