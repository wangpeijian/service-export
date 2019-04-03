package com.org.serviceexport.utils.zookeeper;

/**
 * Create by wangpeijian on 2018/7/3.
 */
public class DistributeLock {

//    private ZooKeeper zooKeeper;
//    private String path;
//    private String lockName;
//
//    public DistributeLock(String path, String lockName){
//        this.lockName = lockName;
//        this.zooKeeper = Connection.getInstance();
//    }
//
//    boolean tryLock(){
//        try {
//            String lockStr = String.format("%s/%s", path, lockName);
//            String lockPath = zooKeeper.create(lockStr, new byte[0], ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL_SEQUENTIAL);
//            //判断当前节点之前是否存在节点，存在则添加监听
//            List<String> subNodes = zooKeeper.getChildren(path, false);
//
//        } catch (KeeperException | InterruptedException e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
}
