package com.tencent.mm.plugin.sns.data;

import com.tencent.mm.protocal.c.bon;
import java.util.concurrent.ConcurrentHashMap;

public final class d
{
  public ConcurrentHashMap<String, CharSequence> nkP = new ConcurrentHashMap();
  
  public final void a(bon parambon, CharSequence paramCharSequence)
  {
    this.nkP.put(parambon.smh + "-" + parambon.smk + "-" + parambon.jSA, paramCharSequence);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/sns/data/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */