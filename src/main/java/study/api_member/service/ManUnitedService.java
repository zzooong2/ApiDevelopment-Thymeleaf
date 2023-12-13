package study.api_member.service;

import org.springframework.stereotype.Service;
import study.api_member.domain.ManUnitedVO;

import java.util.List;

@Service
public interface ManUnitedService {
    public List<ManUnitedVO> getList();

    public ManUnitedVO get(int backnumber);
}
