public class Mainclass2 {
    public static void main(String[] args) {

        employee e1 = new employee();
        employee e2 = new employee();
        e1.name="Himanshu";
        e1.age= 23;

        e2.name = "Ashu";
        e2.age = 23;

        e1.work();
        e2.vacation();

    }
}

class employee
{
    String name;
    int age;

    void work()
    {
        System.out.println(name +" is working");
        System.out.println(name +" works for 5 hours per day");
    }

    void vacation()
    {
        System.out.println(name+ " is on vacation");
    }
}
