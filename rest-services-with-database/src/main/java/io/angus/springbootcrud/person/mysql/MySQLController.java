package io.angus.springbootcrud.person.mysql;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MySQLController {
	
	@Autowired
	private MySQLRecordService mysqlRecordService;
	
	@RequestMapping("/mysqlrecords")
	@GetMapping(value="/")
	public List<MySQLRecord>getAllMySQLRecord() {
			return mysqlRecordService.getAllMySQLRecord();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/mysqlrecords")
	public void addMySQLRecord(@RequestBody MySQLRecord mysqlRecord) {
		mysqlRecordService.addMySQLRecord(mysqlRecord);	
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/mysqlrecords/{id}")
	public void updateMySQLRecord(@RequestBody MySQLRecord mysqlRecord, @PathVariable Integer id) {
		mysqlRecordService.updateMySQLRecord(id, mysqlRecord);	
	}

	@RequestMapping(method=RequestMethod.DELETE, value="/mysqlrecords/{id}")
	public void deleteMySQLRecord(@PathVariable Integer id) {
		mysqlRecordService.deleteMySQLRecord(id);	
	}


}
