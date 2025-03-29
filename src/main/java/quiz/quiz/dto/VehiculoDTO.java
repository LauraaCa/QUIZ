package quiz.quiz.dto;

import org.apache.logging.log4j.core.config.plugins.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record VehiculoDTO (@NotBlank String placa,
                           String color,
                           Long modelo,
                           LocalDateTime lanzamiento,
                           String caja) {
}
