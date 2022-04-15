
public class App
{
    public static void main( String[] args)
    {
        Student S1 = new Student("20BCE0001",30,40,55,60,75);
        Student S2 = new Student("20BCE0002",50,70,50,60,75);
        Student S3 = new Student("20BCE0003",60,50,58,60,75);
        Student S4 = new Student("20BCE0004",70,80,65,60,75);
        Student S5 = new Student("20BCE0005",30,20,95,60,75);
        Student S6 = new Student("20BCE0006",30,100,55,60,75);
        Student S7 = new Student("20BCE0007",30,40,75,60,75);
        Student S8 = new Student("20BCE0008",80,65,55,60,75);
        Student S9 = new Student("20BCE0009",75,40,55,60,75);
        Student S10 = new Student("20BCE0010",30,40,55,60,75);
        Operations o = new Operations(S1,S2,S3,S4,S5);
        Operations2 o2 = new Operations2(S1,S2,S3,S4,S5);
        Operations3 o3 =new Operations3(S1,S2,S3,S4,S5);
        try{
        Thread t = new Thread(o);
        t.start();
        
        Thread t2 = new Thread(o2);
        t2.start();
        Thread t3 = new Thread(o3);
        t3.start();
        }
        catch(Exception e)
        {
            e.getMessage();
        }
        
        
        
        
        
    }
}	 	  	 		      		      	 	     	     	 	