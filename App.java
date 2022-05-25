import java.util.Arrays;

class App {
  public static void main(String args[]) {
    int[] testScores = { 72, 95, 91, 85, 87, 51, 65, 72, 75, 89 };
    int length = testScores.length;

    System.out.println(mean(testScores, length));
    System.out.println(median(testScores, length));
  }

  public static double median(int[] array, int length) {
    Arrays.sort(array);
    if (length % 2 != 0)
      return (double) array[length / 2];

    return (double) (array[(length - 1) - 1] + array[length / 2]) / 2.0;

  }

  public static double mean(int[] array, int length) {
    int sum = 0;
    for (int score : array) {
      sum = sum + score;
      score++;
    }
    return (sum / length);
  }
}