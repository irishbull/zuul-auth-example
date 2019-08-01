package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_ATTEMPTS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//Todo sequence generator db ecc ecc
public class UserAttemptEntity {
    @Id
    @Column(name = "USER_ID", nullable = false)
    private Long uid;
    @Column(name = "RESET_PASSWORD_ATTEMPTS", nullable = false)
    private int resetPwdCounter;
    @Column(name = "REGISTRATION_ATTEMPTS", nullable = false)
    private int registrationCounter;
}


