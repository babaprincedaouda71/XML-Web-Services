package tp1;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BankWebService")
public class BankService {
    @WebMethod(operationName = "Convert")
    public double conversion(@WebParam(name = "amount") double amount) { return amount * 11.12; }

    @WebMethod
    public Account getAccount(@WebParam(name = "code") int code) {

        return new Account(code, Math.random()*2500, new Date());
    }

    @WebMethod
    public List<Account> listAccounts() {
        return List.of(
                new Account(1, Math.random()*2500, new Date()),
                new Account(2, Math.random()*2500, new Date()),
                new Account(3, Math.random()*2500, new Date()),
                new Account(4, Math.random()*2500, new Date()),
                new Account(5, Math.random()*2500, new Date()),
                new Account(6, Math.random()*2500, new Date())
        );
    }
}
