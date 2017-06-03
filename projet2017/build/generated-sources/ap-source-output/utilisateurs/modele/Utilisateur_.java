package utilisateurs.modele;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import utilisateurs.modele.Adresse;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-30T12:33:23")
@StaticMetamodel(Utilisateur.class)
public class Utilisateur_ { 

    public static volatile SingularAttribute<Utilisateur, String> firstname;
    public static volatile CollectionAttribute<Utilisateur, Adresse> adresses;
    public static volatile SingularAttribute<Utilisateur, Integer> id;
    public static volatile SingularAttribute<Utilisateur, String> login;
    public static volatile SingularAttribute<Utilisateur, String> lastname;

}