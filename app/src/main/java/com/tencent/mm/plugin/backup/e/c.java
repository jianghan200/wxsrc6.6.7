package com.tencent.mm.plugin.backup.e;

import java.util.HashMap;

public final class c
  extends com.tencent.mm.plugin.backup.a.a
{
  private static String TAG = "MicroMsg.BackupItemFactory";
  private static c gVQ;
  private HashMap<Integer, l> gVR;
  
  public static c arT()
  {
    if (gVQ == null)
    {
      c localc = new c();
      gVQ = localc;
      a(localc);
    }
    return gVQ;
  }
  
  public final void aqK()
  {
    gVQ = null;
  }
  
  public final l mE(int paramInt)
  {
    if (this.gVR == null)
    {
      this.gVR = new HashMap();
      this.gVR.put(Integer.valueOf(3), new d());
      this.gVR.put(Integer.valueOf(47), new b());
      this.gVR.put(Integer.valueOf(49), new a());
      this.gVR.put(Integer.valueOf(34), new g());
      Object localObject = new f();
      this.gVR.put(Integer.valueOf(43), localObject);
      this.gVR.put(Integer.valueOf(44), localObject);
      this.gVR.put(Integer.valueOf(62), localObject);
      localObject = new e();
      this.gVR.put(Integer.valueOf(48), localObject);
      this.gVR.put(Integer.valueOf(42), localObject);
      this.gVR.put(Integer.valueOf(66), localObject);
      this.gVR.put(Integer.valueOf(10000), localObject);
      this.gVR.put(Integer.valueOf(1), localObject);
      this.gVR.put(Integer.valueOf(37), localObject);
      this.gVR.put(Integer.valueOf(40), localObject);
      this.gVR.put(Integer.valueOf(50), localObject);
    }
    return (l)this.gVR.get(Integer.valueOf(paramInt));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/backup/e/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */