public class Hufflepuff extends Khogvarts {

    private int industry;
    private int allegiance;
    private int fairness;

    public int getFairness() {
        return fairness;
    }

    public Hufflepuff(String name, String surname, int magic, int transgression, int industry,
                      int allegiance, int fairness) {
        super(name, surname, magic, transgression);
        this.industry = industry;
        this.allegiance = allegiance;
        this.fairness = fairness;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" + super.toString() +
                "industry=" + industry +
                ", allegiance=" + allegiance +
                ", fairness=" + fairness +
                "} ";
    }

    public void compareTo(Hufflepuff other) {
        int countThis = this.allegiance + this.fairness + this.industry;
        int countOther = other.allegiance + other.industry + other.fairness;
        if (countThis > countOther) {
            printComparableStudent(this,other);
        } else if (countThis < countOther) {
            printComparableStudent(other, this);
        }else{
            System.out.println("Студенты одинаково учатся");
        }
    }

    private void printComparableStudent(Hufflepuff bestStudent, Hufflepuff worseStudent) {
        System.out.println(bestStudent.getName() + " " + bestStudent.getSurname() + " лучший Пуфендуец, чем " +
                worseStudent.getName() + " " + worseStudent.getSurname());
    }
}