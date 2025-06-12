import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Задача 1 ");
        int age = 18;
        if (age >= 18) {
            System.out.println(" Если возраст человека равен " + age + " он " +
                    "совершеннолетний ");
        } else {
            System.out.println(" Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать.");
        }
        System.out.println(" Задача 2 ");
        int airTemperature = 5;
        if (airTemperature >= 5) {
            System.out.println("На улице " + airTemperature + " градусов, можно идти без шапки ");
        } else {
            System.out.println("На улице " + airTemperature + "градусов, нужно надеть шапку ");
        }
        System.out.println("Задача 3 ");
        int speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то она превышена и придется заплатить штраф. ");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то превышения скорости нет, можно ездить спокойно");
        }
        System.out.println("Задача 4");
        int kindergartenAge = 3;
        if (kindergartenAge >= 2 && kindergartenAge <= 6) {
            System.out.println("Если возраст человека равен " + kindergartenAge + ", то ему нужно ходить в детский сад");
        } else {
            System.out.println("Ему не нужно ходить в детский сад");
        }
        int studentAge = 7;
        if (studentAge >= 7 && studentAge <= 18) {
            System.out.println(" Если возраст человека равен " + studentAge + ", то ему нужно ходить в школу");
        } else {
            System.out.println("Ему не нужно ходить в школу");
        }
        int universityAge = 18;
        if (universityAge >= 18 && universityAge <= 24) {
            System.out.println("Если возраст человека равен " + universityAge + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Ему не нужно ходить в университет");
        }
        int ageToWork = 25;
        if (ageToWork > 24) {
            System.out.println("Если возраст человека равен " + ageToWork + ", то ему пора ходить на работу");
        } else {
            System.out.println(" Ему не нужно ходить на работу");
        }
        System.out.println("Задача 5");

        int cantRide = 4;
        if (cantRide < 5) {
            System.out.println("Если возраст ребенка равен " + cantRide + ", то он не может кататься на аттракционе.");
        } else {
            System.out.println("Если больше 5 лет, то он может кататься на аттракционе в присутствии взрослого");
        }
        int rideWithAnAdult = 6;
        if (rideWithAnAdult > 5 && rideWithAnAdult < 14) {
            System.out.println("Если возраст ребенка равен " + rideWithAnAdult + ", то он может кататься на аттракционе в сопровождении взрослого.");
        } else {
            System.out.println("Если больше 14 лет, то может кататься без сопровождения взрослого");
        }
        int canRideAlone = 14;
        if (canRideAlone >= 14) {
            System.out.println("Если возраст ребенка равен " + canRideAlone + ", то он может кататься на аттракционе без сопровождения взрослого");
        } else {
            System.out.println("Если меньше 14 лет, то только в сопровождении взрослого.");
        }

        System.out.println(" Задача 6 ");
        int place = 59;
        if (place > 60 && place <= 102) {
            System.out.println(" Если место номер " + place + ", то место стоячее");
        }
        if (place <= 60 && place != 0) {
            System.out.println("если место номер " + place + ", то место сидячее");
        } else {
            System.out.println("Если мест " + place + ", то вагон уже полностью забит. ");
        }

        System.out.println(" Задача 7 ");

        int one = 3;
        int two = 6;
        int three = 9;
        if (one > two && one > three) {
            System.out.println("Число one больше остальных");
        } else if (two > one && two > three) {
            System.out.println("Число two больше остальных");
        } else {
            System.out.println("Число three больше остальных");
        }

    }
}


