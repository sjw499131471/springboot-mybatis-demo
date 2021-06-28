package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.dao.device.DeviceMapper;
import com.example.demo.model.device.Device;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootMybatisDemoApplication.class)
public class SpringbootMybatisDemoApplicationTests {

	@Autowired
	DeviceMapper dao;
	
	@Test
	public void test() {
		Device device = dao.selectByPrimaryKey("508f445d7a5e11ebbfbd801844e1a8c3");
		System.out.println(device.getName());
	}

}
