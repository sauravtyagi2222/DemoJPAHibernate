package com.sat.dev.DemoJPAHibernate.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sat.dev.DemoJPAHibernate.madel.DistrictDetails;
import com.sat.dev.DemoJPAHibernate.repository.DistrictRepository;

@Service
public class DistrictService {

	@Autowired
	private DistrictRepository districtRepository;

	
	public List<DistrictDetails> getDistrictList() {
		List<DistrictDetails> ds = new ArrayList<>();
		districtRepository.findAll().forEach(ds::add);
		return ds;
	}

	public DistrictDetails getDistrict(String name) {
		//return ditrict.stream().filter(t -> t.getName().equals(name)).findFirst().get();
	return districtRepository.findOne(name);
	}

	public void addDistrict(DistrictDetails districtDetails) {
		districtRepository.save(districtDetails);
	}
	public void addDistrictAll(List<DistrictDetails> districtDetails) {
		districtRepository.save(districtDetails);
	}

	public void updateDistrict(DistrictDetails district, String name) {
		
		districtRepository.save(district);
	}

	public void deleteDistrict(String name) {
		districtRepository.delete(name);
		}
}
