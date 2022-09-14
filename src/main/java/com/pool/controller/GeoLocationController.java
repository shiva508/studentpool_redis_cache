package com.pool.controller;

import java.util.List;

import org.springframework.cache.CacheManager;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pool.entity.GeoLocationEntity;
import com.pool.service.GeoLocationService;

@RestController
public class GeoLocationController {

    private final GeoLocationService geoLocationService;

    private final CacheManager cacheManager;

    public GeoLocationController(GeoLocationService geoLocationService, CacheManager cacheManager) {
        this.geoLocationService = geoLocationService;
        this.cacheManager = cacheManager;
    }

    @GetMapping("/geos")
    public ResponseEntity<?> getAllGeoLocations() {
        List<GeoLocationEntity> geoLocationEntities = geoLocationService.getGeoLocationEntities();
        for (String name : cacheManager.getCacheNames()) {
            System.out.println(name);
            System.out.println(cacheManager.getCache(name));

        }
        return new ResponseEntity<>(geoLocationEntities, HttpStatus.OK);
    }

}
