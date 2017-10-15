package teststudent; 

 /**
 * <p>title Teststudent
 * @author 袁杰
 * @DATE 2017年10月15日上午11:44:12


 */
public class TestExtends {

	public static void main(String[] args) {
		Student stu=new Student("袁杰","21岁","本科");
		stu.show();
		System.out.println("====================");
		Undergraduate ugrad=new Undergraduate("小明","24岁","本科","软件工程");
		ugrad.show();
		System.out.println("====================");
		Graduate grad=new Graduate("小强","25岁","研究生","C语言");
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
		System.out.println("direction："+direction);
	}
}

