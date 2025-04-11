# 🌱 Projet CarboneIUT - Application CO₂ (Java Swing)

Cette application Java Swing permet de simuler et estimer l'empreinte carbone hebdomadaire d’un utilisateur en fonction de ses **modes de transport**, de ses **habitudes alimentaires (repas)** et de son **usage numérique (ordinateur)**.

---

## 🌟 Objectifs pédagogiques

- Implémenter une application en Java avec une interface graphique (Swing).
- Suivre une architecture propre basée sur le modèle **MVP (Modèle - Vue - Présentateur)**.
- Modulariser le code pour faciliter l’évolution et la maintenance.
- Gérer les erreurs de saisie utilisateur de manière robuste.
- Réinitialiser complètement l’application via un bouton "Recommencer".

---

## 🧱 Architecture du projet (MVP)

```
src/
├── model/           → Calculs CO₂, gestion des données
├── view/            → Interfaces graphiques (JPanel)
├── controller/      → Coordination entre vues et modèles
└── main/            → Point d'entrée principal (main)
```

### 📌 Classes principales

| Package        | Classe              | Rôle |
|----------------|---------------------|------|
| `model`        | `Model`             | Stocke co2Min & co2Max et fournit les méthodes d'accumulation et de réinitialisation |
|                | `ModelFood`         | Calcule et ajoute les émissions liées aux repas (vegan, boeuf...) au `Model` |
|                | `ModelTransport`    | Calcule et ajoute les émissions liées au transport au `Model` |
|                | `Data`              | Contient les coefficients CO₂ de référence |
| `view`         | `PanelWelcome`      | Écran d'accueil |
|                | `PanelTransport`    | Choix du mode de transport |
|                | `PanelRepas`        | Entrée des repas hebdomadaires |
|                | `PanelOrdinateur`   | Choix du type d’ordinateur |
|                | `PanelFinal`        | Affichage du bilan carbone |
|                | `PanelThanks`       | Écran de remerciement |
| `controller`   | `UIHandler`         | Présentateur principal (orchestration des vues et coordination avec le modèle) |
|                | `ControllerButtons` | Gestion des clics sur les boutons liés au transport |
| `main`         | `AppMain`           | Point d'entrée principal de l'application |

---

## 🖼️ Fonctionnalités

- ✅ Choix du mode de transport (voiture, vélo, transport en commun, etc.)
- ✅ Saisie du nombre de repas (vegan, végétarien, boeuf, poisson/viande)
- ✅ Choix du type d'ordinateur utilisé (IUT ou personnel)
- ✅ Affichage dynamique des résultats CO₂ min et max
- ✅ Réinitialisation complète via "Recommencer"
- ✅ Gestion des erreurs : empêche les saisies non numériques ou négatives
- ✅ Unification des modèles Transport et Repas dans un modèle commun `Model`

---

## 💡 Notes

- Le projet suit la logique MVC-MVP pour une meilleure séparation des responsabilités.
- Aucun framework externe requis (utilise uniquement Java Swing natif).
- Le modèle `Model` est partagé entre les composants pour agréger toutes les émissions CO₂.
- Chaque vue est implémentée dans une classe dédiée héritant de `JPanel`.
- La logique métier est découplée de la logique de présentation.

---

## 🧑‍💻 Auteur

Projet réalisé dans le cadre du cours **Qualité & Architecture Logicielle - S4**  
Étudiant : Van Trang DANG
IUT d’Orsay – BUT Informatique 2023/2024