package pl.kpartyka.flashcardsapp_backend.exception.api;

public class DocumentNotFoundException extends RuntimeException {

    public DocumentNotFoundException(String message) {
        super(message);
    }
}
