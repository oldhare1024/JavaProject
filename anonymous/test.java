package anonymous;

public class test {
    public static void main(String []args){
        ShowBoard board=new ShowBoard();
        board.showMess(new OutputEnglish());
        board.showMess(new OutputAlphabet() {
                public void output(){
                    for(char c ='��';c<='��';c++){
                        System.out.printf("%3c",c);
                    }
                }
            }
        );
    }
}
