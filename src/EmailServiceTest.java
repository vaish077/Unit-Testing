import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class EmailServiceTest {
    @Test
    public void Test_getInstance_return_Single_Instance()
    {
        EmailService Expected_EmailService_Instance=EmailService.getInstance();

        EmailService actual_EmailService_Instance=EmailService.getInstance();

        assertEquals(Expected_EmailService_Instance,actual_EmailService_Instance);
    }
    @Test
    void Send_Email_throws_exception_IF_no_CC_provided() {
        Order newOrder = new Order();
        EmailService emailService=EmailService.getInstance();
        assertThrows(RuntimeException.class, () -> emailService.sendEmail(newOrder));
    }
    @Test
    void SendEmail_Returns_True_If_Mail_Sent() {
        Order newOrder = new Order();
        String expected_CC="vaishali.kaushik@tothenew.com";
        EmailService emailService=EmailService.getInstance();

        boolean mailSend=emailService.sendEmail(newOrder,expected_CC);

        assertTrue(mailSend);
    }
}
