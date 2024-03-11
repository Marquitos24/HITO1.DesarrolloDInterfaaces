package es.hherramientasoftware.controladores;

import org.springframework.ui.Model;
import es.hherramientasoftware.model.Renta;
import es.hherramientasoftware.servicios.RentaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class RentaControlador {

    private final RentaServicio datosServicio;

    @Autowired
    public RentaControlador(RentaServicio datosServicio) {
        this.datosServicio = datosServicio;

    }
    @GetMapping("/consulta1")
    public String cojerTodoslosDatos(Model model){
        List<Renta> datos = datosServicio.cojerTodoslosDatos();
        model.addAttribute("datos", datos);
        return "consulta1";

    }

    @GetMapping("/consulta2")
    public String consult2(Model model) { // Ejecutar la consulta en la base de datos
        List<Object[]> resultado = datosServicio.consulta2();
        // Pasar los resultados a la plantilla Thymeleaf
        model.addAttribute("resultados", resultado);

        // Renderizar la vista correspondiente
        return "consulta2";
    }

    // Endpoint para mostrar la consulta 3
    @GetMapping("/consulta3")
    public String  consult3(Model model) {
        // Ejecutar la consulta en la base de datos
        List<Object[]> resultado = datosServicio.consulta3();

        // Pasar los resultados a la plantilla Thymeleaf
        model.addAttribute("rentas", resultado);

        // Renderizar la vista correspondiente
        return "consulta3";
    }


    // Endpoint para mostrar la consulta 4
    @GetMapping("/consulta4")
    public String consult4(Model model) {
        // Ejecutar la consulta en la base de datos
        List<Object[]> resultado = datosServicio.consulta4();

        // Pasar los resultados a la plantilla Thymeleaf
        model.addAttribute("rentas", resultado);

        // Renderizar la vista correspondiente
        return "consulta4";
    }


    // Endpoint para mostrar la consulta 5
    @GetMapping("/consulta5")
    public String consult5(Model model) {

        List<Object[]> resultado = datosServicio.consulta5();
        model.addAttribute("resultados", resultado);

        return "consulta5";
    }


    // Endpoint para mostrar la consulta 6
    @GetMapping("/consulta6")
    public String consult6(Model model) {
        // Ejecutar la consulta en la base de datos
        List<Object[]> resultado = datosServicio.consulta6();

        model.addAttribute("resultados", resultado);

        return "consulta6";
    }


    // Endpoint para mostrar la consulta 7
    @GetMapping("/consulta7")
    public String consult7(Model model) {
        // Ejecutar la consulta en la base de datos
        List<Object[]> resultado = datosServicio.consulta7();

        model.addAttribute("resultados", resultado);

        return "consulta7";
    }


    // Endpoint para mostrar la consulta 8
    @GetMapping("/consulta8")
    public String consult8(Model model) {
        // Ejecutar la consulta en la base de datos
        List<Object[]> resultado = datosServicio.consulta8();


        // Pasar los resultados a la plantilla Thymeleaf
        model.addAttribute("resultados", resultado);
        // Renderizar la vista correspondiente
        return "consulta8";
    }


    // Endpoint para mostrar la consulta 9
    @GetMapping("/consulta9")
    public String consult9(Model model) {
        // Ejecutar la consulta en la base de datos
        List<Object[]> resultado = datosServicio.consulta9();

        // Pasar los resultados a la plantilla Thymeleaf
        model.addAttribute("resultados", resultado);
        // Renderizar la vista correspondiente
        return "consulta9";
    }


    // Endpoint para mostrar la consulta 10
    @GetMapping("/consulta10")
    public String consult10(Model model) {
        // Ejecutar la consulta en la base de datos
        List<Object[]> resultado = datosServicio.consulta10();

        model.addAttribute("resultados", resultado);
        return "consulta10";
    }

    }
