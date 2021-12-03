//Write a program in java to check string contains special characters in java
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class TestString {

  public static void main(String[] args){
        String my_str="abcd #*jgj&janhfj gfhkr";
        Pattern my_pattern = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher my_match = my_pattern.matcher(my_str);
        boolean b = my_match.find();
        if (b)
            System.out.println("String contains special characters");
        else
            System.out.println("No special characters in the string");
    }
}
