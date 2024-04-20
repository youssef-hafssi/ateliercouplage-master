package dao;

import java.util.HashMap;
import java.util.Map;

public class EtudiantDAODictionary {
    private Map<String, Etudiant> etudiantsMap;

    public EtudiantDAODictionary() {
        this.etudiantsMap = new HashMap<>();
    }

    public Etudiant addEtudiant(Etudiant etudiant) {
        etudiantsMap.put(Integer.toString(etudiant.getId()), etudiant);
        return etudiant;
    }

    public Map<String, Etudiant> getAllEtudiants() {
        return etudiantsMap;
    }
}
