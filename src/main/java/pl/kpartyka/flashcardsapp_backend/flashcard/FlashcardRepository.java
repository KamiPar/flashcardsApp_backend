package pl.kpartyka.flashcardsapp_backend.flashcard;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlashcardRepository extends MongoRepository<Flashcard,String> {
}
