package com.tencent.mm.plugin.backup.bakoldlogic.c;

import com.tencent.mm.a.e;
import com.tencent.mm.ab.f;
import com.tencent.mm.jniinterface.AesEcb;
import com.tencent.mm.plugin.backup.h.ad;
import com.tencent.mm.plugin.backup.h.ae;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;

public final class d
  extends com.tencent.mm.plugin.backup.f.b
{
  private static int progress;
  private int dHI;
  private f has = null;
  private ad hau = new ad();
  private ae hav = new ae();
  private String haw;
  public String id;
  private byte[] key;
  private int offset = 0;
  private int start = 0;
  
  public d(String paramString1, String paramString2, int paramInt1, int paramInt2, f paramf, byte[] paramArrayOfByte)
  {
    if (paramInt1 == 1) {}
    for (this.haw = (paramString1 + "backupItem/" + com.tencent.mm.plugin.backup.bakoldlogic.a.a.wv(paramString2));; this.haw = (paramString1 + "backupMeida/" + com.tencent.mm.plugin.backup.bakoldlogic.a.a.wv(paramString2)))
    {
      this.id = paramString2;
      this.hau.hcI = paramString2;
      this.hau.hcJ = paramInt1;
      this.dHI = paramInt2;
      x.i("MicroMsg.BakSceneRestoreData", "BakSceneRestoreData init, %s, type:%d, totalLen:%d", new Object[] { this.hau.hcI, Integer.valueOf(this.hau.hcJ), Integer.valueOf(this.dHI) });
      this.has = paramf;
      this.key = paramArrayOfByte;
      return;
    }
  }
  
  public static void setProgress(int paramInt)
  {
    x.i("MicroMsg.BakSceneRestoreData", "setProgress %d", new Object[] { Integer.valueOf(paramInt) });
    progress = paramInt;
  }
  
  public final com.tencent.mm.bk.a asj()
  {
    return this.hav;
  }
  
  public final com.tencent.mm.bk.a ask()
  {
    return this.hau;
  }
  
  public final boolean ass()
  {
    long l = 524288L;
    x.i("MicroMsg.BakSceneRestoreData", "doSecne");
    int i = this.dHI;
    if (this.hau.hcJ == 2) {
      if (this.dHI - this.offset > 524288L) {
        i = (int)l;
      }
    }
    for (;;)
    {
      this.start = this.offset;
      this.offset = (i + this.start);
      this.hau.hcL = this.start;
      this.hau.hcM = this.offset;
      this.hau.hcO = progress;
      return super.ass();
      l = this.dHI - this.offset;
      break;
    }
  }
  
  public final int getType()
  {
    return 7;
  }
  
  public final void mI(int paramInt)
  {
    x.i("MicroMsg.BakSceneRestoreData", "onSceneEnd id:%s, type:%d, s:%d, e:%d, status:%d", new Object[] { this.hav.hcI, Integer.valueOf(this.hav.hcJ), Integer.valueOf(this.hav.hcL), Integer.valueOf(this.hav.hcM), Integer.valueOf(this.hav.hcd) });
    if ((this.hav.hcd != 0) && (this.hav.hcd != 10))
    {
      g(4, this.hav.hcd, "error");
      return;
    }
    if ((this.hav.hcL != this.start) || (this.hav.hcM != this.offset))
    {
      x.e("MicroMsg.BakSceneRestoreData", "err local:%d, %d;   server:%d,%d", new Object[] { Integer.valueOf(this.start), Integer.valueOf(this.offset), Integer.valueOf(this.hav.hcL), Integer.valueOf(this.hav.hcM) });
      g(3, -1, "error");
      return;
    }
    this.has.a(this.hau.hcM - this.hau.hcL, this.dHI, this);
    byte[] arrayOfByte = this.hav.hbs.lR;
    Object localObject;
    boolean bool;
    if (this.key != null)
    {
      localObject = this.key;
      if (this.offset == this.dHI)
      {
        bool = true;
        arrayOfByte = AesEcb.aesCryptEcb(arrayOfByte, (byte[])localObject, false, bool);
      }
    }
    for (;;)
    {
      localObject = this.haw;
      String str = this.id;
      File localFile = new File((String)localObject + str);
      long l1;
      label337:
      long l2;
      if (localFile.exists())
      {
        l1 = localFile.length();
        e.b((String)localObject, str, arrayOfByte);
        localFile = new File((String)localObject + str);
        if (!localFile.exists()) {
          break label525;
        }
        l2 = localFile.length();
        label391:
        if (l1 == l2)
        {
          x.e("MicroMsg.BakSceneRestoreData", "append failed and try again:%s", new Object[] { (String)localObject + str });
          e.b((String)localObject, str, arrayOfByte);
        }
        if (arrayOfByte != null) {
          break label531;
        }
      }
      label525:
      label531:
      for (paramInt = 0;; paramInt = arrayOfByte.length)
      {
        x.i("MicroMsg.BakSceneRestoreData", "onSceneEnd appendbuf len:%d", new Object[] { Integer.valueOf(paramInt) });
        if (this.offset != this.dHI) {
          break label538;
        }
        x.i("MicroMsg.BakSceneRestoreData", "recover cmoplete:%s  %d", new Object[] { this.id, Integer.valueOf(this.dHI) });
        g(0, 0, "success");
        return;
        bool = false;
        break;
        l1 = 0L;
        break label337;
        l2 = 0L;
        break label391;
      }
      label538:
      ass();
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */