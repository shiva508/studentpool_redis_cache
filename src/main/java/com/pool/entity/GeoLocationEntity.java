package com.pool.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "geo")
@Data
@NoArgsConstructor
public class GeoLocationEntity implements Serializable {
	@Id
	@Column(name = "GeoID")
	private String geoId;

	@Column(name = "Geo")
	private String geoLocation;

	@Column(name = "Region")
	private String geoRegion;
}
