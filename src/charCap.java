class charCap{
    public static void main(String args[]){
        char smallLeter, bigLetter;                 //define var

        smallLeter = 'b';                              //assign value
        bigLetter = Character.toUpperCase(smallLeter); //convert small to big
        System.out.println(bigLetter); //print big
    }
}