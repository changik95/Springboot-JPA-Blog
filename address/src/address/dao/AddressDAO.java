//데이터의 처리
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
	private static final String filename = "address.txt";  //저장 편하게 하려고 따로 대입해놓고 씀
	
	public AddressDAO() {
		//현재 위치에 "address.data" 파일이 있으면 연다
		File file = new File(filename);
		if (file.isFile()){
			try {
				ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));// 저장된 객체를 읽어서 list 변수에 대입
				list = (ArrayList<AddressVO>) in.readObject();
				in.close();
			}catch (Exception e) {
				list = new ArrayList<AddressVO>();
			}
		}
		else {
			//파일이 없으면 ArrayList객체를 생성해서 list 변수에 대입
			list = new ArrayList<AddressVO>();
		}
			
		
	}
		
		
	//주소등록 (같은 이름이 있을시 저장안되고 false리턴)
	//없으면 등록하고 true리턴
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
	//주소 수정
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
		
	
	
	//주소 검색
	public ArrayList<AddressVO> search(String name){
		ArrayList<AddressVO> searchList = new ArrayList<AddressVO>();
		
		for(AddressVO a : list) {	//원본 리스트의  처음부터 끝까지 확인
			if(a.getName().contains(name)) {//이름에 전달받은 문자열이 포함되어있는지
				searchList.add(a); //현재객체를 searchList 리스트에 추가
			}
		}
			
		return searchList;
	}
	
	//데이터를 파일로 저장
	public void save() {
		ObjectOutputStream out = null;
		//객체를 파일로 저장할 수 있는 스트림생성
		try {
			out = new ObjectOutputStream(new FileOutputStream(filename));
			// list를 파일로 출력
			out.writeObject(list); 
			//스트림 닫기
			out.close();		
		}catch (Exception e) {
			System.out.println("파일 저장 실패.");
		}
		
				
	}
	
	
	
	
	
	
}//끝
