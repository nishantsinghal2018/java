Class Emp
{
static String cname="tcs";
string name;
int salary;
void get(String s1,int s2);
{
name=s1;
salary=s2;
}
void show()
{
system.out.println(name);
system.out.println(salary);
system.out.println(cname);
}
static int add(int a,int b)
{
return a+b;
}
public static void main (String... s)
{
Emp e1=new Emp();


e1.get("lala",101);
e1.show();
system.out.println(cname);
system.out.println(Emp.cname);
int z=Emp.add(10,20);
system.out.println(z);
} 
}
Class Demo
{
    public static void main(String... s)
    {
        Emp e2=new Emp();

        e2.get("rabari",51);
        e2.show();
        int z=Emp.add(10,30);
        system.out.println(z);
        system.out.println(Emp.cname);
    }
}