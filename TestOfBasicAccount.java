public class TestOfBasicAccount {
    public static void main(String[] args) {
      BasicAccount b=new BasicAccount();
     b.deposits(100);
        System.out.println(b.getBalance());
     b.withdraws(101);
     System.out.println(b.getBalance());
    }
}
