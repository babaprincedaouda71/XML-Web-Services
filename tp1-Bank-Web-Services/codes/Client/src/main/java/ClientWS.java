import proxy.Account;
import proxy.BankService;
import proxy.BankWebService;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BankService stub = new BankWebService().getBankServicePort();
        System.out.println(stub.convert(7600));
        Account account = stub.getAccount(5);
        System.out.println(account.getCode());
        System.out.println(account.getBalance());
        List<Account> listAccounts = stub.listAccounts();
        for (Account a : listAccounts) {
            System.out.println("Code : " + a.getCode());
            System.out.println("Balance : " + a.getBalance());
            System.out.println("Creation Date : " + a.getCreationDate());
            System.out.println("********************************");
        };
    }
}
