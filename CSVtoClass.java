import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class CSVtoClass{
    public static void main(String[] args) {
        List<Student> clss = new ArrayList<Student>();
        try
        {String line ;
        String splitchar = ",";
        BufferedReader input =  new BufferedReader(new FileReader("test.csv"));
        
        while ((line = input.readLine()) != null)
        {
            String[] stu = line.split(splitchar);
            Student s1 = new Student(stu);
            clss.add(s1);
        }
        } 
        catch(Exception e)
        {System.out.println(e.getMessage());}
        
        for (Student s : clss)
        {
        System.out.println(s.reg_no);
        }
    }

}