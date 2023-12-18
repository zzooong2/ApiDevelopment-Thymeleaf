package study.api_member.service;

import org.springframework.stereotype.Service;
import study.api_member.domain.ManUnitedVO;

import java.util.List;

@Service
public interface ManUnitedService {
    //선수 명단 조회
    public List<ManUnitedVO> getList();

    //선수 등록
    public void register(ManUnitedVO vo);

    //선수 조회
    public ManUnitedVO getPlayer(int backNumber);

    //선수 삭제
    public int delete(int backNumber);

    //선수 수정
    public int modify(ManUnitedVO vo);
}
