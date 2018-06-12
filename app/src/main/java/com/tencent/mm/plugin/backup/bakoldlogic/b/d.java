package com.tencent.mm.plugin.backup.bakoldlogic.b;

import com.tencent.mm.plugin.backup.a.a;
import java.util.HashMap;

public final class d
  extends a
{
  private static String TAG = "MicroMsg.BakOldItemFactory";
  private static d gZd;
  private HashMap<Integer, j> gVR;
  
  public static d asM()
  {
    if (gZd == null)
    {
      d locald = new d();
      gZd = locald;
      a(locald);
    }
    return gZd;
  }
  
  public final void aqK()
  {
    gZd = null;
  }
  
  public final j mN(int paramInt)
  {
    if (this.gVR == null)
    {
      this.gVR = new HashMap();
      this.gVR.put(Integer.valueOf(3), new e());
      this.gVR.put(Integer.valueOf(47), new c());
      this.gVR.put(Integer.valueOf(49), new b());
      this.gVR.put(Integer.valueOf(34), new h());
      Object localObject = new g();
      this.gVR.put(Integer.valueOf(43), localObject);
      this.gVR.put(Integer.valueOf(44), localObject);
      this.gVR.put(Integer.valueOf(62), localObject);
      localObject = new f();
      this.gVR.put(Integer.valueOf(48), localObject);
      this.gVR.put(Integer.valueOf(42), localObject);
      this.gVR.put(Integer.valueOf(66), localObject);
      this.gVR.put(Integer.valueOf(10000), localObject);
      this.gVR.put(Integer.valueOf(1), localObject);
      this.gVR.put(Integer.valueOf(37), localObject);
      this.gVR.put(Integer.valueOf(40), localObject);
      this.gVR.put(Integer.valueOf(50), localObject);
    }
    return (j)this.gVR.get(Integer.valueOf(paramInt));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */