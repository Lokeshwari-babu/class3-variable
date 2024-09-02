class Account{
    int acc_ID;
    String acc_name;
    double acc_bal;
    static double min_bal=2000;
    static String branch_Name="SBI";
    public static void main (String[]args){
        Account a1= new Account();
        Account a2= new Account();
        Account a3= new Account();

        System.out.println(a1.acc_ID);
        System.out.println(a1.acc_name);
        
    }
}