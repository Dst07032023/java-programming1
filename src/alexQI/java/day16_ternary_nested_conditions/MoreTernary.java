package alexQI.java.day16_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
        //String reply;
        //if(hourlyRate > 45) {
        //    reply = "accept";
        //} else {
        //    reply = "reject";
        //}

        String reply = (hourlyRate > 45) ? "accept" : "reject";
        System.out.println("reply = " + reply);

        String todaysClass = "java";
        String teacher = (todaysClass.equals("java")) ? "Saim|Muradil" : "Nadir";
        System.out.println("Today's teacher = " + teacher);

        boolean isEligibleToDrive = false; //true
        // "have DL and Can drive"  "No DL, cannot drive"
        String driving = isEligibleToDrive ? "yes, have DL, Can drive" : "No DL, cannot drive";
        System.out.println("driving = " + driving);



    }
}
