package com.juliocfds.dslist.repositories;

import com.juliocfds.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
