package com.tony.java;

public class StoreObject {
    private String contactName;
    private String contactNo;
    private boolean selected;
    private int status;
    private String online_id;

    public String getName() {
        return contactName;
    }

    public void setName(String contactName) {
        this.contactName = contactName;
    }

    public String getNumber() {
        return contactNo;
    }

    public void setNumber(String contactNo) {
        this.contactNo = contactNo;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getOnlineID() {
        return online_id;
    }

    public void setOnlineID(String online_id) {
        this.online_id = online_id;
    }
}
