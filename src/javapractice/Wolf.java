package javapractice;

class Creature{
    public Creature()
    {
        System.out.println("Creature无参数的构造器");
    }
}

class Animal extends Creature
{
    public Animal(String name)
    {
        System.out.println("Animal带一个参数的构造器，" + "该动物的name为" + name);
    }

    public Animal(String name,int age)
    {
        //同一个类中重载的构造器用this
        this(name);
        System.out.println("Animal带两个参数的构造器，" + "该动物的age为" + age);
    }
}

public class Wolf extends Animal {
    public Wolf()
    {
        //继承的子类要调用父类的构造器需要用super
        super("abc",3);
        System.out.println("Wolf无参数的构造器");
    }
    public static void main(String[] args)
    {
        new Wolf();
    }
}
