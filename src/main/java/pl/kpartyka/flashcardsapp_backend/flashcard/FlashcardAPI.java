package pl.kpartyka.flashcardsapp_backend.flashcard;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface FlashcardAPI {
    @PostMapping
    ResponseEntity<String> save(@RequestBody FlashcardDto flashcardDto);
}
