package MainNode.pkg;

import NodeData.pkg.TransactionClass;

import java.util.ArrayList;

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
        TransactionClass[] transactionClassesDataSet = {new TransactionClass("001"), new TransactionClass("002")};

        TransactionClass[] transactionClassesDataSet2 = {new TransactionClass("003"), new TransactionClass("004")};


    }


}
