package com.company;
class AstaHero{
    private static AstaHero AstaHero=new AstaHero();
    private int CriticalHit;
    private AstaHero(){
    this.CriticalHit=12;
    }
    public static AstaHero getInstance() {
    return AstaHero;
    }
    public int getCriticalHit(){
    return CriticalHit;
    }
    public void setCriticalHit(int CriticalHit){
    this.CriticalHit=CriticalHit;
    }
    }
    public class Main {
    public static void main(String[] args) {
        AstaHero asHero = AstaHero.getInstance();
        System.out.println(asHero.getCriticalHit());
        asHero.setCriticalHit(50);
        AstaHero asHero1 = AstaHero.getInstance();
        System.out.println((asHero1.getCriticalHit()));
    if (asHero1.hashCode() == asHero.hashCode()) {
            System.out.println("OK");
    }
    else {
            System.out.println("Error!");
    }
    }
    }