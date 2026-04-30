package q01_basic.question03;

class Member {
	private String name;
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
	public Member(String name, int age, int rank) {
		this.name = name;
		this.age = age;
		this.rank = rank;
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
		System.out.println("name:" + getName());
		System.out.println("age:" + getAge());
		System.out.println("rank:" + getRank());
		System.out.println("*******************");

	}

	public void rankUp() {
		System.out.println("*******************");
		System.out.println(">>>RANK UP>>>");
		System.out.println("----GET RANK---");
		rank++;
		System.out.println("newRank:" + getRank());
	}

}
