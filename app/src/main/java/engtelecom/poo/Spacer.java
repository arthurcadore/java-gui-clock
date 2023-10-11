package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;

/**
 * Classe que representa um espaçador do contador, (dois pontos), seus
 * atributos, construtor, e método de desenho.
 */
public class Spacer {

  /**
   * Atributos correspondents a classe Spacer.
   */
  private Draw screen;
  private double[] spacerPosition;
  private int spacerSize;

  /**
   * Cria uma nova instância da classe Spacer.
   * 
   * @param screen         Região de desenho utilizada para imprimir o
   *                       contador.
   * 
   * @param spacerPosition Coordenadas (x, y) utilizadas para posicionar o
   *                       objeto na tela
   * 
   * @param spacerSize     Fator de multiplicação do tamanho do display,
   *                       utilizado para variar seu tamanho.
   * 
   * @param segmentColor   String correspondente a cor do segmento que será
   *                       impresso, os valores devem ser especificamente
   *                       ORANGE, RED, BLUE, WHITE, GRAY, GREEN, YELLOW ou
   *                       BLACK. Caso o valor passado esteja inválido, o
   *                       construtor utilizará BLACK por padrão.
   */

  public Spacer(Draw screen, double[] spacerPosition, int spacerSize, String segmentColor) {
    this.screen = screen;
    this.spacerPosition = spacerPosition;
    this.spacerSize = spacerSize;

    this.DrawSpacer(segmentColor);
  }

  /**
   * 
   * Metodo para impressão do segmento pelo método construtor;
   * 
   * @param segmentColor String correspondente a cor do espaçador que será
   *                     impresso.
   */

  private void DrawSpacer(String segmentColor) {

    double[] Avet = this.spacerPosition.clone();
    double[] Bvet = this.spacerPosition.clone();

    Bvet[1] = (Bvet[1] + ((this.spacerSize * 1) + (this.spacerSize * 0.01)));
    SpacerSegment A = new SpacerSegment(screen, Avet, this.spacerSize, segmentColor);
    SpacerSegment B = new SpacerSegment(screen, Bvet, this.spacerSize, segmentColor);

  }

  public double[] getSpacerPosition() {
    return spacerPosition;
  }

  public int getSpacerSize() {
    return spacerSize;
  }

}
