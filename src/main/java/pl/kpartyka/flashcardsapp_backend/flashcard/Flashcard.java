package pl.kpartyka.flashcardsapp_backend.flashcard;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("flashcards")
@Getter
@Setter
@RequiredArgsConstructor
public class Flashcard {

    @Id
    private final String id;
    private final String expression;
    private final String translation;
    private final String description;

}
