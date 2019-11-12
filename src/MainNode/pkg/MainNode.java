package MainNode.pkg;

import NodeData.pkg.TransactionClass;
import sun.util.logging.PlatformLogger;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author melanrashitha
 * @date 11/12/19
 * @project BlockChainArchController
 */
public class MainNode {

        private int hash;
        private int prevHash;
       private TransactionClass[] transactionData;
       Logger logger = Logger.getLogger("MainNode");

    public MainNode(int prevHash, TransactionClass[] transactionData) {

        //Logger MainNode Transaction class init
        logger.log(Level.INFO,"Node HB Received");


        this.prevHash = prevHash;
        logger.log(Level.INFO,"Node prevHash loaded : "+prevHash);

        this.transactionData = transactionData;

        logger.log(Level.INFO,"Node HB Received");
        logger.log(Level.INFO,"Node transactionData loaded : "+transactionData);




        //Current Calculated blockhash calculated on current transaction data, prev hashcode
        logger.log(Level.INFO,"Node Hash Generating ");
        Object[] object = new Object[] {transactionData,prevHash};

        this.hash = object.hashCode();
        logger.log(Level.INFO,"Node Hash Generated  :  "+ this.hash);
        logger.log(Level.INFO,"Node HB Detached");
    }

    public int getHash() {
        return hash;
    }

    public int getPrevHash() {
        return prevHash;
    }

    public TransactionClass[] getTransactionData() {
        return transactionData;
    }
}
