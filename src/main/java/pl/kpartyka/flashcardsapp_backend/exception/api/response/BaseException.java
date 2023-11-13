package pl.kpartyka.flashcardsapp_backend.exception.api.response;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;

import java.time.LocalDateTime;

@Builder
@Getter
@Jacksonized
public class BaseException {

    private final String message;

    @Builder.Default
    private final LocalDateTime date = LocalDateTime.now();
}
