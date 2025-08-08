package Heima.Algorithm;

public class BlockSearch {
    public static void main(String[] args) {
        int[] arr = {16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};
        //分块
        Block b1 = new Block(21, 0, 5);
        Block b2 = new Block(45, 6, 11);
        Block b3 = new Block(73, 12, 17);
        //将每一块都放入数组中方便管理
        Block[] blockArr = {b1, b2, b3};
        int number = 52;
        System.out.println(getIndex(blockArr, arr, number));
    }

    //查询数字在数组中的索引
    private static int getIndex(Block[] blockArr, int[] arr, int number) {
        //首先确定数字在哪一块分块中
        int indexBlock = findIndexBlock(blockArr, number);
        if(indexBlock == -1){
            //哪一块分块都不在
            return -1;
        }
        //获取所在分块的起始和结束索引
        int startIndex = blockArr[indexBlock].getStartIndex();
        int endIndex = blockArr[indexBlock].getEndIndex();
        for (int i = startIndex; i < endIndex; i++) {
            if(arr[i] == number){
                return i;
            }
        }
        //该分块中也没有该数字
        return -1;
    }
    //查询数字在分块数组中的索引,即数字在哪一块分块
    private static int findIndexBlock(Block[] blockArr, int number) {
        for (int i = 0; i < blockArr.length; i++) {
            //将数字与每个分块的最大值比较,如果数字小于等于该分块的最大值,则数字在该分块中
            if(number <= blockArr[i].getMax()){
                return i;
            }
        }
        return -1;
    }
}
class Block{
    private int max;
    private int startIndex;
    private int endIndex;

    public Block() {
    }
    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }
}