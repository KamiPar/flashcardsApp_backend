package pl.kpartyka.flashcardsapp_backend.flashcard;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface FlashcardMapper {

    Flashcard toFlashcard(FlashcardDto flashcardDto);

    FlashcardDto toFlashcardDto(Flashcard flashcard);

    Flashcard update(@MappingTarget Flashcard flashcard, FlashcardDto flashcardDto);

}
