package Method;
//extends�� �������־ extends object ����Ǿ����� ������������
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
	
	@Override // �Ǽ��� ã����
	public String toString() {
		String s = "��ǰ��:" + name + " ����:" + price;
		return s;
	}

	@Override // ��ӹ��� �޼ҵ�� �� �������̵�� �����ϱ�
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
