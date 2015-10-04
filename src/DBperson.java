import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by ECHIN on 5/19/2015.
 */
public class DBperson {
    private Person person;

    public void setDBPerson( Person person)
    {
        this.person = person;
    }

    public void write() {
        try {
            FileOutputStream dataBase = new FileOutputStream("database.csv", true);
            String writeString = person.getInits() + ", " +
                    person.getLastName() + ", " +
                    person.getFirstName() +", " + person.getAge() + ", " + person.getIncome() + ", " +
                    person.getJob1() + ", " + person.getJob2() +"\n";
            dataBase.write(writeString.getBytes());
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public boolean find(Person person) {
        Person e = null;
        try
        {
            FileInputStream fileIn = new FileInputStream("database.csv");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (Person) in.readObject();
            in.close();
            fileIn.close();
        }catch(IOException i)
        {
            i.printStackTrace();

        }catch(ClassNotFoundException c)
        {
            System.out.println("Person not found");
            c.printStackTrace();
        }

        if(e == person)
        return true;

        else
            return false;
    }


}
