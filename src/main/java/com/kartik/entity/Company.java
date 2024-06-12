package com.kartik.entity;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="company_tab")
@DynamicUpdate
public class Company {
       
    @Id
    @Column(name="com_id_col")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name="com_name_col")   
    private String name;
    
    @Column(name="com_regid_col")
    private String cregId;
    
    @Column(name="com_type_col")
    private String ctype;
    
    @Column(name="com_parent_col")
    private String parentOrg;
    
    @Column(name="com_mode_col")
    private String modeOfOperate;
    
    @Column(name="com_service_code_col")
    private String serviceCode;
    
    @OneToOne(
        cascade = CascadeType.ALL,
        fetch = FetchType.EAGER)
    @JoinColumn(name="aidFk")
    private Address addr; //HAS -A

	


}