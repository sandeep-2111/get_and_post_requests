package yennisarluu.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface RepoClass extends JpaRepository<Employee,Integer>{
//Employee save();
}
