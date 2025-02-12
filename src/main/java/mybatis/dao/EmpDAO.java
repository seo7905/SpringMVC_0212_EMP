package mybatis.dao;

import mybatis.vo.EmpVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmpDAO {
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
