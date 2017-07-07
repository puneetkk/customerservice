package com.company.selfservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.selfservice.domain.Address;
import com.company.selfservice.repo.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository addressRepository;

	public AddressService(AddressRepository addressRepository) {
		this.addressRepository = addressRepository;
	}
	
	public Address createAddress(String line1,String line2,String county,String country,String postcode){
		return addressRepository.save(new Address(line1, line2, county, country, postcode));
	}
	
	public Address updateAddress(Address address){
		/*Address currentAddress = this.addressRepository.findOne(address.getId());
		System.out.println("Current Address is "+ currentAddress);
		Address newAddress = currentAddress;
		newAddress.setLine1(address.getLine1());
		newAddress.setLine2(address.getLine2());
		newAddress.setCounty(address.getCounty());
		newAddress.setCountry(address.getCountry());
		newAddress.setPostcode(address.getPostcode());
		System.out.println("New Address is "+ newAddress);*/
		return addressRepository.save(address);
	}

}
