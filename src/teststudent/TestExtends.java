package teststudent; 

 /**
 * <p>title Teststudent
 * @author Ԭ��
 * @DATE 2017��10��15������11:44:12


 */
public class TestExtends {

	public static void main(String[] args) {
		Student stu=new Student("Ԭ��","21��","����");
		stu.show();
		System.out.println("====================");
		Undergraduate ugrad=new Undergraduate("С��","24��","����","�������");
		ugrad.show();
		System.out.println("====================");
		Graduate grad=new Graduate("Сǿ","25��","�о���","C����");
		grad.show();
		// TODO Auto-generated method stub

	}

}
class Student{
	String name;
	String age;
	String education;
	Student(String n,String m,String ed){
		this.name=n;
		this.age=m;
		this.education=ed;
	}
	public void show() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("education:"+education);
	}
}
class Undergraduate extends Student{
	String specialty;
	Undergraduate(String n,String m,String ed,String spe ){
		super(n,m,ed);
		this.specialty=spe;
		
	}
	public void show() {
		super.show();
		System.out.println("specialty:"+specialty);
	}
	

}
class Graduate extends Student{
	String direction;
	Graduate(String n,String m,String ed,String dir){
		super(n,m,ed);
		this.direction=dir;
	}
	public void show() {
		super.show();
		System.out.println("direction��"+direction);
	}
}

