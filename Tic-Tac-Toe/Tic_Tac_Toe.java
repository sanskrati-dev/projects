import java.util.Scanner;
public class Tic_Tac_Toe{
static char[][] grid=new char[3][3];
public static void main(String[] args){

//basic rules and intro
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

//setting currentchar value and setting grid each value to blank
char currentchar='X';
for(int i=0;i<3;i++){
  for(int j=0;j<3;j++){
    grid[i][j]=' ';
}}

//creating new input object
Scanner sc=new Scanner(System.in);

//main game loop
while(true){
 
//rows and column input
System.out.print("Enter rows and column:");
int rows=sc.nextInt( );int col=sc.nextInt( );

//checking if position is already filled or not
while(grid[rows-1][col-1]=='X' || grid[rows-1][col-1]=='O'){
   System.out.println("Position taken! try again");
    System.out.print("Enter rows and column:");
     rows=sc.nextInt( ); col=sc.nextInt( );}

System.out.println();

//displaying the updated grid or board
board(rows,col,currentchar);

//checking if someone won
if(checkwin()){
  System.out.println("Congratulations! Player"+" "+currentchar+" "+"wins");
  break;}

//checking if match is draw
if(checkdraw()){
  System.out.println("Match draw");
  break;
}

//switching player chances
if(currentchar=='X')
  currentchar='O';
else 
  currentchar='X';
}}


//method for displaying grid or board 
static char[][] board(int row,int col,char ch){

//setting entered value in the grid
grid[row-1][col-1] = ch;
 
//displaying the grid in tic tac toe form with each column and row seperated by | and _____ respectively
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

//method for checking if a player won 
static boolean checkwin(){

// checking rows
if(grid[0][0]==grid[0][1] && grid[0][1]==grid[0][2] && grid[0][0]!=' ' )
  return true;

else if(grid[1][0]==grid[1][1] && grid[1][1]==grid[1][2] && grid[1][0]!=' ' )
  return true;

else if(grid[2][0]==grid[2][1] && grid[2][1]==grid[2][2] && grid[2][0]!=' ' )
  return true;

//checking columns
else if(grid[0][0]==grid[1][0] && grid[1][0]==grid[2][0] && grid[0][0]!=' ' )
  return true;

else if(grid[0][1]==grid[1][1] && grid[1][1]==grid[2][1] && grid[0][1]!=' ' )
  return true;

else if(grid[0][2]==grid[1][2] && grid[1][2]==grid[2][2] && grid[0][2]!=' ' )
  return true;

// checking both diagonals
else if(grid[0][0]==grid[1][1] && grid[1][1]==grid[2][2]  && grid[0][0]!=' ' )
  return true;

else if(grid[0][2]==grid[1][1] && grid[1][1]==grid[2][0]  && grid[0][2]!=' ' )
  return true;

//yet to win
else
  return false;

}

//method for checking if the match is a draw 
static boolean checkdraw(){
for(int i=0;i<3;i++){
  for(int j=0;j<3;j++){
   if(grid[i][j]==' ')
     return false;
}}
return true;}}
