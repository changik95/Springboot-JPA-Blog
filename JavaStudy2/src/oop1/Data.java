package oop1;      //��Ű�� ����,���� �տ� ����,

public class Data {
   public int num;//��ü�ȿ�����
   public static int stnum;//����ƽ�� ������ ��ü �ۿ����� �ʱⰪ 0 //���������
                     //��� ��ü ����    �����Ҷ� ����ƽ�� ��Ƴ���
   public static final int finum = 100;
   
   public Data() {//������
      num++;
      stnum++;
   }
   
   public void print() {
      System.out.println("num:"+num+", stnum:"+stnum);
   }

   public int getNum() {
      return num;
   }

   public void setNum(int num) {
      this.num = num;
   }

   public static int getStnum() {
      return stnum;
   }

   public static void setStnum(int stnum) {
      Data.stnum = stnum;
   }
   
   

   
   
   
}