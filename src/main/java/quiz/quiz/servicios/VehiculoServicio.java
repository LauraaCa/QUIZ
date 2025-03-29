package quiz.quiz.servicios;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import quiz.quiz.dto.VehiculoDTO;
import quiz.quiz.persistencia.entidades.Vehiculo;
import quiz.quiz.persistencia.repositorios.VehiculoRepositorio;

@Service
@AllArgsConstructor
public class VehiculoServicio {
    VehiculoRepositorio vehiculoRepositorio;

    public VehiculoDTO crear(VehiculoDTO vehiculoDTO) {
        Vehiculo vehiculo = Vehiculo.builder()
                .placa(vehiculoDTO.placa())
                .color(vehiculoDTO.color())
                .modelo(vehiculoDTO.modelo())
                .lanzamiento(vehiculoDTO.lanzamineto())
                .cajaTransmision(vehiculoDTO.cajaTrasmision())
                .build();

        if (vehiculoRepositorio.save(vehiculo).getId() > 0)
            return vehiculoDTO;
        else return null;
    }

}



