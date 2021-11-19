# MineSweeper
Mine Sweeper game is implemented in this project. This game comprises of 4 screens, which are encompassed by four different activities and their corresponding XML layouts. There is one other Kotlin file which is making a mine cell (unit component of the mine-field).
Tech Stack Used:
IntelliJ Idea | Kotlin | XML | Shared Preferences
Details of Implementation:
1. Launch Screen (MainActivity)    
• This screen provides user with options of game level to be played.  
• User can also create a custom board, specifying height, width and number of mines by him/herself.  
• The screen also displays the best record and the record of the last game played.  
• There is also an option for displaying the instructions to play the game.  
2. Custom Board Screen (CustomBoard)  
• This activity takes input from the user for the height, width, and number of mines to be placed in the game  
3. Game Screen (GamePlay)  
• This screen is the functional game, where the user interacts and plays game.  
• In addition to the game area, there is a display of the timer, and a refresh button, along with a flag button (to switch between flag and bomb).  
4. Result Screen (result)  
• On this screen, the result is declared. (Either won or lost game)  
• Along with the result, the option for playing again is present.n Kotlin Language.   
