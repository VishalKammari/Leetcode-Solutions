public class Set_Matrix_Zeros {
    
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int a=matrix[0][0];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    if(j==0) a=0;
                    else{
                        matrix[0][j]=0;
                    }
                }
            }   
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][j]!=0){
                    if((matrix[i][0]==0)||(matrix[0][j]==0)) matrix[i][j]=0;
                }
            }
        }
        if(matrix[0][0]==0){
            for(int j=0;j<m;j++){
                matrix[0][j]=0;
            }
        }
        if(a==0){
            for(int i=0;i<n;i++){
                matrix[i][0]=0;
            }
        }
    }
}