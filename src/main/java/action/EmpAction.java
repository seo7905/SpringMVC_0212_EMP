package action;

import mybatis.dao.EmpDAO;
import mybatis.vo.EmpVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class EmpAction {
    /* 원하는 DAO를 자동적으로 받도록 지정한다. */
    @Autowired
    private EmpDAO empDAO;

    @RequestMapping("/emp/list")
    public ModelAndView emp() {
        ModelAndView mv = new ModelAndView("emp"); /* (emp) 입력하면 setViewName을 지정하지 않아도 된다. */ /* 파일의 경로를 입력 */
        EmpVO[] ar = empDAO.getEmp();
        mv.addObject("emp", ar);
//        for (EmpVO emp : ar) {
//            System.out.println(emp.getPosno());
//        }
//        mv.setViewName("emp");
        return mv;
    }

}
