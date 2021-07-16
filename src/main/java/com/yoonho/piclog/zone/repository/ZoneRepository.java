package com.yoonho.piclog.zone.repository;

import com.yoonho.piclog.zone.domain.Zone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZoneRepository extends JpaRepository<Zone, Long> {
    Zone findByCityAndProvince(String cityName, String provinceName);
}