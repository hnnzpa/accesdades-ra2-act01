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
        int nStatus = 0; 
        String[] noms = {"hanna", "maikel", "ian", "cha-li", "marc", "iker", "joan", "erika", "elsa", "janira"};
        String[] cognoms = {"zipa", "alcantara", "limon", "jimenez", "lopez", "nuevo", "fernandez", "hermosilla", "jimenez", "lopez"};
        int[] edats = {18, 18, 19, 20, 22, 25, 21, 20, 19, 20};
        String[] cicles = {"DAM", "DAW", "DAW", "ASIX", "DAM", "ASIX", "DAW", "DAM", "ASIX", "DAW"}; 
        int[] anys = {1, 1, 2, 1, 2, 2, 1, 2, 1, 2};
        for (int i = 0; i < 10; i++) {
            String sql = "insert into students (nom, cognom, age, cicle, any_academic) values (?,?,?,?,?)";
            int status = jdbcTemplate.update(sql, noms[i], cognoms[i], edats[i], cicles[i], anys[i]); 
            nStatus += status;
        }
        
        return nStatus; 
    }
}
