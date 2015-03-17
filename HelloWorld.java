public class HelloWorld {
    public static void main(String[] args) {
        String who = "world";
        
        if ( args.length > 0 ) {
            who = args[0];
        }

        System.out.println("hello " + who);
       
    }    
}

