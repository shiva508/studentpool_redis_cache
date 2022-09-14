package com.pool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pool.entity.GeoLocationEntity;

public interface GeoLocationRepository extends JpaRepository<GeoLocationEntity, String> {

}
