
    public class Gryffindor extends Khogvarts {
    private int generosity;
    private int honor;
    private int bravery;
        public Gryffindor(String name, String surname, int magic, int transgression, int generosity,
                      int honor, int bravery) {
        super(name, surname, magic, transgression);
        this.generosity = generosity;
        this.honor = honor;
        this.bravery = bravery;
    }

        @Override
        public String toString() {
            return "Gryffindor" + '{' + super.toString() +
                    "generosity=" + generosity +
                    ", honor=" + honor +
                    ", bravery=" + bravery +
                    "} ";
        }

        public void compareTo(Gryffindor other) {
            int countThis = this.bravery + this.honor + this.generosity;
            int countOther = other.bravery + other.honor + other.generosity;
            if (countThis > countOther) {
                printComparableStudent(this,other);
            } else if (countThis < countOther) {
                printComparableStudent(other, this);
            }else{
                System.out.println("Студенты одинаково учатся");
            }

        }

        private void printComparableStudent(Gryffindor bestStudent, Gryffindor worseStudent) {
            System.out.println(bestStudent.getName() + " " + bestStudent.getSurname() + " лучший Гриффиндорец, чем " +
                    worseStudent.getName() + " " + worseStudent.getSurname());
        }
    }
