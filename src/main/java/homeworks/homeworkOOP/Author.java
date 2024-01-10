package homeworks.homeworkOOP;

public class Author {
    //    declararea variabilelor din clasa Author;
    private String name;
    private String email;

    //    declararea constructorului, care initializeaza variabilele clasei;
    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    //    getter-ele clasei;
    public String getName() {
        return name;
    };

    public String getEmail() {
        return email;
    }
}
