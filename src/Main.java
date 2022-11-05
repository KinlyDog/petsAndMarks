class Func {
    public static void petsAndMarks(int n, String[] names, String[] pets, double[][] marks) {
        double[] ma = new double[n];

        for (int i = 0; i < n; i++) {
            double sum = 0;

            for (int j = 0; j < 3; j++) {
                sum += marks[i][j];
            }

            ma[i] = sum / 3;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ma[i] < ma[j]) {
                    double marksTmp = ma[i];
                    ma[i] = ma[j];
                    ma[j] = marksTmp;

                    String namesTmp = names[i];
                    names[i] = names[j];
                    names[j] = namesTmp;

                    String petsTmp = pets[i];
                    pets[i] = pets[j];
                    pets[j] = petsTmp;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(names[i] + " " + pets[i] + " " + ma[i]);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int n = 4;

        String[] names = {"Иван", "Николай", "Анна", "Дарья"};
        String[] pets = {"Жучка", "Кнопка", "Цезарь", "Добряш"};
        double[][] marks = {{7, 7, 7}, {8, 8, 7}, {4, 5, 6}, {9, 9, 9}};

        Func.petsAndMarks(n, names, pets, marks);
    }
}

