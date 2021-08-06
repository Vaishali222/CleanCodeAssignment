public class CleanCode {

    static class CheckClean {  //static class

        int SmallestNumber;
        int LargestNumber;
    }

    //Method to find the largest and smallest number from a given array
    static CheckClean FindLargestSmallest(int[] GivenArray, int SizeOfArray){
        CheckClean objectOfCheck = new CheckClean();

        int i;

        if (SizeOfArray == 1) {
            objectOfCheck.LargestNumber = GivenArray[0];
            objectOfCheck.SmallestNumber = GivenArray[0];
            return objectOfCheck;
        }

        if (GivenArray[0] > GivenArray[1]) {
            objectOfCheck.LargestNumber = GivenArray[0];
            objectOfCheck.SmallestNumber = GivenArray[1];
        }

        else {
            objectOfCheck.LargestNumber = GivenArray[1];
            objectOfCheck.SmallestNumber = GivenArray[0];
        }

        for (i = 2; i < SizeOfArray; i++) {
            if (GivenArray[i] > objectOfCheck.LargestNumber)
            {
                objectOfCheck.LargestNumber = GivenArray[i];
            }
            else if (GivenArray[i] < objectOfCheck.SmallestNumber)
            {
                objectOfCheck.SmallestNumber = GivenArray[i];
            }
        }

        return objectOfCheck;
    }

    //Main method
    public static void main(String[] args) {
        int [] GivenArray = {1000, 11, 445, 1, 330, 3000}; //Given array of elements
        int SizeOfArray = 6;
        CheckClean objectOfCheck = FindLargestSmallest(GivenArray, SizeOfArray);//Calling of the method

        //Printing Array
        System.out.printf("\n Given array : ");
        for(int i=0;i<SizeOfArray;i++){
            System.out.printf(GivenArray[i]+" ");
        }

        //Printing the smallest and largest number
        System.out.printf("\n Smallest Number in array : %d", objectOfCheck.SmallestNumber);
        System.out.printf("\n Largest Number in array : %d", objectOfCheck.LargestNumber);
    }
}
