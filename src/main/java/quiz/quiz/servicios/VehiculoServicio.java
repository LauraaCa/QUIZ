package quiz.quiz.servicios;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import quiz.quiz.dto.VehiculoDTO;
import quiz.quiz.persistencia.entidades.Vehiculo;
import quiz.quiz.persistencia.repositorios.VehiculoRepositorio;

import java.util.List;

@Service
@AllArgsConstructor
public class VehiculoServicio {
    VehiculoRepositorio vehiculoRepositorio;

    public VehiculoDTO crear(VehiculoDTO vehiculoDTO) {
        Vehiculo vehiculo = Vehiculo.builder()
                .placa(vehiculoDTO.placa())
                .color(vehiculoDTO.color())
                .modelo(vehiculoDTO.modelo())
                .lanzamiento(vehiculoDTO.lanzamiento())
                .caja(vehiculoDTO.caja())
                .build();

        if (vehiculoRepositorio.save(vehiculo).getId() > 0)
            return vehiculoDTO;
        else return null;
    }

    public List<Vehiculo> obtenerTodos(){
        return vehiculoRepositorio.findAll();
    }

}



