package android.support.v7.app;

import android.app.UiModeManager;
import android.content.Context;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Window;
import android.view.Window.Callback;

final class i
  extends h
{
  private final UiModeManager Eu;
  
  i(Context paramContext, Window paramWindow, d paramd)
  {
    super(paramContext, paramWindow, paramd);
    this.Eu = ((UiModeManager)paramContext.getSystemService("uimode"));
  }
  
  final Window.Callback a(Window.Callback paramCallback)
  {
    return new a(paramCallback);
  }
  
  final int aG(int paramInt)
  {
    if ((paramInt == 0) && (this.Eu.getNightMode() == 0)) {
      return -1;
    }
    return super.aG(paramInt);
  }
  
  final class a
    extends h.a
  {
    a(Window.Callback paramCallback)
    {
      super(paramCallback);
    }
    
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback)
    {
      return null;
    }
    
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback, int paramInt)
    {
      if (i.this.Es) {}
      switch (paramInt)
      {
      default: 
        return super.onWindowStartingActionMode(paramCallback, paramInt);
      }
      return a(paramCallback);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/app/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */