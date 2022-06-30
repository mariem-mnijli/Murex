package tn.stage.spring.registration.token;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.Setter;
import tn.stage.spring.entity.User;

@Getter
@Setter
@Entity
public class ConfirmationToken {


	@SequenceGenerator(
            name = "confirmation_token_sequence",
            sequenceName = "confirmation_token_sequence",
            allocationSize = 1
    )
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "confirmation_token_sequence"
    )
	private Long id;
	@Column(nullable=false)
	private String token; 
	@Column(nullable=false)
	private LocalDateTime createdAt;
	@Column(nullable=false)
	private LocalDateTime expiresAt;
	private LocalDateTime confirmedAt;
	
	@ManyToOne
	@JoinColumn(nullable=false, 
	            name = "app_user_id")
	private User appUser;
	
	public ConfirmationToken(String token, LocalDateTime createdAt, LocalDateTime expiresAt, User appUser) {
		super();
		this.token = token;
		this.createdAt = createdAt;
		this.expiresAt = expiresAt;
		this.appUser = appUser;
	}

	/**
	 * 
	 */
	public ConfirmationToken() {
		super();
	}

	
	
	
	
}
