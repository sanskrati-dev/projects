import java.util.Scanner;
public class Tic_Tac_Toe{
static char[][] grid=new char[3][3];
public static void main(String[] args){
System.out.println("Welome to tic tac toe game");
System.out.println();
System.out.println("*Rules:");
System.out.println();
System.out.println("1: Player 1 character is X");
System.out.println("2: Player 2 character is O");
System.out.println();
System.out.println("*Game will autaomatically be finished when one of the players win or match is draw");
System.out.println();
System.out.println("*To end the game mid match please press ctrl+C");
System.out.println();
System.out.println("*You have to enter the value of the index where you want to place your charater");
System.out.println();
System.out.println("*The tic tac toe grid is in the form of matrix so please enter the index value accordingly");
System.out.println();

char currentchar='X';
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
grid[i][j]=' ';}}

Scanner sc=new Scanner(System.in);
while(true){

System.out.print("Enter rows and column:");
int rows=sc.nextInt( );int col=sc.nextInt( );
while(grid[rows-1][col-1]=='X' || grid[rows-1][col-1]=='O'){
System.out.println("Position taken! try again");
System.out.print("Enter rows and column:");
 rows=sc.nextInt( ); col=sc.nextInt( );}



System.out.println();
board(rows,col,currentchar);

if(checkwin()){
System.out.println("Congratulations! Player"+" "+currentchar+" "+"wins");
break;}
if(checkdraw()){
System.out.println("Match draw");
break;
}
if(currentchar=='X')
currentchar='O';
else 
currentchar='X';
}}



static char[][] board(int row,int col,char ch){


grid[row-1][col-1] = ch;
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){


if(j<2){
System.out.print(" "+grid[i][j]+"|");
}
else if(j==2){
System.out.print(" "+grid[i][j]);
}
}
if(i<2){
System.out.println();
System.out.print("_________\n");

}}
System.out.println();
return grid;}

static boolean checkwin(){



//rows
if(grid[0][0]==grid[0][1] && grid[0][1]==grid[0][2] && grid[0][0]!=' ' )
return true;
else if(grid[1][0]==grid[1][1] && grid[1][1]==grid[1][2] && grid[1][0]!=' ' )
return true;
else if(grid[2][0]==grid[2][1] && grid[2][1]==grid[2][2] && grid[2][0]!=' ' )
return true;

 //col
else if(grid[0][0]==grid[1][0] && grid[1][0]==grid[2][0] && grid[0][0]!=' ' )
return true;
else if(grid[0][1]==grid[1][1] && grid[1][1]==grid[2][1] && grid[0][1]!=' ' )
return true;
else if(grid[0][2]==grid[1][2] && grid[1][2]==grid[2][2] && grid[0][2]!=' ' )
return true;



//diagonal
else if(grid[0][0]==grid[1][1] && grid[1][1]==grid[2][2]  && grid[0][0]!=' ' )
return true;
else if(grid[0][2]==grid[1][1] && grid[1][1]==grid[2][0]  && grid[0][2]!=' ' )
return true;

//yet to win
else
return false;

}

static boolean checkdraw(){
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
if(grid[i][j]==' ')
return false;
}}
return true;}}
