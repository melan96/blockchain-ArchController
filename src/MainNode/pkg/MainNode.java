package MainNode.pkg;

import NodeData.pkg.TransactionClass;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author melanrashitha
 * @date 11/12/19
 * @project BlockChainArchController
 */
public class MainNode {

        private String hash;
        private String prevHash;
       private TransactionClass[] transactionData;

    public MainNode(String prevHash, TransactionClass[] transactionData) {

        this.prevHash = prevHash;
        this.transactionData = transactionData;


        TransactionClass[] transactionDataP = {new TransactionClass(""+System.nanoTime()), new TransactionClass(""+System.nanoTime())};
        //Current Calculated blockhash calculated on current transaction data, prev hashcode

        Object[] contHash = {Arrays.hashCode(transactionData), prevHash};

    }

    public String getHash() {
        return hash;
    }

    public String getPrevHash() {
        return prevHash;
    }

    public TransactionClass[] getTransactionData() {
        return transactionData;
    }
}
