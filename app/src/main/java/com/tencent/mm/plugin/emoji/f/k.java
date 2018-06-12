package com.tencent.mm.plugin.emoji.f;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.bt.h;
import com.tencent.mm.g.a.mj;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.emoji.g.c.a;
import com.tencent.mm.plugin.emoji.model.i;
import com.tencent.mm.protocal.c.ada;
import com.tencent.mm.protocal.c.adb;
import com.tencent.mm.protocal.c.aqi;
import com.tencent.mm.protocal.c.tm;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class k
  extends com.tencent.mm.ab.l
  implements com.tencent.mm.network.k
{
  public final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e doG;
  private c.a iiK;
  private boolean iiL = false;
  private mj iiM = null;
  public String iil = "";
  
  public k(String paramString)
  {
    b.a locala = new b.a();
    locala.dIG = new ada();
    locala.dIH = new adb();
    locala.uri = "/cgi-bin/micromsg-bin/getemotiondesc";
    locala.dIF = 521;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    this.iil = paramString;
    this.iiM = new mj();
  }
  
  public k(String paramString, c.a parama)
  {
    b.a locala = new b.a();
    locala.dIG = new ada();
    locala.dIH = new adb();
    locala.uri = "/cgi-bin/micromsg-bin/getemotiondesc";
    locala.dIF = 521;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    this.iil = paramString;
    this.iiK = parama;
    this.iiL = true;
    this.iiM = new mj();
  }
  
  private int aEN()
  {
    return ((adb)this.diG.dIE.dIL).rHw;
  }
  
  protected final int Cc()
  {
    return 50;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    x.d("MicroMsg.emoji.NetSceneGetEmotionDesc", "getEmotionDesc %s ", new Object[] { this.iil });
    this.doG = parame1;
    ((ada)this.diG.dID.dIL).rem = this.iil;
    if (TextUtils.isEmpty(this.iil))
    {
      x.w("MicroMsg.emoji.NetSceneGetEmotionDesc", "get emoji desc faild. product id is null.");
      return -1;
    }
    return a(parame, this.diG, this);
  }
  
  protected final int a(q paramq)
  {
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.storage.emotion.c localc;
    Object localObject1;
    int i;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      if (this.iiL) {
        if ((aEN() & 0x1) == 1) {
          com.tencent.mm.plugin.emoji.g.c.a(this.iiK);
        }
      }
      for (;;)
      {
        this.doG.a(paramInt2, paramInt3, paramString, this);
        return;
        x.i("MicroMsg.emoji.NetSceneGetEmotionDesc", "new emotion is can't download. ignore");
        continue;
        paramArrayOfByte = ((adb)this.diG.dIE.dIL).hbG;
        localc = i.aEA().igz;
        localObject1 = this.iil;
        paramInt1 = ((adb)this.diG.dIE.dIL).rHu;
        i = aEN();
        if (localc.tcX != null) {
          localc.tcX.edit().putLong("274544" + (String)localObject1, System.currentTimeMillis()).commit();
        }
        if ((paramArrayOfByte != null) && (paramArrayOfByte.size() > 0)) {
          break;
        }
        label176:
        if ((paramArrayOfByte == null) || (paramArrayOfByte.size() <= 0)) {
          break label535;
        }
        x.i("MicroMsg.emoji.NetSceneGetEmotionDesc", "end getEmojiDesc, productId: %s ", new Object[] { this.iil });
        this.iiM.bXk.bKk = this.iil;
        a.sFg.m(this.iiM);
      }
      paramq = null;
      if (!(localc.diF instanceof h)) {
        break label588;
      }
      paramq = (h)localc.diF;
    }
    label535:
    label588:
    for (long l = paramq.dO(Thread.currentThread().getId());; l = -1L)
    {
      localc.diF.delete("EmojiInfoDesc", "groupId=?", new String[] { localObject1 });
      com.tencent.mm.storage.emotion.b localb = new com.tencent.mm.storage.emotion.b();
      localb.field_groupId = ((String)localObject1);
      localb.field_click_flag = paramInt1;
      localb.field_download_flag = i;
      localObject1 = paramArrayOfByte.iterator();
      Object localObject3;
      do
      {
        Object localObject2;
        while (!((Iterator)localObject2).hasNext())
        {
          if (!((Iterator)localObject1).hasNext()) {
            break;
          }
          localObject2 = (tm)((Iterator)localObject1).next();
          localb.field_md5 = ((tm)localObject2).rwk;
          localObject2 = ((tm)localObject2).hbG.iterator();
        }
        localObject3 = (aqi)((Iterator)localObject2).next();
        localb.field_desc = ((aqi)localObject3).jOS;
        localb.field_lang = ((aqi)localObject3).jRj;
        localb.field_md5_lang = (localb.field_md5 + localb.field_lang);
        localObject3 = localb.wH();
      } while (localc.diF.replace("EmojiInfoDesc", "md5_lang", (ContentValues)localObject3) >= 0L);
      if (paramq == null) {
        break label176;
      }
      paramq.gp(l);
      break label176;
      localc.diF.replace("EmojiInfoDesc", "md5_lang", localb.wH());
      if (paramq == null) {
        break label176;
      }
      paramq.gp(l);
      break label176;
      break;
      x.i("MicroMsg.emoji.NetSceneGetEmotionDesc", "end getEmojiDesc, & errType:%d, errCode:%d, productId: %s ", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), this.iil });
      if (!this.iiL) {
        break;
      }
      x.i("MicroMsg.emoji.NetSceneGetEmotionDesc", "new emotion get des failed. ignore");
      break;
    }
  }
  
  public final int getType()
  {
    return 521;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/emoji/f/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */