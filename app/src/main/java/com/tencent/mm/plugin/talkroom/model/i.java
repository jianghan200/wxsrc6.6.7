package com.tencent.mm.plugin.talkroom.model;

import android.os.Looper;
import com.tencent.mm.ax.d;
import com.tencent.mm.sdk.platformtools.ag;
import java.util.LinkedList;
import java.util.List;

public final class i
{
  List<d> cWy = new LinkedList();
  ag handler = new ag(Looper.getMainLooper());
  
  public final void St()
  {
    i.1 local1 = new i.1(this);
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      local1.run();
      return;
    }
    this.handler.post(local1);
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString)
  {
    paramString = new i.9(this, paramInt1, paramInt2, paramString);
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      paramString.run();
      return;
    }
    this.handler.post(paramString);
  }
  
  public final void i(String paramString, int paramInt1, int paramInt2)
  {
    paramString = new i.5(this, paramString, paramInt1, paramInt2);
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      paramString.run();
      return;
    }
    this.handler.post(paramString);
  }
  
  public final void iA(int paramInt)
  {
    i.7 local7 = new i.7(this, paramInt);
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      local7.run();
      return;
    }
    this.handler.post(local7);
  }
  
  public final void nr(String paramString)
  {
    paramString = new i.8(this, paramString);
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      paramString.run();
      return;
    }
    this.handler.post(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/talkroom/model/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */