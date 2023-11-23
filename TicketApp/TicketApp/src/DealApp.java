public class DealApp {
    private User user;
    private Ticket ticket;
    private Account account;

    public DealApp(User user, Ticket ticket, Account account) {
        this.user = user;
        this.ticket = ticket;
        this.account = account;
    }

    public void Set() {
        this.user.addTicket(ticket);
    }
    
}