public class Slytherin extends Khogvarts {
    private int trick;
    private int resoluteness;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;



    public Slytherin(String name, String surname, int magic, int transgression, int trick, int resoluteness,
                     int ambition, int resourcefulness,
                     int lustForPower) {
        super(name, surname, magic, transgression);
        this.trick = trick;
        this.resoluteness = resoluteness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Slytherin{" + super.toString() +
                "trick=" + trick +
                ", resoluteness=" + resoluteness +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                "} ";
    }
    public void compareTo(Slytherin other) {
        int countThis = this.trick + this.resoluteness + this.ambition + this.resourcefulness + this.lustForPower;
        int countOther = other.trick + other.resoluteness + other.ambition + this.resourcefulness + this.lustForPower;
        if (countThis > countOther) {
            printComparableStudent(this,other);
        } else if (countThis < countOther) {
            printComparableStudent(other, this);
        }else{
            System.out.println("Студенты одинаково учатся");
        }

    }

    private void printComparableStudent(Slytherin bestStudent, Slytherin worseStudent) {
        System.out.println(bestStudent.getName() + " " + bestStudent.getSurname() + " лучший Слизеринец, чем " +
                worseStudent.getName() + " " + worseStudent.getSurname());
    }
}
