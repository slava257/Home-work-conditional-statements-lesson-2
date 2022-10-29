import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Задание 2");
        int clientAndroid = 1;
        int clientDeviceYear = 2011;
        if (clientAndroid == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("установите облегченную версию  приложения для iOS по ссылке");
            } else {
                System.out.println("установите версию  приложения для iOS по ссылке");
            }
        } else if (clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        System.out.println("задание 3");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println("задание 4");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        System.out.println("потребуется дней " + deliveryDays);
    System.out.println(" задание 5");
    int monthNumber = 7;
    switch (monthNumber){
        case 1 :
        case 2 :
        case 3 :
            System.out.println( monthNumber+" принадлежит к сезону лета");
            break;
        case 4 :
        case 5 :
        case 6 :
            System.out.println(monthNumber+" принадлежит к сезону осень");
            break;
        case 10 :
        case 11 :
        case 12 :
            System.out.println(monthNumber+" принадлежит к сезону зима ");
            break;
        case 7 :
        case 8 :
        case 9 :
            System.out.println(monthNumber+" принадлежит к сезону осени ");
            break;
        default:
            System.out.println(monthNumber+" токого месяца не существует");
    }
}
}








