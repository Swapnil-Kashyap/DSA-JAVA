import java.util.ArrayList;
import java.util.Collections;

public class RatMaze {
    boolean isSafeToMove(int[][] maze,int x,int y,boolean[][] visited) {
        int n=maze.length;
        return x>=0 && x<n &&
               y>=0 && y<n &&
               maze[x][y]==1 &&
               !visited[x][y];
    }
    void solve(int[][] maze,int srcX,int srcY,int destX,int destY,
               boolean[][] visited,ArrayList<String> ans,String path) {
        if(srcX==destX && srcY==destY) {
            ans.add(path);
            return;
        }
        visited[srcX][srcY]=true;

        // Up
        int newX=srcX-1;
        int newY=srcY;
        if(isSafeToMove(maze,newX,newY,visited)) {
            solve(maze,newX,newY,destX,destY,visited,ans,path+"U");
        }
        // Down
        newX=srcX+1;
        newY=srcY;
        if(isSafeToMove(maze,newX,newY,visited)) {
            solve(maze,newX,newY,destX,destY,visited,ans,path+"D");
        }
        // Left
        newX=srcX;
        newY=srcY-1;
        if(isSafeToMove(maze,newX,newY,visited)) {
            solve(maze,newX,newY,destX,destY,visited,ans,path+"L");
        }
        // Right
        newX=srcX;
        newY=srcY+1;
        if(isSafeToMove(maze,newX,newY,visited)) {
            solve(maze,newX,newY,destX,destY,visited,ans,path+"R");
        }
        visited[srcX][srcY]=false;
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        int n=maze.length;
        ArrayList<String> ans=new ArrayList<>();
        if(n==0 || maze[0][0]==0 || maze[n-1][n-1]==0) {
            return ans;
        }
        boolean[][] visited=new boolean[n][n];
        solve(maze,0,0,n-1,n-1,visited,ans,"");
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        int[][] maze={
            {1,0,0,0},
            {1,1,0,1},
            {1,1,0,0},
            {0,1,1,1}
        };
        RatMaze obj=new RatMaze();
        System.out.println(obj.ratInMaze(maze));
    }
}