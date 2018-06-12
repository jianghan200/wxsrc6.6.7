package com.tencent.mm.plugin.backup.backuppcmodel;

import android.os.Looper;
import android.os.PowerManager.WakeLock;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;

public final class b
  extends com.tencent.mm.plugin.backup.a.d
{
  private static b gWq;
  private com.tencent.mm.plugin.backup.b.a gTG;
  private c gWr;
  private e gWs;
  private d gWt;
  private a gWu;
  private PowerManager.WakeLock wakeLock = null;
  
  public static b arV()
  {
    if (gWq == null)
    {
      b localb = new b();
      gWq = localb;
      a(localb);
    }
    return gWq;
  }
  
  public final void aqK()
  {
    gWq = null;
  }
  
  public final void aqQ()
  {
    ah.A(new b.1(this));
  }
  
  public final void aqR()
  {
    ah.A(new b.2(this));
  }
  
  public final c arW()
  {
    if (this.gWr == null) {
      this.gWr = new c();
    }
    return this.gWr;
  }
  
  public final e arX()
  {
    if (this.gWs == null) {
      this.gWs = new e();
    }
    return this.gWs;
  }
  
  public final d arY()
  {
    if (this.gWt == null) {
      this.gWt = new d();
    }
    return this.gWt;
  }
  
  public final a arZ()
  {
    if (this.gWu == null) {
      this.gWu = new a();
    }
    return this.gWu;
  }
  
  public final com.tencent.mm.plugin.backup.b.a arw()
  {
    if (this.gTG == null) {
      this.gTG = new com.tencent.mm.plugin.backup.b.a();
    }
    return this.gTG;
  }
  
  public final void l(Object... paramVarArgs)
  {
    ((Boolean)paramVarArgs[0]).booleanValue();
    paramVarArgs = arV().arW();
    new ag(Looper.getMainLooper()).postDelayed(new c.5(paramVarArgs), 100L);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/backup/backuppcmodel/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */