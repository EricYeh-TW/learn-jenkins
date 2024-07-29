package idv.eric.mapper;

import idv.eric.entity.Users;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM users")
    List<Users> findAll();

    @Select("SELECT * FROM users WHERE name = #{name}")
    Users findByName(String name);

    @Insert("INSERT INTO users(name, rocId, birthday, email) VALUES(#{name}, #{rocId}, #{birthday}, #{email})")
    void insert(String name, String rocId, LocalDate birthday, String email);

    @Delete("DELETE FROM users WHERE name = #{name}")
    void delete(String name);
}
