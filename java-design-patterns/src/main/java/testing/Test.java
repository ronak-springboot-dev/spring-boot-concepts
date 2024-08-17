package testing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Test {

    public static void main(String[] args) {
        String name = "Ronak-t-intelera";

        int length = name.length();
        System.out.println("length = " + length);


        System.out.println(100 + 100 + "Simplilearn");

        System.out.println("E - Learning Company" + 100 + 100); //consider whole line as a String



        List<Integer> integerList = new ArrayList<>();//or we can create another list
        List<Employee> employeeList = new ArrayList<>();//or we can create another list
        employeeList.add(new Employee(55000, "Ronak", "IT"));
        employeeList.add(new Employee(1000, "Ronak 1", "IT"));
        employeeList.add(new Employee(35000, "Ronak 2", "IT"));
        employeeList.add(new Employee(6000, "Ronak 3", "IT"));
        employeeList.add(new Employee(11000, "Ronak 4", "IT"));
        employeeList.add(new Employee(25000, "Ronak 5", "IT"));

        List<Integer> anotherList = List.of(1, 2, 3, 4, 5);

        IntStream.range(1,10).forEach( //end is exclusive
                i -> integerList.add(i)
        );

        anotherList.stream()
                .forEach(integerList::add);  // Add each element from anotherList to integerList

        System.out.println(integerList);  // Output the list

        System.out.println("integerList = " + integerList);


        List<Employee> highSalaryEmployees = employeeList.stream()
                .filter(l -> l.getSalary() > 5000)
                .toList();



    }




}
