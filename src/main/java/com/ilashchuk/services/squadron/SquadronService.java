package com.ilashchuk.services.squadron;

import com.ilashchuk.model.Squadron;

import java.util.List;

public interface SquadronService {
    Squadron insertSquadron(Squadron squadron);
    Squadron getSquadron(int id);
    Squadron updateSquadron(Squadron squadron);
    void deleteSquadron(int id);
    List<Squadron> getAll();
}
