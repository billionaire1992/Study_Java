public class JsonDTO {
	private int num, age;
	private String name, addr, tel;
	
	public JsonDTO() {}

	public JsonDTO(int num, String name, int age, String addr, String tel) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.tel = tel;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
}//class
