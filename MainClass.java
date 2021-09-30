import encapsulation.EncapsulationIntro;

public class MainClass {
    public static void main(String[] args) {

       /* person p1 = new person();       // new person() is a defualt constructor , public person() constructor is called here, its default.
        p1.age =24;
        p1.name = "Himanshu";  */

        //System.out.println(p1.age);
        //System.out.println(p1.name);

        //person p2 = new person(23,"Shivam");

        //   p2.age = 31;
        //    p2.name = "ashu";

        //System.out.println(p1.age + " " + p1.name);
        //System.out.println(p2.age + " " + p2.name);

       // p1.walk();
        //p2.eat();
        //p1.walk(200);
      // System.out.println(person.count);

    /*    Developer d1 = new Developer(24,"Anuj");
        {
            d1.walk();
            d1.walk(25);

        }
    }  */

        EncapsulationIntro obj = new EncapsulationIntro();
        {
          obj.doWork();
        }
    }
}

class Developer extends person{

    public Developer(int age , String name)
    {
        super(age,name);
    }

    void walk()        //  class behaviours
    {
        System.out.println("Developer" + name + " is walking.");
    }

}


class person {
    protected String name;        //class properties
    int age;              // class properties

    static int count;
    public person()      // To check if default constructor is calling out.
    {
        count++;
        System.out.println("creating an object");
    }

   public person(int newAge , String newName)
    {
        count++;
        name = newName;
        age = newAge;
    }

    void walk()        //  class behaviours
    {
        System.out.println(name + " is walking.");
    }

    void eat() {
        System.out.println(name + " is eating.");
    }

    void walk(int steps)
    {
        System.out.println(name + " walked "+ steps +" steps");
    }

}
