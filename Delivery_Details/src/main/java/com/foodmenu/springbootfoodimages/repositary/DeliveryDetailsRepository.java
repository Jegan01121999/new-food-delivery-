package com.foodmenu.springbootfoodimages.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodmenu.springbootfoodimages.entity.DeliveryDetails;


@Repository
public interface DeliveryDetailsRepository extends JpaRepository<DeliveryDetails, Long>{

}

