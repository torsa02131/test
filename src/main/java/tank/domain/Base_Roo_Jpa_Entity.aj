// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package tank.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import tank.domain.Base;

privileged aspect Base_Roo_Jpa_Entity {
    
    declare @type: Base: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Base.id;
    
    @Version
    @Column(name = "version")
    private Integer Base.version;
    
    public Long Base.getId() {
        return this.id;
    }
    
    public void Base.setId(Long id) {
        this.id = id;
    }
    
    public Integer Base.getVersion() {
        return this.version;
    }
    
    public void Base.setVersion(Integer version) {
        this.version = version;
    }
    
}
