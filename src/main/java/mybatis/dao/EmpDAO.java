package mybatis.dao;

import mybatis.vo.EmpVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component  /* 중요 */
public class EmpDAO {
    /* 톰캣 구동될 때 미리 생성된 SqlsessionTemplate이 자동으로 저장되도록 하자 */

    @Autowired
    private SqlSessionTemplate ss;

    public EmpVO[] getEmp() {
        EmpVO[] ar = null;
        List<EmpVO> list = ss.selectList("emp.getEmp");
        if (list != null && !list.isEmpty()) {
            ar = new EmpVO[list.size()];
            list.toArray(ar);
        }
        return ar;
    }
}
