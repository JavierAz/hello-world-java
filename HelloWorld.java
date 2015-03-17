public class HelloWorld {
    public static void main(String[] args) {
        String who = "World";
        
        if ( args.length > 0 ) {
            who = args[0];
            char firstLetter = who.charAt(0);
            who = Character.toUpperCase(firstLetter) + who.substring(1);
        }

        System.out.println(String.format("Hello %s!!!", who)); 
    }    
}

