public class GreetMe {
    public static void main(String[] args){
        //Write a method that takes one argument as name and then greets that name, capitalized and ends with an exclamation point.

        System.out.println(greet("mikey"));
    }

    public static String greet(String name){
        return "Hello " + Character.toUpperCase(name.charAt(0)) + name.substring(1,name.length()).toLowerCase() + "!";
    }
}
