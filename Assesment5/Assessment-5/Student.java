import java.lang.String;


public class Student
{
    String regno;
    int m1;
    int m2;
    int m3;
    
    public void printDet()
    {
        
            String s = regno + " "+Integer.toString(m1)+" "+Integer.toString(m2)+" "+Integer.toString(m3);
            System.out.println(s);
        
    }
}
