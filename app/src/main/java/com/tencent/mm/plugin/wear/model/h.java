package com.tencent.mm.plugin.wear.model;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.su;
import com.tencent.mm.g.a.su.b;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.au;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelvoice.n;
import com.tencent.mm.pluginsdk.a.d;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.i.a;
import com.tencent.mm.protocal.c.cds;
import com.tencent.mm.protocal.c.cej;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bd.a;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.y.g.a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

public final class h
{
  public static byte[] N(Bitmap paramBitmap)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream);
    return localByteArrayOutputStream.toByteArray();
  }
  
  public static final Bitmap PO(String paramString)
  {
    Bitmap localBitmap = a.b.ccZ().cJ(paramString);
    if (localBitmap == null)
    {
      paramString = com.tencent.mm.aa.q.Kp().c(paramString, false, false);
      x.d("MicroMsg.Wear.WearUtil", "avatar fullpath: %s", new Object[] { paramString });
      return com.tencent.mm.aa.f.jW(paramString);
    }
    x.d("MicroMsg.Wear.WearUtil", "get wear avatar from cache: %s", new Object[] { paramString });
    return localBitmap;
  }
  
  public static String PP(String paramString)
  {
    au.HU();
    ab localab = com.tencent.mm.model.c.FR().Yg(paramString);
    String str;
    if (s.fq(paramString))
    {
      str = ad.getContext().getString(R.l.chatting_roominfo_noname);
      paramString = r.a(localab, paramString);
      if ((!localab.field_username.equals(paramString)) && (!bi.oW(paramString))) {
        return paramString;
      }
    }
    else
    {
      return r.a(localab, paramString);
    }
    return str;
  }
  
  public static byte[] PQ(String paramString)
  {
    paramString = "lib" + paramString + ".so";
    return FileOp.e(new File(new File(com.tencent.mm.loader.stub.b.duM, "lib"), paramString).getAbsolutePath(), 0, -1);
  }
  
  public static boolean aEo()
  {
    PackageManager localPackageManager = ad.getContext().getPackageManager();
    try
    {
      localPackageManager.getPackageInfo("com.google.android.wearable.app.cn", 1);
      return true;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    return false;
  }
  
  public static boolean aEp()
  {
    PackageManager localPackageManager = ad.getContext().getPackageManager();
    try
    {
      localPackageManager.getPackageInfo("com.google.android.wearable.app", 1);
      return true;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    return false;
  }
  
  public static cej aa(com.tencent.mm.storage.bd parambd)
  {
    cej localcej = new cej();
    localcej.szl = parambd.field_msgId;
    localcej.szq = parambd.field_createTime;
    localcej.jQd = 1;
    localcej.szr = true;
    Object localObject2;
    Object localObject1;
    label92:
    int i;
    if (parambd.field_isSend == 1)
    {
      localcej.rTW = PP(com.tencent.mm.model.q.GF());
      localcej.szk = com.tencent.mm.model.q.GF();
      localObject2 = null;
      if (parambd.isSystem())
      {
        localObject1 = ad.getContext().getString(R.l.notification_sys_content);
        localcej.jQd = 3;
        parambd = (com.tencent.mm.storage.bd)localObject1;
        if (localObject1 == null) {
          parambd = ad.getContext().getString(R.l.notification_simple_tip);
        }
        localcej.jSA = parambd;
        return localcej;
      }
    }
    else if (s.fq(parambd.field_talker))
    {
      localObject1 = parambd.field_talker;
      i = com.tencent.mm.model.bd.iA(parambd.field_content);
      if (i == -1) {
        break label1534;
      }
      localObject2 = parambd.field_content.substring(0, i).trim();
      if ((localObject2 == null) || (((String)localObject2).length() <= 0)) {
        break label1534;
      }
      localObject1 = localObject2;
    }
    label1183:
    label1289:
    label1343:
    label1432:
    label1437:
    label1450:
    label1531:
    label1534:
    for (;;)
    {
      localcej.rTW = PP((String)localObject1);
      localcej.szk = ((String)localObject1);
      break;
      localcej.rTW = PP(parambd.field_talker);
      localcej.szk = parambd.field_talker;
      break;
      if (parambd.ckA())
      {
        localObject1 = ad.getContext().getString(R.l.notification_img_content);
        localcej.jQd = 4;
        break label92;
      }
      if (parambd.isText())
      {
        if ((s.fq(parambd.field_talker)) && (parambd.field_isSend != 1))
        {
          i = com.tencent.mm.model.bd.iA(parambd.field_content);
          if (i != -1)
          {
            localObject1 = parambd.field_content.substring(i + 1).trim();
            break label92;
          }
          localObject1 = parambd.field_content;
          break label92;
        }
        localObject1 = parambd.field_content;
        break label92;
      }
      if (parambd.ckz())
      {
        localObject1 = ad.getContext().getString(R.l.notification_voice_content);
        localcej.jQd = 6;
        localcej.szr = com.tencent.mm.modelvoice.q.F(parambd);
        float f = com.tencent.mm.modelvoice.q.bD(new n(parambd.field_content).time);
        localcej.szs = new com.tencent.mm.bk.b(ad.getContext().getString(R.l.fmt_time_length, new Object[] { Integer.valueOf((int)f) }).getBytes());
        break label92;
      }
      if (parambd.cmj())
      {
        localObject1 = ad.getContext().getString(R.l.notification_video_content);
        break label92;
      }
      if (parambd.cmk())
      {
        localObject1 = ad.getContext().getString(R.l.notification_short_video_content);
        break label92;
      }
      if (parambd.cmb())
      {
        g.a locala = g.a.gp(parambd.field_content);
        localObject1 = localObject2;
        if (locala == null) {
          break label92;
        }
        if (locala.dyc.startsWith("wxpay://c2cbizmessagehandler/hongbao/receivehongbao"))
        {
          localcej.jQd = 5;
          if (parambd.field_isSend == 1)
          {
            localObject1 = locala.dxW;
            break label92;
          }
          localObject1 = locala.dxV;
          break label92;
        }
        if (parambd.field_isSend == 1) {}
        for (parambd = locala.dxW;; parambd = locala.dxV)
        {
          localObject1 = ad.getContext().getString(R.l.notification_c2c_template, new Object[] { parambd });
          break;
        }
      }
      if (parambd.cmc())
      {
        localObject1 = ad.getContext().getString(R.l.notification_c2c_new_year_lucky_content);
        localcej.jQd = 5;
        break label92;
      }
      if (parambd.aQm())
      {
        parambd = g.a.gp(parambd.field_content);
        localObject1 = localObject2;
        if (parambd == null) {
          break label92;
        }
        switch (parambd.type)
        {
        case 7: 
        case 9: 
        case 11: 
        case 12: 
        case 14: 
        case 17: 
        case 18: 
        default: 
          localObject1 = localObject2;
          break;
        case 2: 
          localObject1 = String.format(ad.getContext().getString(R.l.notification_img_content), new Object[0]);
          break;
        case 5: 
          localObject1 = String.format(ad.getContext().getString(R.l.notification_app_link_content), new Object[] { bi.aG(parambd.title, "") });
          break;
        case 3: 
          localObject1 = String.format(ad.getContext().getString(R.l.notification_app_music_content), new Object[] { bi.aG(parambd.title, "") });
          break;
        case 6: 
          localObject1 = String.format(ad.getContext().getString(R.l.notification_app_file_content), new Object[] { bi.aG(parambd.title, "") });
          break;
        case 4: 
          localObject1 = String.format(ad.getContext().getString(R.l.notification_app_video_content), new Object[] { bi.aG(parambd.title, "") });
          break;
        case 19: 
          localObject1 = String.format(ad.getContext().getString(R.l.notification_app_record_content), new Object[] { bi.aG(parambd.title, "") });
          break;
        case 15: 
          localObject1 = String.format(ad.getContext().getString(R.l.notification_app_emoji_share_content), new Object[] { bi.aG(parambd.title, "") });
          break;
        case 10: 
          localObject1 = String.format(ad.getContext().getString(R.l.notification_app_product_content), new Object[] { bi.aG(parambd.title, "") });
          break;
        case 13: 
          localObject1 = String.format(ad.getContext().getString(R.l.notification_app_mall_product_content), new Object[] { bi.aG(parambd.title, "") });
          break;
        case 20: 
          localObject1 = String.format(ad.getContext().getString(R.l.notification_app_tv_content), new Object[] { bi.aG(parambd.title, "") });
          break;
        case 16: 
          localObject1 = String.format(ad.getContext().getString(R.l.notification_card_content), new Object[] { bi.aG(parambd.title, "") });
          break;
        case 8: 
          localObject1 = ad.getContext().getString(R.l.notification_custom_emoji_content, new Object[] { bi.aG(parambd.title, "") });
          break;
        }
      }
      if (parambd.cml())
      {
        localObject1 = ad.getContext().getString(R.l.notification_emoji_content);
        if (((com.tencent.mm.plugin.emoji.b.c)g.n(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr() == null) {
          break label1531;
        }
        parambd = ((com.tencent.mm.plugin.emoji.b.c)g.n(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().zi(parambd.field_imgPath);
        if (bi.oW(((com.tencent.mm.plugin.emoji.b.c)g.n(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().zf(parambd.Xh())))
        {
          localObject1 = ad.getContext().getString(R.l.notification_emoji_content);
          localObject2 = new cds();
          ((cds)localObject2).rwt = parambd.Xh();
          if (!parambd.isGif()) {
            break label1289;
          }
          ((cds)localObject2).hcE = 1;
        }
      }
      try
      {
        for (;;)
        {
          localcej.szs = new com.tencent.mm.bk.b(((cds)localObject2).toByteArray());
          localcej.jQd = 2;
          break;
          localObject1 = "[" + ((com.tencent.mm.plugin.emoji.b.c)g.n(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().zf(parambd.Xh()) + "]";
          break label1183;
          ((cds)localObject2).hcE = 2;
        }
        if (parambd.aQo())
        {
          localObject1 = ad.getContext().getString(R.l.notification_location_content);
          break label92;
        }
        if ((!parambd.cme()) && (!parambd.cmf()))
        {
          if (parambd.getType() == 64)
          {
            i = 1;
            if (i == 0) {
              break label1450;
            }
          }
        }
        else if (!parambd.field_content.equals(com.tencent.mm.storage.bd.tbx))
        {
          parambd = parambd.field_content;
          localObject1 = new su();
          ((su)localObject1).cdE.bOh = 1;
          ((su)localObject1).cdE.content = parambd;
          a.sFg.m((com.tencent.mm.sdk.b.b)localObject1);
          if (((su)localObject1).cdF.type != 3) {
            break label1432;
          }
        }
        for (i = 1;; i = 0)
        {
          if (i == 0) {
            break label1437;
          }
          localObject1 = ad.getContext().getString(R.l.notification_voip_voice_content);
          break;
          i = 0;
          break label1343;
        }
        localObject1 = ad.getContext().getString(R.l.notification_voip_content);
        break label92;
        if (parambd.cmi())
        {
          au.HU();
          parambd = com.tencent.mm.model.c.FT().GR(parambd.field_content);
          localObject1 = String.format(ad.getContext().getString(R.l.notification_card_content), new Object[] { parambd.getDisplayName() });
          break label92;
        }
        localObject1 = localObject2;
        if (parambd.getType() != -1879048186) {
          break label92;
        }
        localObject1 = ad.getContext().getString(R.l.notification_app_location_share_content);
      }
      catch (IOException parambd)
      {
        for (;;) {}
      }
      break label92;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wear/model/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */