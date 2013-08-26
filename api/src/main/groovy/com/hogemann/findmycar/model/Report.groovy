package com.hogemann.findmycar.model

abstract class Report {
	
	double latitude
	double longitude
	List<String> geocells
	
	Car car
	Date dateCreated
	
}
