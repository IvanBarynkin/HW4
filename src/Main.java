import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("_______Задача №1________");
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите возраст человека: ");
            byte ages = in.nextByte();
            if (ages < 0) {
                System.out.println("Возраст не может быть отрицательным.");
            } else if (ages < 18) {
                System.out.println("Человек не достиг совершеннолетия.");
            } else if (ages > 18) {
                System.out.println("Человек достиг совершеннолетия.");
            }
        } catch (Exception InputMismatchException) {
            System.out.println("Введены некорректные данные.");
        }
        System.out.println();

        System.out.println("_______Задача №2________");

        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Какая температура на улице? ");
            byte temperature = in.nextByte();
            if (temperature < 5) {
                System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");

            } else {
                System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
            }
        } catch (Exception InputMismatchException) {
            System.out.println("Введены некорректные данные.");
        }
        System.out.println();

        System.out.println("_______Задача №3________");

        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Сколько на спидометре? ");
            int speed = Math.abs(in.nextByte());
            if (speed < 60) {
                System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно.");

            } else {
                System.out.println("Если скорость " + speed + " км/ч, то придётся заплатить штраф.");
            }
        } catch (Exception InputMismatchException) {
            System.out.println("Введены некорректные данные.");
        }
        System.out.println();

        System.out.println("_______Задача №4________");

        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Сколько лет человеку? ");
            byte ages = in.nextByte();

            if (ages < 0) {
                System.out.println("Возраст не может быть отрицательным.");
            } else if (ages <= 2) {
                System.out.println("Если возраст человека равен " + ages + " , то ему нужно быть с мамой.");
            } else if (ages <= 6) {
                System.out.println("Если возраст человека равен " + ages + " , то ему нужно ходить в детский сад.");
            } else if (ages <= 17) {
                System.out.println("Если возраст человека равен " + ages + " , то ему нужно ходить в школу.");
            } else if (ages <= 24) {
                System.out.println("Если возраст человека равен " + ages + " , то ему нужно ходить в университет.");
            } else {
                System.out.println("Если возраст человека равен " + ages + " , то ему нужно ходить на работу.");
            }
        } catch (Exception InputMismatchException) {
            System.out.println("Введены некорректные данные.");
        }
        System.out.println();

        System.out.println("_______Задача №5________");

        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Сколько лет человеку? ");
            byte ages = in.nextByte();

            if (ages < 0) {
                System.out.println("Возраст не может быть отрицательным.");
            } else if (ages < 5) {
                System.out.println("Если возраст равен " + ages + ", то нельзя кататься на аттракционе.");
            } else if (ages < 14) {
                System.out.println("Если возраст равен " + ages + ", то можно кататься на аттракционе, но в сопровождении взрослого.");
            } else {
                System.out.println("Если возраст равен " + ages + " , то можно кататься на аттракционе без сопровождения.");
            }
        } catch (Exception InputMismatchException) {
            System.out.println("Введены некорректные данные.");
        }
        System.out.println();

        System.out.println("_______Задача №6________");

        byte wagonCapacity = 102;
        byte wagonSeats = 60;


        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Какое количество людей в вагоне? ");
            byte humans = in.nextByte();

            if (humans <= 0) {
                System.out.println("Вагон пустой.");
            } else if (humans < wagonSeats) {
                System.out.println("Занято " + humans + " сидячих мест, ещё свободно " + (wagonSeats - humans) + " сидячих мест и " + (wagonCapacity - wagonSeats) + " стоячих мест.");
            } else if (humans < wagonCapacity) {
                System.out.println("Все сидячие места заняты, остались только стоячие в количестве: " + (wagonCapacity - humans));
            } else {
                System.out.println("Вагон полностью забит");
            }
        } catch (Exception InputMismatchException) {
            System.out.println("Введены некорректные данные.");
        }
        System.out.println();

        System.out.println("_______Задача №7________");

        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите 3 различных целых числа \n");
            System.out.print("Введите первое число: \n");
            int one = in.nextInt();
            System.out.print("Введите второе число: \n");
            int two = in.nextInt();
            System.out.print("Введите третье число: \n");
            int three = in.nextInt();

            if (one < two) {
                if (two < three) {
                    System.out.println("1<2<3");
                } else if (one > three) {
                    System.out.println("3<1<2");
                } else {
                    System.out.println("1<3<2");
                }
            } else {
                if (one < three) {
                    System.out.println("2<1<3");
                } else if (three < two) {
                    System.out.println("3<2<1");
                } else {
                    System.out.println("2<3<1");
                }
            }

        } catch (Exception InputMismatchException) {
            System.out.println("Введены некорректные данные.");
        }
    }
}