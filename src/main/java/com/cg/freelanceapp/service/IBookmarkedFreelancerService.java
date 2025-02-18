package com.cg.freelanceapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dto.BookmarkedFreelancerDTO;
import com.cg.freelanceapp.dto.BookmarkedFreelancerListDTO;
import com.cg.freelanceapp.entities.BookmarkedFreelancer;

/**************************************************************************************
 * Description : This is the Service Interface for BookmarkedFreelancer module.
 * Version     : v1.0.0
 *************************************************************************************/
@Service
public interface IBookmarkedFreelancerService {

	BookmarkedFreelancer bookmarkFreelancer(BookmarkedFreelancerDTO bookmarkedFreelancerDto);

	void deleteBookmarkedFreelancerById(Long id);

	BookmarkedFreelancer findById(Long id);
	
	List<BookmarkedFreelancerListDTO> getAll();

	Long getCurrentId();

	BookmarkedFreelancer save(BookmarkedFreelancerDTO bookmarkedFreelancerDto);

}
