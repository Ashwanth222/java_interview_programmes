package Java8_programs;

import java.util.*;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RankTheSktudentsByMarks {
    public static void main(String[] args){

        Student s1 = new Student(1,"name1",36);
        Student s2 = new Student(2,"name2",37);
        Student s3 = new Student(3,"name3",38);
        Student s4 = new Student(4,"name4",36);
        Student s5 = new Student(5,"name5",37);
        Student s6 = new Student(6,"name6",38);
        Student s7 = new Student(7,"name7",39);
        Student s8 = new Student(8,"name8",40);
        Student s9 = new Student(9,"name9",41);
        Student s10 = new Student(10,"name10",42);

        List<Student> students = Arrays.asList(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);




        List<Map.Entry<Integer, List<Student>>> marks = students.stream()
                .sorted((e1, e2) -> e2.getMarks() - e1.getMarks()).collect(Collectors.toList())
                .stream().collect(Collectors.groupingBy(t-> t.getMarks()))
                .entrySet().stream().sorted((e1,e2)-> e2.getKey() - e1.getKey())
                .collect(Collectors.toList());

        System.out.println(marks);
    }
}
