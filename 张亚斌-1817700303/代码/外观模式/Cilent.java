package com.huawei.facadeDesign;

import org.apache.log4j.Logger;

import com.huawei.facadeDesign.facade.Computer;

/**
 * 客户端类
 * @author Administrator
 *
 */
public class Cilent {
    public static final Logger LOGGER = Logger.getLogger(Cilent.class);
    public static void main(String[] args)
    {
        Computer computer = new Computer();
        computer.start();
        LOGGER.info("=================");
        computer.shutDown();
    }

}