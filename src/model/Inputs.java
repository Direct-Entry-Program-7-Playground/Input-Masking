package model;

public class Inputs {
    private String NIC;
    private String creditCardNo;
    private String dob;
    private String mobileNo;

    public Inputs() {
    }

    public Inputs(String NIC, String creditCardNo, String dob, String mobileNo) {
        this.setNIC(NIC);
        this.setCreditCardNo(creditCardNo);
        this.setDob(dob);
        this.setMobileNo(mobileNo);
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getCreditCardNo() {
        return creditCardNo;
    }

    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "Inputs{" +
                "NIC='" + NIC + '\'' +
                ", creditCardNo='" + creditCardNo + '\'' +
                ", dob='" + dob + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                '}';
    }

}
