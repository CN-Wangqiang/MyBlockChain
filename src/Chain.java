import java.util.ArrayList;

/**
 * FileName: Chain
 * Author:   wangqiang
 * Date:     2020/1/26 13:47
 * Description: 区块的链
 */
public class Chain {

    ArrayList<Block> chain = new ArrayList<>();

    @Override
    public String toString() {
        return "Chain{" +
                "chain=" + chain +
                '}';
    }
    Chain(){
        chain.add(bigBang());
    }

    //生成祖先区块
    private Block bigBang(){
        return new Block("我是祖先","");
    }

    //得到最近的区块
    private Block getLastestBlock(){
        return chain.get(chain.size() - 1);
    }


    //添加区块到区块链上
    public void addBlockToChain(Block block){
        block.setPreviousHash(this.getLastestBlock().getHash());
        block.setHash(Sha256.getSHA256(block.getData()));
        chain.add(block);
    }


    //验证区块
    public boolean validateChain(){
        if (chain.size() == 1){
            if (!chain.get(0).getHash().equals(Sha256.getSHA256(chain.get(0).getData()))){
                return false;
            }
            return true;
        }
        for (int i =1;i < chain.size()-1; i++){
            Block blockToValidate = chain.get(i);
            if (!blockToValidate.getHash().equals(Sha256.getSHA256(blockToValidate.getData()))){
                System.out.println("当前第"+i+"个区块内容被篡改");
                return false;
            }

            Block previousBlock = chain.get(i-1);
            if (!blockToValidate.getPreviousHash().equals(previousBlock.getHash())){
                System.out.println("区块链发生断裂，在第"+i+"个区块发生");
                return false;
            }

        }
        return true;
    }
}
