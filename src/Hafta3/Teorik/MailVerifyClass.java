package Hafta3.Teorik;

public class MailVerifyClass {
    String mail;
    String ip;

/*
    int MailVerifyClass(String ip,int emailCheck){
        this.ip=ip;

    }*/

    int MailVerifyClass(String mail){
        int i,atCheck,OneLetter,Dot;
        this.mail=mail;
        int maillenght = this.mail.length();
        for(i=0;i<maillenght;i++){
            if(this.mail.charAt(i)=='@'){
                atCheck=i;
                for(i=atCheck;i<maillenght;i++){
                    if((this.mail.charAt(i)>65&&this.mail.charAt(i)<90)||(this.mail.charAt(i)>97&&this.mail.charAt(i)<122)){
                        OneLetter=i;
                        for(i=OneLetter;i<maillenght;i++){
                            if(this.mail.charAt(i)=='.'){
                                Dot=i;
                                return(1);
                            }
                            else{
                                return(0);
                            }
                        }
                    }
                    else return(0);
                }
            }
            else{
                return(0);
            }
        }
        return(0);
    }
}
