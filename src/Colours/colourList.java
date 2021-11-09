package Colours;

public class colourList {
    //Reset back to default console colours
    public static final String RESET = "\033[0m";

    //Standard Based Colours
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN

    //Normal Based Text
    public static final String COMMON = "\033[0;37m";
    public static final String RARE = "\u001B[34m";
    public static final String EPIC = "\\033[0;32m";
    public static final String LEGENDARY = "\\033[0;33m";
    public static final String MYTHICAL = "\\033[0;35m";
    
    //Bolded Based Text
    public static final String COMMONBOLD = "\033[1;37m";  // WHITE
    public static final String RAREBOLD = "\033[1;34m";   // BLUE
    public static final String EPICBOLD = "\033[1;32m";  // GREEN
    public static final String LEGENDARYBOLD = "\033[1;33m"; // YELLOW
    public static final String MYTHICBOLD = "\033[1;35m"; // PURPLE
}
