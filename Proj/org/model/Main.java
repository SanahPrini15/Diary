package org.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "Mail_id")
@Table(name = "Diary_name")

public class Main {
	@Column(name = "TEXT")
    String text;
	@Column(name = "DATE")
    @Temporal(TemporalType.DATE)
    String date;
}
