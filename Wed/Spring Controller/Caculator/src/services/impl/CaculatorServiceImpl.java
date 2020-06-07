package services.impl;

import org.springframework.stereotype.Service;
import repository.CaculatorRepository;
import repository.impl.CaculatorRepositoryImpl;
import services.CaculatorService;
@Service
public class CaculatorServiceImpl implements CaculatorService {
    CaculatorRepositoryImpl caculatorRepository = new CaculatorRepositoryImpl();
    @Override
    public String calculation(double num1, double num2, String calculation) {
        return caculatorRepository.calculation(num1, num2, calculation);
    }

}
