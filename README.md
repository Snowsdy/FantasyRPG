# Travail à réaliser
Création d'un programme permettant de construire des personnages de JDR.

## Chaque personnage dispose :
- d'un nom
- de différentes caractéristiques :
  - Force
  - Dextérité
  - Constitution
  - Intelligence
  - Sagesse
  - Charisme
- d'un niveau (1 à la création)
- de modificateurs de caractéristiques => (caractéristique / 2) - 5
- de points de vie
- d'une défense => 10 + Modificateur de Dextérité
- d'une attaque de mêlée => Modificateur de Force + 1
- d'une attaque à distance => Modificateur de Dextérité + 1
- d'une race (impliquant des modificateurs) :
  - Humain
  - Elfe (Dextérité +2, Force -2)
  - Demi-Elfe
  - Nain (Constitution +2, Dextérité -2)
  - Demi-Orque (Force +2, Intelligence-2, Charisme -2)
- d'un profil (indiquant le nombre de points de vie par niveau) :
  - Guerrier (PV = 10)
  - Magicien (PV = 4)
    - Attaque magique => Modificateur d'Intelligence +1
  - Prêtre (PV = 8)
      - Attaque magique => Modificateur de Sagesse +1
  - Rôdeur (PV = 8)
  - Voleur (PV = 6)

## Votre programme et architecture de classe doit pouvoir s'adapter à de futures évolutions
Tout est envisageable :
- ajout de profil
- ajout de race
- ajout de caractéristique
- ajout de nouvelles attaques
- ajout de nouveau modes de calculs de modificateurs