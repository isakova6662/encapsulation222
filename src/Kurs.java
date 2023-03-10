public class Kurs {

    private String name;
    private String imyaughetelya;
    private int Naghalokursa;
    private int okonchaniekursa;

    public void setName(String neme){
        this.name=neme;
    };
    public String getName(){
        return name;
    }

    public void setImyaughetelya (String imyaughetelya){
        this.imyaughetelya=imyaughetelya;
    }

    public String getimyaughetelya(){
        return  imyaughetelya;
    }

    public void setNaghalokursa(int naghalokursa){
        this.Naghalokursa=naghalokursa;

    }
    public int getNaghalokursa(){
        return Naghalokursa;
    }

     public void setOkonchaniekursa(int okonchaniekursa){
        this.okonchaniekursa=okonchaniekursa;
     }
     public int getOkonchaniekursa(){
        return okonchaniekursa;
     }

}
