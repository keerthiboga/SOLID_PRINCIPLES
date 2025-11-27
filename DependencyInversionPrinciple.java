
interface MessageService
{
    void SendMessage(String recipient,String message);
}

class EmailService implements MessageService
{
    public void SendMessage(String recipient,String message)
    {
        System.out.println("Sending email to "+recipient+" and the message: "+message);
    }
}
class SMSService implements MessageService
{
    public void SendMessage(String recipient,String message)
    {
        System.out.println("Sending email to "+recipient+" and the message: "+message);
    }
}
class MessageSender {

    private final MessageService messageService;

    public MessageSender(MessageService service) {
        this.messageService = service;
    }

    public void processMessage(String recipient, String message) {
        this.messageService.SendMessage(recipient, message);
    }
}

public class DependencyInversionPrinciple {
    public static void main(String[] args) {

        MessageService emailService = new EmailService();
        MessageSender emailSender = new MessageSender(emailService);
        emailSender.processMessage("abc@gmail.com", "Hello!");

        MessageService smsService = new SMSService();
        MessageSender smsSender = new MessageSender(smsService);
        smsSender.processMessage("0998989890", "Hi!");
    }
}
