package com.cg.freelanceapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dto.SkillDTO;
import com.cg.freelanceapp.entities.Skill;

/**************************************************************************************
 * Description : This is the Service Interface for SkillService module.
 * Version     : v1.0.0
 *************************************************************************************/
@Service
public interface ISkillService {

	Skill findById(Long id);

	List<Skill> getAllSkills();

	Long getCurrentId();

	Skill getSkill(Long id);

	String remove(Long id);

	Skill save(Skill skill);

	Skill save(SkillDTO skillDto);

	Skill update(Long id, Skill skill);

}
