public class StudentDetails {

        String fName,lName,mName,indexNo,department,faculty,email,phone,occupation,level,program;
        String sex;
        int age;
        double fees;

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getmName() {
        return mName;
    }

    public String getIndexNo() {
        return indexNo;
    }

    public String getDepartment() {
        return department;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getLevel() {
        return level;
    }

    public String getProgram() {
        return program;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public double getFees() {
        return fees;
    }

    public StudentDetails(String fName, String lName, String mName, String indexNo, String department, String faculty, String email, String phone, String occupation, String level, String program, String sex, int age, double fees) {
        this.fName = fName;
        this.lName = lName;
        this.mName = mName;
        this.indexNo = indexNo;
        this.department = department;
        this.faculty = faculty;
        this.email = email;
        this.phone = phone;
        this.occupation = occupation;
        this.level = level;
        this.program = program;
        this.sex = sex;
        this.age = age;
        this.fees = fees;


    }
}
