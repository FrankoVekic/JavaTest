package controller;

import java.util.List;
import model.edunova.model.Professor;
import nl.garvelink.iban.IBAN;
import util.CatchException;

public class ProcessProfessor extends ProcessPerson<Professor> {

    @Override
    public List<Professor> read() {
        return session.createQuery("from Professor").list();
    }

    @Override
    protected void controlCreate() throws CatchException {
        super.controlCreate();
        controlIban();
        controlNewIban();
    }

    private void controlIban() throws CatchException {
        if (entity.getIban() == null) {
            throw new CatchException("Iban is required.");
        }

        try {
            IBAN iban = IBAN.valueOf(entity.getIban());
            if (!iban.isSEPA()) {
                throw new CatchException("Iban is invalid.");
            }
        } catch (Exception e) {
            throw new CatchException("Iban is invalid.");
        }

    }

    private void controlNewIban() throws CatchException {

        List<Professor> profList = session.createQuery("from Professor p "
                + "where p.iban=:iban")
                .setParameter("iban", entity.getIban()).list();

        if (profList != null && profList.size() > 0) {
            throw new CatchException("IBAN is already in use.");
        }

    }

    private void controlChangeIban() throws CatchException {

        List<Professor> profList = session.createQuery("from Professor p "
                + "where p.iban=:iban and p.id!=:id")
                .setParameter("iban", entity.getIban())
                .setParameter("id", entity.getId()).list();

        if (profList != null && profList.size() > 0) {
            throw new CatchException("IBAN is already in use.");
        }

    }

    @Override
    protected void controlUpdate() throws CatchException {
        super.controlUpdate();
        controlChangeIban();
    }

    @Override
    protected void controlDelete() throws CatchException {
        if (entity.getGroups() != null && entity.getGroups().size() > 0) {
            throw new CatchException(entity.getName() + " " + entity.getSurname() + " can't be deleted because" + entity.getName() + " is in a group.");

        }
    }

}
