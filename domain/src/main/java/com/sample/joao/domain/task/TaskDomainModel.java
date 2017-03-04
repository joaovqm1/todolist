package com.sample.joao.domain.task;

import com.sample.joao.domain.label.LabelDomainModel;
import com.sample.joao.domain.type.TypdeDomainModel;

import java.util.Date;

/**
 * Tabela TaskDBModel usada para armazenar as tarefas a serem feitas
 */
public class TaskDomainModel {
    String title;
    String description;
    Integer status;
    Integer priority;
    Date date;
    LabelDomainModel labelDomainModel;
    TypdeDomainModel typdeDomainModel;

    public LabelDomainModel getLabelDomainModel() {
        return labelDomainModel;
    }

    public void setLabelDomainModel(LabelDomainModel labelDomainModel) {
        this.labelDomainModel = labelDomainModel;
    }

    public TypdeDomainModel getTypdeDomainModel() {
        return typdeDomainModel;
    }

    public void setTypdeDomainModel(TypdeDomainModel typdeDomainModel) {
        this.typdeDomainModel = typdeDomainModel;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
