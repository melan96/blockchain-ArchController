package NodeData.pkg;

import java.util.Date;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author melanrashitha
 * @date 11/12/19
 * @project BlockChainArchController
 */
public class TransactionClass {

    //Transaction Data Definitions
    /**
     *  DATE : TRANSACTION DATE
     *  STRING : <- TRANSACTION ID // <- TRANSACTION NAME
     */

    private long transactionDate;
    private UUID transactionID;
    private String transactionName;
    Logger logger = Logger.getLogger("TransationClass");

    public TransactionClass(String transactionName) {

        logger.log(Level.INFO, "Transaction HB Recieved");
        this.transactionName = transactionName;
        setTransactionDate();
        setTransactionID();
        logger.log(Level.INFO, "Transaction HB Detached");
    }

    public void setTransactionDate() {
        this.transactionDate = System.nanoTime();
        logger.log(Level.INFO, "Transaction Date Created : "+transactionDate);
    }

    public void setTransactionID() {
        this.transactionID = UUID.randomUUID();
        logger.log(Level.INFO, "TransactionID Created : "+transactionID);
    }
}
