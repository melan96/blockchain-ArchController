# blockchain-ArchController

Simple BlockChain Architecture to manage transactions with highly randomized datasets.Manage Transactions and tranasactions informations via distributed nodes

[![N|Solid](https://i.ibb.co/Y2fGK04/Screen-Shot-2019-11-12-at-12-42-10-PM.png)]()

##### Sample blockchain log 

`
/Library/Java/JavaVirtualMachines/jdk1.8.0_212.jdk/Contents/Home/bin/java "-javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=56632:/Applications/IntelliJ IDEA.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath /Library/Java/JavaVirtualMachines/jdk1.8.0_212.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_212.jdk/Contents/Home/jre/lib/deploy.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_212.jdk/Contents/Home/jre/lib/ext/cldrdata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_212.jdk/Contents/Home/jre/lib/ext/dnsns.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_212.jdk/Contents/Home/jre/lib/ext/jaccess.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_212.jdk/Contents/Home/jre/lib/ext/jfxrt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_212.jdk/Contents/Home/jre/lib/ext/localedata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_212.jdk/Contents/Home/jre/lib/ext/nashorn.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_212.jdk/Contents/Home/jre/lib/ext/sunec.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_212.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_212.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_212.jdk/Contents/Home/jre/lib/ext/zipfs.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_212.jdk/Contents/Home/jre/lib/javaws.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_212.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_212.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_212.jdk/Contents/Home/jre/lib/jfxswt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_212.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_212.jdk/Contents/Home/jre/lib/management-agent.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_212.jdk/Contents/Home/jre/lib/plugin.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_212.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_212.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_212.jdk/Contents/Home/lib/ant-javafx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_212.jdk/Contents/Home/lib/dt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_212.jdk/Contents/Home/lib/javafx-mx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_212.jdk/Contents/Home/lib/jconsole.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_212.jdk/Contents/Home/lib/packager.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_212.jdk/Contents/Home/lib/sa-jdi.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_212.jdk/Contents/Home/lib/tools.jar:/Users/melanrashitha/Desktop/Desktop/stripe-payment-gateway-module/BlockChainArchController/out/production/BlockChainArchController MainNode.pkg.BlockChainMain
Nov 12, 2019 12:38:48 PM NodeData.pkg.TransactionClass <init>
INFO: Transaction HB Recieved
Nov 12, 2019 12:38:48 PM NodeData.pkg.TransactionClass setTransactionDate
INFO: Transaction Date Created : 17574483310971
Nov 12, 2019 12:38:48 PM NodeData.pkg.TransactionClass setTransactionID
INFO: TransactionID Created : 76dc675f-5fc0-4316-b131-560bff011a90
Nov 12, 2019 12:38:48 PM NodeData.pkg.TransactionClass <init>
INFO: Transaction HB Detached
Nov 12, 2019 12:38:48 PM NodeData.pkg.TransactionClass <init>
INFO: Transaction HB Recieved
Nov 12, 2019 12:38:48 PM NodeData.pkg.TransactionClass setTransactionDate
INFO: Transaction Date Created : 17574527619284
Nov 12, 2019 12:38:48 PM NodeData.pkg.TransactionClass setTransactionID
INFO: TransactionID Created : 3bd62257-b87c-4b5c-b372-d5068937650e
Nov 12, 2019 12:38:48 PM NodeData.pkg.TransactionClass <init>
INFO: Transaction HB Detached
Nov 12, 2019 12:38:48 PM NodeData.pkg.TransactionClass <init>
INFO: Transaction HB Recieved
Nov 12, 2019 12:38:48 PM NodeData.pkg.TransactionClass setTransactionDate
INFO: Transaction Date Created : 17574531740306
Nov 12, 2019 12:38:48 PM NodeData.pkg.TransactionClass setTransactionID
INFO: TransactionID Created : 9cde4861-969b-44f2-a3d7-2c3ab9c9bc7e
Nov 12, 2019 12:38:48 PM NodeData.pkg.TransactionClass <init>
INFO: Transaction HB Detached
Nov 12, 2019 12:38:48 PM NodeData.pkg.TransactionClass <init>
INFO: Transaction HB Recieved
Nov 12, 2019 12:38:48 PM NodeData.pkg.TransactionClass setTransactionDate
INFO: Transaction Date Created : 17574535808457
Nov 12, 2019 12:38:48 PM NodeData.pkg.TransactionClass setTransactionID
INFO: TransactionID Created : 4f453d12-9984-44c8-9fa5-4048f503fb0d
Nov 12, 2019 12:38:48 PM NodeData.pkg.TransactionClass <init>
INFO: Transaction HB Detached
Nov 12, 2019 12:38:48 PM MainNode.pkg.MainNode <init>
INFO: Node HB Received
Nov 12, 2019 12:38:48 PM MainNode.pkg.MainNode <init>
INFO: Node prevHash loaded : 1
Nov 12, 2019 12:38:48 PM MainNode.pkg.MainNode <init>
INFO: Node HB Received
Nov 12, 2019 12:38:48 PM MainNode.pkg.MainNode <init>
INFO: Node transactionData loaded : [LNodeData.pkg.TransactionClass;@5caf905d
Nov 12, 2019 12:38:48 PM MainNode.pkg.MainNode <init>
INFO: Node Hash Generating 
Nov 12, 2019 12:38:48 PM MainNode.pkg.MainNode <init>
INFO: Node Hash Generated  :  41359092
Nov 12, 2019 12:38:48 PM MainNode.pkg.MainNode <init>
INFO: Node HB Detached
Nov 12, 2019 12:38:48 PM MainNode.pkg.MainNode <init>
INFO: Node HB Received
Nov 12, 2019 12:38:48 PM MainNode.pkg.MainNode <init>
INFO: Node prevHash loaded : 41359092
Nov 12, 2019 12:38:48 PM MainNode.pkg.MainNode <init>
INFO: Node HB Received
Nov 12, 2019 12:38:48 PM MainNode.pkg.MainNode <init>
INFO: Node transactionData loaded : [LNodeData.pkg.TransactionClass;@5caf905d
Nov 12, 2019 12:38:48 PM MainNode.pkg.MainNode <init>
INFO: Node Hash Generating 
Nov 12, 2019 12:38:48 PM MainNode.pkg.MainNode <init>
INFO: Node Hash Generated  :  149928006
Nov 12, 2019 12:38:48 PM MainNode.pkg.MainNode <init>
INFO: Node HB Detached
`

**Free Software, Hell Yeah!**

