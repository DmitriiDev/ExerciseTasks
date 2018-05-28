public class ExceptionsExercise {
    public void doubleStringArray (String[][] smthg) throws MyArraySizeException, MyArrayDataException{
        if(smthg.length > 4)//Try to avoid "magic numbers"
            throw new MyArraySizeException();//better on the next line
        Integer sum = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                try {
                    String str = smthg[i][j];
                    sum += Integer.parseInt(str);
                }catch (Exception e){
                    throw new MyArrayDataException("wrong data format in the cell ", i, j);
                } } }

        System.out.println(sum);
    }}
