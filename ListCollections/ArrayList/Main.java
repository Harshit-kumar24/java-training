package ListCollections.ArrayList;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args){
       List<Employee> employeeList = new ArrayList<>();

       SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yy");
       
       try{
       employeeList.add(new Employee(34,"harshit",formatter.parse("22-01-2024"),3500.0));
       employeeList.add(new Employee(34,"kota sir",formatter.parse("24-01-2024"),250000.0));
       employeeList.add(new Employee(34,"zama sir",formatter.parse("12-01-2024"),100000.0));
       employeeList.add(new Employee(34,"atharv",formatter.parse("25-01-2024"),1000.0));
       employeeList.add(new Employee(34,"ravi",formatter.parse("01-01-2024"),3000.0));
       employeeList.add(new Employee(34,"ayushi",formatter.parse("09-01-2024"),35000.0));
       employeeList.add(new Employee(34,"sakshi",formatter.parse("13-01-2024"),35000.0));
       employeeList.add(new Employee(34,"rajshree",formatter.parse("17-01-2024"),35000.0));
       employeeList.add(new Employee(34,"manav",formatter.parse("16-01-2024"),35000.0));
       employeeList.add(new Employee(34,"harsh",formatter.parse("29-01-2024"),35000.0));

        Comparator<Employee> salaryComparator = Comparator.comparingDouble(Employee::getSalary);


       Collections.sort(employeeList,salaryComparator);

       for(Employee it: employeeList){
            System.out.println(it.getName()+" "+it.getSalary());
       }
       
       }
       catch(ParseException e){
        e.printStackTrace();
       }
    }
}
