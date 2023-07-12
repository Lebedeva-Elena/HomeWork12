// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public abstract class Khogvarts {
    private String name;
    private String surname;
    private int magic;
    private int transgression;

    public Khogvarts(String name, String surname, int magic, int transgression) {
        this.name = name;
        this.surname = surname;
        this.magic = magic;
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", magic=" + magic +
                ", transgression=" + transgression +
                ',';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public void compareTo(Khogvarts other) {
        int countThis = this.magic + this.transgression;
        int countOther = other.magic + other.transgression;
        if (countThis > countOther) {
            printComparableStudent(this,other);
        } else if (countThis < countOther) {
            printComparableStudent(other, this);
        }else{
            System.out.println("Студенты одинаково учатся");
        }

    }

    private void printComparableStudent(Khogvarts bestStudent, Khogvarts worseStudent) {
        System.out.println(bestStudent.getName() + " " + bestStudent.getSurname() + " лучший хогвардец, чем " +
                worseStudent.getName() + " " + worseStudent.getSurname());
    }
}

