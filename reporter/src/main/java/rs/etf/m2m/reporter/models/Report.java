package rs.etf.m2m.reporter.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Report")
public class Report implements Serializable {

	private static final long serialVersionUID = -7953693980209550902L;

	@Id
	@GeneratedValue
	private Long id;

	@Lob
	private String photo;

	@NotNull
	@Column(nullable = false)
	private double longitude;

	@NotNull
	@Column(nullable = false)
	private double latitude;

	private String comment;

	@NotNull
	private LocalDateTime dateTimeCreated;

	@PrePersist
	protected void onCreate() {
		dateTimeCreated = LocalDateTime.now();
	}

}
