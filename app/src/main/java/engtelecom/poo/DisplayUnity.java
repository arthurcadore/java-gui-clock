package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;

/**
 * Classe que representa um display de sete segmentos (um digito), seus
 * atributos, construtor, e método de desenho.
 */
public class DisplayUnity {

  /**
   * Atributos correspondentes a classe DisplayUnity.
   * Recebem os valores de posição do segmento, tamanho, e região de desenho do
   * display.
   */

  private Draw screen;
  private double[] displayPosition;
  private int displaySize;

  /**
   * Cria uma nova instância de segmento de display
   * 
   * @param screen          Região de desenho utilizada para imprimir o
   *                        display de sete segmentos
   * 
   * @param displayPosition Coordenadas (x, y) utilizadas para posicionar o
   *                        objeto na tela
   * 
   * @param displaySize     Fator de multiplicação do tamanho do display,
   *                        utilizado para variar seu tamanho.
   * 
   * @param segmentOnColor  String correspondente a cor do segmento aceso que será
   *                        impresso.
   * 
   * @param segmentOffColor String correspondente a cor do segmento apagado que
   *                        será impresso.
   * 
   * @param DisplayValue    Valor a ser impresso pelo display, sendo um numero
   *                        inteiro de 0 á 9.
   */

  public DisplayUnity(Draw screen, double[] displayPosition, int displaySize, String segmentOnColor,
      String segmentOffColor, int DisplayValue) {
    this.screen = screen;
    this.displayPosition = displayPosition;
    this.displaySize = displaySize;

    // chama o método de desenho no momento da construção.
    this.DrawDisplay(DisplayValue, segmentOnColor, segmentOffColor);
  }

  /**
   * Metodo para impressão do segmento pelo método construtor;
   * 
   * @param DisplayValue    Valor a ser impresso pelo display, sendo um numero
   *                        inteiro de 0 á 9.
   * 
   * @param segmentOnColor  String correspondente a cor do segmento aceso que será
   *                        impresso.
   * 
   * @param segmentOffColor String correspondente a cor do segmento apagado que
   *                        será impresso.
   */
  private void DrawDisplay(int DisplayValue, String segmentOnColor, String segmentOffColor) {

    double[] Avet = this.displayPosition.clone();
    double[] Bvet = this.displayPosition.clone();
    double[] Cvet = this.displayPosition.clone();
    double[] Dvet = this.displayPosition.clone();
    double[] Evet = this.displayPosition.clone();
    double[] Fvet = this.displayPosition.clone();
    double[] Gvet = this.displayPosition.clone();

    Avet[0] = Avet[0] + (this.displaySize * 0.01);
    Avet[1] = (Avet[1] + ((this.displaySize * 1.8) + (this.displaySize * 0.04)));

    Bvet[1] = (Bvet[1] + ((this.displaySize * 0.9) + (this.displaySize * 0.03)));
    Bvet[0] = (Bvet[0] + (this.displaySize + this.displaySize * 0.02));

    Cvet[1] = Cvet[1] + (this.displaySize * 0.01);
    Cvet[0] = (Cvet[0] + (this.displaySize + this.displaySize * 0.02));

    Dvet[0] = Dvet[0] + (this.displaySize * 0.01);

    Evet[1] = (Evet[1] + (this.displaySize * 0.01));

    Fvet[1] = (Fvet[1] + ((this.displaySize * 0.9) + (this.displaySize * 0.03)));

    Gvet[1] = (Dvet[1] + (this.displaySize * 0.9 + this.displaySize * 0.02));
    Gvet[0] = Gvet[0] + (this.displaySize * 0.01);


    switch (DisplayValue) {

      case 0:

        DisplaySegment A0 = new DisplaySegment(screen, Avet, this.displaySize, segmentOnColor, true);
        DisplaySegment B0 = new DisplaySegment(screen, Bvet, this.displaySize, segmentOnColor, false);
        DisplaySegment C0 = new DisplaySegment(screen, Cvet, this.displaySize, segmentOnColor, false);
        DisplaySegment D0 = new DisplaySegment(screen, Dvet, this.displaySize, segmentOnColor, true);
        DisplaySegment E0 = new DisplaySegment(screen, Evet, this.displaySize, segmentOnColor, false);
        DisplaySegment F0 = new DisplaySegment(screen, Fvet, this.displaySize, segmentOnColor, false);
        DisplaySegment G0 = new DisplaySegment(screen, Gvet, this.displaySize, segmentOffColor, true);

        break;

      case 1:

        DisplaySegment A1 = new DisplaySegment(screen, Avet, this.displaySize, segmentOffColor, true);
        DisplaySegment B1 = new DisplaySegment(screen, Bvet, this.displaySize, segmentOnColor, false);
        DisplaySegment C1 = new DisplaySegment(screen, Cvet, this.displaySize, segmentOnColor, false);
        DisplaySegment D1 = new DisplaySegment(screen, Dvet, this.displaySize, segmentOffColor, true);
        DisplaySegment E1 = new DisplaySegment(screen, Evet, this.displaySize, segmentOffColor, false);
        DisplaySegment F1 = new DisplaySegment(screen, Fvet, this.displaySize, segmentOffColor, false);
        DisplaySegment G1 = new DisplaySegment(screen, Gvet, this.displaySize, segmentOffColor, true);

        break;

      case 2:

        DisplaySegment A2 = new DisplaySegment(screen, Avet, this.displaySize, segmentOnColor, true);
        DisplaySegment B2 = new DisplaySegment(screen, Bvet, this.displaySize, segmentOnColor, false);
        DisplaySegment C2 = new DisplaySegment(screen, Cvet, this.displaySize, segmentOffColor, false);
        DisplaySegment D2 = new DisplaySegment(screen, Dvet, this.displaySize, segmentOnColor, true);
        DisplaySegment E2 = new DisplaySegment(screen, Evet, this.displaySize, segmentOnColor, false);
        DisplaySegment F2 = new DisplaySegment(screen, Fvet, this.displaySize, segmentOffColor, false);
        DisplaySegment G2 = new DisplaySegment(screen, Gvet, this.displaySize, segmentOnColor, true);

        break;

      case 3:

        DisplaySegment A3 = new DisplaySegment(screen, Avet, this.displaySize, segmentOnColor, true);
        DisplaySegment B3 = new DisplaySegment(screen, Bvet, this.displaySize, segmentOnColor, false);
        DisplaySegment C3 = new DisplaySegment(screen, Cvet, this.displaySize, segmentOnColor, false);
        DisplaySegment D3 = new DisplaySegment(screen, Dvet, this.displaySize, segmentOnColor, true);
        DisplaySegment E3 = new DisplaySegment(screen, Evet, this.displaySize, segmentOffColor, false);
        DisplaySegment F3 = new DisplaySegment(screen, Fvet, this.displaySize, segmentOffColor, false);
        DisplaySegment G3 = new DisplaySegment(screen, Gvet, this.displaySize, segmentOnColor, true);

        break;

      case 4:

        DisplaySegment A4 = new DisplaySegment(screen, Avet, this.displaySize, segmentOffColor, true);
        DisplaySegment B4 = new DisplaySegment(screen, Bvet, this.displaySize, segmentOnColor, false);
        DisplaySegment C4 = new DisplaySegment(screen, Cvet, this.displaySize, segmentOnColor, false);
        DisplaySegment D4 = new DisplaySegment(screen, Dvet, this.displaySize, segmentOffColor, true);
        DisplaySegment E4 = new DisplaySegment(screen, Evet, this.displaySize, segmentOffColor, false);
        DisplaySegment F4 = new DisplaySegment(screen, Fvet, this.displaySize, segmentOnColor, false);
        DisplaySegment G4 = new DisplaySegment(screen, Gvet, this.displaySize, segmentOnColor, true);

        break;

      case 5:

        DisplaySegment A5 = new DisplaySegment(screen, Avet, this.displaySize, segmentOnColor, true);
        DisplaySegment B5 = new DisplaySegment(screen, Bvet, this.displaySize, segmentOffColor, false);
        DisplaySegment C5 = new DisplaySegment(screen, Cvet, this.displaySize, segmentOnColor, false);
        DisplaySegment D5 = new DisplaySegment(screen, Dvet, this.displaySize, segmentOnColor, true);
        DisplaySegment E5 = new DisplaySegment(screen, Evet, this.displaySize, segmentOffColor, false);
        DisplaySegment F5 = new DisplaySegment(screen, Fvet, this.displaySize, segmentOnColor, false);
        DisplaySegment G5 = new DisplaySegment(screen, Gvet, this.displaySize, segmentOnColor, true);

        break;

      case 6:

        DisplaySegment A6 = new DisplaySegment(screen, Avet, this.displaySize, segmentOffColor, true);
        DisplaySegment B6 = new DisplaySegment(screen, Bvet, this.displaySize, segmentOffColor, false);
        DisplaySegment C6 = new DisplaySegment(screen, Cvet, this.displaySize, segmentOnColor, false);
        DisplaySegment D6 = new DisplaySegment(screen, Dvet, this.displaySize, segmentOnColor, true);
        DisplaySegment E6 = new DisplaySegment(screen, Evet, this.displaySize, segmentOnColor, false);
        DisplaySegment F6 = new DisplaySegment(screen, Fvet, this.displaySize, segmentOnColor, false);
        DisplaySegment G6 = new DisplaySegment(screen, Gvet, this.displaySize, segmentOnColor, true);

        break;

      case 7:

        DisplaySegment A7 = new DisplaySegment(screen, Avet, this.displaySize, segmentOnColor, true);
        DisplaySegment B7 = new DisplaySegment(screen, Bvet, this.displaySize, segmentOnColor, false);
        DisplaySegment C7 = new DisplaySegment(screen, Cvet, this.displaySize, segmentOnColor, false);
        DisplaySegment D7 = new DisplaySegment(screen, Dvet, this.displaySize, segmentOffColor, true);
        DisplaySegment E7 = new DisplaySegment(screen, Evet, this.displaySize, segmentOffColor, false);
        DisplaySegment F7 = new DisplaySegment(screen, Fvet, this.displaySize, segmentOffColor, false);
        DisplaySegment G7 = new DisplaySegment(screen, Gvet, this.displaySize, segmentOffColor, true);

        break;

      case 8:

        DisplaySegment A8 = new DisplaySegment(screen, Avet, this.displaySize, segmentOnColor, true);
        DisplaySegment B8 = new DisplaySegment(screen, Bvet, this.displaySize, segmentOnColor, false);
        DisplaySegment C8 = new DisplaySegment(screen, Cvet, this.displaySize, segmentOnColor, false);
        DisplaySegment D8 = new DisplaySegment(screen, Dvet, this.displaySize, segmentOnColor, true);
        DisplaySegment E8 = new DisplaySegment(screen, Evet, this.displaySize, segmentOnColor, false);
        DisplaySegment F8 = new DisplaySegment(screen, Fvet, this.displaySize, segmentOnColor, false);
        DisplaySegment G8 = new DisplaySegment(screen, Gvet, this.displaySize, segmentOnColor, true);

        break;

      case 9:

        DisplaySegment A9 = new DisplaySegment(screen, Avet, this.displaySize, segmentOnColor, true);
        DisplaySegment B9 = new DisplaySegment(screen, Bvet, this.displaySize, segmentOnColor, false);
        DisplaySegment C9 = new DisplaySegment(screen, Cvet, this.displaySize, segmentOnColor, false);
        DisplaySegment D9 = new DisplaySegment(screen, Dvet, this.displaySize, segmentOffColor, true);
        DisplaySegment E9 = new DisplaySegment(screen, Evet, this.displaySize, segmentOffColor, false);
        DisplaySegment F9 = new DisplaySegment(screen, Fvet, this.displaySize, segmentOnColor, false);
        DisplaySegment G9 = new DisplaySegment(screen, Gvet, this.displaySize, segmentOnColor, true);

        break;

    }
  }

  public double[] getDisplayPosition() {
    return displayPosition;
  }

  public int getDisplaySize() {
    return displaySize;
  }

}
