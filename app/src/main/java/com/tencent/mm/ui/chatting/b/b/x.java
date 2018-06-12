package com.tencent.mm.ui.chatting.b.b;

import android.content.Intent;
import android.view.ContextMenu;
import android.view.MenuItem;
import com.tencent.mm.plugin.mmsight.SightCaptureResult;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.chatting.b.u;

public abstract interface x
  extends u
{
  public abstract void A(String paramString1, int paramInt, String paramString2);
  
  public abstract void a(ContextMenu paramContextMenu, int paramInt, bd parambd);
  
  public abstract void a(SightCaptureResult paramSightCaptureResult);
  
  public abstract boolean a(MenuItem paramMenuItem, bd parambd);
  
  public abstract boolean aS(bd parambd);
  
  public abstract boolean f(int paramInt1, int paramInt2, Intent paramIntent);
  
  public abstract void t(int paramInt1, int paramInt2, String paramString);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/chatting/b/b/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */