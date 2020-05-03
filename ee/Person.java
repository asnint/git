package ee;

public class  Person extends Description{
    private String id;
    private String name;
    private String sex;
    private  String address;

	public Person(String name,String sex,String id,String address){
        this.name=name;
        this.sex=sex;
        this.id=id;
        this.address=address;
    }
//    public void printName() {
//    	System.out.print(name);  
//    }
    public void printId(){
        System.out.println(" id is"+id);
    }
    
    public void printSex(){
        System.out.print(sex);
    }
    
    
    public void printAddress(){
        System.out.println(address);
    }
    

    public static void main(String[] args) {
        Description[] person = new Description[3];
        person[0]=new Person("karry","male","990921","chongqing");
        person[1]=new Person("wangyuan","male","000928","chongqing");
        person[2]=new Person("jackson","male","001128","beijing");

        for (Description p : person)
        {p.printName(this.name);p.printId();p.printSex();p.printAddress();}
    }
}
