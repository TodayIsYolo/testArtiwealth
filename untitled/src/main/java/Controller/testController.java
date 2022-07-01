//package Controller;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//
//public class testController {
//    testService service;
//    @Autowired
//    public testController(testService service){
//        this.service=service;
//    }
//
//    @GetMapping("/test")
//    public Result getResult(){
//        return service.getResults();
//    }
//}
