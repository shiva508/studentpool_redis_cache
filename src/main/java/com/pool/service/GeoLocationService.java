package com.pool.service;

import java.util.List;

import com.pool.entity.GeoLocationEntity;

public interface GeoLocationService {
    public List<GeoLocationEntity> getGeoLocationEntities();

    public GeoLocationEntity getGeoLocation(String geolocation);
}
