package com.oryx.vo;

import com.oryx.model.IUser;

import java.util.List;

public class UserListVO {
    private int pagesCount;
    private long totalUsers;

    private String actionMessage;
    private String searchMessage;

    private List<IUser> users;

    public UserListVO() {
    }

    public UserListVO(int pages, long totalUsers, List<IUser> users) {
        this.pagesCount = pages;
        this.users = users;
        this.totalUsers = totalUsers;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public void setPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
    }

    public List<IUser> getUsers() {
        return users;
    }

    public void setUsers(List<IUser> users) {
        this.users = users;
    }

    public long getTotalUsers() {
        return totalUsers;
    }

    public void setTotalUsers(long totalUsers) {
        this.totalUsers = totalUsers;
    }

    public String getActionMessage() {
        return actionMessage;
    }

    public void setActionMessage(String actionMessage) {
        this.actionMessage = actionMessage;
    }

    public String getSearchMessage() {
        return searchMessage;
    }

    public void setSearchMessage(String searchMessage) {
        this.searchMessage = searchMessage;
    }
}