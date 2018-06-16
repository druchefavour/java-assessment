package io.angus.springbootcrud.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@Autowired
	private PersonRecordService personRecordService;
	
	@RequestMapping("/personsrecords")
	public List<PersonRecord>getAllPersonRecord() {
			return personRecordService.getAllPersonRecord();
	}
	
	@RequestMapping("/personrecords/{id}")
	public PersonRecord getPersonRecord(@PathVariable String id) {
		return personRecordService.getPersonRecord(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/personsrecords")
	public void addPersonRecord(@RequestBody PersonRecord personRecord) {
		personRecordService.addPersonRecord(personRecord);	
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/personsrecords/{id}")
	public void updatePersonRecord(@RequestBody PersonRecord personRecord, @PathVariable String id) {
		personRecordService.updatePersonRecord(id, personRecord);	
	}

	@RequestMapping(method=RequestMethod.DELETE, value="/personsrecords/{id}")
	public void deletePersonRecord(@PathVariable String id) {
		personRecordService.deletePersonRecord(id);	
	}


}
