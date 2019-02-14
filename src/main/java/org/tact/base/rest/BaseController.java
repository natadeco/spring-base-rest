package org.tact.base.rest;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/base")
public class BaseController {
	
	
	//localhost:8080/base/movie
    @RequestMapping(value = "/movie", method = RequestMethod.GET)
    public <T> T listUsers() {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        map.put("Actor", "Ajith");
        map.put("Actress", "Nayantara");
        map.put("Movie", "Viswasam");
        map.put("Rating", "6/10");
        
        return (T) map;
    }
    
    //localhost:8080/base/scientist
    @RequestMapping(value = "/scientist", method = RequestMethod.GET)
    public <T> T listScientist() {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        map.put("name", "Dr. APJ Abdul Kalam");
        map.put("designation", "Scientist");
      
        return (T) map;
    }
}
