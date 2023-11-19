package ma.enset.compte.common_api.commandes;

public class DebitAccountCommand extends BaseCommand<String>{

    private  double amount;
    private String currency;

    public DebitAccountCommand(String id, double amount, String currency) {
        super(id);
        this.amount = amount;
        this.currency = currency;
    }
}
