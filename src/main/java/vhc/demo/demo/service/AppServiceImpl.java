package vhc.demo.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.demo.demo.entiti.Lol;
import vhc.demo.demo.repository.AppRepository;

import java.util.List;
import java.util.Optional;
@Service
public class AppServiceImpl  implements AppService{
    @Autowired
    public AppRepository appRepository;

    @Override
    public List<Lol> getAll() {
        return (List<Lol>) appRepository.findAll();
    }

    @Override
    public void saveUser(Lol lol) {
        appRepository.save(lol);
    }

    @Override
    public void deleteUser(Long nonameId) {
        appRepository.deleteById(nonameId);
    }

    @Override
    public Optional<Lol> finByUserId(Long nonameId) {
        return appRepository.findById(nonameId);
    }
}
