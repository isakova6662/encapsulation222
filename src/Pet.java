public class Pet {
    private String tip;
    private  String name;
    private  String poroda;
    private String svet;
    private  int vozrast;

    public Pet(){

    }

    public Pet(String tip,String name,String poroda,String svet,int vozrast ){
        this.tip=tip;
        this.name=name;
        this.poroda=poroda;
        this.svet=svet;
        this.vozrast=vozrast;
    }


    public void setTip(String tip){
        this.tip=tip;
    }
    public String getTip(){
        return tip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public String getSvet() {
        return svet;
    }

    public void setSvet(String svet) {
        this.svet = svet;
    }

    public int getVozrast() {
        return vozrast;
    }

    public void setVozrast(int vozrast) {
        this.vozrast = vozrast;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "tip='" + tip + '\'' +
                ", name='" + name + '\'' +
                ", poroda='" + poroda + '\'' +
                ", svet='" + svet + '\'' +
                ", vozrast=" + vozrast +
                '}';
    }
}
