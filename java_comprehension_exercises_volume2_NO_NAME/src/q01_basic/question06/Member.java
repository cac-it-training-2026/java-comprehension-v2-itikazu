package q01_basic.question06;

class Member extends AbstMember {
	//TODO ここから実装する
	private int id;
	private String password;
	private int age;
	private int rank;

	/**
	 * 
	 */
	public Member() {
	}

	/**
	 * 
	 */
	public Member(int id, String password, String name, int age, int rank) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public void showMember() {
		System.out.println("*** MEMBER DATA ***");
		System.out.println("id:" + getId());
		System.out.println("password:" + getPassword());
		System.out.println("name:" + getName());
		System.out.println("age:" + getAge());
		System.out.println("rank:" + getRank());
		System.out.println("*******************");

	}

	public void buyItem() {
		System.out.println(getName() + "purchased the item at at 50% off");

	}

	public void rankUp() {
		System.out.println("*******************");
		System.out.println(">>>RANK UP>>>");
		System.out.println("----GET RANK---");
		rank++;
		System.out.println("newRank:" + getRank());
	}

}
