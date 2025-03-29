package quiz.quiz.persistencia.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import quiz.quiz.persistencia.entidades.Vehiculo;

public interface VehiculoRepositorio extends JpaRepository<Vehiculo, String> {

}
