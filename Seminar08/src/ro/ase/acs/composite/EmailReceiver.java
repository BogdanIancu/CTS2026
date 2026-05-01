package ro.ase.acs.composite;

import java.util.Collection;
import java.util.List;

public interface EmailReceiver {
    void receive(String message);

    void addReceiver(EmailReceiver receiver);

    void deleteReceiver(EmailReceiver receiver);

    Collection<EmailReceiver> getReceivers();
}
