public class Exercise72 {
    public static void main(String[] args){
        //90. Write a Java program to get the value of the environment variable PATH, TEMP, USERNAME
        System.out.println("System environment USERNAME: ");
        System.out.println(System.getenv("USERNAME"));

        System.out.println("System evnironment PATH: ");
        System.out.println(System.getenv("PATH"));

        System.out.println("System environment TEMP: ");
        System.out.println(System.getenv("TEMP"));
    }
}
