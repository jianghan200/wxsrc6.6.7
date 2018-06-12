package com.tencent.mm.plugin.luckymoney.f2f;

import android.media.SoundPool;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public final class a
{
  public volatile boolean gYf = false;
  public SoundPool kMT = new SoundPool(2, 3, 0);
  Hashtable<String, Integer> kMU = new Hashtable();
  Map<Integer, Boolean> kMV = new HashMap();
  
  public final void eR(String paramString)
  {
    if (this.kMU.containsKey(paramString))
    {
      int i = ((Integer)this.kMU.get(paramString)).intValue();
      if ((i >= 0) && (this.kMV.containsKey(Integer.valueOf(i))) && (((Boolean)this.kMV.get(Integer.valueOf(i))).booleanValue())) {
        this.kMT.play(i, 1.0F, 1.0F, 0, 0, 1.0F);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/f2f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */