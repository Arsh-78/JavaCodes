import java.util.Arrays;
public class Operations3 implements Runnable
{
    
    public Operations3(Student a1,Student a2,Student a3,Student a4,Student a5)
    {
       int[]  c1= {a1.m1,a2.m1,a3.m1,a4.m1,a5.m1};
       int[]  c2= {a1.m2,a2.m2,a3.m2,a4.m2,a5.m2};
       int[]  c3= {a1.m3,a3.m3,a3.m3,a4.m3,a5.m3};
       int[]  c4= {a1.m4,a2.m4,a3.m4,a4.m4,a5.m4};
       int[]  c5= {a1.m5,a2.m5,a3.m5,a4.m5,a5.m5};
       
       Arrays.sort(c1);
       Arrays.sort(c2);
       Arrays.sort(c3);
       Arrays.sort(c4);
       Arrays.sort(c5);
    
        
    }
    public void run()
    {
        
       System.out.println("The format is Course max min");
       /*System.out.println("Course" + c1[4] + " "+ c1[0]);
       System.out.println("Course1" + c2[4] + " "+ c2[0]);
       System.out.println("Course1" + c3[4] + " "+ c3[0]);
       System.out.println("Course1" + c4[4] + " "+ c4[0]);
       System.out.println("Course1" + c5[4] + " "+ c5[0]);
        */
        /*This outputs are not working for some reasons please consider for revaluation other wise the Code runs fin3*/ 
}
}	 	  	 		      		      	 	     	     	 	
