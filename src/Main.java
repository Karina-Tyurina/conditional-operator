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
        int ageFrom2To6 = 3;
        if (ageFrom2To6 >= 2 && ageFrom2To6 <= 6) {
            System.out.println("Если возраст человека равен " + ageFrom2To6 + ", то ему нужно ходить в детский сад");
        } else {
            System.out.println("Ему не нужно ходить в детский сад");
        }
        int ageFrom7to18 = 7;
        if (ageFrom7to18 >= 7 && ageFrom7to18 <= 18) {
            System.out.println(" Если возраст человека равен " + ageFrom7to18 + ", то ему нужно ходить в школу");
        } else {
            System.out.println("Ему не нужно ходить в школу");
        }
        int ageFrom18to24 = 18;
        if (ageFrom18to24 >=18 && ageFrom18to24 <24) {
            System.out.println("Если возраст человека равен " + ageFrom18to24 + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Ему не нужно ходить в университет");
        }
        int ageFromMoreThan24 = 25;
        if (ageFromMoreThan24>24 ) {
            System.out.println("Если возраст человека равен " + ageFromMoreThan24 + ", то ему пора ходить на работу");
        } else {
            System.out.println(" Ему не нужно ходить на работу");
        }
        System.out.println("Задача 5");

        int ageFromLessThan5 = 4;
        if (ageFromLessThan5<5 ) {
            System.out.println("Если возраст ребенка равен " + ageFromLessThan5 + ", то он не может кататься на аттракционе.");
        } else {
            System.out.println("Если больше 5 лет, то он может кататься на аттракционе в присутствии взрослого");
        }
        int ageFrom5To14 = 6;
        if (ageFrom5To14 > 5 && ageFrom5To14 < 14) {
            System.out.println("Если возраст ребенка равен " + ageFrom5To14 + ", то он может кататься на аттракционе в сопровождении взрослого.");
        } else {
            System.out.println("Если больше 14 лет, то может кататься без сопровождения взрослого");
        }
        int ageFromMoreThan14 = 14;
        if (ageFromMoreThan14 >= 14) {
            System.out.println("Если возраст ребенка равен " + ageFromMoreThan14 + ", то он может кататься на аттракционе без сопровождения взрослого");
        } else {
            System.out.println("Если меньше 14 лет, то только в сопровождении взрослого.");
        }

        System.out.println(" Задача 6 ");
        int place = 59;
        if (place > 60 && place <= 102 ) {
            System.out.println(" Если место под номером " + place + ", то место стоячее");
        }
        if (place <= 60 && place != 0) {
            System.out.println("если место по номером " +  place + ", то место сидячее");
        } else {
            System.out.println("Если мест " + place + ", то вагон уже полностью забит. ");
        }

        System.out.println(" Задача 7 ");

        int one = 3;
        int two = 6;
        int three = 9;
        if (one>two && one>three) {
            System.out.println("Число one больше остальных");
        }
        else if (two>one && two>three) {
            System.out.println("Число two больше остальных");
        } else {
            System.out.println("Число three больше остальных");

        }



    }
}


