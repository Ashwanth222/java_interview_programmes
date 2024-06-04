package Java8_programs.java8.sorted;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Collections;


public class sortListDemo {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(3);
        list.add(12);
        list.add(4);

        List<Java8_programs.java8.mapReduce.Employee> employees =  Stream.of(new Java8_programs.java8.mapReduce.Employee(101,"john","A",60000),
                        new Java8_programs.java8.mapReduce.Employee(109,"peter","B",30000),
                        new Java8_programs.java8.mapReduce.Employee(102,"mak","A",80000),
                        new Java8_programs.java8.mapReduce.Employee(103,"kim","A",90000),
                        new Java8_programs.java8.mapReduce.Employee(104,"json","C",15000))
                .collect(Collectors.toList());

		/*Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o1.getSalary() - o2.getSalary());// ascending
			}
		});*/


        Collections.sort(employees, ( o1,  o2) ->(int) (o1.getSalary() - o2.getSalary()));

        System.out.println(employees);


        employees.stream().sorted(( o1,  o2) ->(int) (o2.getSalary() - o1.getSalary())).forEach(System.out::println);

        employees.stream().sorted(Comparator.comparing(emp->emp.getSalary())).forEach(System.out::println);

        employees.stream().sorted(Comparator.comparing(e -> e.getSalary())).forEach(System.out::println);


          Collections.sort(list);//ASSENDING Collections.reverse(list);
          System.out.println(list);

          list.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println
          (s));//descending

    }
}
