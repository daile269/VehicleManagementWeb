package com.springbootapp.vehicleapp.repositories;

import com.springbootapp.vehicleapp.models.VehicleMaintenance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleMaintenanceRepository extends JpaRepository<VehicleMaintenance,Long> {

}
