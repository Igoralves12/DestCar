package com.destcar.respoitory.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.destcar.domain.CarroVO;

public interface CarroDao extends JpaRepository<CarroVO, Long> {

}
