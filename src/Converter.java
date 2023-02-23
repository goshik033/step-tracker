public class Converter {
    final float K=50f;
    final float S=0.75f;
    public float kalConv(int steps){
        return (steps/1000*K);

    }
    public float kilConv(int steps){
        return (steps/1000*S);


    }
}
