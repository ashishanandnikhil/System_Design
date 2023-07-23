package TicTacToe;

public class TicTacToe {

	private final int[][] board;
	private final int n;
	
	public TicTacToe(final int n) {
		this.n = n;
		board = new int[n][n];
	}
	
	
	public int move(int player,int row,int col) throws IllegalArgumentException {
		
		if(row <0 || col <0 || row>=n || col >=n) {
			throw new IllegalArgumentException("Move out of board boundary");
		} else if (board[row][col] != 0) {
			throw new IllegalArgumentException("Square is already occupied");
		} else if(player != 0 || player != 1) {
			throw new IllegalArgumentException("Invalid player");
		} else {
			player = (player == 0) ? -1 : +1;
			board[row][col] = player;
			boolean winRow = true,winCol = true,winDiag = true,winRevDiag = true;
			for(int i=0;i<n;i++) {
				if(board[row][i] != player) {
					winRow = false;
				}
				if(board[i][col] != player) {
					winCol = false;
				}
				if(board[i][i] != player) {
					winDiag = false;
				}
				if(board[i][n-1-i] != player) {
					winRevDiag = false;
				}
			}
			
			if(winRow||winCol||winDiag||winRevDiag) {
				return player;
			}
			return 0;
		}
	}
}
	
			
		
			
			
//			// row
//			for(int i=0;i<n;i++) {
//				if(board[row][i] != player) {
//					win = false;
//					break;
//				}
//			}
//			if(win) {
//				return player;
//			}
//			
//			// col
//			win = true;
//			for(int i=0;i<n;i++) {
//				if(board[i][col] != player) {
//					win = false;
//					break;
//				}
//			}
//			if(win) {
//				return player;
//			}
//			
//			//diagonal 
//			if(row == col) {
//				win = true;
//				for(int i=0;i<n;i++) {
//					if(board[i][i] != player) {
//						win = false;
//						break;
//					}
//				}
//				if(win) {
//					return player;
//				}
//			}
//			
//			// reverse diagonal
//			if(row == n - col) {
//				win = true;
//				for(int i=0;i<n;i++) {
//					if(board[i][col] != player) {
//						win = false;
//						break;
//					}
//				}
//				if(win) {
//					return player;
//				}
//			}
//		}
		
