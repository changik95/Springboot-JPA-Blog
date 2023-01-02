package Method;
//extends가 안적혀있어도 extends object 적용되어있음 생략되잇을뿐
public class Product implements Comparable<Product>{
	private String name;
	private int price;
	
	public Product() {
		
	}
	
	
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}



	public String GetName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override // 실수를 찾아줌
	public String toString() {
		String s = "상품명:" + name + " 가격:" + price;
		return s;
	}

	@Override // 상속받은 메소드는 꼭 오버라이드로 정의하기
	public boolean equals(Object obj) {
		Product p = (Product) obj;
		if (p.name.equals(this.name)&& p.price == this.price) {
			return true;
		}
		return false;
	}
	
	@Override
	public int compareTo(Product o) {
		if(this.price > o.price) {
			return 1;
		}
		else if (this.price < o.price) {
			return -1;
		}
		return 0;
	}
	
	
	
}
