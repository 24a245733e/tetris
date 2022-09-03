package com.tetris.ui;

import java.awt.event.KeyEvent;

public interface Observable
{
   public void NotifyObservers(KeyEvent keyEvent);
}
