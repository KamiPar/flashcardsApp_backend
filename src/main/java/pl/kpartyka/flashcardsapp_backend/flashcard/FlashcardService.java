package pl.kpartyka.flashcardsapp_backend.flashcard;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.kpartyka.flashcardsapp_backend.exception.api.DocumentNotFoundException;

import java.util.List;

import static java.lang.StringTemplate.STR;

@Service
@RequiredArgsConstructor
public class FlashcardService {

    private final FlashcardRepository flashcardRepository;
    private final FlashcardMapper flashcardMapper;


    public String save(FlashcardDto flashcardDto) {
      return flashcardRepository.save(flashcardMapper.toFlashcard(flashcardDto)).getId();
    }

    public FlashcardDto findFlashcardById(String id) {
        return flashcardMapper.toFlashcardDto(findById(id));
    }

    public List<FlashcardDto> findAll() {
        return flashcardRepository.findAll().stream().map(flashcardMapper::toFlashcardDto).toList();
    }

    public void deleteById(String id) {
        flashcardRepository.deleteById(id);
    }

    public FlashcardDto updateById(String id, FlashcardDto flashcardDto) {
        Flashcard flashcard = findById(id);
        return flashcardMapper.toFlashcardDto(flashcardRepository.save(flashcardMapper.update(flashcard,flashcardDto)));
    }


    private Flashcard findById(String id) {
        return flashcardRepository.findById(id).orElseThrow(() -> new DocumentNotFoundException(STR."Document with id: \{id} doest not exist"));
    }




}
