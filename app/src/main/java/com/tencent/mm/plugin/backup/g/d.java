package com.tencent.mm.plugin.backup.g;

import com.tencent.mm.kernel.g;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.model.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class d
  extends com.tencent.mm.plugin.backup.a.a
{
  private static String TAG = "MicroMsg.BackupStorageModel";
  private static d gYO;
  private b gYP;
  private a gYQ;
  
  public static d asG()
  {
    if (gYO == null)
    {
      d locald = new d();
      gYO = locald;
      a(locald);
    }
    return gYO;
  }
  
  public final void aqK()
  {
    gYO = null;
  }
  
  public final b asH()
  {
    if (this.gYP == null) {
      this.gYP = new b();
    }
    return this.gYP;
  }
  
  public final a asI()
  {
    if (this.gYQ == null) {
      this.gYQ = new a();
    }
    return this.gYQ;
  }
  
  public final void asJ()
  {
    x.i(TAG, "backupInitStorage");
    b localb = asH();
    au.HU();
    String str = c.Gq();
    au.HU();
    int i = c.Df();
    x.i("MicroMsg.BackupStorage", "setBackupStorage, accPath:%s, accUin:%d, caller:%s", new Object[] { str, Integer.valueOf(i), bi.cjd() });
    localb.uin = i;
    localb.dqp = str;
    au.HU();
    localb.dqq = c.FO();
    au.HU();
    localb.gYC = c.DT();
    au.HU();
    localb.gYD = c.FR();
    au.HU();
    localb.gYF = c.FW();
    au.HU();
    localb.gYE = c.FT();
    au.HU();
    localb.gYI = c.FZ();
    localb.gYG = com.tencent.mm.ak.o.Pf();
    localb.gYH = i.aEA().igx;
    localb.gYK = ((com.tencent.mm.plugin.chatroom.b.b)g.l(com.tencent.mm.plugin.chatroom.b.b.class)).Ga();
    localb.gYJ = com.tencent.mm.modelvideo.o.Ta();
    localb.gYL = com.tencent.mm.plugin.ac.a.bmg();
    localb.gYM = com.tencent.mm.plugin.ac.a.bmf();
    localb.gYN = com.tencent.mm.plugin.ac.a.asF();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/backup/g/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */