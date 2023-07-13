public class Ravenclaw extends Khogvarts {
    private int brain;
    private int sapience;
    private int cuteness;
    private int creation;

    public Ravenclaw(String name, String surname, int magic, int transgression, int brain,
                     int sapience, int cuteness, int creation) {
        super(name, surname, magic, transgression);
        this.brain = brain;
        this.sapience = sapience;
        this.cuteness = cuteness;
        this.creation = creation;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" + super.toString() +
                "brain=" + brain +
                ", sapience=" + sapience +
                ", cuteness=" + cuteness +
                ", creation=" + creation +
                "} ";
    }

    public void compareTo(Ravenclaw other) {
        int countThis = this.brain + this.sapience + this.cuteness + this.creation;
        int countOther = other.brain + other.sapience + other.cuteness + other.creation;
        if (countThis > countOther) {
            printComparableStudent(this, other);
        } else if (countThis < countOther) {
            printComparableStudent(other, this);
        } else {
            System.out.println("Студенты одинаково учатся");
        }
    }

    private void printComparableStudent(Ravenclaw bestStudent, Ravenclaw worseStudent) {
        System.out.println(bestStudent.getName() + " " + bestStudent.getSurname() + " лучший Когтевранец, чем " +
                worseStudent.getName() + " " + worseStudent.getSurname());
    }
}