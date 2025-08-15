package observer;

public class EmailMsgListener implements EventListener {
    private final String email;

    public EmailMsgListener(String email) {
        this.email = email;
    }

    @Override
    public void update() {
        System.out.println("Уведомление от Store для пользователя с почтой: " + email);
    }
}
