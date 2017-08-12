package com.song.web.pojo;

import java.util.List;

/**
 * Created by sj1246225170@outlook on 2017/8/12.
 */
public class Result {
    private int currentPage;
    private int pageSize;
    private int count;
    private List<User> users;
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}

