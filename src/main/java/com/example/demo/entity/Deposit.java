package com.example.demo.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;


@Table(name = "deposits")
public class Deposit {
	
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer depoId;
		@NotNull
		@NotBlank
		@Size(max = 10)
		private String accnumber;
		@NotNull
		@Range(min = 1)
		private Double amt;
		private String description;
		
		public Integer getDepoId() {
			return depoId;
		}
		public void setDepoId(Integer depoId) {
			this.depoId = depoId;
		}
		public String getAccNumber() {
			return accnumber;
		}
		public void setAccNumber(String accNumber) {
			this.accnumber = accNumber;
		}
		public Double getAmt() {
			return amt;
		}
		public void setAmt(Double amt) {
			this.amt = amt;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		
}
