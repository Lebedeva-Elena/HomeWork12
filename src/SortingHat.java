public class SortingHat {
    public static void main(String[] args) {
        Gryffindor student1 = new Gryffindor("Garry", "Potter", 67, 73, 65,
                54, 48);
        Gryffindor student2 = new Gryffindor("Germiona", "Granger", 56, 89, 67,
                90, 75);
        Gryffindor student3 = new Gryffindor("Ron", "Weasley", 45, 39, 46,
                57, 55);

        Slytherin student4 = new Slytherin("Drako", "Malfoy", 66, 67, 68,
                70, 60,61,62);
        Slytherin student5 = new Slytherin("Graham", "Montagu", 50, 60, 65,
                45, 55, 70, 40);
        Slytherin student6 = new Slytherin("Gregory", "Goyle", 40, 35, 55,
                45, 51, 53, 54);

        Hufflepuff student7 = new Hufflepuff("Zacharias", "Smith", 50, 45, 40,
                35, 70);
        Hufflepuff student8 = new Hufflepuff("Justin", "Finch-Fletchley", 59, 53, 51,
                50, 45);
        Hufflepuff student9 = new Hufflepuff("Cedric", "Diggory", 54, 58, 65,
                60, 56);

        Ravenclaw student10 = new Ravenclaw("Zhou", "Chang", 58, 53, 70, 65,
                64, 59);
        Ravenclaw student11 = new Ravenclaw("Padma", "Patil", 60, 70, 35, 48,
                59, 65);
        Ravenclaw student12 = new Ravenclaw("Marcus", "Belby", 40, 49, 53, 65,
                67, 70);

        System.out.println(student1);
        System.out.println(student4);
        System.out.println(student8);
        System.out.println(student11);

        student10.compareTo(student12);
        student2.compareTo(student9);

    }
}
