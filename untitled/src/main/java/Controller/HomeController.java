
package Controller;

        import domain.testAnswer;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;
        import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {


    testService service;
    @Autowired
    public HomeController(testService service){
        this.service=service;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public testAnswer getResult(){
        return service.getResults();
    }
}