

public class Student {
    String reg_no;
    Float m1;
    Float m2;
    Float m3;

    public Student(String[] a)
    {
        this.reg_no = a[0];
        this.m1 =Float.parseFloat(a[1]);
        this.m2 =Float.parseFloat(a[2]);
        this.m3 =Float.parseFloat(a[3]);
    }
}
