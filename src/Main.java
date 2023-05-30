public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog + 4);
        System.out.println(cat + 4);
        System.out.println(paper + 4);
    }


    public static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog - 3.5);
        System.out.println(cat - 1.6);
        System.out.println(paper - 7639);
    }

    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);


    }

    public static void task5() {
        System.out.println("Задача 5");
        var fog = 3.5;
        System.out.println(fog);
        fog = fog * 10;
        System.out.println(fog);
        fog = fog / 3.5;
        System.out.println(fog);
        fog = fog + 4;
        System.out.println(fog);
    }

    public static void task6() {
        System.out.println("Задача 6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        System.out.println(boxer1 + boxer2 + " Кг, общий вес двух бойцов");
        var boxerA = 78.2;
        var boxerB = 82.7;
        System.out.println(boxerB - boxerA + " Кг, разница в весе");
    }

    public static void task7() {

        System.out.println("Задача 7 ");
        var boxerA = 78.2;
        var boxerB = 82.7;
        System.out.println(boxerB - boxerA + " Кг, разница в весе");
        System.out.println(boxerB % boxerA + " Кг, разница в в есе");
    }

    public static void task8() {
        System.out.println("Задача 8");
        var totalHours = 640;
        var everyEmployee = 8;
        var totalEmployees = totalHours / everyEmployee;
        System.out.println("Всего работников в компании " + totalHours / everyEmployee + " человек");
        totalEmployees = totalEmployees + 94;
        System.out.println(totalEmployees);
        totalHours = totalEmployees * 8;
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего " + totalHours + " часов работы может быть поделено между сотрудниками");


    }

}




