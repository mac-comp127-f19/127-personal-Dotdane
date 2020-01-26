package basicjava;

public class BasicStuff {
    public static void main(String[] args) {
        double age0 = 19, age1 = 18;
        System.out.println("We are "+age0+" and "+age1+" years old! ");

        double sumOfAges = age0+age1;
        System.out.println("The sum of our ages is "+sumOfAges+"!");
        System.out.println("The sum of our ages is "+(age0+age1)+"!");

        System.out.println(6/3);
        System.out.println((double)6/4);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE-1);

        int hours = 1600;
        System.out.println("There are " + 1600/24/7 + " weeks, " + 1600/24%7 + " days, " + 1600%24 + " hours in " + hours + " hours");

        double h = 5, r = 2, V, a;
        V = (Math.PI*r*r*h)/3;
        a = Math.PI*r*r + Math.PI*r*Math.sqrt(r*r+h*h);
    }
}
