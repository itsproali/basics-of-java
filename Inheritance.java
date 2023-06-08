class Phone {
  public int camera = 3;

  public void tone() {
    System.out.println("Beep Beep!");
  }
}

class iphone extends Phone {
  public boolean waterProof = true;

  public static void main(String[] args) {
    iphone myIphone = new iphone();
    myIphone.tone();
    System.out.println(myIphone.camera);
  }
}