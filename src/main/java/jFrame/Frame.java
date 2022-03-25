package jFrame;

import Mouse.MouseMover;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;

public class Frame extends JFrame {

    private String activeDefiner_g = "스톱!";
    private JLabel activeDefiner = null;



    public boolean flag = false;

    java.util.Timer globalTimer = null;

    public Frame(){
        initUi();
    }

    private void initUi(){

        //TODOS insert thread func out
        java.util.Timer t = new java.util.Timer();

        setTitle("Mouse Mover");
        setSize(250,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        getContentPane().setLayout(null);

        JButton startBtn = new JButton("Start");
        JButton stopBtn = new JButton("stop");
        activeDefiner = new JLabel(activeDefiner_g);

        startBtn.setBounds(10,70, 100 ,50);
        stopBtn.setBounds(120,70, 100 ,50);
        activeDefiner.setBounds(100,0, 100 ,100);

        addEvent(startBtn);
        addEvent(stopBtn);

        getContentPane().add(startBtn);
        getContentPane().add(stopBtn);
        getContentPane().add(activeDefiner);

        setVisible(true);

    }

    private void addEvent(JButton btn){

        btn.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){

                if( btn.getText().equals("Start") ){
                    activeDefiner.setText("시작!");
                    flag = true;


                }else{
                    activeDefiner.setText("스톱!");
                    flag = false;
                }

                if(flag){
                    globalTimer = scheduler();
                }else{
                    globalTimer.cancel();
                }





            }

        });



    }

    public java.util.Timer scheduler() {

        java.util.Timer t = new java.util.Timer();
        MouseMover mouseMover = new MouseMover();

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                mouseMover.yLocMove();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

                mouseMover.yLocMoveBack();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        };
        t.schedule(timerTask, 0, 3000);

        return t;

    }
}
