package com.org.serviceexport.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by wangpeijian on 2018/7/2.
 */
@RequestMapping("zoo")
@RestController
public class zookeeper {


//    @RequestMapping("create")
//    public String index() throws IOException, KeeperException, InterruptedException {
//
//        //创建ZooKeeper实例
//        ZooKeeper zk = new ZooKeeper("127.0.0.1:2181", 100, null);
//        String path = "/wpjtest/record";
//
//       /* if(zk.exists(path, null) != null){
//            zk.delete(path, -1);
//        }*/
//
//        //创建一个节点,模式是PERSISTENT
//        String createResult = zk.create(path, "1".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT_SEQUENTIAL);
//        System.out.println("创建结果：" + createResult);
//        /*System.out.println("创建节点" + path + ",数据为：" + new String(zk.getData(path, event -> {
//            System.out.println("监听节点变化"  + "," +  event.getPath()  + "," + event.getState().toString()  + "," +  event.getType() + "," + event.getWrapper());
//        }, null)));*/
//
//
//        List<String> list = zk.getChildren("/wpjtest", false);
//        System.out.println("准备遍历");
//        list.forEach(item -> {
//            System.out.println("===遍历===：" + item);
//        });
//
//   /*     //修改节点数据
////        zk.setData(path, "2".getBytes(), -1);
//        Stat stat = new Stat();
//        stat.setCtime(new Date().getTime());
////        System.out.println("修改节点" + path + ",数据为：" + new String(zk.getData(path, null, stat)));
//        //删除一个节点
//        System.out.println(zk.exists(path, null));
//        zk.delete(path, -1);
//        //节点是否存在
//        System.out.println(zk.exists(path, null));*/
//
//        return "ok";
//    }

}
