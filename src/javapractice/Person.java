package javapractice;

public class Person {
    private String name;
    private int age;

    public void setName(String name)
    {
        if (name.length()>6||name.length()<2)
        {
            System.out.println("you can't use this name ");
            return;
        }
        else
        {
            this.name=name;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (age>100||age<0)
        {
            System.out.println("wrong age ");
            return;
        }

        else
            this.age=age;
    }

    public int getAge()
    {
        return this.age;
    }
    //jkjkjkhkjhkjhkjhkjh
}
