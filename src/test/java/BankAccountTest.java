import org.example.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


@DisplayName("Testing Bank Account Class")
public class BankAccountTest {
    private BankAccount acc;

    @BeforeEach
    public void mtd(){
        acc = new BankAccount(1500, 500);
    }

    @Test
    @DisplayName("Deposit 500")
    public void depositTest(){
        acc.deposit(500);
        assertEquals(2000, acc.getBalance());
    }

    @Test
    @DisplayName("withdraw 500")
    public void withDrawTest(){
        acc.withDraw(500);
        assertEquals(1000, acc.getBalance());
    }
}
