package Class_1_Pen;

// Create a pen, to get used to the idea of classes...
public class Pen {
    public String model;
    public String color;
    public double tip;
    private int ink;
    private boolean capped;
    
    // creating the constructors...
    
// Complete detailed pen...
//    public Pen(String color, String model, double tip, int ink, boolean capped) {
//        this.color = color;
//        this.model = model;
//        this.tip = tip;
//        this.ink = ink;
//        this.capped = capped;
//    }
//    
//    // Semi-detailed pen...
//    public Pen(String model, double tip, int ink) {
//        this.color = "Black";
//        this.model = model;
//        this.tip = tip;
//        this.ink = ink;
//        this.capped = false;
//    }
    
    // default pen...
    public Pen() {
        this.color = "Black";
        this.model = "FabreCastel";
        this.tip = 0.5;
        this.ink = 100;
        this.capped = true;
    }
    
    // Class methods that will be used later...
    public void status() {

        //Print the type of the pen that called this method...
        String status;
        status = String.format("""
                               Model: %s.
                               A(n) %s pen.
                               Pen tip: %.2f.
                               Is capped? %b.
                               Charge: %d.
                               """
                ,this.model, this.color,this.tip, this.capped, this.ink);
                
        System.out.println(status);
    }
    
    public void write () {
        
        // conditition to make sure its possible to write...
        if (this.capped == true) {
            System.out.println("The pen is capped, it cant write.");
        } else {
            // then checks if it has any ink left to write...
            if (this.ink > 0){
                System.out.println("Writing...");
                this.ink -= 1;
            } else {
                System.out.println("It cant  write without ink");
            }
        }
    }
    
    public void close () {
        
        // Conditition to make sure its possible to cap the pen...
        if (this.capped == true){
            System.out.println("The pen is already capped.");
        } else {
            this.capped = true;
        }
    }
    
    public void open () {
        
        // condition to make sure its to uncap the pen...
        if (this.capped == false) {
            System.out.println("The pen is already uncapped.");
        } else {
            this.capped = false;
        }
    }
    
    public void fill_pen(int ink) {
        // method to fill the pen, creaated to pratice private and public attributes/methods...
        this.ink += ink;
    }
}
