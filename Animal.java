public class Animal {
    private String name;
    private String type;

    public void setName(String name){
        this.name =name;
    }
    public void setType(String type){
        this.type =type;
    }

    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }

    public void display(){
        System.out.println("Name of the animal is " +getName());
        System.out.println("Type of the animal is " +getType());
    }
    public static void main(String[] args) {
        Animal an = new Animal();
        an.setName("Cat");
        an.setType("Domestic");
        an.display();
    }
}


