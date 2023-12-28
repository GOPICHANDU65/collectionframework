package collectionframework;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StudentArrayList {
    static Predicate<Student> countryPredicate = (student) -> student.getCountry().equalsIgnoreCase("india");

    public static void main(String[] args) {
        List<Student> names = new ArrayList<Student>();
        Student s1 = new Student("india", "chandu");
        Student s2 = new Student("us", "appu");
        Student s3 = new Student("japan", "sarath");
        Student s4 = new Student("india", "chandhan");
        names.add(s1);
        names.add(s2);
        names.add(s3);
        names.add(s4);
      //  List<Student> samecountryStudents = new ArrayList<>();
        //for (int i = 0; i < names.size(); i++) {
        //    if (samecountryStudents.equals(names.get(i))) {
        //        samecountryStudents.equals(names.get(i));
         //   }

            List<Student> streamsamecountryStudents = names.stream()
                    .filter(name -> countryPredicate.test(name))
                    .collect(Collectors.toList());
            System.out.println("stream same country students " + streamsamecountryStudents);
        }
    }


//}