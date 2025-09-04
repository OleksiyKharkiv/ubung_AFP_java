  public class Main {
    public static void main(String[] args) {
        byte myByte = 127; // Maximum value for a byte
        short myShort = 32767; // Maximum value for a short
        int myInt = 2147483647; // Maximum value for an int
        long myLong = 9223372036854775807L; // Maximum value for a long
        float myFloat = 3.4028235E38f; // Maximum value for a float
        double myDouble = 1.7976931348623157e308; // Maximum value for a double

        int a = 5;
        int b = 10;
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
        Bird eagle = new Bird("Eagle", 3, "Freedom");
        System.out.println("Bird is: " + eagle.getBird());
        System.out.println(strConcat("Hello,", "world!"));
        System.out.println(0b101 << 1);
        System.out.println(0x10);
        System.out.println(030);
        String str = "Array of Characters";
        System.out.println(str);
    }
    public static String strConcat(String a, String b){
      return a.concat(b);
    }
}
