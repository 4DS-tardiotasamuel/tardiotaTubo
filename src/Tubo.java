public class Tubo {

    private float raggio;
    private float altezza;

    public Tubo(float r, float a){
        raggio = r;
        this.altezza = a;
    }

    //V=πr2h formula volume

    //2πrh + 2πr2 formula superficie
    public float Superficie(){
        float sup = 0;
        sup = (float)(2*3.14*raggio*altezza) + (float)(2*3.14*Math.pow(raggio, 2));
        return sup;
    }


}
