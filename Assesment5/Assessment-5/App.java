import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.String;

public class App
{
    public static void main (String[] args)
    {
        List<Student> data = new ArrayList();
        
        try
        {
            String line;
            String splitc = ",";
            BufferedReader input = new BufferedReader(new FileReader("data.csv"));
            
            while((line = input.readLine()) != null)
            {
                String[] dat = line.split(splitc);
                Student temp = new Student();
                temp.regno = dat[0];
                temp.m1 = Integer.parseInt(dat[1]);
                temp.m2 = Integer.parseInt(dat[2]);
                temp.m3= Integer.parseInt(dat[3]);
                data.add(temp);
             
             }
        }
             catch(Exception e)
             {
                 System.out.println(e.getMessage());
             }
             
             
             
             data.stream().filter(y->y.m1>90 || y.m2>90 || y.m3>90).forEach(y->y.printDet());
             System.out.println();
             data.stream().filter(x->x.regno.contains("BCE")).forEach(y->y.printDet());
             System.out.println();
       /*      List<Integer> c3 = new ArrayList();
             for(Student stud : data)
             {	 	  	 		      		      	 	     	     	 	
                 c3.add(stud.m3);
             }
             int sum = c3.stream().reduce(0,(subt,x)->subt+x);
             float avg = sum/data.size()*/
             
             
             int av =data.stream().mapToInt((x)->x.m3).reduce(0,(subt,x)->x+subt);
             System.out.println("Average Marks for course 3 is :");
             System.out.println(av/data.size());
    }
}