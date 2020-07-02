package exercise2;
import java.util.Arrays;
import java.util.List;

public class Colors {

    String[] colorful(String[] strings) {
        List<String> stringList = Arrays.asList(strings);
        for (int i = 0; i < strings.length; i++){
            if(stringList.contains("blue") || stringList.contains("red") || stringList.contains("yellow") || stringList.contains("green") || stringList.contains("black"))
            {
                ;
            }
            else {
                stringList.remove(i);
            }
        }

        // For the given strings, keep all the strings that begin with a color ("red", "yellow", "green", "blue", etc.) return an array of strings that start with a color.  discard all the other strings.  If no strings start with a color in the input array, return an empty array.
        return new stringList.toArray(stringList);
    }

    public static void main(String[] args) {
        Colors code = new Colors();
        code.colorful(new String[]{"bluebird","red herring", "yellow bumblebee","black spider", "green monkey","pink","great gatsby","feeding frenzy","black bird","widowmaker","quran","bible","torah"});
        System.out.println("This is the Colors class");
    }


}