package composite.exercice;

import java.util.ArrayList;
import java.util.List;

public class Dossier implements DossierComponent {

    private List<DossierComponent> components = new ArrayList<>();

    private String titre;

    public Dossier(String titre) {
        this.titre = titre;
    }

    public void addSousDosser(Dossier dossier2) {
        components.add(dossier2);
    }

    public void addFichier(Fichier fichier1) {
        components.add(fichier1);
    }

    @Override
    public int getTaille() {
        int tailleTotale = 0;
        for (DossierComponent component : components) {
            int taille = component.getTaille();
            tailleTotale = tailleTotale + taille;
        }
        return tailleTotale;
    }

    //public List<Fichier> getFichiers() {
    //    return fichiers;
    //}

    // public List<Dossier> getSousDossiers() {
    //     return dossiers;
    // }
}
