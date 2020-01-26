/**
 * FileName: Block
 * Author:   wangqiang
 * Date:     2020/1/26 13:30
 * Description: 区块
 */

public class Block {
    private String data;
    private String previousHash;
    private String hash;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(String previousHash) {
        this.previousHash = previousHash;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public Block(String data, String previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.hash = this.computeHash();
    }

    @Override
    public String toString() {
        return "Block{" +
                "data='" + data + '\'' +
                ", previousHash='" + previousHash + '\'' +
                ", hash='" + hash + '\'' +
                '}';
    }

    private String computeHash(){
        return Sha256.getSHA256(this.data + this.previousHash);
    }
}
