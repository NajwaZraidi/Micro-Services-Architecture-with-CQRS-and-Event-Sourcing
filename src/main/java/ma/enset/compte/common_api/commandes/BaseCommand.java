package ma.enset.compte.common_api.commandes;

import lombok.Getter;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

public abstract class BaseCommand<T> {

    //idenfiant d'agrerat lie à la commande
    @TargetAggregateIdentifier
    @Getter private  T id;

    public BaseCommand(T id) {
        this.id = id;
    }
}
