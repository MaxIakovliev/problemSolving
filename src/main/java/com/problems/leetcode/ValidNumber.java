package com.problems.leetcode;

/**
 * Created by Maks on 7/19/2017.
 */
public class ValidNumber {
    public boolean isNumber(String s) {
        boolean preSpace=true;
        int numberStarted=0;
        boolean xStarted=false;
        boolean binStarted=false;
        if(s.length()==0)
            return  false;

        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);

            if(preSpace && numberStarted==0 && c==' ')
                continue;
            else if((preSpace && c=='-') || (preSpace && c=='+')
                    ||(preSpace && Character.isDigit(c)) ||(preSpace && c=='.')){
                preSpace=false;
                numberStarted=1;
            }
            else if(!preSpace && numberStarted==1 &&Character.isDigit(c))
                continue;
            else if(!preSpace && numberStarted==1 && !xStarted  && !binStarted &&(c=='x' ||c=='X')){
                xStarted=true;
            }
            else if(!preSpace && numberStarted==1 && xStarted && !binStarted &&
                    (Character.isDigit(c) ||c=='a' || c=='A' || c=='b'|| c=='B'|| c=='c'|| c=='C'
                            || c=='d'|| c=='D'|| c=='e'|| c=='E'||c=='f'||c=='F')) {
                continue;
            }
            else if(!preSpace && numberStarted==1 && !xStarted && !binStarted &&(c=='l' ||c=='L' || c=='f' ||c=='F')){
                numberStarted=2;
            }
            else if(!preSpace && numberStarted==1 && !xStarted && !binStarted && (c=='b' || c=='B')){
                binStarted=true;
            }
            else if(!preSpace && numberStarted==1 && !xStarted && binStarted &&(c=='1'||c=='0')){
                continue;
            }
            else if(!preSpace && numberStarted>0 && c==' '){
                continue;
            }
            else
                return  false;
            long creditCardNumber = 1234_5678_9012_3456L;
            float f1= .1f;

        }
        if(numberStarted>0)
            return  true;
        else
            return false;

    }
}
