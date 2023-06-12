public class StringManipulation {
    public static void main(String[] args) {
        System.out.println("\n***Creating of strings***");
        char arrSample[] = { 'R', 'O', 'S', 'E' };
        String strSample_1 = new String(arrSample);
        System.out.println("Created from char[] using new String: " + strSample_1);
        byte ascii[] = { 65, 66, 67, 68, 69, 70 };
        String strSample_2 = new String(ascii);
        System.out.println("Created from byte[]: " + strSample_2);

        System.out.println("\n***getting string length***");
        System.out.println("Length of " + strSample_1 + " is " + strSample_1.length());

        System.out.println("\n***String Concatenation***");
        String strSample_3 = strSample_1.concat(strSample_2);
        System.out.println("Using concat(): " + strSample_3);

        String strSample_4 = "Using + operator: " + strSample_1 + strSample_2;
        System.out.println(strSample_4);

        System.out.println("\n***Using charAt()***");
        System.out.println("Character at 3rd position in " + strSample_4 + " is " + strSample_4.charAt(2));

        System.out.println("\n***Using getChars()***");
        char buf[] = new char[3];
        strSample_4.getChars(2, 5, buf, 0);
        System.out.println("Characters between 3rd and 6th position in " + strSample_4 + " are " + new String(buf));

        System.out.println("\n**String comparison**");
        System.out.println("Using compareTo()");
        String str_Sample = "RockStar";
        System.out.println("Compare 'RockStar' To 'ROCKSTAR': " + str_Sample.compareTo("ROCKSTAR"));
        System.out.println("Compare 'RockStar' To 'ROCKSTAR': Case Ignored: " + str_Sample.compareToIgnoreCase("ROCKSTAR"));

        System.out.println("\n**Using startsWith() and endsWith()**");
        System.out.println("'RockStar' startsWith ('Ro') is: " + str_Sample.startsWith("Ro"));
        System.out.println("'RockStar' endsWith ('Star') is: " + str_Sample.endsWith("Star"));

        System.out.println("\n**Searching subStrings**");
        System.out.println("Using contains()");
        System.out.println("'RockStar' contains sequence 'tar': " + str_Sample.contains("tar"));

        System.out.println("Using indexOf()");
        System.out.println("indexOf 't' in 'RockStar' is: " + str_Sample.indexOf("t"));
        System.out.println("indexOf 'Star' in 'RockStar' is: " + str_Sample.indexOf("Star"));

        System.out.println("\n**Modifying a string**");
        System.out.println("Changing case of characters in the string");
        System.out.println("All caps 'RockStar': " + str_Sample.toUpperCase());
        System.out.println("All small letters 'RockStar': " + str_Sample.toLowerCase());

        System.out.println("Using replace()");
        System.out.println("In 'RockStar', replace 'Star' with 'et': " + str_Sample.replace("Star", "et"));

System.out.println("\n**Data conversion using valueOf()**");
String dVal = "3.456";
String iVal = "6";
System.out.println("Double.valueOf(dVal) is: " + Double.valueOf(dVal));
System.out.println("Integer.valueOf(iVal) is: " + Integer.valueOf(iVal));

}
}

