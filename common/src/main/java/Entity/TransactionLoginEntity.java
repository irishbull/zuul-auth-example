package Entity;

import Base.BaseEntity;
import Enum.LoginStateEnum;
import javax.persistence.*;

public class TransactionLoginEntity extends BaseEntity {
    @Id
    @Column(name = "USER_ID", nullable = false)
    private Long uid;
    @Column(name = "OTP", nullable = false)
    private String otp;
    @Enumerated(EnumType.STRING)
    @Column(name = "LOGIN_STATE", nullable = false)
    private LoginStateEnum loginState;
    @Column(name = "ACTUAL_ATTEMPTS", nullable = false)
    private int attemptsCounter;

    public TransactionLoginEntity() {
    }
}
