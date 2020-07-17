package vhc.demo.demo.service;

import vhc.demo.demo.entiti.Lol;

import java.util.List;
import java.util.Optional;

public interface AppService {
    List<Lol> getAll();
    void saveUser(Lol lol);
    void deleteUser(Long nonameId);
    Optional<Lol> finByUserId(Long nonameId);
}
