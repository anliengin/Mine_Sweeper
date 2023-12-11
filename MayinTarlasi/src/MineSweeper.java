import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.*;

public class MineSweeper {
    int satir_numara,sutun_numara,boyut;
    int[][] harita;
    int[][] alan;
    boolean oyun=true;

    Random rnd=new Random();
    Scanner input = new Scanner(in);

    MineSweeper(int satir_numara,int sutun_numara ){
        this.satir_numara=satir_numara;
        this.sutun_numara=sutun_numara;
        this.harita=new int[satir_numara][sutun_numara];
        this.alan=new int[satir_numara][sutun_numara];
        this.boyut=satir_numara*sutun_numara;
    }

    public void Calistir(){
        int sayac=0;
        oyunHazirla();
        yazdir(harita);
System.out.println("-----------------------------------");
        out.println("Oyun Başladı!");
        while(oyun){
           // alanCalistir(alan);
            yazdirAlan(alan);
            out.println("Satır sayısı: ");
            int satir=input.nextInt();
            out.println("Sutun sayısı: ");
            int sutun=input.nextInt();
            if(harita[satir][sutun]==1){
                System.out.println("Game Over!...");
                break;
            }
            if(harita[satir][sutun]!=1){
                mayinKontrol(satir,sutun);
                sayac++;
                if(sayac==(boyut-(boyut/4))){
                    out.println("Bravo! Tebrikler...");
                }
            }
        }
    }

    public void mayinKontrol(int satir, int sutun){

        int sayac=0;

            if(harita[satir][sutun]==0){

                if((sutun<sutun_numara-1) && (harita[satir][sutun+1])==1 ){
                    sayac++;
                }

                if((sutun>0) && (satir>0) && (harita[satir-1][sutun-1])==1 ){
                    sayac++;
                }

                if((satir<satir_numara-1) && (sutun>0) && (harita[satir+1][sutun-1]==1)){
                    sayac++;
                }

                if((satir>0) && (harita[satir-1][sutun]==1)){
                    sayac++;
                }

                if((satir>0) && (sutun<sutun_numara-1) && (harita[satir-1][sutun+1]==1)){
                    sayac++;
                }

                if((sutun>0) && (harita[satir][sutun-1]==1)){
                    sayac++;
                }

                if((satir<satir_numara-1) && (sutun<sutun_numara-1) && (harita[satir+1][sutun+1]==1)){
                    sayac++;
                }

                if((satir<satir_numara-1) && (harita[satir+1][sutun]==1)){
                    sayac++;
                }

                int sonuc=sayac;

                System.out.print(alan[satir][sutun]=sonuc);

    }}

    public void oyunHazirla() {
        int rnd_satir,rnd_sutun,sayac=0;
        while(sayac != (boyut/4)) {
            rnd_satir = rnd.nextInt(satir_numara);
            rnd_sutun = rnd.nextInt(sutun_numara);

            if (harita[rnd_satir][rnd_sutun]!=-1) {
                harita[rnd_satir][rnd_sutun]=1;
                sayac++;
            }
        }}

    public void yazdir(int[][] arr){
        for (int i=0;i< arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]>=0) {
                    out.print("");
                    out.print(arr[i][j] + " ");
                }
            }
            out.println(" ");
        }
    }

    public void yazdirAlan(int[][] arr){
        for (int i=0;i< arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]>=0) {
                    System.out.print("");
                    System.out.print(arr[i][j] +" " );

                }
            }
            System.out.println(" ");
        }
    }
/*
    public void alanCalistir(Object[][]  alan ) {

        for (satir_numara = 0; satir_numara < alan.length; satir_numara++) {
            for (sutun_numara = 0; sutun_numara < alan[satir_numara].length; sutun_numara++) {
                alan[satir_numara][sutun_numara] =0;
                out.print(alan[satir_numara][sutun_numara] + " ");
            }
            out.println(" ");
        }}
*/

    }



