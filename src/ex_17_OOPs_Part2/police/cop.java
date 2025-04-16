package ex_17_OOPs_Part2.police;

public class cop {


    public int gun;
    String iCard;


    public cop(int gun) {
        this.gun = gun;
    }

  protected void canIShoot(){
      System.out.println("yes you can shoot");
  }
}
