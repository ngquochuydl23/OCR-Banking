package com.socialv2.ewallet.dtos.accounts;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AccountBankDto {
    @SerializedName("bin")
    @Expose
    private String bin;

    @SerializedName("bankName")
    @Expose
    private String bankName;

    @SerializedName("bankAccountId")
    @Expose
    private String bankAccountId;

    @SerializedName("bankOwnerName")
    @Expose
    private String bankOwnerName;

    @SerializedName("logoUrl")
    @Expose
    private String logoUrl;

    @SerializedName("bankFullName")
    @Expose
    private String bankFullName;

    @SerializedName("idCardNo")
    @Expose
    private String idCardNo;

    public AccountBankDto() {

    }

    public AccountBankDto(String bin, String bankName, String bankAccountId, String bankOwnerName, String logoUrl, String bankFullName, String idCardNo) {
        this.bin = bin;
        this.bankName = bankName;
        this.bankAccountId = bankAccountId;
        this.bankOwnerName = bankOwnerName;
        this.logoUrl = logoUrl;
        this.bankFullName = bankFullName;
        this.idCardNo = idCardNo;
    }

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAccountId() {
        return bankAccountId;
    }

    public void setBankAccountId(String bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    public String getBankOwnerName() {
        return bankOwnerName;
    }

    public void setBankOwnerName(String bankOwnerName) {
        this.bankOwnerName = bankOwnerName;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getBankFullName() {
        return bankFullName;
    }

    public void setBankFullName(String bankFullName) {
        this.bankFullName = bankFullName;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    @Override
    public String toString() {
        return "AccountBankDto{" +
                "bin='" + bin + '\'' +
                ", bankName='" + bankName + '\'' +
                ", bankAccountId='" + bankAccountId + '\'' +
                ", bankOwnerName='" + bankOwnerName + '\'' +
                ", logoUrl='" + logoUrl + '\'' +
                ", bankFullName='" + bankFullName + '\'' +
                ", idCardNo='" + idCardNo + '\'' +
                '}';
    }
}
