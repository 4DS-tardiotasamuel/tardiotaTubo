public class Tubo {

    private float raggio;
    private float altezza;

    public Tubo(float r, float a) throws Exception{
        if(r<0 || a<0) {
            throw new Exception("Dati non validi");
        }
        this.raggio = r;
        this.altezza = a;
    }

    //V=πr^2h formula volume
    public float volume(){
        float v = (float)(3.14*Math.pow(raggio, 2)*altezza);
        return v;
    }

    //2πrh + 2πr^2 formula superficie
    public float superficie(){
        float sup = 0;
        sup = (float)(2*3.14*raggio*altezza) + (float)(2*3.14*Math.pow(raggio, 2));
        return sup;
    }


}
