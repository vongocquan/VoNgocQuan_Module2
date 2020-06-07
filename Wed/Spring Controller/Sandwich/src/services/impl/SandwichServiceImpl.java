package services.impl;


import org.springframework.stereotype.Service;
import repository.impl.SandwichRepositoryImpl;
import services.SandwichService;
@Service
public class SandwichServiceImpl implements SandwichService {
    SandwichRepositoryImpl sandwichRepository = new SandwichRepositoryImpl();
    @Override
    public String show(String[] condiments) {
        return sandwichRepository.show(condiments);
    }
}
