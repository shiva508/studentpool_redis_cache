package com.pool.service;

import java.util.List;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pool.entity.GeoLocationEntity;
import com.pool.repository.GeoLocationRepository;

@Service
public class GeoLocationServiceImpl implements GeoLocationService {

    private final GeoLocationRepository geoLocationRepository;

    public GeoLocationServiceImpl(GeoLocationRepository geoLocationRepository) {
        this.geoLocationRepository = geoLocationRepository;
    }

    @Override
    @Transactional(readOnly = true)
    @Cacheable(value = "geos")
    public List<GeoLocationEntity> getGeoLocationEntities() {
        return geoLocationRepository.findAll();
    }

}
