package pl.kpartyka.flashcardsapp_backend.flashcard;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<FlashcardDto> findById(@PathVariable String id) {
        return ResponseEntity.ok().body(flashcardService.findFlashcardById(id));
    }


}
