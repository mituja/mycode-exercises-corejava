package exercises.types;

//Napisz program, który policzy średnią z kilku przedmiotów.
// Możemy założyć, że uczeń w szkole ma 3 przedmioty i z każdego z nich dostał po 4 oceny.

public class Types {

    private final int numberOfSubjects;
    private final int numberOfNotes;
    private int[][] notes;
    double[] subjectsAverages;

    public Types(int numberOfSubjects, int numberOfNotes) {
        this.numberOfSubjects = numberOfSubjects;
        this.numberOfNotes = numberOfNotes;
    }


    public void printArray() {
        double subjectSum = 0;
        fillArrayWithNotes();

        for (int i = 0; i < notes.length; i++) {
            for (int j = 0; j < notes.length; j++) {
                subjectSum += notes[i][j];
            }
            subjectsAverages[i] = subjectSum / notes.length;
            System.out.println(subjectsAverages[i]);
        }

    }

    public void fillArrayWithNotes() {
        notes = new int[numberOfSubjects][numberOfNotes];
        subjectsAverages = new double[numberOfNotes];

        for (int i = 0; i < notes.length; i++) {
            for (int j = 0; j < notes.length; j++) {
                notes[i][j] = getRandomNote();
            }
        }
    }

    public int getRandomNote() {
        int grade = 1 + (int) (Math.random() * 6);
        return grade;
    }

    public static void main(String[] args) {
        Types averageObject = new Types(3, 4);
        averageObject.printArray();


    }
}
