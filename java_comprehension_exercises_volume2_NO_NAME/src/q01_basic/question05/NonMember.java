package q01_basic.question05;

public class NonMember extends AbstMember {
	public NonMember(String name) {
	}

	public void buyItem() {
		System.out.println(getName() + "purchased the item at a fixed price");
	}

	public void showMember() {
		System.out.println("*** MEMBER DATA ***");
		System.out.println(getName() + "is a non-member");
		System.out.println("*******************");
	}

}
