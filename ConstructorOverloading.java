package Training;

public class ConstructorOverloading {
	 String name;


    public Student() {
        this.name = "Unknown";
        System.out.println(name);
    }

 
    public Student(String name) {
        this.name = name;
        System.out.println(name);
    }
    public static void main(String[] args) {
        
        ConstructorOverloading student1 = new ConstructorOverloading(); 
        ConstructorOverloading student2 = new ConstructorOverloading("Anuhya"); 

      
        
    }
}


