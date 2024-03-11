package es.hherramientasoftware.servicios;

import es.hherramientasoftware.model.Renta;
import es.hherramientasoftware.repository.RentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentaServicio {

    private final RentaRepository rentaR;

    @Autowired
    public RentaServicio(RentaRepository rentaR) {
        this.rentaR = rentaR;
    }

    public List<Renta> cojerTodoslosDatos() {
        return rentaR.findAll();
    }

    //ejecutar la consulta 2
    public List<Object[]> consulta2() {
        return rentaR.consulta2();
    }

    public List<Object[]> consulta3() {
        return rentaR.consulta3();
    }

    public List<Object[]> consulta4() {
        return rentaR.consulta4();
    }

    public List<Object[]> consulta5() {
        return rentaR.consulta5();
    }

    public List<Object[]> consulta6() {
        return rentaR.consulta6();
    }

    public List<Object[]> consulta7() {
        return rentaR.consulta7();
    }

    public List<Object[]> consulta8() {
        return rentaR.consulta8();
    }

    public List<Object[]> consulta9() {
        return rentaR.consulta9();
    }

    public List<Object[]> consulta10() {
        return rentaR.consulta10();
    }
}
