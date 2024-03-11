package es.hherramientasoftware.repository;

import es.hherramientasoftware.model.Renta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RentaRepository extends JpaRepository<Renta, Long> {


    List<Renta> findAll();//cojer los datos

    // Consulta 2
    @Query("SELECT AVG(r.rentaM) AS promedio_renta FROM Renta r")
    List<Object[]> consulta2();


    // Consulta 3
    @Query("SELECT r.comunidadA , MAX(r.rentaM) AS max_renta FROM Renta r GROUP BY r.comunidadA")
    List<Object[]> consulta3();


    // Consulta 4
    @Query("SELECT r.comunidadA, COUNT(*) AS cantidad_hogares FROM Renta r GROUP BY r.comunidadA")
    List<Object[]> consulta4();


    // Consulta 5
    @Query("SELECT r.tipoR, MAX(r.rentaM) AS max_renta, MIN(r.rentaM) AS min_renta FROM Renta r GROUP BY r.tipoR")
    List<Object[]> consulta5();


    // Consulta 6
    @Query("SELECT SUBSTRING(CAST(r.periodo AS STRING), 1, 4), SUM(r.rentaM) FROM Renta r GROUP BY SUBSTRING(CAST(r.periodo AS STRING), 1, 4)")
    List<Object[]> consulta6();



    // Consulta 7
    @Query("SELECT r.comunidadA, r.tipoR, AVG(r.rentaM) FROM Renta r GROUP BY r.comunidadA, r.tipoR")
    List<Object[]> consulta7();


    // Consulta 8
    @Query("SELECT r.comunidadA, AVG(r.rentaM) FROM Renta r WHERE r.comunidadA IN ('19 Melilla', '18 Ceuta', '17 Rioja, La') GROUP BY r.comunidadA")
    List<Object[]> consulta8();


    // Consulta 9
    @Query("SELECT r.periodo, r.tipoR, AVG(r.rentaM) FROM Renta r GROUP BY r.periodo, r.tipoR")
    List<Object[]> consulta9();



    // Consulta 10
    @Query("SELECT COUNT(DISTINCT r.periodo) AS cantidad_periodos FROM Renta r")
    List<Object[]> consulta10();


}
