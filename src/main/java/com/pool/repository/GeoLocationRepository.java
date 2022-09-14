package com.pool.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pool.entity.GeoLocationEntity;

public interface GeoLocationRepository extends JpaRepository<GeoLocationEntity, String> {
    public Optional<GeoLocationEntity> findByGeoLocation(String geoLocation);
}
