package com.codewithTayyab;
//importing all the necessary packages.
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Main  implements ActionListener{
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,sample,swap;    //Declaring all the buttons that are used further.
    Icon swap_icon;
    JLabel l4;
    JLabel l5;
    int counter = 0;
    long before, after;  //"before" is the variable of time before the click of mouse and "after" is variable of time after the click of mouse.

    JFrame frame = new JFrame();  //Creating a JFrame.

    //Initializing all the images that will be utilized  further in code.
    Icon swap_1=new ImageIcon("pic/swap 1.jpg");
    Icon swap_2=new ImageIcon("pic/swap 2.jpg");
    Icon swap_3=new ImageIcon("pic/swap 3.jpg");
    Icon sam_1=new ImageIcon("pic/sam 1.jpg");
    Icon sam_2=new ImageIcon("pic/sam 2.jpg");
    Icon sam_3=new ImageIcon("pic/sam 3.jpg");

    Icon ic1=new ImageIcon("pic/1.jpg");
    Icon ic2=new ImageIcon("pic/5.jpg");
    Icon ic3=new ImageIcon("pic/2.jpg");
    Icon ic4=new ImageIcon("pic/7.jpg");
    Icon ic5=new ImageIcon("pic/4.jpg");
    Icon ic6=new ImageIcon("pic/6.jpg");
    Icon ic7=new ImageIcon("pic/8.jpg");
    Icon ic8=new ImageIcon("pic/9.jpg");
    Icon ic9=new ImageIcon("pic/3.jpg");

    Icon ic11=new ImageIcon("pic/12.jpg");
    Icon ic12=new ImageIcon("pic/13.jpg");
    Icon ic13=new ImageIcon("pic/16.jpg");
    Icon ic14=new ImageIcon("pic/11.jpg");
    Icon ic15=new ImageIcon("pic/14.jpg");
    Icon ic16=new ImageIcon("pic/19.jpg");
    Icon ic17=new ImageIcon("pic/17.jpg");
    Icon ic18=new ImageIcon("pic/15.jpg");
    Icon ic19=new ImageIcon("pic/18.jpg");

    Icon ic21=new ImageIcon("pic/24.jpg");
    Icon ic22=new ImageIcon("pic/25.jpg");
    Icon ic23=new ImageIcon("pic/21.jpg");
    Icon ic24=new ImageIcon("pic/27.jpg");
    Icon ic25=new ImageIcon("pic/23.jpg");
    Icon ic26=new ImageIcon("pic/29.jpg");
    Icon ic27=new ImageIcon("pic/28.jpg");
    Icon ic28=new ImageIcon("pic/22.jpg");
    Icon ic29=new ImageIcon("pic/26.jpg");

    // This is the constructor of Main class. Action Listener will be implemented here.
    Main(){

        frame.setTitle("SOLVE THE PUZZLE");


        //These are all the buttons and their respective location in JFrame window.
        b1=new JButton(ic1);
        b1.setBounds(10,80,100,100);
        b2=new JButton(ic2);
        b2.setBounds(110,80,100,100);
        b3=new JButton(ic3);
        b3.setBounds(210,80,100,100);
        b4=new JButton(ic4);
        b4.setBounds(10,180,100,100);
        b5=new JButton(ic5);
        b5.setBounds(110,180,100,100);
        b6=new JButton(ic6);
        b6.setBounds(210,180,100,100);
        b7=new JButton(ic7);
        b7.setBounds(10,280,100,100);
        b8=new JButton(ic8);
        b8.setBounds(110,280,100,100);
        b9=new JButton(ic9);
        b9.setBounds(210,280,100,100);
        sample=new JButton(sam_1);
        sample.setBounds(380,100,200,200);

        JLabel l1=new JLabel("Sample:");
        l1.setBounds(330,200,70,20);
        JLabel l2=new JLabel("NOTE:- This Icon has ability to  switch with neighbour icon");
        l2.setBounds(5,15,500,20);
        JLabel l3=new JLabel("Click sample for next puzzle");
        l3.setBounds(380,320,200,20);
        l3.setForeground(Color.red);
        l4 = new JLabel();
        l4.setBounds(380,260,200,200);
        l5 = new JLabel();
        l5.setBounds(380,290,200,200);

        swap=new JButton(swap_1);
        swap.setBounds(330,5,50,50);
        swap_icon=b9.getIcon();

        // adding all the components in JFrame window.
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(sample);
        frame.add(swap);
        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(l4);
        frame.add(l5);

        //The "this" keyword refers to the current object in Main constructor.
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        sample.addActionListener(this);

        frame.setLayout(null);
        frame.setSize(600,500);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public void actionPerformed(ActionEvent e){
        if(counter==0)
        {
            before = System.currentTimeMillis(); //TIme before the mouse click event.
        }

        if(e.getSource()==b1)
        {
            Icon s1=b1.getIcon();
            if(b2.getIcon()==swap_icon)
            {
                b2.setIcon(s1);
                b1.setIcon(swap_icon);
            } else if(b4.getIcon()==swap_icon)
            {
                b4.setIcon(s1);
                b1.setIcon(swap_icon);
            }
            l4.setText("Your Clicks :"+(++counter)+" (Total Clicks :500.)");
            after = System.currentTimeMillis();
            long seconds = (after-before)/1000;

            l5.setText("Seconds :"+seconds+" (Total Time :500 sec)");
            if(counter==500)
            {
                JOptionPane.showMessageDialog(null,"You failed to complete this puzzle in given target","Game Over",JOptionPane.INFORMATION_MESSAGE);
                frame.setVisible(false);
                counter = 0;
            }
            if(b1.getIcon().equals(ic1) && b2.getIcon().equals(ic3) && b3.getIcon().equals(ic9) && b4.getIcon().equals(ic5) && b5.getIcon().equals(ic2) && b6.getIcon().equals(ic6) && b7.getIcon().equals(ic4) && b8.getIcon().equals(ic7) && b9.getIcon().equals(ic8))
            {
                JOptionPane.showMessageDialog(null,"Congratulations! You have completed this level in "+counter+" counters and "+seconds+" Seconds","LEVEL COMPLETED",JOptionPane.INFORMATION_MESSAGE);
                frame.setVisible(false);
                counter = 0;
                before = 0;
                after = 0;
            }
            if(seconds>=500)
            {
                JOptionPane.showMessageDialog(null,"You failed to complete this puzzle in given time","Game Over",JOptionPane.INFORMATION_MESSAGE);
                frame.setVisible(false);
                counter = 0;
                before = 0;
                after = 0;
            }

        }//end of if

        if(e.getSource()==b2)
        {
            Icon s1=b2.getIcon();
            if(b1.getIcon()==swap_icon)
            {
                b1.setIcon(s1);
                b2.setIcon(swap_icon);
            } else if(b5.getIcon()==swap_icon)
            {
                b5.setIcon(s1);
                b2.setIcon(swap_icon);
            }
            else if(b3.getIcon()==swap_icon)
            {
                b3.setIcon(s1);
                b2.setIcon(swap_icon);
            }
            l4.setText("Your Clicks :"+(++counter)+" (Total Clicks :500.)");
            after = System.currentTimeMillis();
            long seconds = (after-before)/1000;

            l5.setText("Seconds :"+seconds+" (Total Time :500 sec)");
            if(counter==500)
            {
                JOptionPane.showMessageDialog(null,"You failed to complete this puzzle in given target","Game Over",JOptionPane.INFORMATION_MESSAGE);
                frame.setVisible(false);
                counter=0;
            }
            if(b1.getIcon().equals(ic1) && b2.getIcon().equals(ic3) && b3.getIcon().equals(ic9) && b4.getIcon().equals(ic5) && b5.getIcon().equals(ic2) && b6.getIcon().equals(ic6) && b7.getIcon().equals(ic4) && b8.getIcon().equals(ic7) && b9.getIcon().equals(ic8))
            {
                JOptionPane.showMessageDialog(null,"Congratulations! You have completed this level in "+counter+" counters","LEVEL COMPLETED",JOptionPane.INFORMATION_MESSAGE);
                frame.setVisible(false);
                counter = 0;
                before = 0;
                after = 0;
            }
            if(seconds>=500)
            {
                JOptionPane.showMessageDialog(null,"You failed to complete this puzzle in given time","Game Over",JOptionPane.INFORMATION_MESSAGE);
                frame.setVisible(false);
                counter = 0;
                before = 0;
                after = 0;
            }

        }//end of if

        if(e.getSource()==b3)
        {
            Icon s1=b3.getIcon();
            if(b2.getIcon()==swap_icon)
            {
                b2.setIcon(s1);
                b3.setIcon(swap_icon);
            } else if(b6.getIcon()==swap_icon)
            {
                b6.setIcon(s1);
                b3.setIcon(swap_icon);
            }
            l4.setText("Your Clicks :"+(++counter)+" (Total Clicks :500.)");
            after = System.currentTimeMillis();
            long seconds = (after-before)/1000;

            l5.setText("Seconds :"+seconds+" (Total Time :500 sec)");
            if(counter==500)
            {
                JOptionPane.showMessageDialog(null,"You failed to complete this puzzle in given target","Game Over",JOptionPane.INFORMATION_MESSAGE);
                frame.setVisible(false);
                counter = 0;
            }
            if(b1.getIcon().equals(ic1) && b2.getIcon().equals(ic3) && b3.getIcon().equals(ic9) && b4.getIcon().equals(ic5) && b5.getIcon().equals(ic2) && b6.getIcon().equals(ic6) && b7.getIcon().equals(ic4) && b8.getIcon().equals(ic7) && b9.getIcon().equals(ic8))
            {
                JOptionPane.showMessageDialog(null,"Congratulations! You have completed this level in "+counter+" counters","LEVEL COMPLETED",JOptionPane.INFORMATION_MESSAGE);
                frame.setVisible(false);
                counter = 0;
                before = 0;
                after = 0;
            }
            if(seconds>=500)
            {
                JOptionPane.showMessageDialog(null,"You failed to complete this puzzle in given time","Game Over",JOptionPane.INFORMATION_MESSAGE);
                frame.setVisible(false);
                counter = 0;
                before = 0;
                after = 0;
            }

        }//end of if

        if(e.getSource()==b4)
        {
            Icon s1=b4.getIcon();
            if(b1.getIcon()==swap_icon)
            {
                b1.setIcon(s1);
                b4.setIcon(swap_icon);
            } else if(b5.getIcon()==swap_icon)
            {
                b5.setIcon(s1);
                b4.setIcon(swap_icon);
            }
            else if(b7.getIcon()==swap_icon)
            {
                b7.setIcon(s1);
                b4.setIcon(swap_icon);
            }
            l4.setText("Your Clicks :"+(++counter)+" (Total Clicks :500.)");
            after = System.currentTimeMillis();
            long seconds = (after-before)/1000;

            l5.setText("Seconds :"+seconds+" (Total Time :500 sec)");
            if(counter==500)
            {
                JOptionPane.showMessageDialog(null,"You failed to complete this puzzle in given target","Game Over",JOptionPane.INFORMATION_MESSAGE);
                frame.setVisible(false);
                counter = 0;
            }
            if(b1.getIcon().equals(ic1) && b2.getIcon().equals(ic3) && b3.getIcon().equals(ic9) && b4.getIcon().equals(ic5) && b5.getIcon().equals(ic2) && b6.getIcon().equals(ic6) && b7.getIcon().equals(ic4) && b8.getIcon().equals(ic7) && b9.getIcon().equals(ic8))
            {
                JOptionPane.showMessageDialog(null,"Congratulations! You have completed this level in "+counter+" counters","LEVEL COMPLETED",JOptionPane.INFORMATION_MESSAGE);
                frame.setVisible(false);
                counter = 0;
                before = 0;
                after = 0;
            }
            if(seconds>=500)
            {
                JOptionPane.showMessageDialog(null,"You failed to complete this puzzle in given time","Game Over",JOptionPane.INFORMATION_MESSAGE);
                frame.setVisible(false);
                counter = 0;
                before = 0;
                after = 0;
            }

        }//end of if

        if(e.getSource()==b5)
        {
            Icon s1=b5.getIcon();
            if(b2.getIcon()==swap_icon)
            {
                b2.setIcon(s1);
                b5.setIcon(swap_icon);
            } else if(b4.getIcon()==swap_icon)
            {
                b4.setIcon(s1);
                b5.setIcon(swap_icon);
            }
            else if(b6.getIcon()==swap_icon)
            {
                b6.setIcon(s1);
                b5.setIcon(swap_icon);
            }
            else if(b8.getIcon()==swap_icon)
            {
                b8.setIcon(s1);
                b5.setIcon(swap_icon);
            }
            l4.setText("Your Clicks :"+(++counter)+" (Total Clicks :500.)");
            after = System.currentTimeMillis();
            long seconds = (after-before)/1000;

            l5.setText("Seconds :"+seconds+" (Total Time :500 sec)");
            if(counter==500)
            {
                JOptionPane.showMessageDialog(null,"You failed to complete this puzzle in given target","Game Over",JOptionPane.INFORMATION_MESSAGE);
                frame.setVisible(false);
                counter = 0;
            }
            if(b1.getIcon().equals(ic1) && b2.getIcon().equals(ic3) && b3.getIcon().equals(ic9) && b4.getIcon().equals(ic5) && b5.getIcon().equals(ic2) && b6.getIcon().equals(ic6) && b7.getIcon().equals(ic4) && b8.getIcon().equals(ic7) && b9.getIcon().equals(ic8))
            {
                JOptionPane.showMessageDialog(null,"Congratulations! You have completed this level in "+counter+" counters","LEVEL COMPLETED",JOptionPane.INFORMATION_MESSAGE);
                frame.setVisible(false);
                counter = 0;
                before = 0;
                after = 0;
            }
            if(seconds>=500)
            {
                JOptionPane.showMessageDialog(null,"You failed to complete this puzzle in given time","Game Over",JOptionPane.INFORMATION_MESSAGE);
                frame.setVisible(false);
                counter = 0;
                before = 0;
                after = 0;
            }

        }//end of if

        if(e.getSource()==b6)
        {
            Icon s1=b6.getIcon();
            if(b3.getIcon()==swap_icon)
            {
                b3.setIcon(s1);
                b6.setIcon(swap_icon);
            } else if(b5.getIcon()==swap_icon)
            {
                b5.setIcon(s1);
                b6.setIcon(swap_icon);
            }
            else if(b9.getIcon()==swap_icon)
            {
                b9.setIcon(s1);
                b6.setIcon(swap_icon);
            }
            l4.setText("Your Clicks :"+(++counter)+" (Total Clicks :500.)");
            after = System.currentTimeMillis();
            long seconds = (after-before)/1000;

            l5.setText("Seconds :"+seconds+" (Total Time :500 sec)");
            if(counter==500)
            {
                JOptionPane.showMessageDialog(null,"You failed to complete this puzzle in given target","Game Over",JOptionPane.INFORMATION_MESSAGE);
                frame.setVisible(false);
                counter = 0;
            }
            if(b1.getIcon().equals(ic1) && b2.getIcon().equals(ic3) && b3.getIcon().equals(ic9) && b4.getIcon().equals(ic5) && b5.getIcon().equals(ic2) && b6.getIcon().equals(ic6) && b7.getIcon().equals(ic4) && b8.getIcon().equals(ic7) && b9.getIcon().equals(ic8))
            {
                JOptionPane.showMessageDialog(null,"Congratulations! You have completed this level in "+counter+" counters","LEVEL COMPLETED",JOptionPane.INFORMATION_MESSAGE);
                frame.setVisible(false);
                counter = 0;
                before = 0;
                after = 0;
            }
            if(seconds>=500)
            {
                JOptionPane.showMessageDialog(null,"You failed to complete this puzzle in given time","Game Over",JOptionPane.INFORMATION_MESSAGE);
                frame.setVisible(false);
                counter = 0;
                before = 0;
                after = 0;
            }

        }//end of if

        if(e.getSource()==b7)
        {
            Icon s1=b7.getIcon();
            if(b4.getIcon()==swap_icon)
            {
                b4.setIcon(s1);
                b7.setIcon(swap_icon);
            } else if(b8.getIcon()==swap_icon)
            {
                b8.setIcon(s1);
                b7.setIcon(swap_icon);
            }
            l4.setText("Your Clicks :"+(++counter)+" (Total Clicks :500.)");
            after = System.currentTimeMillis();
            long seconds = (after-before)/1000;

            l5.setText("Seconds :"+seconds+" (Total Time :500 sec)");
            if(counter==500)
            {
                JOptionPane.showMessageDialog(null,"You failed to complete this puzzle in given target","Game Over",JOptionPane.INFORMATION_MESSAGE);
                frame.setVisible(false);
                counter = 0;
            }
            if(b1.getIcon().equals(ic1) && b2.getIcon().equals(ic3) && b3.getIcon().equals(ic9) && b4.getIcon().equals(ic5) && b5.getIcon().equals(ic2) && b6.getIcon().equals(ic6) && b7.getIcon().equals(ic4) && b8.getIcon().equals(ic7) && b9.getIcon().equals(ic8))
            {
                JOptionPane.showMessageDialog(null,"Congratulations! You have completed this level in "+counter+" counters","LEVEL COMPLETED",JOptionPane.INFORMATION_MESSAGE);
                frame.setVisible(false);
                counter = 0;
                before = 0;
                after = 0;
            }
            if(seconds>=500)
            {
                JOptionPane.showMessageDialog(null,"You failed to complete this puzzle in given time","Game Over",JOptionPane.INFORMATION_MESSAGE);
                frame.setVisible(false);
                counter = 0;
                before = 0;
                after = 0;
            }

        }//end of if

        if(e.getSource()==b8)
        {
            Icon s1=b8.getIcon();
            if(b7.getIcon()==swap_icon)
            {
                b7.setIcon(s1);
                b8.setIcon(swap_icon);
            } else if(b5.getIcon()==swap_icon)
            {
                b5.setIcon(s1);
                b8.setIcon(swap_icon);
            }
            else if(b9.getIcon()==swap_icon)
            {
                b9.setIcon(s1);
                b8.setIcon(swap_icon);
            }
            l4.setText("Your Clicks :"+(++counter)+" (Total Clicks :500.)");
            after = System.currentTimeMillis();
            long seconds = (after-before)/1000;

            l5.setText("Seconds :"+seconds+" (Total Time :500 sec)");
            if(counter==500)
            {
                JOptionPane.showMessageDialog(null,"You failed to complete this puzzle in given target","Game Over",JOptionPane.INFORMATION_MESSAGE);
                frame.setVisible(false);
                counter = 0;
            }
            if(b1.getIcon().equals(ic1) && b2.getIcon().equals(ic3) && b3.getIcon().equals(ic9) && b4.getIcon().equals(ic5) && b5.getIcon().equals(ic2) && b6.getIcon().equals(ic6) && b7.getIcon().equals(ic4) && b8.getIcon().equals(ic7) && b9.getIcon().equals(ic8))
            {
                JOptionPane.showMessageDialog(null,"Congratulations! You have completed this level in "+counter+" counters","LEVEL COMPLETED",JOptionPane.INFORMATION_MESSAGE);
                frame.setVisible(false);
                counter = 0;
                before = 0;
                after = 0;
            }
            if(seconds>=500)
            {
                JOptionPane.showMessageDialog(null,"You failed to complete this puzzle in given time","Game Over",JOptionPane.INFORMATION_MESSAGE);
                frame.setVisible(false);
                counter = 0;
                before = 0;
                after = 0;
            }

        }//end of if

        if(e.getSource()==b9)
        {
            Icon s1=b9.getIcon();
            if(b8.getIcon()==swap_icon)
            {
                b8.setIcon(s1);
                b9.setIcon(swap_icon);
            } else if(b6.getIcon()==swap_icon)
            {
                b6.setIcon(s1);
                b9.setIcon(swap_icon);
            }
            l4.setText("Your Clicks :"+(++counter)+" (Total Clicks :500.)");
            after = System.currentTimeMillis();
            long seconds = (after-before)/1000;

            l5.setText("Seconds :"+seconds+" (Total Time :500 sec)");
            if(counter==500)
            {
                JOptionPane.showMessageDialog(null,"You failed to complete this puzzle in given target","Game Over",JOptionPane.INFORMATION_MESSAGE);
                frame.setVisible(false);
                counter = 0;
            }
            if(b1.getIcon().equals(ic1) && b2.getIcon().equals(ic3) && b3.getIcon().equals(ic9) && b4.getIcon().equals(ic5) && b5.getIcon().equals(ic2) && b6.getIcon().equals(ic6) && b7.getIcon().equals(ic4) && b8.getIcon().equals(ic7) && b9.getIcon().equals(ic8))
            {
                JOptionPane.showMessageDialog(null,"Congratulations! You have completed this level in "+counter+" counters","LEVEL COMPLETED",JOptionPane.INFORMATION_MESSAGE);
                frame.setVisible(false);
                counter = 0;
                before = 0;
                after = 0;
            }
            if(seconds>=500)
            {
                JOptionPane.showMessageDialog(null,"You failed to complete this puzzle in given time","Game Over",JOptionPane.INFORMATION_MESSAGE);
                frame.setVisible(false);
                counter = 0;
                before = 0;
                after = 0;
            }

        }//end of if

        if(e.getSource()==sample){

            Icon s1=sample.getIcon();
            if(s1==sam_3)
            {
                sample.setIcon(sam_1);
                b1.setIcon(ic1);
                b2.setIcon(ic2);
                b3.setIcon(ic3);
                b4.setIcon(ic4);
                b5.setIcon(ic5);
                b6.setIcon(ic6);
                b7.setIcon(ic7);
                b8.setIcon(ic8);
                b9.setIcon(ic9);
                swap_icon=b9.getIcon();
                swap.setIcon(swap_1);
                counter = 0;
                before = 0;
                after = 0;

                if(b1.getIcon().equals(ic1) && b2.getIcon().equals(ic3) && b3.getIcon().equals(ic9) && b4.getIcon().equals(ic5) && b5.getIcon().equals(ic2) && b6.getIcon().equals(ic6) && b7.getIcon().equals(ic4) && b8.getIcon().equals(ic7) && b9.getIcon().equals(ic8))
                {
                    JOptionPane.showMessageDialog(null,"Congratulations! You have completed this level in "+counter+" counters","LEVEL COMPLETED",JOptionPane.INFORMATION_MESSAGE);
                    frame.setVisible(false);
                    counter = 0;
                    before = 0;
                    after = 0;
                }
            }//end of  if
            else if(s1==sam_1)
            {
                sample.setIcon(sam_2);
                b1.setIcon(ic11);
                b2.setIcon(ic12);
                b3.setIcon(ic13);
                b4.setIcon(ic14);
                b5.setIcon(ic15);
                b6.setIcon(ic16);
                b7.setIcon(ic17);
                b8.setIcon(ic18);
                b9.setIcon(ic19);
                swap_icon=b6.getIcon();
                swap.setIcon(swap_2);
                counter = 0;
                before = 0;
                after = 0;

                if(b1.getIcon().equals(ic1) && b2.getIcon().equals(ic3) && b3.getIcon().equals(ic9) && b4.getIcon().equals(ic5) && b5.getIcon().equals(ic2) && b6.getIcon().equals(ic6) && b7.getIcon().equals(ic4) && b8.getIcon().equals(ic7) && b9.getIcon().equals(ic8))
                {
                    JOptionPane.showMessageDialog(null,"Congratulations! You have completed this level in "+counter+" counters","LEVEL COMPLETED",JOptionPane.INFORMATION_MESSAGE);
                    frame.setVisible(false);
                    counter = 0;
                    before = 0;
                    after = 0;
                }
            }//end of  else
            else{
                sample.setIcon(sam_3);
                b1.setIcon(ic21);
                b2.setIcon(ic22);
                b3.setIcon(ic23);
                b4.setIcon(ic24);
                b5.setIcon(ic25);
                b6.setIcon(ic26);
                b7.setIcon(ic27);
                b8.setIcon(ic28);
                b9.setIcon(ic29);
                swap_icon=b6.getIcon();
                swap.setIcon(swap_3);
                counter = 0;
                before = 0;
                after = 0;

                if(b1.getIcon().equals(ic1) && b2.getIcon().equals(ic3) && b3.getIcon().equals(ic9) && b4.getIcon().equals(ic5) && b5.getIcon().equals(ic2) && b6.getIcon().equals(ic6) && b7.getIcon().equals(ic4) && b8.getIcon().equals(ic7) && b9.getIcon().equals(ic8))
                {
                    JOptionPane.showMessageDialog(null,"Congratulations! You have completed this level in "+counter+" counters","LEVEL COMPLETED",JOptionPane.INFORMATION_MESSAGE);
                    frame.setVisible(false);
                    counter = 0;
                    before = 0;
                    after = 0;
                }
            }//end of  else

        }
    }//end of actionPerformed

    public static void main(String[] args)
    {
        new Main(); // Calling the main constructor where all the game logic is implemented.
    }//end of main
}//end of class




