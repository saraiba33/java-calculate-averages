import java.util.Arrays;

class App {
  public static void main(String args[]) {
    int[] testScores = { 72, 95, 91, 85, 87, 51, 65, 72, 75, 89 };
    int length = testScores.length;

    System.out.println(median(testScores, length));
    System.out.println(mean(testScores, length));
    System.out.println(highScore(testScores));
    System.out.println(lowScore(testScores));

  }

  public static double median(int[] array, int length) {
    Arrays.sort(array);
    if (length % 2 != 0) {
      return (double) array[length / 2];
    } else {
      return ((double) array[(length / 2)] + (double) array[length / 2 - 1]) / 2;
    }
  }

  public static double mean(int[] array, int length) {
    int sum = 0;
    for (int score : array) {
      sum = sum + score;
      score++;
    }
    return (sum / length);
  }

  public static int highScore(int[] array) {
    Arrays.sort(array);
    return array[array.length - 1];
  }

  public static int lowScore(int[] array) {
    Arrays.sort(array);
    return array[0];
  }
}
