//�ּҷ��� ȭ��, ������� �Է� & ���
/*
  [ �ּҷ� ]
  1. �ּ� ���
  2. �ּ� ����
  3. �ּ� ����
  4. �ּ� �˻�
  0. ����
    ���� : 5
    �ٽ� �Է��ϼ��� : a
    �ٽ� �Է��ϼ��� : 1
    
  [ �ּ� ��� ]
    �̸� : 
 */

package address.main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import address.dao.AddressDAO;
import address.vo.AddressVO;

public class AddressUI {
	Scanner scan = new Scanner(System.in); //�̷��� ����� ���� �޼ҵ忡�� �� ��ĵ������ ��� ��밡����
	AddressDAO dao = new AddressDAO();
	
	public AddressUI() {
		
		while (true) { //while(true)�ȳ����� �ݺ���
			menuPrint();    //�޴� ���
			
			int a = 0;
				
			try {
				 a = scan.nextInt();	//��ȣ �Է�
			}catch (InputMismatchException ime) {
				System.out.println("�ٽ� �Է��ϼ���.");
				scan.nextLine(); //���ۿ� ����ģ�κб��� �� �ܾ�ͼ� ����
				continue; // �ݺ����� �ٽ� ���� �ø�
			}
			
		//����ó�� �Ǵ� ��� ����	
			
			switch (a) {
				case 1: input(); break;
				case 2: delete(); break;
				case 3: update(); break;
				case 4: search(); break;
				case 0:
					dao.save();
					System.out.println("-> \"�����ϰڽ��ϴ�.\""); 
					return;
				default : System.out.println("�ٽ� �Է��ϼ���."); 

			}//switch ��
				
		}//while ��
		
	}//addressUI ��

		

	//�޴� ���
	void menuPrint() {
		System.out.println("[ �ּҷ� ]");
		System.out.println("1. �ּ� ���");
		System.out.println("2. �ּ� ����");
		System.out.println("3. �ּ� ����");
		System.out.println("4. �ּ� �˻�");
		System.out.println("0. ����");
		System.out.println("* ���� : ");
		return;
	}
		//�ּ� �Է�
		void input() {
			System.out.println("-> \"1.�ּ� ��� �޴��� �����߽��ϴ�.\"");
			scan.nextLine();
			String  n, p, e;
			System.out.print("�̸�  : ");
			n = scan.nextLine();
			System.out.print("��ȭ��ȣ : ");
			p = scan.nextLine();
			System.out.print("�̸��� : ");
			e = scan.nextLine();
			
			AddressVO vo = new AddressVO(n,p,e); //�Է¹��� ������ VO��ü�� ����
			boolean res = dao.input(vo); //AddressDAOŬ������ input()�޼ҵ�� ����
			if(res) {
				System.out.println("����Ǿ����ϴ�.");
			}
			else {
				System.out.println("�̹� ����� �̸��Դϴ�.");
			}
				
		}
		//�ּ� ����
		void delete() {
			System.out.println("> \"2.�ּ� ���� �޴��� �����߽��ϴ�.\"");
			scan.nextLine();
			//������ �̸� �Է¹���
			System.out.print("������ �̸��� �Է����ּ���.");
			String name = scan.nextLine();
			
			//AddressDAOŬ������ ���� �޼ҵ��  String Ÿ���� �̸������Ͽ� ����
			
			//���� ���θ� boolean Ÿ������ ���Ϲ޾� ��� �޽��� ���
			boolean res = dao.delete(name); 
			if(res) {
				System.out.println("�����Ǿ����ϴ�.");
			}
			else {
				System.out.println("�����̸��Դϴ�.");
			}
		}
		//�ּ� ����
		void update() {
			System.out.println("> \"3.�ּ� ���� �޴��� �����߽��ϴ�.\"");
			scan.nextLine();
			String  n, p, e;
			//������ �̸�, ��ȭ��ȣ, �̸����� �Է¹޾� AddressVO ��ü ����
			System.out.print("�̸�  : ");
			n = scan.nextLine();
			System.out.print("��ȭ��ȣ : ");
			p = scan.nextLine();
			System.out.print("�̸��� : ");
			e = scan.nextLine();
			
			//AddressDAO�� �����޼ҵ�� AddressVO ��ü �����Ͽ� ����
			AddressVO vo = new AddressVO(n,p,e); 
			boolean res = dao.update(vo); 
			if(res) {
				System.out.println("�����Ǿ����ϴ�.");
			}
			else {
				System.out.println("���� �̸��Դϴ�.");
			}
			
		}
			//���� ���� boolean Ÿ������ ���Ϲ޾� ��� �޼��� ���
		//�ּ� �˻�
		void search() {
			System.out.println("-> \"4.�ּ� �˻� �޴��� �����߽��ϴ�.\"");
			
			System.out.println("�˻��� �̸�: ");
			String name = scan.nextLine();
			
			ArrayList<AddressVO> list = dao.search(name);
			
			for (AddressVO vo : list) {
				System.out.println(vo.getName() + "\t" + vo.getPhone() + 
						"\t" + vo.getEmail());
				
			}
		}	
	}
//����ó�� �Ǵ� ��ɽ���
