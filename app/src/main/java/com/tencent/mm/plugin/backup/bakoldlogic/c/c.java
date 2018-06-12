package com.tencent.mm.plugin.backup.bakoldlogic.c;

import com.tencent.mm.a.e;
import com.tencent.mm.ab.f;
import com.tencent.mm.bk.a;
import com.tencent.mm.jniinterface.AesEcb;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.backup.h.y;
import com.tencent.mm.pluginsdk.a.d;
import com.tencent.mm.protocal.c.ey;
import com.tencent.mm.protocal.c.ez;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.io.IOException;
import java.util.LinkedList;

public final class c
  extends com.tencent.mm.plugin.backup.f.b
{
  private static int progress;
  private int dHI = 0;
  private String filePath;
  public com.tencent.mm.plugin.backup.h.x gXK = new com.tencent.mm.plugin.backup.h.x();
  private y gXL = new y();
  private f has = null;
  private byte[] hat;
  private byte[] key;
  private int offset = 0;
  private int start = 0;
  private int type;
  
  public c(String paramString1, int paramInt, LinkedList<ey> paramLinkedList, String paramString2, f paramf, byte[] paramArrayOfByte)
  {
    this.gXK.hcI = paramString1;
    this.gXK.hcJ = paramInt;
    this.type = paramInt;
    if (paramInt == 1)
    {
      paramString1 = new ez();
      paramString1.hbG = paramLinkedList;
      paramString1.hbF = paramLinkedList.size();
    }
    for (;;)
    {
      try
      {
        this.hat = paramString1.toByteArray();
        this.dHI = this.hat.length;
        paramInt = this.dHI;
        this.gXK.hcK = (16 - paramInt % 16 + this.dHI);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BakSceneDataPush", "BakSceneDataPush init:%s  type:%d, localTotalLen:%d, reqDataSize:%d", new Object[] { this.gXK.hcI, Integer.valueOf(this.gXK.hcJ), Integer.valueOf(this.dHI), Integer.valueOf(this.gXK.hcK) });
        this.has = paramf;
        this.key = paramArrayOfByte;
        return;
      }
      catch (IOException paramString1)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BakSceneDataPush", "backList to buffer error");
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.BakSceneDataPush", paramString1, "", new Object[0]);
        continue;
      }
      this.filePath = paramString2;
      this.dHI = e.cm(paramString2);
    }
  }
  
  public static void setProgress(int paramInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BakSceneDataPush", "setProgress %d", new Object[] { Integer.valueOf(paramInt) });
    progress = paramInt;
  }
  
  public final a asj()
  {
    return this.gXL;
  }
  
  public final a ask()
  {
    return this.gXK;
  }
  
  public final boolean ass()
  {
    long l = 524288L;
    Object localObject2;
    Object localObject1;
    boolean bool;
    label73:
    int j;
    if (this.type == 1)
    {
      i = this.dHI;
      localObject2 = this.hat;
      this.start = this.offset;
      this.offset = (i + this.start);
      localObject1 = localObject2;
      if (this.key != null)
      {
        localObject1 = this.key;
        if (this.offset != this.dHI) {
          break label511;
        }
        bool = true;
        localObject1 = AesEcb.aesCryptEcb((byte[])localObject2, (byte[])localObject1, true, bool);
      }
      this.gXK.hcL = this.start;
      localObject2 = this.gXK;
      j = this.start;
      if (localObject1 != null) {
        break label517;
      }
    }
    label463:
    label511:
    label517:
    for (int i = 0;; i = localObject1.length)
    {
      ((com.tencent.mm.plugin.backup.h.x)localObject2).hcM = (i + j);
      this.gXK.hbs = new com.tencent.mm.bk.b((byte[])localObject1);
      this.gXK.hcO = progress;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BakSceneDataPush", "doSecne %s---total:%d, start:%d, offset:%d, data.len:%d", new Object[] { this.gXK.hcI, Integer.valueOf(this.dHI), Integer.valueOf(this.start), Integer.valueOf(this.offset), Integer.valueOf(this.gXK.hcM) });
      return super.ass();
      int k;
      if (this.dHI - this.offset > 524288L)
      {
        k = (int)l;
        i = 3;
        localObject1 = null;
      }
      for (;;)
      {
        j = i - 1;
        if ((i <= 0) || (localObject1 != null)) {
          break label463;
        }
        if (!bi.oW(this.filePath))
        {
          localObject1 = this.filePath;
          au.HU();
          if (((String)localObject1).startsWith(com.tencent.mm.model.c.Gg()))
          {
            localObject1 = this.filePath.substring(this.filePath.lastIndexOf("/") + 1);
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BakSceneDataPush", "md5:%s", new Object[] { localObject1 });
            localObject1 = ((com.tencent.mm.plugin.emoji.b.c)g.n(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().zi((String)localObject1);
            if ((localObject1 != null) && ((((EmojiInfo)localObject1).field_reserved4 & EmojiInfo.tcW) == EmojiInfo.tcW))
            {
              localObject2 = ((com.tencent.mm.plugin.emoji.b.c)g.n(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().a((EmojiInfo)localObject1);
              localObject1 = new byte[k];
              System.arraycopy(localObject2, this.offset, localObject1, 0, k);
              i = j;
              continue;
              l = this.dHI - this.offset;
              break;
            }
            localObject1 = e.e(this.filePath, this.offset, k);
            i = j;
            continue;
          }
        }
        localObject1 = e.e(this.filePath, this.offset, k);
        i = j;
      }
      localObject2 = localObject1;
      i = k;
      if (localObject1 != null) {
        break;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BakSceneDataPush", "read file error, offset%d, len:%d", new Object[] { Integer.valueOf(this.offset), Integer.valueOf(k) });
      localObject2 = localObject1;
      i = k;
      break;
      bool = false;
      break label73;
    }
  }
  
  public final int getType()
  {
    return 5;
  }
  
  public final void mI(int paramInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BakSceneDataPush", "onSceneEnd id:%s, type:%d, s:%d, e:%d, status:%d", new Object[] { this.gXL.hcI, Integer.valueOf(this.gXL.hcJ), Integer.valueOf(this.gXL.hcL), Integer.valueOf(this.gXL.hcM), Integer.valueOf(this.gXL.hcd) });
    if (this.gXL.hcd != 0)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BakSceneDataPush", "status:%d", new Object[] { Integer.valueOf(this.gXL.hcd) });
      g(4, this.gXL.hcd, "error");
      return;
    }
    this.has.a(this.gXK.hcM - this.gXK.hcL, this.dHI, this);
    if (this.offset == this.dHI)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BakSceneDataPush", "back complete: %s,  %d", new Object[] { this.gXK.hcI, Integer.valueOf(this.dHI) });
      g(0, 0, "success");
      return;
    }
    ass();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */