public class q6 {
  public static void main(String[] args) {
    Integer[] nums = new Integer[args.length];
    for (int i = 0; i < args.length; i++) {
      nums[i] = Integer.parseInt(args[i]);
    }

    Integer max = nums[0];
    for (Integer num : nums) {
      if (num > max) {
        max = num;
      }
    }

    System.out.println(max);
  }
}
