class Problem02 {
  public static void main(String[] args) {
    System.out.println("hello!");
    calculateFibonacciSum(8);
  }

  public static boolean getTrue() {
    return true;
  }

  public static int calculateFibonacciSum(int limit) {
    int beforeBefore = 1;
    int before = 2;

    int sum = 2;

    int next = beforeBefore + before;
    while (next < limit) {
      next = beforeBefore + before;
      beforeBefore = before;
      before = next;
      if (next % 2 == 0) {
        sum += next;
      }
    }

    return sum;
  }
}
