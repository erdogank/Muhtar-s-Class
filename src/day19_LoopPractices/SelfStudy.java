package day19_LoopPractices;



public class SelfStudy {

    public static void main(String[] args) {

        String str="abcdegheieje";
        String container="";
        int counter;
        int biggestcount=0;


        for (int i = 0; i <str.length(); i++) {

            char ch=str.charAt(i);
            counter=0;



            for (int j = 0; j <str.length(); j++) {
                char check=str.charAt(j);

              if(ch==check){
                  counter++;

              }



            }if(counter>biggestcount && (!container.contains(ch+""))){
                biggestcount=counter;
                container=ch+"";
            }else if(counter==biggestcount &&(!container.contains(ch+"")) ){
                container+=ch;
            }



        }
        System.out.println(container);
        System.out.println(biggestcount);
        }












    }



