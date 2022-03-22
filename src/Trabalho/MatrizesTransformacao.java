package Trabalho;

public class MatrizesTransformacao {

    public double[][] retornarMatrizTranslacao(double X, double Y){
        double matrizTranslacao[][] = new double[3][3];
        matrizTranslacao[0][0] = 1;
        matrizTranslacao[0][1] = 0;
        matrizTranslacao[0][2] = 0;
        matrizTranslacao[1][0] = 0;
        matrizTranslacao[1][1] = 1;
        matrizTranslacao[1][2] = 0;
        matrizTranslacao[2][0] = X;
        matrizTranslacao[2][1] = Y;
        matrizTranslacao[2][2] = 1;
        return matrizTranslacao;
    }
    
    public double[][] retornarMatrizEscalonamento(Transformar transformar){
        double matrizEscalonamento[][] = new double[3][3];
        matrizEscalonamento[0][0] = transformar.getX();
        matrizEscalonamento[0][1] = 0;
        matrizEscalonamento[0][2] = 0;
        matrizEscalonamento[1][0] = 0;
        matrizEscalonamento[1][1] = transformar.getY();
        matrizEscalonamento[1][2] = 0;
        matrizEscalonamento[2][0] = 0;
        matrizEscalonamento[2][1] = 0;
        matrizEscalonamento[2][2] = 1;
        return matrizEscalonamento;
    }
    
    public double[][] retornarMatrizCisalhamento(Transformar transformar){
        double matrizCisalhamento[][] = new double[3][3];
        matrizCisalhamento[0][0] = 1; 
        matrizCisalhamento[0][1] = transformar.getY();
        matrizCisalhamento[0][2] = 0;
        matrizCisalhamento[1][0] = transformar.getX();
        matrizCisalhamento[1][1] = 1;
        matrizCisalhamento[1][2] = 0;
        matrizCisalhamento[2][0] = 0;
        matrizCisalhamento[2][1] = 0;
        matrizCisalhamento[2][2] = 1;
        return matrizCisalhamento;
    }
    
    public double[][] retornarMatrizReflexao(Transformar transformar){
        double matrizReflexao[][] = new double[3][3];
        
        if((transformar.getX() == 1)&&(transformar.getY() == 1)){
            matrizReflexao[0][0] = -1; 
            matrizReflexao[0][1] = 0;
            matrizReflexao[0][2] = 0;
            matrizReflexao[1][0] = 0;
            matrizReflexao[1][1] = -1;
            matrizReflexao[1][2] = 0;
            matrizReflexao[2][0] = 0;
            matrizReflexao[2][1] = 0;
            matrizReflexao[2][2] = 1;
        } else {
            if(transformar.getX() == 1){
                matrizReflexao[0][0] = 1; 
                matrizReflexao[0][1] = 0;
                matrizReflexao[0][2] = 0;
                matrizReflexao[1][0] = 0;
                matrizReflexao[1][1] = -1;
                matrizReflexao[1][2] = 0;
                matrizReflexao[2][0] = 0;
                matrizReflexao[2][1] = 0;
                matrizReflexao[2][2] = 1;
            } else {
                matrizReflexao[0][0] = -1;
                matrizReflexao[0][1] = 0;
                matrizReflexao[0][2] = 0;
                matrizReflexao[1][0] = 0;
                matrizReflexao[1][1] = 1;
                matrizReflexao[1][2] = 0;
                matrizReflexao[2][0] = 0;
                matrizReflexao[2][1] = 0;
                matrizReflexao[2][2] = 1;
            }
        }
        
        return matrizReflexao;
    }
    
    public double[][] retornarMatrizInversaTranslacao(double X, double Y){
        double matrizInversaTranslacao[][] = new double[3][3];
        matrizInversaTranslacao[0][0] = 1;
        matrizInversaTranslacao[0][1] = 0;
        matrizInversaTranslacao[0][2] = 0;
        matrizInversaTranslacao[1][0] = 0;
        matrizInversaTranslacao[1][1] = 1;
        matrizInversaTranslacao[1][2] = 0;
        matrizInversaTranslacao[2][0] = - X;
        matrizInversaTranslacao[2][1] = - Y;
        matrizInversaTranslacao[2][2] = 1;
        return matrizInversaTranslacao;
    }
    
    public double[][] retornarMatrizRotacao(Transformar transformar){
        double matrizRotacao[][] = new double[3][3];
        matrizRotacao[0][0] = Math.cos(Math.toRadians(transformar.getAngulo()));
        matrizRotacao[0][1] = Math.sin(Math.toRadians(transformar.getAngulo()));
        matrizRotacao[0][2] = 0;
        matrizRotacao[1][0] = - Math.sin(Math.toRadians(transformar.getAngulo()));;
        matrizRotacao[1][1] = Math.cos(Math.toRadians(transformar.getAngulo()));;
        matrizRotacao[1][2] = 0;
        matrizRotacao[2][0] = 0;
        matrizRotacao[2][1] = 0;
        matrizRotacao[2][2] = 1;
        return matrizRotacao;
    }
    
    public double[][] retornarMatrizPontos(double X, double Y){
        double matrizPontos[][] = new double[1][3];
        matrizPontos[0][0] = X;
        matrizPontos[0][1] = Y;
        matrizPontos[0][2] = 1;
        return matrizPontos;
    }
    
    public double[][] calcularMatrizes(double[][] matrizPontos, double[][] matrizTransformacao){
        double matrizResultado[][] = new double[1][3];
        for (int k = 0; k < matrizPontos.length; k++) {
            for (int l = 0; l < matrizTransformacao[0].length; l++) {
                for (int m = 0; m < matrizPontos[0].length; m++) {
                    matrizResultado[k][l] += (matrizPontos[k][m] * matrizTransformacao[m][l]);
                }
            }
        }
        return matrizResultado;
    }

    public double[][] translacao(Transformar transformar, double X, double Y) {
        double matrizPontos[][] = retornarMatrizPontos(X, Y);
        double matrizTranslacao[][] = retornarMatrizTranslacao(transformar.getX(), transformar.getY());
        return calcularMatrizes(matrizPontos, matrizTranslacao);
    }
    
    public double[][] cisalhamento(Transformar transformar, double X, double Y) {
        double matrizPontos[][] = retornarMatrizPontos(X, Y);
        double matrizCisalhamento[][] = retornarMatrizCisalhamento(transformar);
        return calcularMatrizes(matrizPontos, matrizCisalhamento);
    }
    
    public double[][] reflexao(Transformar transformar, double X, double Y) {
        double matrizPontos[][] = retornarMatrizPontos(X, Y);
        double matrizReflexao[][] = retornarMatrizReflexao(transformar);
        return calcularMatrizes(matrizPontos, matrizReflexao);
    }
    
    public double[][] escalonamento(Transformar transformar, double X, double Y) {
        double matrizPontos[][] = retornarMatrizPontos(X, Y);
        double matrizEscalonamento[][] = retornarMatrizEscalonamento(transformar);
        return calcularMatrizes(matrizPontos, matrizEscalonamento);
    }
    
    public double[][] rotacao(Transformar transformar, double X, double Y) {
        double matrizPontos[][] = retornarMatrizPontos(X, Y);
        double matrizRotacao[][] = retornarMatrizRotacao(transformar);
        return calcularMatrizes(matrizPontos, matrizRotacao);
    }
    
    public double[][] escalonamentoPontoDeEixo(Transformar transformar, double X, double Y, double diferencaOrigemX, double diferencaOrigemY) {
        double matrizPontos[][] = retornarMatrizPontos(X, Y);
        double matrizInversaTranslacao[][] = retornarMatrizInversaTranslacao(diferencaOrigemX, diferencaOrigemY);
        double matrizTranslacao[][] = retornarMatrizTranslacao(diferencaOrigemX, diferencaOrigemY);
        double matrizEscalonamento[][] = retornarMatrizEscalonamento(transformar);
        double matrizResultado[][];
        
        matrizResultado = calcularMatrizes(matrizPontos, matrizInversaTranslacao); 
        matrizResultado = calcularMatrizes(matrizResultado, matrizEscalonamento); 
        matrizResultado = calcularMatrizes(matrizResultado, matrizTranslacao);
        return matrizResultado; 
    }
    
    public double[][] rotacaoPontoDeEixo(Transformar transformar, double X, double Y) {
        double matrizPontos[][] = retornarMatrizPontos(X, Y);
        double matrizInversaTranslacao[][] = retornarMatrizInversaTranslacao(transformar.getX(), transformar.getY());
        double matrizTranslacao[][] = retornarMatrizTranslacao(transformar.getX(), transformar.getY());
        double matrizRotacao[][] = retornarMatrizRotacao(transformar);
        double matrizResultado[][];
        
        matrizResultado = calcularMatrizes(matrizPontos, matrizInversaTranslacao); 
        matrizResultado = calcularMatrizes(matrizResultado, matrizRotacao); 
        matrizResultado = calcularMatrizes(matrizResultado, matrizTranslacao);
        return matrizResultado; 
    }
}
