package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;

/**
 * Classe que representa um segmento de display (display de sete segmentos), e
 * seu construtor.
 */
public class DisplaySegment {

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
   * Atributos correspondentes a classe DisplaySegment.
   * 
   * Recebem os valores de posição do segmento, tamanho, e região de desenho.
   */

  private Draw screen;
  private double[] segmentPositon;
  private int segmentSize;
  private String segmentColor;

  /**
   * Cria uma nova instância de segmento de display
   * 
   * @param screen                Região de desenho utilizada para imprimir o
   *                              segmento
   * @param displaySegmentPositon Coordenadas (x, y) utilizadas para posicionar o
   *                              objeto na tela
   * @param displaySegmentSize    Fator de multiplicação do tamanho do display,
   *                              utilizado para variar seu tamanho.
   * @param segmentColor          String correspondente a cor do segmento que será
   *                              impresso, os valores devem ser especificamente
   *                              ORANGE, RED, BLUE, WHITE, GRAY, GREEN, YELLOW ou
   *                              BLACK. Caso o valor passado esteja inválido, o
   *                              construtor utilizará BLACK por padrão.
   * @param SegmentTypeString     Informa o tipo de segmento que será impresso,
   *                              deve ser utilizado "true" para impressão
   *                              horizontal e "false" para vertical.
   */

  public DisplaySegment(Draw screen, double[] displaySegmentPositon, int displaySegmentSize,
      String segmentColor, boolean SegmentType) {

    this.segmentPositon = displaySegmentPositon;
    this.segmentSize = displaySegmentSize;
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
    if (SegmentType) {

      // Montando vetores com os pontos em X e em Y para desenhar um segmento
      // horizontal
      double[] xPlace = { 0.1 * this.segmentSize + xInicial, 0.2 * this.segmentSize + xInicial,
          1.0 * this.segmentSize + xInicial,
          1.1 * this.segmentSize + xInicial, 1.0 * this.segmentSize + xInicial, 0.2 * this.segmentSize + xInicial };
      double[] yPlace = { 0.2 * this.segmentSize + yInicial, 0.3 * this.segmentSize + yInicial,
          0.3 * this.segmentSize + yInicial,
          0.2 * this.segmentSize + yInicial, 0.1 * this.segmentSize + yInicial, 0.1 * this.segmentSize + yInicial };

      screen.filledPolygon(xPlace, yPlace);
    } else {
      // Montando vetores com os pontos em X e em Y para desenhar um segmento vertical
      double[] xPlace = { 0.1 * this.segmentSize + xInicial, 0.2 * this.segmentSize + xInicial,
          0.2 * this.segmentSize + xInicial,
          0.1 * this.segmentSize + xInicial, 0 * this.segmentSize + xInicial, 0 * this.segmentSize + xInicial };
      double[] yPlace = { 0.2 * this.segmentSize + yInicial, 0.3 * this.segmentSize + yInicial,
          1.0 * this.segmentSize + yInicial,
          1.1 * this.segmentSize + yInicial, 1.0 * this.segmentSize + yInicial, 0.3 * this.segmentSize + yInicial };

      screen.filledPolygon(xPlace, yPlace);
    }
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



