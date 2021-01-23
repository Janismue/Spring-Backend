package de.janismueller.springBackend.email;

public interface EmailSender {
    void send(String to, String email);
}
