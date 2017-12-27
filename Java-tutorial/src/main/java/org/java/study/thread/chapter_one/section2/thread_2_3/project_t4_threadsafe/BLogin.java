package org.java.study.thread.chapter_one.section2.thread_2_3.project_t4_threadsafe;

public class BLogin extends Thread {
    @Override
    public void run() {
        super.run();
        LoginServlet.post("b","bb");
    }
}
