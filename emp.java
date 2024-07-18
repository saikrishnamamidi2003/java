
WAJP to print the details of an employee using super keyword


class person{
	int id;
	String name;
	person(int id, String name){
		this.id = id;
		this.name = name;
	}
}

class emp{
	float sal;
	person(int id, String name, float sal){
		super(id, name);
		this.sal = sal;
}
void display(){
	System.out.println("id = "+id + "name "+ name +"sal = "+sal);
}
}
	
class test{
public static void main(String args[]){
	emp e = new emp(1, "sai", 100);
	e.display();
}
}