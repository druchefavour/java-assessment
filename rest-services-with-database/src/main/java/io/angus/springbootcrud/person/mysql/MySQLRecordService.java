package io.angus.springbootcrud.person.mysql;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class MySQLRecordService {
	
	private MySQLRepository mysqlRepository;
	
	public List<MySQLRecord>getAllMySQLRecord() {
		List<MySQLRecord> mySQLRecords = new ArrayList<>(); 
		mysqlRepository.findAll()
		.forEach(mySQLRecords::add);
		return mySQLRecords;
	}

	public void addMySQLRecord(MySQLRecord mysqlRecord) {
		mysqlRepository.save(mysqlRecord);
	}

	public void updateMySQLRecord(Integer id, MySQLRecord mysqlRecord) {
		mysqlRepository.save(mysqlRecord);
		}
		
	public void deleteMySQLRecord(Integer id) {
		mysqlRepository.deleteById(id);
	}
}
