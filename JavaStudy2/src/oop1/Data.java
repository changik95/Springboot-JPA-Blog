package oop1;      //패키지 선언문,가장 앞에 선언,

public class Data {
   public int num;//객체안에있음
   public static int stnum;//스태틱이 붙으면 객체 밖에있음 초기값 0 //계속증가함
                     //모든 객체 공유    공유할때 스태틱에 담아놓음
   public static final int finum = 100;
   
   public Data() {//생성자
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