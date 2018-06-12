package com.tencent.mm.plugin.sns.h;

import com.tencent.mm.modelsns.b;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.Vector;

public abstract class g
{
  private Vector<b> nxP = new Vector();
  
  public final b b(b paramb)
  {
    this.nxP.add(paramb);
    return paramb;
  }
  
  public final b bR(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    try
    {
      Iterator localIterator = this.nxP.iterator();
      while (localIterator.hasNext())
      {
        b localb = (b)localIterator.next();
        if (paramObject.equals(localb.egQ))
        {
          this.nxP.remove(localb);
          return localb;
        }
      }
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.Ss_log_base_helper", "report by key " + localException.getMessage() + " " + paramObject);
    }
    return null;
  }
  
  public final boolean c(b paramb)
  {
    Iterator localIterator = this.nxP.iterator();
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      if (localb.egS == paramb.egS) {
        this.nxP.remove(localb);
      }
    }
    for (boolean bool = true;; bool = false)
    {
      this.nxP.add(paramb);
      return bool;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sns/h/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */