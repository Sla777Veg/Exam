public class Main {
    public static void main(String[] args) {
        //Напишите программу, которая разделяет любую строку на две
        //части ровно пополам по количеству символов.
        String s = "IvanovIvan";
        System.out.println(s.substring(0,s.length()/2));
        System.out.println(s.substring(s.length()/2));
    }
}