package com.tencent.mm.plugin.emoji.sync.a;

import android.util.Base64;
import com.tencent.mm.a.g;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.a.cs;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.emoji.e.f;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.e.n;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.emoji.model.i;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.io.File;
import java.util.Arrays;
import java.util.LinkedList;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class a
  extends com.tencent.mm.plugin.emoji.sync.d
{
  private EmojiInfo gZe;
  private String iiH;
  private String iiI;
  private String iil;
  private com.tencent.mm.plugin.emoji.sync.e ijL;
  private String ijM;
  private String ijN;
  private String ijO;
  private String ijP;
  private String ijQ;
  private com.tencent.mm.plugin.emoji.d.a ijR;
  private com.tencent.mm.ak.a.b.a ijS;
  
  public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8)
  {
    if (bi.oW(paramString1)) {
      x.e("MicroMsg.BKGLoader.EmojiDownloadTask", "[cpan] can not create task md5 is null.");
    }
    this.ijM = paramString1;
    this.ijN = paramString2;
    this.ijO = paramString3;
    this.iiH = paramString4;
    this.ijP = paramString5;
    this.ijQ = paramString6;
    this.iil = paramString7;
    this.iiI = paramString8;
    this.gZe = i.aEA().igx.Zy(this.ijM);
    if (this.gZe == null)
    {
      this.gZe = new EmojiInfo();
      this.gZe.field_md5 = this.ijM;
      this.gZe.field_cdnUrl = this.ijN;
      this.gZe.field_thumbUrl = this.ijO;
      this.gZe.field_designerID = this.iiH;
      this.gZe.field_encrypturl = this.ijP;
      this.gZe.field_aeskey = this.ijQ;
      this.gZe.field_groupId = this.iil;
    }
    if (!bi.oW(this.ijN))
    {
      this.gZe.field_cdnUrl = this.ijN;
      if (bi.oW(this.ijP)) {
        break label349;
      }
      this.gZe.field_encrypturl = this.ijP;
      this.gZe.field_aeskey = this.ijQ;
    }
    for (;;)
    {
      if (!bi.oW(this.iiH)) {
        this.gZe.field_designerID = this.iiH;
      }
      if (!bi.oW(this.iil)) {
        this.gZe.field_groupId = this.iil;
      }
      if (!bi.oW(this.ijO)) {
        this.gZe.field_thumbUrl = this.ijO;
      }
      if (!bi.oW(this.iiI)) {
        this.gZe.field_activityid = this.iiI;
      }
      this.ijR = new com.tencent.mm.plugin.emoji.d.a();
      this.ijS = new com.tencent.mm.ak.a.b.a();
      return;
      this.ijN = this.gZe.field_cdnUrl;
      break;
      label349:
      this.ijP = this.gZe.field_encrypturl;
      this.ijQ = this.gZe.field_aeskey;
    }
  }
  
  private void aFb()
  {
    x.i("MicroMsg.BKGLoader.EmojiDownloadTask", "disable to download emoji when cdn download failed.");
    cs localcs = new cs();
    localcs.bKf.bKg = this.ijM;
    localcs.bKf.bIH = 0;
    localcs.bKf.success = false;
    com.tencent.mm.sdk.b.a.sFg.m(localcs);
    if (this.gZe != null)
    {
      x.i("MicroMsg.BKGLoader.EmojiDownloadTask", "[cpan] this emoji is broken. md5 is:%s", new Object[] { this.gZe.Xh() });
      this.gZe.field_state = EmojiInfo.tcQ;
      this.gZe.field_catalog = EmojiInfo.tcB;
      i.aEA().igx.p(this.gZe);
    }
  }
  
  public final void a(com.tencent.mm.plugin.emoji.sync.e parame)
  {
    this.ijL = parame;
  }
  
  public final void cancel() {}
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject != null) && ((paramObject instanceof a)))
    {
      paramObject = (a)paramObject;
      if ((!bi.oW(this.ijM)) && (!bi.oW(((a)paramObject).ijM)) && (this.ijM.equals(((a)paramObject).ijM))) {
        return true;
      }
    }
    return false;
  }
  
  public final String getKey()
  {
    return this.ijM;
  }
  
  public final void run()
  {
    Object localObject1;
    if (this.ijL != null)
    {
      this.ijL.zI(this.ijM);
      x.i("MicroMsg.BKGLoader.EmojiDownloadTask", "emoji md5:%s cndUrl:%s thumbUrl:%s field_designerID:%s field_encrypturl:%s field_groupId:%s", new Object[] { this.gZe.Xh(), this.gZe.field_cdnUrl, this.gZe.field_thumbUrl, this.gZe.field_designerID, this.gZe.field_encrypturl, this.gZe.field_groupId });
      if ((bi.oW(this.ijN)) && (bi.oW(this.ijP))) {
        break label971;
      }
      localObject1 = this.ijN;
      if ((bi.oW(this.ijP)) || (bi.oW(this.ijQ))) {
        break label1028;
      }
      localObject1 = this.ijP;
    }
    label795:
    label907:
    label971:
    label1028:
    for (int i = 1;; i = 0)
    {
      long l = System.currentTimeMillis();
      Object localObject5 = this.ijR.mb((String)localObject1);
      if ((localObject5 == null) || (bi.bC(((com.tencent.mm.ak.a.d.b)localObject5).data)))
      {
        x.d("MicroMsg.BKGLoader.EmojiDownloadTask", "get image data suuse time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        aFb();
      }
      for (;;)
      {
        if (!bi.oW(this.gZe.field_thumbUrl))
        {
          localObject4 = this.ijR.mb(this.gZe.field_thumbUrl);
          if (localObject4 != null)
          {
            localObject1 = this.ijS;
            localObject2 = this.gZe.field_thumbUrl;
            localObject4 = ((com.tencent.mm.ak.a.d.b)localObject4).data;
            localObject5 = this.gZe.field_thumbUrl;
            ((com.tencent.mm.ak.a.b.a)localObject1).a((String)localObject2, (byte[])localObject4, f.o(this.gZe.cnF() + "_cover", new Object[0]));
          }
        }
        return;
        x.w("MicroMsg.BKGLoader.EmojiDownloadTask", "call back is null.");
        break;
        x.d("MicroMsg.BKGLoader.EmojiDownloadTask", "get image data use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        Object localObject4 = ((com.tencent.mm.ak.a.d.b)localObject5).data;
        Object localObject2 = localObject4;
        if (i != 0) {}
        try
        {
          localObject2 = ((com.tencent.mm.ak.a.d.b)localObject5).data;
          localObject5 = Base64.decode(Base64.encodeToString(bi.WP(this.ijQ), 0).getBytes(), 0);
          SecretKeySpec localSecretKeySpec = new SecretKeySpec((byte[])localObject5, "AES");
          Cipher localCipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
          localCipher.init(2, localSecretKeySpec, new IvParameterSpec(Arrays.copyOf((byte[])localObject5, localObject5.length)));
          localObject2 = localCipher.doFinal((byte[])localObject2);
          localObject4 = com.tencent.mm.sdk.platformtools.c.decodeByteArray((byte[])localObject2, 10, 10);
          boolean bool = this.ijS.a((String)localObject1, (byte[])localObject2, f.o(this.gZe.cnF(), new Object[0]));
          localObject1 = new File(this.gZe.cnF());
          if ((localObject4 == null) || (!bool) || (!((File)localObject1).exists())) {
            break label907;
          }
          localObject4 = g.m((File)localObject1);
          if ((!bi.oW((String)localObject4)) && (((String)localObject4).equalsIgnoreCase(this.gZe.Xh())))
          {
            this.gZe.field_size = localObject2.length;
            this.gZe.field_state = EmojiInfo.tcP;
            this.gZe.field_temp = 0;
            this.gZe.field_catalog = EmojiInfo.tcH;
            j = EmojiLogic.ak((byte[])localObject2);
            this.gZe.field_type = j;
            j = i.aEA().igx.cnM();
            if (j < n.aEj())
            {
              j = n.aEj();
              this.gZe.field_idx = j;
              i.aEA().igx.p(this.gZe);
              localObject1 = i.aEA().igy;
              if (!com.tencent.mm.storage.emotion.a.cnl()) {
                i.aEA().igy.cnm();
              }
              localObject1 = new cs();
              ((cs)localObject1).bKf.bKg = this.ijM;
              ((cs)localObject1).bKf.bIH = 0;
              ((cs)localObject1).bKf.success = true;
              com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject1);
              if (i == 0) {
                break label795;
              }
              com.tencent.mm.plugin.emoji.c.cA(7L);
              com.tencent.mm.plugin.emoji.c.cA(4L);
              com.tencent.mm.plugin.emoji.c.a(this.ijM, 3, 0, 0, this.iil, 0, this.iiH);
              com.tencent.mm.plugin.emoji.e.e.aDM().c(this.gZe, true);
            }
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            int j;
            x.w("MicroMsg.BKGLoader.EmojiDownloadTask", "encrypt file failed. %s", new Object[] { bi.i(localException) });
            Object localObject3 = localObject4;
            continue;
            j += 1;
            continue;
            com.tencent.mm.plugin.emoji.c.cA(2L);
            com.tencent.mm.plugin.emoji.c.cA(4L);
            com.tencent.mm.plugin.emoji.c.a(this.ijM, 2, 0, 0, this.iil, 1, this.iiH);
          }
          if (((File)localObject1).exists()) {
            ((File)localObject1).delete();
          }
          aFb();
          if (i != 0)
          {
            com.tencent.mm.plugin.emoji.c.cA(8L);
            com.tencent.mm.plugin.emoji.c.a(this.ijM, 3, 0, 1, this.iil, 1, this.iiH);
            continue;
          }
          com.tencent.mm.plugin.emoji.c.cA(5L);
          com.tencent.mm.plugin.emoji.c.a(this.ijM, 2, 0, 1, this.iil, 1, this.iiH);
        }
        continue;
        aFb();
        if (i != 0)
        {
          com.tencent.mm.plugin.emoji.c.cA(8L);
          com.tencent.mm.plugin.emoji.c.a(this.ijM, 3, 0, 1, this.iil, 1, this.iiH);
        }
        else
        {
          com.tencent.mm.plugin.emoji.c.cA(3L);
          com.tencent.mm.plugin.emoji.c.a(this.ijM, 2, 1, 1, this.iil, 1, this.iiH);
          continue;
          h.mEJ.a(164L, 10L, 1L, false);
          localObject1 = new LinkedList();
          ((LinkedList)localObject1).add(this.ijM);
          au.DF().a(new com.tencent.mm.plugin.emoji.f.e((LinkedList)localObject1), 0);
          aFb();
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/emoji/sync/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */