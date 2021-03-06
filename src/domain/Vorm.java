package domain;

import javafx.scene.paint.Color;

public abstract class Vorm implements Drawable {
    private Color kleur = Color.WHITE;
    private boolean zichtbaar = true;

    @Override
    public String toString() {
        return toText() + " - " + getOmhullende().toString();
    }

    public abstract Omhullende getOmhullende();

    public abstract String toText();

    public boolean isZichtbaar() {
        return zichtbaar;
    }

    public void setZichtbaar(boolean zichtbaar) {
        this.zichtbaar = zichtbaar;
    }

    public Color getKleur() {
        return kleur;
    }

    public void setKleur(Color kleur) {
        this.kleur = kleur;
    }
}
