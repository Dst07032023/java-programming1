package alexQI.java.day43_list_custom_classes;

public class Company {
    public static void main(String[] args) {
        /**
         * add 3 objects of Employee class
         * assign name and job titles.
         * call work method
         */
        Employee emp1 = new Employee();
        emp1.name = "Onurcan Dogru";
        emp1.jobTitle = "SDET";
        emp1.work();
        System.out.println(emp1.name);
        System.out.println(emp1.jobTitle);

        Employee emp2 = new Employee();
        emp2.name = "Rahib Heydarov";
        emp2.jobTitle = "Full stack developer";
        emp2.work();
        System.out.println(emp2.name);
        System.out.println(emp2.jobTitle);

//        emp1 = emp2;
        emp1.work();

;    }
}
