package method.arrayargs;

public class Main {
    static void change(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = 100;
        }
        return;
    }

    public static void main(String[] args) {
        int marks[] = { 34, 56, 23, 78, 4, 78 };
        change(marks);
        for (int i : marks) {
            System.out.println(i);
        }
        Integer a = 8;
        System.out.println(a.compareTo(5));
    }
}
