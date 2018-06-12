package com.tencent.mm.plugin.backup.c;

import android.os.PowerManager.WakeLock;
import com.tencent.mm.sdk.platformtools.ah;

public final class b
  extends com.tencent.mm.plugin.backup.a.d
{
  private static b gTC;
  private d gTD;
  private c gTE;
  private a gTF;
  private com.tencent.mm.plugin.backup.b.a gTG;
  String gTH = "tickit";
  private PowerManager.WakeLock wakeLock = null;
  
  public static b arv()
  {
    if (gTC == null)
    {
      b localb = new b();
      gTC = localb;
      a(localb);
    }
    return gTC;
  }
  
  public final void aqK()
  {
    gTC = null;
  }
  
  public final void aqQ()
  {
    ah.A(new b.2(this));
  }
  
  public final void aqR()
  {
    ah.A(new b.3(this));
  }
  
  public final com.tencent.mm.plugin.backup.b.a arw()
  {
    if (this.gTG == null) {
      this.gTG = new com.tencent.mm.plugin.backup.b.a();
    }
    return this.gTG;
  }
  
  public final d arx()
  {
    if (this.gTD == null) {
      this.gTD = new d();
    }
    return this.gTD;
  }
  
  public final c ary()
  {
    if (this.gTE == null) {
      this.gTE = new c();
    }
    return this.gTE;
  }
  
  public final a arz()
  {
    if (this.gTF == null) {
      this.gTF = new a();
    }
    return this.gTF;
  }
  
  public final void l(Object... paramVarArgs)
  {
    ah.A(new b.1(this, (String)paramVarArgs[0]));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/backup/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */