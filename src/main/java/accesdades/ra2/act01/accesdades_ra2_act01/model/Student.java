package accesdades.ra2.act01.accesdades_ra2_act01.model;

public class Student {

    private Long id; 
    private String nom; 
    private String cognom; 
    private int age; 
    private String cicle; 
    private int any_academic;

    public Student(){}
    
    public Student(Long id, String nom, String cognom, int age, String cicle, int any_academic) {
        this.id = id;
        this.nom = nom;
        this.cognom = cognom;
        this.age = age;
        this.cicle = cicle;
        this.any_academic = any_academic;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getCognom() {
        return cognom;
    }
    public void setCognom(String cognom) {
        this.cognom = cognom;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getCicle() {
        return cicle;
    }
    public void setCicle(String cicle) {
        this.cicle = cicle;
    }
    public int getAny_academic() {
        return any_academic;
    }
    public void setAny_academic(int any_academic) {
        this.any_academic = any_academic;
    }
}


