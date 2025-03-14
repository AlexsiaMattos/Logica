import java.util.Scanner;

public class Paredes {
    public static void main(String[] args){
        float p_grande;
        float p_pequena;
        float alt_p;
        float azulejo;
        float piso;
        float v_caixa;
        float quant_cx;
        float m2_cx;
        float v_total;

        Scanner input = new Scanner(System.in);
        System.out.println("DE O COMPRIMENTO DAS PAREDES MAIORES, APOS AS PAREDES MENORES: ");
        p_grande = input.nextFloat();
        p_pequena = input.nextFloat();
        //System.out.println(p_grande);
        //System.out.println(p_pequena);
        System.out.println("ALTURA DA PAREDE: ");
        alt_p = input.nextFloat();
        azulejo = (2*(p_grande*alt_p)) + (2*(p_pequena*alt_p));
        // 2 paredes grandes, 2 paredes pequenas. area = base . altura
        System.out.println(" PARA AZULEJAR AS PAREDES SERAO NECESSARIOS: " + azulejo + "m2" );
        piso = (2*(p_grande*p_pequena));
        System.out.println("PARA COLOCAR O PISO SERAO NECESSARIOS: " + piso + "m2");
        System.out.println("INSIRA QUANTOS METROS2 VEM EM CADA CAIXA: ");
        m2_cx = input.nextFloat();
        System.out.println("INSIRA O VALOR DE CADA CAIXA QUE O USUARIO COMPROU: ");
        v_caixa = input.nextFloat();
        quant_cx = (azulejo + piso)/m2_cx;
        System.out.println(" SERAO NECESSARIAS: " + quant_cx + "CAIXAS");
        v_total = quant_cx * v_caixa;
        System.out.println("O VALOR TOTAL PARA ESTA REFORMA SERA DE: " + v_total);

// ENUNCIADO DO EXERCICIO;
//faça um programa que dado as dimensoes de uma cozinha retangular (altura das paredes, comprimento das paredes)
//indique quantos m2 de piso sao necesarios para azulejar as 4 paredes e o piso. Depois pergunte ao usuario
//quantos m2 vem em cada caixa e o valor da caixa e indique quantas caixas de piso devem ser compradas e o valor
//total de piso usado.

    }
}    
