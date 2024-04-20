package metier;

import dao.Etudiant;
import dao.EtudiantDAO;
import dao.EtudiantDAODictionary;

import java.util.List;
import java.util.HashMap;
import java.util.Map;
public class EtudiantManager {
    //public EtudiantDAO etudiantDAO;
    private EtudiantDAODictionary etudiantDAO;

    //public EtudiantManager(EtudiantDAO etudiantDAO) {
    public EtudiantManager(EtudiantDAODictionary etudiantDAO) {
        this.etudiantDAO = etudiantDAO;
    }

    public Etudiant addEtudiant(Etudiant etudiant) {
        // Vérifier si l'email est déjà utilisé par un ancien étudiant
        //List<Etudiant> allEtudiants = etudiantDAO.getAllEtudiants();
        Map<String, Etudiant> allEtudiants = etudiantDAO.getAllEtudiants();
        //for (Etudiant e : allEtudiants) {
        for (Etudiant e : allEtudiants.values()) {
            if (e.getEmail().equals(etudiant.getEmail())) {
                // L'email est déjà utilisé
                throw new IllegalArgumentException("Email déjà utilisé par un autre étudiant");
            }
        }
        // Ajouter l'étudiant s'il n'y a pas de conflit d'email
        return etudiantDAO.addEtudiant(etudiant);
    }

    //public List<Etudiant> getAllEtudiants() {
    public Map<String, Etudiant> getAllEtudiants() {
        return etudiantDAO.getAllEtudiants();
    }
}
