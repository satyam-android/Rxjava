package com.base.company.rxjavatest;

import java.util.ArrayList;
import java.util.List;

public class DataSource {

    List<Task> taskList;

    public List<Task> getData() {
        taskList=new ArrayList<>();
        taskList.add(new Task("Take Out of Trash", true, 3));
        taskList.add(new Task("Walk the Dog", false, 2));
        taskList.add(new Task("Make my Bed", true, 1));
        taskList.add(new Task("Upload the Dishwasher", false, 0));
        taskList.add(new Task("Make Dinner", true, 5));
        return taskList;
    }
}
