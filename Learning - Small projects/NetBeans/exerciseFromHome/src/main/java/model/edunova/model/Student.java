package model.edunova.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Student extends Person {

    private String contractCount;

    @ManyToMany(mappedBy = "students")
    private List<Group> groups;

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public String getContractCount() {
        return contractCount;
    }

    public void setContractCount(String contractCount) {
        this.contractCount = contractCount;
    }

}
