package accesdades.ra2.act01.accesdades_ra2_act01.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import accesdades.ra2.act01.accesdades_ra2_act01.model.Student;

@Repository
public class StudentRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    private static final class StudentRowMapper implements RowMapper<Student>{
        @Override
        public Student mapRow(ResultSet rs, int rowNum) throws SQLException{
            Student student = new Student(); 
            student.setId(rs.getLong("id"));
            student.setNom(rs.getString("nom"));
            student.setCognom(rs.getString("cognom"));
            student.setAge(rs.getInt("age"));
            student.setCicle(rs.getString("cicle"));
            student.setAny_academic(rs.getInt("any_academic"));
            
            return student;
        }   
    }
    public List<Student> findAll(){
        String sql = "select * from students";
        List<Student> llista = jdbcTemplate.query(sql, new StudentRowMapper());
        
        return llista;
    }

    public int save(){
        String sql = "insert into students (nom, cognom, age, cicle, any_academic) values (?,?,?,?,?)";
        int status = jdbcTemplate.update(sql, "Hanna", "Zipa", 18, "DAM", 2);
        return status; 
    }
}
