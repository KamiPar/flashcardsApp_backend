package pl.kpartyka.flashcardsapp_backend.flashcard;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flashcard")
@RequiredArgsConstructor
public class FlashcardController implements FlashcardAPI {

    private final FlashcardService flashcardService;

    @PostMapping
    @Override
    public ResponseEntity<String> save(@RequestBody FlashcardDto flashcardDto) {
        return ResponseEntity.ok().body(flashcardService.save(flashcardDto));
    }
}
