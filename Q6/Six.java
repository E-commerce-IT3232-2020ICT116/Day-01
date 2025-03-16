public class Six {

    public static void main(String[] args) {

        Student[] students = new Student[5];

        int[] m1 = {78, 50, 64};
        int[] m2 = {88, 88, 70};
        int[] m3 = {76, 84, 54};
        int[] m4 = {99, 97, 98};
        int[] m5 = {44, 92, 64};

        Student s1 = new Student("Kavindu", m1);
        Student s2 = new Student("Chesintha", m2);
        Student s3 = new Student("Oshan", m3);
        Student s4 = new Student("Namal", m4);
        Student s5 = new Student("Lasanga", m5);

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;

        for (Student s : students) {
            System.out.println("Name: " + s.getName());
            s.getAverage();
            System.out.println("-----------------------");
        }
    }
}

class Student {
    private String name;
    private int[] marks;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void getAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        double average = (double) sum / marks.length;
        System.out.println("Average Marks: " + average);
    }
}

/*@Chesintha ➜ /workspaces/Day-01/Q6 (main) $ javac Six.java
@Chesintha ➜ /workspaces/Day-01/Q6 (main) $ java Six
Name: Kavindu
Average Marks: 64.0
-----------------------
Name: Chesintha
Average Marks: 82.0
-----------------------
Name: Oshan
Average Marks: 71.33333333333333
-----------------------
Name: Namal
Average Marks: 98.0
-----------------------
Name: Lasanga
Average Marks: 66.66666666666667
----------------------- */