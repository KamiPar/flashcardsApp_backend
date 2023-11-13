package pl.kpartyka.flashcardsapp_backend.flashcard;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FlashcardService {

    private final FlashcardRepository flashcardRepository;
    private final FlashcardMapper flashcardMapper;


    public String save(FlashcardDto flashcardDto) {
      return flashcardRepository.save(flashcardMapper.toFlashcard(flashcardDto)).getId();
    }
}
