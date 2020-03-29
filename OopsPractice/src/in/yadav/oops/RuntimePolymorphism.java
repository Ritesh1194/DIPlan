package in.yadav.oops;
/* 
 * 4.Write a program that achieve the Runtime Polymorphism.
 * 
 * @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  28-03-2020
 * */
class Parent {

	void display() {
		System.out.println("parent class");
	}
}

class Child1 extends Parent {

	void display() {
		System.out.println("child1 class");
	}
}

class Child2 extends Parent {

	void display() {
		System.out.println("child class2");
	}
}

class RuntimePolymorphism {
	public static void main(String[] args) {

		Parent parent;

		parent = new Child1();
		parent.display();

		parent = new Child2();
		parent.display();
	}
}