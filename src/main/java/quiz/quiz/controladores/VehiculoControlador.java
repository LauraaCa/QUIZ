package quiz.quiz.controladores;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import quiz.quiz.dto.VehiculoDTO;
import quiz.quiz.persistencia.entidades.Vehiculo;
import quiz.quiz.servicios.VehiculoServicio;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping("/vehiculos")

public class VehiculoControlador {
    VehiculoServicio vehiculoServicio;

    @PostMapping("/")
    public VehiculoDTO crear(@RequestBody VehiculoDTO vehiculo){
        return vehiculoServicio.crear(vehiculo);
    }

    @GetMapping("/")
    public List<Vehiculo> obtener(){
        return vehiculoServicio.obtenerTodos();
    }

}
