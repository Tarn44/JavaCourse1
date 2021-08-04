public class Equals_Compare {
    public static void main (String[] args) {
        String s1 = "Welcome to java", s3 = "Welcome to java", s2 = "Programing is fun";
        boolean isEqual;

        s1 = " Welcome ";
        s2 = " welcome ";

        System.out.println("1" + 1);
        System.out.println('1' + 1 + " | " + '1' + " | " + (byte)(1) );
        System.out.println("1" + 1 + 1);
        System.out.println("1" + (1 + 1));
        System.out.println('1' + 1 + 1);
        System.out.println(" ======= ");
        System.out.println(1 + "Welcome " + 1 + 1);
        System.out.println(1 + "Welcome " + (1 + 1));
        System.out.println(1 + "Welcome " + ('\u0001' + 1));
        System.out.println(1 + "Welcome " + 'a' + 1);
        System.out.println(" ======= ");
        isEqual = s1.equals(s2);
        System.out.println(isEqual);
        System.out.println("peter".equals("peter"));
        System.out.println("peter".equalsIgnoreCase("Peter"));
        System.out.println("peter".compareToIgnoreCase("Peter"));
        System.out.println("peter".equalsIgnoreCase("peter"));
        System.out.println("SELECT");
        System.out.println("SELECT".substring(4,5));
    }

}
