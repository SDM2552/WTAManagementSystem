package izo.wtamanagementsystem.model;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;  // 유저의 고유 식별자
    private String email;  // 유저의 이메일 (로그인 ID 대신 사용)
    private String password;  // 유저의 비밀번호
    private String role;  // 유저의 역할 (예: STUDENT, PROFESSOR 등)
    private String registDate;  // 유저가 등록된 날짜
}

//package izo.wtamanagementsystem.model;
//
//public class User {
//    private Long id;  // 유저의 고유 식별자
//    private String email;  // 유저의 로그인 ID
//    private String password;  // 유저의 비밀번호
//    private String role;  // 유저의 역할 (예: STUDENT, PROFESSOR 등)
//    private String registDate;  // 유저가 등록된 날짜
//
//    // 기본 생성자
//    public User() {}
//
//    // 모든 필드를 포함하는 생성자
//    public User(Long id, String email, String password, String role, String registDate) {
//        this.id = id;
//        this.loginId = email;
//        this.password = password;
//        this.role = role;
//        this.registDate = registDate;
//    }
//
//    // 각 필드에 대한 getter 및 setter 메서드
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.loginId = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getRole() {
//        return role;
//    }
//
//    public void setRole(String role) {
//        this.role = role;
//    }
//
//    public String getRegistDate() {
//        return registDate;
//    }
//
//    public void setRegistDate(String registDate) {
//        this.registDate = registDate;
//    }
//}
