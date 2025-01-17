package com.socialv2.ewallet.dtos.transfers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequestBankTransferDto {
    @SerializedName("sourceAccountId")
    @Expose
    private String sourceAccountId;

    @SerializedName("destBin")
    @Expose
    private String destBin;

    @SerializedName("destBankAccountNo")
    @Expose
    private String destBankAccountNo;

    @SerializedName("transferContent")
    @Expose
    private String transferContent;

    @SerializedName("transferAmount")
    @Expose
    private double transferAmount;


    @SerializedName("useLinkingBank")
    @Expose
    private boolean useLinkingBank;

    public RequestBankTransferDto() {

    }

    public RequestBankTransferDto(
            String sourceAccountId,
            String destBin,
            String destBankAccountNo,
            String transferContent,
            double transferAmount,
            boolean useLinkingBank) {
        this.sourceAccountId = sourceAccountId;
        this.destBin = destBin;
        this.destBankAccountNo = destBankAccountNo;
        this.transferContent = transferContent;
        this.transferAmount = transferAmount;
        this.useLinkingBank = useLinkingBank;
    }

    public String getSourceAccountId() {
        return sourceAccountId;
    }

    public void setSourceAccountId(String sourceAccountId) {
        this.sourceAccountId = sourceAccountId;
    }

    public String getDestBin() {
        return destBin;
    }

    public void setDestBin(String destBin) {
        this.destBin = destBin;
    }

    public String getDestBankAccountNo() {
        return destBankAccountNo;
    }

    public void setDestBankAccountNo(String destBankAccountNo) {
        this.destBankAccountNo = destBankAccountNo;
    }

    public String getTransferContent() {
        return transferContent;
    }

    public void setTransferContent(String transferContent) {
        this.transferContent = transferContent;
    }

    public double getTransferAmount() {
        return transferAmount;
    }

    public void setTransferAmount(double transferAmount) {
        this.transferAmount = transferAmount;
    }


    public boolean isUseLinkingBank() {
        return useLinkingBank;
    }

    public void setUseLinkingBank(boolean useLinkingBank) {
        this.useLinkingBank = useLinkingBank;
    }

    @Override
    public String toString() {
        return "RequestBankTransferDto{" +
                "sourceAccountId='" + sourceAccountId + '\'' +
                ", destBin='" + destBin + '\'' +
                ", destBankAccountNo='" + destBankAccountNo + '\'' +
                ", transferContent='" + transferContent + '\'' +
                ", transferAmount=" + transferAmount +
                ", useLinkingBank=" + useLinkingBank +
                '}';
    }
}
