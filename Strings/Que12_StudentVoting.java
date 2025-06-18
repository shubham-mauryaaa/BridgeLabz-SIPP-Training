import java.util.*;

public class Que12_StudentVoting {
    static int[] generateAges(int n) {
        int[] arr = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(90);
        }
        return arr;
    }

    static String[][] canVote(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = (ages[i] >= 18 && ages[i] >= 0) ? "true" : "false";
        }
        return result;
    }

    static void display(String[][] data) {
        System.out.println("Age\tCanVote");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = generateAges(10);
        String[][] result = canVote(ages);
        display(result);
    }
}
