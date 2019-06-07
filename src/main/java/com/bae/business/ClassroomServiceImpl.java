package com.bae.business;

import javax.inject.Inject;

import com.bae.persistence.repository.ClassroomRepository;

public class ClassroomServiceImpl implements ClassroomService {

	@Inject
	private ClassroomRepository classRepo;

	@Override
	public String getAllClassrooms() {
		return classRepo.getAllClassrooms();
	}

}
