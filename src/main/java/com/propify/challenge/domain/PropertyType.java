package com.propify.challenge.domain;

public enum PropertyType {

	SINGLE_FAMILY("Single Family"),
	MULTI_FAMILY("Multi-family"),
	CONDOMINIUM("Condominium"),
	TOWNHOUSE("Townhouse");

	public String type;

	PropertyType(String s) {
		this.type = s;
	}
}
