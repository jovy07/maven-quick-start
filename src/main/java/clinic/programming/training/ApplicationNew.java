package clinic.programming.training;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class ApplicationNew {

        public int countWords(String words){
                String [] separateWords = StringUtils.split(words,' ');
                return (separateWords == null) ? 0 : separateWords.length;
        }

        public void greet(){
                List<String> greetings = new ArrayList<>();
                greetings.add("Hello");

                for(String greeting : greetings){
                        System.out.println("Greeting: "+ greeting);
                }
        }

    public ApplicationNew() {
        System.out.println ("Inside ApplicationNew");
    }

    // method main(): ALWAYS the ApplicationNew entry point
    public static void main (String[] args) {
        System.out.println ("Starting ApplicationNew");
                ApplicationNew app = new ApplicationNew();
                app.greet();
                System.out.println("KRAVAAA");
                int count = app.countWords("I have four words");
                System.out.println("KRAVAAA");
                System.out.println("Word count: " + count);
                System.out.println("KRAVAAA");
    }
}