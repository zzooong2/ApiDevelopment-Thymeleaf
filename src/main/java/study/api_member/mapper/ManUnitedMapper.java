package study.api_member.mapper;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import study.api_member.domain.ManUnitedVO;

import java.util.List;

@Mapper
public interface ManUnitedMapper {
    public List<ManUnitedVO> getList();

    public ManUnitedVO read(int backnumber);
}
