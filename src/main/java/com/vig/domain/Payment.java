package com.vig.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="payment")
public class Payment implements Serializable{
	
	private static final long serialVersionUID = 1236283424582915L;
	
	//import에서 오는 결제 uid
	@Id	
	private String paymentId;
	//구매자(후원자)
	private User buyer;
	//후원시엔 후원을 받을 사람과 피드정보
	private String beneficiary;
	private long feedId;
	//0: 카드, 1: 실시간계좌이체
	private int paymentOption;
	//0: 프라임피드결제 , 1: 비즈니스전환결제, 2:후원결제
	private int productType;
	//후원 결제시 선택한 금액 = 후원금액
	private int selectPrice;
	//실제 결제한 금액
	private int lastPrice;
	private String paymentDate;
	//0:출금 전, 1:출금 후
	private int isWithdraw;
	//0: 정상결제상태 1:결제취소상태
	private int isCancel;
	


}
