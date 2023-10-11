package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;

/**
 * Classe que representa um segmento espaçador (ponto), e
 * seu construtor.
 */
public class SpacerSegment {

  /**
   * Constantes correspondentes as cores permitidas no desenho dos segmentos do
   * display.
   */

  private static final String COLOR_ORANGE = "ORANGE";
  private static final String COLOR_RED = "RED";
  private static final String COLOR_BLUE = "BLUE";
  private static final String COLOR_WHITE = "WHITE";
  private static final String COLOR_GRAY = "GRAY";
  private static final String COLOR_GREEN = "GREEN";
  private static final String COLOR_YELLOW = "YELLOW";
  private static final String COLOR_BLACK = "BLACK";

  /**
   * Atributos correspondentes a classe SpacerSegment.
   * 
   * Recebem os valores de posição do segmento, tamanho, e região de desenho.
   */

  private Draw screen;
  private double[] segmentPositon;
  private int segmentSize;
  private String segmentColor;

  /**
   * Cria uma nova instância de classe SpacerSegment
   * 
   * @param screen         Região de desenho utilizada para imprimir o
   *                       espaçador
   * @param SegmentPositon Coordenadas (x, y) utilizadas para posicionar o
   *                       objeto na tela
   * @param SegmentSize    Fator de multiplicação do tamanho do espaçador,
   *                       utilizado para variar seu tamanho.
   * @param segmentColor   String correspondente a cor do espaçador que será
   *                       impresso, os valores devem ser especificamente
   *                       ORANGE, RED, BLUE, WHITE, GRAY, GREEN, YELLOW ou
   *                       BLACK. Caso o valor passado esteja inválido, o
   *                       construtor utilizará BLACK por padrão.
   */

  public SpacerSegment(Draw screen, double[] SegmentPositon, int SegmentSize,
      String segmentColor) {

    this.segmentPositon = SegmentPositon;
    this.segmentSize = SegmentSize;
    this.screen = screen;

    double xInicial = this.segmentPositon[0];
    double yInicial = this.segmentPositon[1];

    if (segmentColor == COLOR_ORANGE) {
      screen.setPenColor(Draw.ORANGE);
      this.segmentColor = segmentColor;

    } else if (segmentColor == COLOR_RED) {
      screen.setPenColor(Draw.RED);
      this.segmentColor = segmentColor;

    } else if (segmentColor == COLOR_BLUE) {
      screen.setPenColor(Draw.BLUE);
      this.segmentColor = segmentColor;

    } else if (segmentColor == COLOR_WHITE) {
      screen.setPenColor(Draw.WHITE);
      this.segmentColor = segmentColor;

    } else if (segmentColor == COLOR_GRAY) {
      screen.setPenColor(Draw.GRAY);
      this.segmentColor = segmentColor;

    } else if (segmentColor == COLOR_GREEN) {
      screen.setPenColor(Draw.GREEN);
      this.segmentColor = segmentColor;

    } else if (segmentColor == COLOR_YELLOW) {
      screen.setPenColor(Draw.YELLOW);
      this.segmentColor = segmentColor;

    } else if (segmentColor == COLOR_BLACK) {
      screen.setPenColor(Draw.BLACK);
      this.segmentColor = segmentColor;

    } else {
      screen.setPenColor(Draw.BLACK);
      this.segmentColor = COLOR_BLACK;

    }

    double[] xPlace = { xInicial, xInicial + this.segmentSize * 0.2, xInicial + this.segmentSize * 0.2, xInicial };
    double[] yPlace = { yInicial, yInicial, yInicial + this.segmentSize * 0.2, yInicial + this.segmentSize * 0.2 };

    screen.filledPolygon(xPlace, yPlace);
  }

  public double[] getSegmentPositon() {
    return segmentPositon;
  }

  public int getSegmentSize() {
    return segmentSize;
  }

  public String getSegmentColor() {
    return segmentColor;
  }

}
