public class Motor {

  public int kecepatan = 0;
  public boolean kontakOn = false;

  public void printStatus() {
    if (kontakOn == true) {
      System.out.println("kontak On");
    } else {
      System.out.println("Kontak Off");
    }
    System.out.println("kecepatan " + kecepatan + "\n");
  }

}
