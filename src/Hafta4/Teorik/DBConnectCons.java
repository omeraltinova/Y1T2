package Hafta4.Teorik;

public class DBConnectCons {
    private String dBName;
    private int dBPassword;

    DBConnectCons(String dBName,int dBPassword){
        this.dBName=dBName;
        this.dBPassword=dBPassword;
    }

    String getdBName(){
        return(this.dBName);
    }
    int getdBPassword(){
        return(this.dBPassword);
    }
    void setdBName(String dbName){
        this.dBName=dbName;
    }
    void setdBPassword(int dBPassword){
        this.dBPassword=dBPassword;
    }
}
