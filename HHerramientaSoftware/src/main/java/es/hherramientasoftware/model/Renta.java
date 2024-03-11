package es.hherramientasoftware.model;

import jakarta.persistence.*;

import javax.xml.crypto.Data;
import java.time.LocalDate;

@Entity
@Table(name = "renta_hogares")
public class Renta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "comunidad_autonoma")
    private String comunidadA;


    @Column(name = "tipo_renta")
    private String tipoR;


    @Column(name = "periodo")
    private int periodo;


    @Column(name = "renta_neta_media_hogar")
    private int rentaM;

    public Renta(String comunidadA, String tipoR, int periodo, int rentaM) {
        this.comunidadA = comunidadA;
        this.tipoR = tipoR;
        this.periodo = periodo;
        this.rentaM = rentaM;
    }

    public Renta() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComunidadA() {
        return comunidadA;
    }

    public void setComunidadA(String comunidadA) {
        this.comunidadA = comunidadA;
    }

    public String getTipoR() {
        return tipoR;
    }

    public void setTipoR(String tipoR) {
        this.tipoR = tipoR;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getRentaM() {
        return rentaM;
    }

    public void setRentaM(int rentaM) {
        this.rentaM = rentaM;
    }
}
