package org.java.study.thread.chapter_six.section4.thread_4_1.project_singletion_7_1;


import java.io.*;

public class SaveAndRead {

    public static void main(String[] args) {
        try {
            MyObject myObject = MyObject.getInstance();
            FileOutputStream fosRef = new FileOutputStream(new File("D://BugReport.txt"));
            ObjectOutputStream oosRef = new ObjectOutputStream(fosRef);
            oosRef.writeObject(myObject);
            oosRef.close();
            fosRef.close();
            System.out.println("myObject==="+myObject.hashCode());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fisRef = new FileInputStream(new File("D://BugReport.txt"));
            ObjectInputStream oisRef = new ObjectInputStream(fisRef);
            MyObject myObject1 = (MyObject)oisRef.readObject();
            oisRef.close();
            fisRef.close();
            System.out.println("myObject1==="+myObject1.hashCode());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
