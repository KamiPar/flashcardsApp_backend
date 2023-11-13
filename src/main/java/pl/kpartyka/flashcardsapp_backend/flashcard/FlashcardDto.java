package pl.kpartyka.flashcardsapp_backend.flashcard;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
@Builder
public class FlashcardDto {

    private final String expression;
    private final String translation;
    private final String description;
}
