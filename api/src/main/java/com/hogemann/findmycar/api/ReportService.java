package com.hogemann.findmycar.api;

import java.util.List;

import com.hogemann.findmycar.model.Car;
import com.hogemann.findmycar.model.Report;

public interface ReportService {

	void reportMissing(Car car, String report, double latitude, double longitude);
	
	void reportFound(Car car, String report, double lon, double lat);
	
	List<Report> reportsNear(double latitude, double longitude);
	
	List<Report> missingNear(double latitude, double longitude);
	
	List<Report> foundNear(double latitude, double longitude);
}
