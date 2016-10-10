import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

public class DriverStudentRegSystem {

    public static void main(String[] args) {
        StudentInfo student1  = new StudentInfo("Peter", 19, "18/3/1997", "123456");
        StudentInfo student2  = new StudentInfo("Conor", 22, "10/6/1994", "122299");
        StudentInfo student3  = new StudentInfo("Shane", 20, "24/9/1996", "120746");

        List<StudentInfo> studentInfoList = new ArrayList<StudentInfo>();
        //student1.add(new StudentInfo(student1));
        studentInfoList.add(student1);
        studentInfoList.add(student2);
        studentInfoList.add(student3);

        Module module1 = new Module("CT324", "123", studentInfoList);
        Module module2 = new Module("CT453", "113", studentInfoList);
        Module module3 = new Module("CT210", "101", studentInfoList);

        List<Module> listOfModules = new ArrayList<Module>();
        listOfModules.add(module1);
        listOfModules.add(module2);
        listOfModules.add(module3);



        Course course1 = new Course("Computer Science", listOfModules, new DateTime(2016, 9, 01, 9, 00), new DateTime(2017, 05, 20, 12, 00));


        for (int i = 0; i < studentInfoList.size(); i++) {

            System.out.println("Student Name : " +  studentInfoList.get(i).getName());
            System.out.println("Is doing the course : " + course1.getCourseName());

            for (int j = 0; j < listOfModules.size(); j++) {

                System.out.println("Is taking the Module : " + listOfModules.get(j).getModName());



            }
        }
    }


}
