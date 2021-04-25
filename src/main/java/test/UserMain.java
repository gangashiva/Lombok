package test;

public class UserMain {

  public static void main(String[] args) {
    User user = new User("Gangashiva",25000L, 100);
    //user.setName("Shiva");
    System.out.println(user.getName());
    System.out.println("User: "+user);
  }

}
