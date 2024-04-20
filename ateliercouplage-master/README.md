Description de l'Application
Partie 1: Inversion de Contrôle et Injection de Dépendances
Description Minimale :
Utilisation du principe d'inversion de contrôle (IoC) et de l'injection de dépendances (DI) pour assurer la flexibilité de l'application.

Partie 2: Extension de l'Application
Description Minimale :
Extension de l'application pour inclure un service de mise à jour des informations des étudiants tout en conservant le même ID.

Partie 3: Instantiation Dynamique
Réponse :
Pour assurer le bon fonctionnement de l'application dans ses deux versions, nous proposons une solution basée sur l'inversion de contrôle et l'injection de dépendances.

Cette solution implique la configuration d'un conteneur IoC pour instancier dynamiquement la classe DAO appropriée (EtudiantDAO ou EtudiantDAODictionary) en fonction des conditions de configuration ou d'exécution.

Les changements nécessaires sont apportés dans le code pour accommoder cette instantiation dynamique, notamment en ajoutant une logique conditionnelle pour l'instanciation de la classe DAO et en mettant à jour les références directes à EtudiantDAO ou EtudiantDAODictionary.
