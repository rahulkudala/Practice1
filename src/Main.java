import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[])
    {

        Employees e1 = new Employees("Kiran",301,10000);
        Employees e2 = new Employees("Ram", 302,15000);
        Employees e3 = new Employees("Sai", 303, 12000);
        List<Employees> empl = new ArrayList<>();
        empl.add(e1);
        empl.add(e2);
        empl.add(e3);
        System.out.println(e1.getEmpId());
    }
}
