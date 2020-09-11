public class Exercise50 {
    public static void main(String[] args){
        //67. Write a Java program to insert a word in the middle of the another string. Go to the editor
        //Insert "Tutorial" in the middle of "Python 3.0", so result will be Python Tutorial 3.0

        String str = "Python 3.0";
        String word = "tutorial";
        String newStr = "";

        String[] array = str.split(" ");

        for(int i = 0; i < array.length;i++){

            newStr += array[i] + " ";

            if(i == Math.floor(array.length/2)-1)
                newStr += word+" ";

        }

        System.out.println("Old string: "+str);
        System.out.println("New string: "+newStr);
    }
}
