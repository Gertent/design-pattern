package com.gertent.d13_01_strategy;


import java.io.File;
import java.io.FileFilter;
import java.lang.annotation.Annotation;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class CalPriceFactory {
    //这里是一个常量，表示我们扫描策略的包
    private static final String CAL_PRICE_PACKAGE = "com.xyy.test.com.example.stragedemo";
    private ClassLoader classLoader = getClass().getClassLoader();

    //策略列表
    private List<Class<? extends CalPrice>> calPriceList;

    //根据玩家的总金额产生相应的策略
    public CalPrice createCalPrice(Player player) {
        //在策略列表查找策略
        for (Class<? extends CalPrice> clazz : calPriceList) {
            PriceRegion validRegion = handleAnnotation(clazz);//获取该策略的注解
            //判断金额是否在注解的区间
            if (player.getTotalAmount() > validRegion.min() && player.getTotalAmount() < validRegion.max()) {
                try {
                    //是的话我们返回一个当前策略的实例
                    return clazz.newInstance();
                } catch (Exception e) {
                    throw new RuntimeException("策略获得失败");
                }
            }
        }
        throw new RuntimeException("策略获得失败");
    }

    //处理注解，我们传入一个策略类，返回它的注解
    private PriceRegion handleAnnotation(Class<? extends CalPrice> clazz) {
        Annotation[] annotations = clazz.getDeclaredAnnotations();
        if (annotations == null || annotations.length == 0) {
            return null;
        }
        for (int i = 0; i < annotations.length; i++) {
            if (annotations[i] instanceof PriceRegion) {
                return (PriceRegion) annotations[i];
            }
        }
        return null;
    }
    private CalPriceFactory(){
        init();
    }
    private void init(){
        calPriceList = new ArrayList<Class<? extends CalPrice>>();
        File[] resources = getResources();
        Class<CalPrice> calPriceClass = null;
        try{
            calPriceClass = (Class<CalPrice>) classLoader.loadClass(CalPrice.class.getName());

        }catch (Exception el){

        }
        for (int i=0;i<resources.length;i++){
            try {
                //载入包下的类
                Class<?> clazz = classLoader.loadClass(CAL_PRICE_PACKAGE + "." + resources[i].getName().replace(".class", ""));
                //判断是否是CalPrice的实现类并且不是CalPrice它本身，满足的话加入到策略列表
                if (CalPrice.class.isAssignableFrom(clazz) && clazz != calPriceClass) {
                    calPriceList.add((Class<? extends CalPrice>) clazz);
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        }
    }
    private File[] getResources(){
        try{
            URI uri = classLoader.getResource(CAL_PRICE_PACKAGE.replace(".", "/")).toURI();
            File file = new File(classLoader.getResource(CAL_PRICE_PACKAGE.replace(".", "/")).toURI());
            return file.listFiles(new FileFilter(){

                @Override
                public boolean accept(File pathname) {
                    if (pathname.getName().endsWith(".class")){
                        return true;

                    }
                    return false;
                }
            });
        }catch (Exception e){
            throw new RuntimeException("未找到策略资源");
        }
    }

    public static CalPriceFactory getInstance(){
        return CalPriceFactoryInstance.instance;
    }

    private static class CalPriceFactoryInstance{
        private static CalPriceFactory instance = new CalPriceFactory();
    }

    public static void main(String[] args) {
        CalPriceFactory.getInstance();
    }

}
