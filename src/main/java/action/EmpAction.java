package action;

import mybatis.dao.EmpDAO;
import mybatis.vo.EmpVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class EmpAction {
    @Autowired
    private EmpDAO empDAO;

    @RequestMapping("/emp")
    public ModelAndView emp() {
        ModelAndView mv = new ModelAndView();

        EmpVO[] ar = empDAO.getEmp();
        mv.addObject("emp", ar);
//        for (EmpVO emp : ar) {
//            System.out.println(emp.getPosno());
//        }
        mv.setViewName("emp");
        return mv;

    }

}
