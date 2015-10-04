import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by ECHIN on 5/19/2015.
 */
public class Person {
    private final String lastName;
    private final String firstName;
    private final String inits;
    private final int Age;
    private final double income;
    private final String job1;
    private final String job2;
    private DBperson daperson;


    public Person(String first, String last, int age, double income, String job1, String job2) {
        this.firstName = first;
        this.lastName = last;
        inits = firstName.charAt(0) + "" + lastName.charAt(0);
        this.Age = age;
        this.income = income;
        this.job1 = job1;
        this.job2 = job2;
        daperson = new DBperson();
        daperson.setDBPerson(this);
    }

    public void write()
    {
        daperson.write();
    }



    public String getLastName() {
        return lastName;
    }

    public Object getFirstName() {
        return firstName;
    }

    public String getInits() {
        return inits;
    }

    public int getAge() {
        return Age;
    }

    public double getIncome() {
        return income;
    }

    public String getJob1() {
        return job1;
    }

    public String getJob2() {
        return job2;
    }



    public boolean find() {

        boolean record = daperson.find(this);

        return record;

    }
}
