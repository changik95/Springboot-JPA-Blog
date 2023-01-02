//�������� ó��
package address.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import address.vo.AddressVO;

public class AddressDAO {
	ArrayList<AddressVO> list;
	private static final String filename = "address.txt";  //���� ���ϰ� �Ϸ��� ���� �����س��� ��
	
	public AddressDAO() {
		//���� ��ġ�� "address.data" ������ ������ ����
		File file = new File(filename);
		if (file.isFile()){
			try {
				ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));// ����� ��ü�� �о list ������ ����
				list = (ArrayList<AddressVO>) in.readObject();
				in.close();
			}catch (Exception e) {
				list = new ArrayList<AddressVO>();
			}
		}
		else {
			//������ ������ ArrayList��ü�� �����ؼ� list ������ ����
			list = new ArrayList<AddressVO>();
		}
			
		
	}
		
		
	//�ּҵ�� (���� �̸��� ������ ����ȵǰ� false����)
	//������ ����ϰ� true����
	public boolean input(AddressVO vo) {
		for(AddressVO a : list) {
			if(a.getName().equals(vo.getName())) {
				return false;
			}
		}
		list.add(vo);
		return true;
			
	}
	
	public boolean delete(String name) {
		AddressVO a = null;
		for (int i = 0; i < list.size(); i++) {
			a = list.get(i);
			if (a.getName().equals(name)) {
				list.remove(i);
				return true;
			}
		}
		return false;
	}	
	//�ּ� ����
	public boolean update(AddressVO vo) {
		AddressVO a = null;
		for(int i = 0; i < list.size(); i++) {
			a = list.get(i);
			if(a.getName().equals(vo.getName())) {
				list.set(i,vo);
				return true;
			}
		}
		return false;
	}
		
	
	
	//�ּ� �˻�
	public ArrayList<AddressVO> search(String name){
		ArrayList<AddressVO> searchList = new ArrayList<AddressVO>();
		
		for(AddressVO a : list) {	//���� ����Ʈ��  ó������ ������ Ȯ��
			if(a.getName().contains(name)) {//�̸��� ���޹��� ���ڿ��� ���ԵǾ��ִ���
				searchList.add(a); //���簴ü�� searchList ����Ʈ�� �߰�
			}
		}
			
		return searchList;
	}
	
	//�����͸� ���Ϸ� ����
	public void save() {
		ObjectOutputStream out = null;
		//��ü�� ���Ϸ� ������ �� �ִ� ��Ʈ������
		try {
			out = new ObjectOutputStream(new FileOutputStream(filename));
			// list�� ���Ϸ� ���
			out.writeObject(list); 
			//��Ʈ�� �ݱ�
			out.close();		
		}catch (Exception e) {
			System.out.println("���� ���� ����.");
		}
		
				
	}
	
	
	
	
	
	
}//��
