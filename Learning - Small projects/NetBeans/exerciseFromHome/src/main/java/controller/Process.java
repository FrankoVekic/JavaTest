/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import org.hibernate.Session;
import util.CatchException;
import util.HibernateUtil;

/**
 *
 * @author frank
 */
public abstract class Process<T> {

    protected Session session;
    protected T entity;

    public abstract List<T> read();

    protected abstract void controlCreate() throws CatchException;

    protected abstract void controlUpdate() throws CatchException;

    protected abstract void controlDelete() throws CatchException;

    public Process() {
        session = HibernateUtil.getSession();
    }

    public T create() throws CatchException {
        controlCreate();
        save();
        return entity;
    }

    public T update () throws CatchException {
        controlUpdate();
        save();
        return entity;
    }

    public void delete() throws CatchException {
        controlDelete();
        session.beginTransaction();
        session.delete(entity);
        session.getTransaction().commit();
    }

    public T getEntity() {
        return entity;
    }

    public void setEntity(T entity) {
        this.entity = entity;
    }

    private void save() {
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
    }

}
