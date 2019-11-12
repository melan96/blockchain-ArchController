package MainNode.pkg;

import NodeData.pkg.TransactionClass;

import java.util.ArrayList;
import java.util.UUID;

/**
 * @author melanrashitha
 * @date 11/12/19
 * @project BlockChainArchController
 */
public class BlockChainMain {

    //Create chain for blocks
    ArrayList<MainNode> blockchain = new ArrayList<MainNode>();

    //Block Chain Dynamically behav
    public static void main(String[] args){


        //Create Genesis block - Main Block ( Initial Block )
        //Create Transaction Details for genesis Block

        //Create Transaction data block
        TransactionClass[] transactionClassesDataSet = {new TransactionClass("0x01"), new TransactionClass("02x0")};

        TransactionClass[] transactionClassesDataSet2 = {new TransactionClass("00x3"), new TransactionClass("00x4")};


        //Create Genesis Block
        MainNode genesisBlock = new MainNode(001,transactionClassesDataSet2);

        MainNode childNode = new MainNode(genesisBlock.getHash(),transactionClassesDataSet2);



    }


}
