package com.springboot;

import java.net.InetAddress;
import java.net.UnknownHostException;

import com.swagger.client.codegen.rest.api.EmployeeProfileControllerApi;
import com.swagger.client.codegen.rest.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.client.RestTemplateAutoConfiguration;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/svc/v1/api/example")
@RestController
public class ExampleController {

  @Autowired
  private EmployeeProfileControllerApi employeeProfileControllerApi;

  @GetMapping
  public Object getEmployeeApi(@RequestParam(name = "name") String name) {

    Employee employee = employeeProfileControllerApi.fetchEmployeeByNameUsingGET(name);
    return employee;
  }






























//	@GetMapping
//	public String fooBar() throws UnknownHostException {
//		InetAddress ip;
//		String hostName;
//		ip = InetAddress.getLocalHost();
//		hostName = ip.getHostName();
//		return "<h3>Welcome, Responding from IP : " + ip + " and HOST : " + hostName + "</h3>";
//	}
}