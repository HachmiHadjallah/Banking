package Banck.test.banck;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins="http://localhost:4200")
@RestController
public class RestControllerResource {
    @Autowired
	MonthFacade monthFacade;
    
    //@GetMapping(path="/months")
    @RequestMapping(method=RequestMethod.GET,path="/months")
	public List<Month> getAllMonths(){
		return monthFacade.findAll();
	}
    
    @RequestMapping(method=RequestMethod.GET,path="/helloMonth")
    public String HelloMonth() {
    	return "Month1";
    }
}
