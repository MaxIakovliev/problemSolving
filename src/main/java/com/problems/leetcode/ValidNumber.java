package com.problems.leetcode;

/**
 * Created by Maks on 7/19/2017.
 */
public class ValidNumber {
    public boolean isNumber(String s) {

        boolean preSpace=true;
        int numberStarted=0;
        boolean xStarted=false;
        boolean xClosedByDigit=false;
        boolean binStarted=false;
        boolean binClosedByDigit=false;
        boolean greatherZero=false;
        boolean signPassed=false;
        boolean eSignPassed=false;
        boolean dotPassed=false;
        boolean dotClosedByDigit=false;
        boolean ePassed=false;
        boolean eClosedByDigit=false;
        boolean ePlusPassed=false;
        boolean firstZero=false;

        if(s.length()==0)
            return  false;

        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);

            if(numberStarted==0 && Character.isDigit(c) && c=='0'){
                firstZero=true;
            }

            if(!binStarted && Character.isDigit(c) && c!='0'){//  special helper for bin value
                greatherZero=true;
            }

            if(preSpace && numberStarted==0 &&!dotPassed && c==' ') {
                continue;
            }

            else if((preSpace && !signPassed && !dotPassed && c=='-') || (preSpace &&!signPassed &&!dotPassed && c=='+')){
                signPassed=true;
                preSpace=false;
            }
            else if(ePassed && dotPassed && !eSignPassed && (c=='-'|| c=='+') && i!=s.length()-1){
                eSignPassed=true;
            }
            else if(ePassed &&  !eSignPassed && (c=='-'|| c=='+') && i!=s.length()-1){
                eSignPassed=true;
            }
            else if (!dotPassed &&numberStarted<=1 && !ePassed && !binStarted && !xStarted && c == '.') {
                dotPassed=true;
            }
            else if(numberStarted==0 && Character.isDigit(c)){
                preSpace=false;
                numberStarted=1;
                if(dotPassed){
                    dotClosedByDigit=true;
                }
            }


            else if(!preSpace && numberStarted==1 && !xStarted  && !binStarted  &&!ePassed && (c=='e'||c=='E')){
                ePassed=true;
            }
            else if(!preSpace && numberStarted==1 && !xStarted  && !binStarted  &&ePassed  && !ePlusPassed && c=='+'){
                ePlusPassed=true;
                eClosedByDigit=false;
            }
            else if(!preSpace && numberStarted==1 && !xStarted  && !binStarted  &&dotPassed  && Character.isDigit(c)){
                dotClosedByDigit=true;
                if(ePassed)
                    eClosedByDigit=true;
            }
            else if(!preSpace && numberStarted==1 && !xStarted  && !binStarted  &&ePassed  && Character.isDigit(c)){
                eClosedByDigit=true;
            }
            else if(!preSpace && numberStarted==1 && xStarted  && !binStarted  &&!ePassed  && Character.isDigit(c)){
                xClosedByDigit=true;
            }

            else if(!preSpace && numberStarted==1 && !xStarted  && !binStarted && !greatherZero &&(c=='x' ||c=='X')){

                xStarted=true;
            }
            else if(!preSpace && numberStarted==1 && !binStarted &&Character.isDigit(c)) {
                continue;
            }
            else if(!preSpace && numberStarted==1 && xStarted && !binStarted &&!dotPassed &&
                    (Character.isDigit(c) ||c=='a' || c=='A' || c=='b'|| c=='B'|| c=='c'|| c=='C'
                            || c=='d'|| c=='D'|| c=='e'|| c=='E'||c=='f'||c=='F')) {
                xClosedByDigit=true;
            }
            else if(!preSpace && numberStarted==1 && !xStarted && !binStarted &&(c=='l' ||c=='L' || c=='f' ||c=='F')){
                numberStarted=2;

                if(firstZero && (c=='l' ||c=='L') )
                    return  false; ///handling stupid 07l case of leetcode
                if(dotPassed && (c=='l' ||c=='L'))
                    return  false;
                if((c=='f' ||c=='F'))
                    return  false;
            }
            else if(!preSpace && numberStarted==1 && !xStarted && !binStarted && (c=='b' || c=='B')){

                if(greatherZero){ //special check of history
                    return false;
                }

                binStarted=true;
            }
            else if(!preSpace && numberStarted==1 && !xStarted && binStarted &&(c=='1'||c=='0')){
                binClosedByDigit=true;
            }
            else if(!preSpace && numberStarted>0 && c==' '){
                numberStarted=2;
            }
            else
                return  false;
            long creditCardNumber = 1234_5678_9012_3456L;
            float f1= .1f;

        }
        if( binStarted && !binClosedByDigit)
            return false;

        if (xStarted && !xClosedByDigit)
            return  false;

        if (dotPassed && numberStarted==0 && !dotClosedByDigit)
            return  false;

        if(ePassed && !eClosedByDigit)
            return  false;

        if(numberStarted>0)
            return  true;
        else
            return false;

    }
}
