public class Operations2 implements Runnable
{
    int m1,m2,m3,m4,m5;
    public Operations2(Student a1,Student a2,Student a3,Student a4,Student a5)
    {
       m1=(a1.m1+a1.m2+a1.m3+a1.m4+a1.m5)/5;
       m2=(a2.m1+a2.m2+a2.m3+a2.m4+a2.m5)/5;
       m3=(a3.m1+a3.m2+a3.m3+a3.m4+a3.m5)/5;
       m4=(a4.m1+a4.m2+a4.m3+a4.m4+a4.m5)/5;
       m5=(a5.m1+a5.m2+a5.m3+a5.m4+a5.m5)/5;
    
        
    }
    
    public void run()
    {
       
        System.out.println("Average oF Student1: "+m1+" Average oF Student2 : "+m2+" Average oF Student3 : "+m3+ " Average oF Student4 : "+m4+"Average oF Student5 : "+m5);
    }
    
    
}