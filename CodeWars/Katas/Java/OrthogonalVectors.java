public class OrthogonalVectors {
    public static void main(String[] args){
        //Suppose I have two vectors: (a1, a2, a3, ..., aN) and (b1, b2, b3, ..., bN). The dot product between these two vectors is defined as:
        //
        //a1*b1 + a2*b2 + a3*b3 + ... + aN*bN
        //The vectors are classified as orthogonal if the dot product equals zero.
        //
        //Complete the function that accepts two sequences as inputs and returns true if the vectors are orthogonal, and false if they are not. The sequences will always be correctly formatted and of the same length, so there is no need to check them first.

        int[] u = {1,2,3};
        int[] v = {4,5,6};

        isOrthogonal(u,v);
    }

    public static boolean isOrthogonal(int[] u, int[] v){

        int sum = 0;

        for(int i = 0; i < u.length; i++){
            sum += u[i] * v[i];
        }

        if(sum == 0)
            return true;
        else
            return false;
    }
}
