package pl.kpartyka.flashcardsapp_backend.exception.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import pl.kpartyka.flashcardsapp_backend.exception.api.DocumentNotFoundException;
import pl.kpartyka.flashcardsapp_backend.exception.api.response.BaseException;

@ControllerAdvice
@Slf4j
public class ControllerAdvisor extends ResponseEntityExceptionHandler {

    @ExceptionHandler(DocumentNotFoundException.class)
    public ResponseEntity<BaseException> handleObjectNotFoundException(DocumentNotFoundException ex) {
        log.error(ex.getMessage(), ex);

        BaseException exception = BaseException.builder()
                .message(ex.getMessage())
                .build();
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception);
    }

}
