package com.tencent.matrix.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class a
  extends c
{
  private final long brh = 86400000L;
  private final SharedPreferences bri;
  private final SharedPreferences.Editor brj;
  private final HashMap<String, Long> brk;
  
  public a(Context paramContext, String paramString, c.a parama)
  {
    super(parama);
    this.bri = paramContext.getSharedPreferences(paramString + com.tencent.matrix.d.c.aC(paramContext), 0);
    this.brk = new HashMap();
    long l1 = System.currentTimeMillis();
    this.brj = this.bri.edit();
    paramContext = new HashSet(this.bri.getAll().keySet()).iterator();
    while (paramContext.hasNext())
    {
      paramString = (String)paramContext.next();
      long l2 = this.bri.getLong(paramString, 0L);
      if ((l2 <= 0L) || (l1 - l2 > this.brh)) {
        this.brj.remove(paramString);
      } else {
        this.brk.put(paramString, Long.valueOf(l2));
      }
    }
    this.brj.apply();
  }
  
  public final void ca(String paramString)
  {
    if (paramString == null) {}
    while (this.brk.containsKey(paramString)) {
      return;
    }
    long l = System.currentTimeMillis();
    this.brk.put(paramString, Long.valueOf(l));
    this.brj.putLong(paramString, l).apply();
  }
  
  public final boolean cb(String paramString)
  {
    if (!this.brk.containsKey(paramString)) {
      return false;
    }
    long l = ((Long)this.brk.get(paramString)).longValue();
    if ((l <= 0L) || (System.currentTimeMillis() - l > this.brh))
    {
      this.brj.remove(paramString).apply();
      this.brk.remove(paramString);
      return false;
    }
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */