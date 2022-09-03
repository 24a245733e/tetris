package com.tetris.gui;

import com.tetris.ui.*;

import java.util.ArrayList;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerExample implements KeyListener, Observable
{

    private ArrayList<Observer> obsList;

    public KeyListenerExample()
    {
        obsList = new ArrayList();
        System.out.println(String.format("Key Listener alive"));
    }
    public void NotifyObservers(KeyEvent keyEvent)
    {
       for(Observer obs : obsList)
       {
           obs.update(keyEvent);
           System.out.println(String.format("obs %s", obs));
       }
   }
   public void AddObserver(Observer obs)
   {
       if (obs != null)
          obsList.add(obs);
        System.out.println(String.format("observer added: %s", obs));
   }

   public void DelObserver(Observer obs)
   {
       if (obs != null)
          obsList.remove(obs);
   }
   @Override
   public void keyPressed(KeyEvent e)
   {
       NotifyObservers(e);
       // System.out.println(String.format("Key pressed %s", e.getKeyCode()));
   }
	@Override
	public void keyReleased(KeyEvent e)
	{}
	@Override
	public void keyTyped(KeyEvent e)
	{}
}
