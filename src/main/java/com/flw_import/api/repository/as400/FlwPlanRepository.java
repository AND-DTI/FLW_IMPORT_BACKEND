package com.flw_import.api.repository.as400;
import com.flw_import.api.model.as400.FlwPlan;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//import org.modelmapper.*;


public interface FlwPlanRepository extends JpaRepository<FlwPlan, String>{
		

    @Query(value="select a.codcia, a.ponum from lpddbice.FlwPlan a", nativeQuery=true)
    //@Query("select new FlwPlan(a.codcia, a.ponum) from FlwPlan a")
    List<Object[]> findAll2(); 



    
    
}