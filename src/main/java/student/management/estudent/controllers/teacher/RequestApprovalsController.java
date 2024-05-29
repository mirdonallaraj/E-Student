package student.management.estudent.controllers.teacher;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RequestApprovalsController {

    @GetMapping("/request-approvals")
    public String showRequestsForApproval(){
        return "teacher/request-approvals";
    }
}
