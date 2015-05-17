package edu.uan.fis.jeesample.dao;

import edu.uan.fis.jeesample.dto.Empleado;
import java.util.List;

public interface EmpleadoDao {
    
    /**
     * Creates a new empleado. 
     * @param empleado
     * @return 
     */
    Empleado create(Empleado empleado);

    /**
     * Updates an existing empleado. Product id can't be modified.
     * @param empleado
     * @return 
     */
    Empleado update(Empleado empleado);

    /**
     * Deletes an existing empleado
     * @param empleado 
     */
    void delete(Empleado empleado);

    /**
     * Find a empleado by id
     * @param empleadoId
     * @return 
     */
    Empleado findById(Integer empleadoId);

    /**
     * Returns all the empleados in the database
     * @return 
     */
    List<Empleado> findAll();
}
