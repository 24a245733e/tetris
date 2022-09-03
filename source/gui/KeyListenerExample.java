package com.tetris.gui;


import java.util.ArrayList;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
// import java.util.Arrays;
public class KeyListenerExample implements KeyListener, Observable
{

    private ArrayList<Observer> obsList;

   public KeyListenerExample()
   {
      obsList = new ArrayList();
   }
	@Override
	public void keyPressed(KeyEvent e)
	{
        NotifyObservers(e);
        // System.out.println(String.format("Key pressed %s", e.getKeyCode()));
    }
    public void NotifyObservers(KeyEvent keyEvent)
   {
       for(Observer obs : obsList)
       {
           obs.update(keyEvent);
           // System.out.println(String.format("obs %s", obs));
       }
   }
   public void AddObserver(Observer obs)
   {
       if (obs != null)
          obsList.add(obs);
   }

   public void DelObserver(Observer obs)
   {
       if (obs != null)
          obsList.remove(obs);
   }
	@Override
	public void keyReleased(KeyEvent e)
	{}
	@Override
	public void keyTyped(KeyEvent e)
	{}
}
