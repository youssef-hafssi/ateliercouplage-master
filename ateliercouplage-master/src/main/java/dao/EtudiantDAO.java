package dao;

import java.util.ArrayList;
import java.util.List;

public class EtudiantDAO {
    private List<Etudiant> etudiants;

    public EtudiantDAO() {
        this.etudiants = new ArrayList<>();
    }

    public Etudiant addEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
        return etudiant;
    }
    public List<Etudiant> getAllEtudiants() {
        return etudiants;
    }
}
