public class Main {
    public static void main(String[] args) {
        //задача 1

        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        //задача 2
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        //задача 3
        var dog1 = 8.0;
        dog1 = dog1 - 3.5;
        System.out.println(dog1);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        //задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend/4;
        System.out.println(friend);

        //задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog - 4;
        System.out.println(frog);

        //задача 6
        var weightBoxer1  = 78.2;
        var weightBoxer2 = 82.7;
        var totalWeight = weightBoxer1 + weightBoxer2;
        System.out.println("Общий вес двух боксеров " + totalWeight);

        var weightDifference = weightBoxer2 - weightBoxer1;
        System.out.println(weightDifference);
        var weightDifference2 = weightBoxer2%weightBoxer1;
        System.out.println("Разница в весе двух боксеров "+ weightDifference2);

        //задача 8
        var totalWorkingTime = 640;
        var workingHours = 8;
        var amountWorkers = totalWorkingTime / workingHours;
        System.out.println("Всего работников в компании - " + amountWorkers + " человек.");

        //задача 9
        var amountWorkers2 = amountWorkers + 94;
        var totalWorkingTime2 = (totalWorkingTime*174) / 80;
        System.out.println("Если в компании работает - " + amountWorkers2 + " человек.То всего " + totalWorkingTime2 + " часов работы может быть поделено между сотрудниками");
    }
}