package com.tencent.mm.plugin.wear.model.f;

import com.tencent.mm.plugin.wear.model.a;
import com.tencent.mm.plugin.wear.model.e.r;
import com.tencent.mm.plugin.wear.model.h;
import com.tencent.mm.protocal.c.cfg;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public final class l
  extends c
{
  private int pJt;
  private String talker;
  
  public l(int paramInt, String paramString)
  {
    this.pJt = paramInt;
    this.talker = paramString;
  }
  
  public final String getName()
  {
    return "WearVoipControllerTask";
  }
  
  protected final void send()
  {
    switch (this.pJt)
    {
    default: 
      return;
    case 20010: 
      cfg localcfg = new cfg();
      localcfg.szk = this.talker;
      localcfg.hcS = h.PP(this.talker);
      try
      {
        a.bSl();
        r.b(this.pJt, localcfg.toByteArray(), false);
        return;
      }
      catch (IOException localIOException)
      {
        return;
      }
    }
    try
    {
      a.bSl();
      r.b(this.pJt, this.talker.getBytes("utf8"), false);
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException) {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/f/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */