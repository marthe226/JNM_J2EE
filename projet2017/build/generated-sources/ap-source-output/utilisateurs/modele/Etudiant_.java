package utilisateurs.modele;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-03T18:13:57")
@StaticMetamodel(Etudiant.class)
public class Etudiant_ extends Utilisateur_ {

    public static volatile SingularAttribute<Etudiant, String> naissance;
    public static volatile SingularAttribute<Etudiant, String> miage;
    public static volatile SingularAttribute<Etudiant, Boolean> ancien;

}