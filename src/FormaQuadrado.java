import java.awt.*;

public class FormaQuadrado extends Forma {

    public FormaQuadrado(){
        nome = "Quadrado";
    }

    @Override
    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public Integer getTamanho() { return this.tamanho; }

    @Override
    public void setCor(Color c) {
        corForma = c;
    }

    @Override
    public Color getCor() {
        return this.corForma;
    }

    @Override
    public void desenha(Integer x, Integer y, Graphics2D g2d) {
        g2d.setColor(getCor());
        g2d.fillRect(x - getTamanho() / 2, y - getTamanho() / 2, getTamanho(), getTamanho());
    }
}
