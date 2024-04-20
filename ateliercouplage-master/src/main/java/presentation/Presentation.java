package presentation;

import dao.Etudiant;
import dao.EtudiantDAO;
import dao.EtudiantDAODictionary;
import metier.EtudiantManager;

public class Presentation {
    public static void main(String[] args) {
        // Créer un objet EtudiantDAO
        //EtudiantDAO etudiantDAO = new EtudiantDAO();
        EtudiantDAODictionary etudiantDAO = new EtudiantDAODictionary();


        // Créer un objet EtudiantManager en lui passant l'EtudiantDAO
        EtudiantManager etudiantManager = new EtudiantManager(etudiantDAO);

        // Créer et ajouter 4 étudiants
        Etudiant etudiant1 = new Etudiant(1, "Doe", "John", "john.doe@example.com");
        Etudiant etudiant2 = new Etudiant(2, "Smith", "Alice", "alice.smith@example.com");
        Etudiant etudiant3 = new Etudiant(3, "Johnson", "Bob", "bob.johnson@example.com");
        Etudiant etudiant4 = new Etudiant(4, "Brown", "Emma", "emma.brown@example.com");

        etudiantManager.addEtudiant(etudiant1);
        etudiantManager.addEtudiant(etudiant2);
        etudiantManager.addEtudiant(etudiant3);
        etudiantManager.addEtudiant(etudiant4);

        // Afficher tous les étudiants
        System.out.println("Liste des étudiants :");
        //for (Etudiant etudiant : etudiantManager.getAllEtudiants()) {
        for (Etudiant etudiant : etudiantManager.getAllEtudiants().values()) {
            System.out.println("ID: " + etudiant.getId() + ", Nom: " + etudiant.getNom() +
                    ", Prénom: " + etudiant.getPrenom() + ", Email: " + etudiant.getEmail());
        }
    }
}
