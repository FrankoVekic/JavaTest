package controller;

import java.util.List;
import model.edunova.model.Student;
import util.CatchException;

public class ProcessStudent extends ProcessPerson<Student> {

    @Override
    public List<Student> read() {
        return session.createQuery("from Student").list();
    }
    
    public List<Student> read(String search) {
        return session.createQuery("from Student s "
                + "where concat(s.name,' ', s.surname, ' ',ifnull(s.oib,''))"
                + "like :search order by s.surname, s.name")
                .setParameter("search", "%" + search + "%")
                .setMaxResults(50).list();
    }
    
    public List<Student> readBeginSurname(String search) {
        return session.createQuery("from Student s "
                + "where s.surname "
                + "like :search order by s.surname, s.name")
                .setParameter("search", "%" + search + "%")
                .setMaxResults(50)
                .list();
    }

    @Override
    protected void controlCreate() throws CatchException {
        super.controlCreate();
        controlContractCount();
    }

    private void controlContractCount() throws CatchException {

        if (entity.getContractCount() == null || !entity.getContractCount().contains("/")) {
            throw new CatchException("Invalid contract count data.");
        }
    }

    @Override
    protected void controlDelete() throws CatchException {
        if (entity.getGroups() != null && entity.getGroups().size() > 0) {
            throw new CatchException(entity.getName() + " " + entity.getSurname() + " can't be deleted because" + entity.getName() + " is in a group.");

        }
    }

}
