package com.customchar;

public class MyChar
 {
    private char character;

    public MyChar(char iCharacter){
      this.character = iCharacter;
    }

    public boolean isDigit(){
       if (this.character <= '9' && this.character >='0'){
        return true;
       }
        return false;
    }

    public boolean isVowel(){
        if(this.character == 'a' || this.character == 'e' || this.character == 'i' || this.character == 'o' || this.character == 'u'
        || this.character == 'A' || this.character == 'E' || this.character == 'I' || this.character == 'O' || this.character == 'U'){
            return true;
        }
        return false;
    }

    public boolean isAlphabet(){
        if ((this.character >= 'a' && this.character <= 'z') || (this.character >= 'A' && this.character <= 'Z'))
        {
            return true;
        }
        return false;
    }

    public boolean isConsonant(){
        return ( isAlphabet() && !isVowel());
    }
    
    static public void printLowerCaseAlphabets(){
         
         for (char aItr = 'a'; aItr <= 'z';aItr++){
            System.out.println(aItr);
         }
    }

    static public void printUpperCaseAlphabets(){
        
        for (char aItr = 'A'; aItr <= 'Z';aItr++){
            System.out.println(aItr);
         }
    }

}
