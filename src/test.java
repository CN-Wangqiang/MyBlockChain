/**
 * FileName: test
 * Author:   wangqiang
 * Date:     2020/1/26 13:43
 * Description: 测试区块
 */

public class test {
    public static void main(String[] args) {

//        Block block = new Block("转账十元","123");
//        System.out.println(block);

        /**
         * 构造区块
         * 输出内容：
         *         Block {
         *             data = '转账十元',
         *             previousHash = '123',
         *             hash = 'bbb52b503ca642e6c48f02ab793b2beaca4a5c5ce7e93531038ed65799f70010'
         *         }
         *
         */

//        Chain myChain = new Chain();
//        System.out.println(myChain.toString());

        /**
         *
         * 添加祖先区块
         * 输出内容：
         *         Chain {
         *             chain =[Block {
         *                 data = '我是祖先',
         *                 previousHash = '',
         *                 hash = 'dbf4cebe91cf0212be8ee04289855fc17e0085d45a7b4c69eeb79e7c636b48fc'
         *             }]}
         *
         *
         */


//        Chain myChain = new Chain();
//        Block block = new Block("转账十元", "");
//        Block block1 = new Block("转账二十元", "");
//        myChain.addBlockToChain(block);
//        myChain.addBlockToChain(block1);
//        System.out.println(myChain);
        /**
         *
         *添加区块
         *输出内容：
         * Chain {
         *             chain =[Block {
         *                 data = '我是祖先',
         *                 previousHash = '',
         *                 hash = 'dbf4cebe91cf0212be8ee04289855fc17e0085d45a7b4c69eeb79e7c636b48fc'
         *             },Block {
         *                 data = '转账十元',
         *                 previousHash = 'dbf4cebe91cf0212be8ee04289855fc17e0085d45a7b4c69eeb79e7c636b48fc',
         *                 hash = '69d0f49f00a327700998ba66c8360a5abe8ff786ee9810f35971c3cebd0852f5'
         *             },Block {
         *                 data = '转账二十元',
         *                 previousHash = '69d0f49f00a327700998ba66c8360a5abe8ff786ee9810f35971c3cebd0852f5',
         *                 hash = '7be808e2a06d1c386bb539fc977e327c0f83551a0c69ea7db05e8ca591e8039a'
         *             }]}
         *
         */



//        Chain myChain = new Chain();
//        Block block = new Block("转账十元", "");
//        Block block1 = new Block("转账二十元", "");
//        Block block2 = new Block("转账三十元", "");
//        Block block3 = new Block("转账四十元", "");
//        myChain.addBlockToChain(block);
//        myChain.addBlockToChain(block1);
//        myChain.addBlockToChain(block2);
//        myChain.addBlockToChain(block3);
//        System.out.println(myChain);
//        System.out.println(myChain.validateChain());
        /**
         *
         *验证区块信息
         *输出内容：
         *        Chain {
         *             chain =[Block {
         *                 data = '我是祖先',
         *                 previousHash = '',
         *                 hash = 'dbf4cebe91cf0212be8ee04289855fc17e0085d45a7b4c69eeb79e7c636b48fc'
         *             },Block {
         *                 data = '转账十元',
         *                 previousHash = 'dbf4cebe91cf0212be8ee04289855fc17e0085d45a7b4c69eeb79e7c636b48fc',
         *                 hash = '69d0f49f00a327700998ba66c8360a5abe8ff786ee9810f35971c3cebd0852f5'
         *             },Block {
         *                 data = '转账二十元',
         *                 previousHash = '69d0f49f00a327700998ba66c8360a5abe8ff786ee9810f35971c3cebd0852f5',
         *                 hash = '7be808e2a06d1c386bb539fc977e327c0f83551a0c69ea7db05e8ca591e8039a'
         *             },Block {
         *                 data = '转账三十元',
         *                 previousHash = '7be808e2a06d1c386bb539fc977e327c0f83551a0c69ea7db05e8ca591e8039a',
         *                 hash = '6b551cd039d6345499605e8cba225598ebd643bce0535a239835f085406e6cd0'
         *             },Block {
         *                 data = '转账四十元',
         *                 previousHash = '6b551cd039d6345499605e8cba225598ebd643bce0535a239835f085406e6cd0',
         *                 hash = 'e55bc76162a6274951ef8172b8b434edc7902ae4a0e1f92d24f0ab69ecaba204'
         *             }]}
         *         true
         *
         *
         */


//        Chain myChain = new Chain();
//        Block block = new Block("转账十元", "");
//        Block block1 = new Block("转账二十元", "");
//        Block block2 = new Block("转账三十元", "");
//        Block block3 = new Block("转账四十元", "");
//        myChain.addBlockToChain(block);
//        myChain.addBlockToChain(block1);
//        myChain.addBlockToChain(block2);
//        myChain.addBlockToChain(block3);
//        myChain.chain.get(1).setData("转账一百元");
//        System.out.println(myChain);
//        System.out.println(myChain.validateChain());
        /**
         *
         * 区块信息被篡改
         * 输出内容：
         *  Chain {
         *             chain =[Block {
         *                 data = '我是祖先',
         *                 previousHash = '',
         *                 hash = 'dbf4cebe91cf0212be8ee04289855fc17e0085d45a7b4c69eeb79e7c636b48fc'
         *             },Block {
         *                 data = '转账一百元',
         *                 previousHash = 'dbf4cebe91cf0212be8ee04289855fc17e0085d45a7b4c69eeb79e7c636b48fc',
         *                 hash = '69d0f49f00a327700998ba66c8360a5abe8ff786ee9810f35971c3cebd0852f5'
         *             },Block {
         *                 data = '转账二十元',
         *                 previousHash = '69d0f49f00a327700998ba66c8360a5abe8ff786ee9810f35971c3cebd0852f5',
         *                 hash = '7be808e2a06d1c386bb539fc977e327c0f83551a0c69ea7db05e8ca591e8039a'
         *             },Block {
         *                 data = '转账三十元',
         *                 previousHash = '7be808e2a06d1c386bb539fc977e327c0f83551a0c69ea7db05e8ca591e8039a',
         *                 hash = '6b551cd039d6345499605e8cba225598ebd643bce0535a239835f085406e6cd0'
         *             },Block {
         *                 data = '转账四十元',
         *                 previousHash = '6b551cd039d6345499605e8cba225598ebd643bce0535a239835f085406e6cd0',
         *                 hash = 'e55bc76162a6274951ef8172b8b434edc7902ae4a0e1f92d24f0ab69ecaba204'
         *             }]}
         *         当前第1个区块内容被篡改
         *         false
         *
         */


        Chain myChain = new Chain();
        Block block = new Block("转账十元", "");
        Block block1 = new Block("转账二十元", "");
        Block block2 = new Block("转账三十元", "");
        Block block3 = new Block("转账四十元", "");
        myChain.addBlockToChain(block);
        myChain.addBlockToChain(block1);
        myChain.addBlockToChain(block2);
        myChain.addBlockToChain(block3);
        myChain.chain.get(1).setData("转账一百元");
        myChain.chain.get(1).setHash(Sha256.getSHA256(myChain.chain.get(1).getData()));
        System.out.println(myChain);
        System.out.println(myChain.validateChain());
        /**
         *
         *当前区块链断裂
         *输出内容：
         *        Chain {
         *             chain =[Block {
         *                 data = '我是祖先',
         *                 previousHash = '',
         *                 hash = 'dbf4cebe91cf0212be8ee04289855fc17e0085d45a7b4c69eeb79e7c636b48fc'
         *             },Block {
         *                 data = '转账一百元',
         *                 previousHash = 'dbf4cebe91cf0212be8ee04289855fc17e0085d45a7b4c69eeb79e7c636b48fc',
         *                 hash = '29d928072f9a1341be5f9929c1374a20b6d1eeabdabcf8dcc49f81873b0a996e'
         *             },Block {
         *                 data = '转账二十元',
         *                 previousHash = '69d0f49f00a327700998ba66c8360a5abe8ff786ee9810f35971c3cebd0852f5',
         *                 hash = '7be808e2a06d1c386bb539fc977e327c0f83551a0c69ea7db05e8ca591e8039a'
         *             },Block {
         *                 data = '转账三十元',
         *                 previousHash = '7be808e2a06d1c386bb539fc977e327c0f83551a0c69ea7db05e8ca591e8039a',
         *                 hash = '6b551cd039d6345499605e8cba225598ebd643bce0535a239835f085406e6cd0'
         *             },Block {
         *                 data = '转账四十元',
         *                 previousHash = '6b551cd039d6345499605e8cba225598ebd643bce0535a239835f085406e6cd0',
         *                 hash = 'e55bc76162a6274951ef8172b8b434edc7902ae4a0e1f92d24f0ab69ecaba204'
         *             }]}
         *         区块链发生断裂，在第2个区块发生
         *         false
         *
         *
         */



    }
}
