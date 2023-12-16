package study.api_member.mapper;

import org.apache.ibatis.annotations.Mapper;
import study.api_member.domain.ManUnitedVO;

import java.util.List;

@Mapper
public interface ManUnitedMapper {
    public List<ManUnitedVO> getList();

    public void register(ManUnitedVO vo);

    public ManUnitedVO getPlayer(int backNumber);

    public int delete(int backNumber);
}
