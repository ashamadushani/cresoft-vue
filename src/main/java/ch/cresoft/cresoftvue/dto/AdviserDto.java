package ch.cresoft.cresoftvue.dto;

import java.util.Date;

public class AdviserDto {
    private Integer id;
    private String code;
    private String name;
    private String shortName;
    private Integer ddlId;
    private String department;
    private String telNumber;
    private Integer ateId;
    private String username;
    private String recTyp;
    private String departmentId;
    private Integer recordStatus;
    private String requestToDelete;
    private String requestUser;
    private Date requestDate;
    private String approveUser;
    private Date approveDate;
    private String region;
    private String market;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Integer getDdlId() {
        return ddlId;
    }

    public void setDdlId(Integer ddlId) {
        this.ddlId = ddlId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public Integer getAteId() {
        return ateId;
    }

    public void setAteId(Integer ateId) {
        this.ateId = ateId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRecTyp() {
        return recTyp;
    }

    public void setRecTyp(String recTyp) {
        this.recTyp = recTyp;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(Integer recordStatus) {
        this.recordStatus = recordStatus;
    }

    public String getRequestToDelete() {
        return requestToDelete;
    }

    public void setRequestToDelete(String requestToDelete) {
        this.requestToDelete = requestToDelete;
    }

    public String getRequestUser() {
        return requestUser;
    }

    public void setRequestUser(String requestUser) {
        this.requestUser = requestUser;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public String getApproveUser() {
        return approveUser;
    }

    public void setApproveUser(String approveUser) {
        this.approveUser = approveUser;
    }

    public Date getApproveDate() {
        return approveDate;
    }

    public void setApproveDate(Date approveDate) {
        this.approveDate = approveDate;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }
}
