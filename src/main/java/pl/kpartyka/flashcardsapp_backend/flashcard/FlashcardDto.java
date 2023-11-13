package pl.kpartyka.flashcardsapp_backend.flashcard;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@Getter
@Builder
public class FlashcardDto {

    private final String expression;
    private final List<String> translations;
    private final String description;
}
