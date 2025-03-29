package quiz.quiz.persistencia.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "vehiculos")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(unique=true)
    private String placa;
    private String color;
    private Long modelo;
    private LocalDateTime lanzamiento;
    private String cajaTransmision;

}


