package com.tencent.mm.ui.chatting;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.mm.aa.j;
import com.tencent.mm.aa.k;
import com.tencent.mm.aa.q;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.s;
import com.tencent.mm.modelappbrand.b.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import com.tencent.mm.y.g.a;
import com.tencent.mm.y.i;
import com.tencent.mm.y.m;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;

public final class l
{
  public static g.a a(String paramString, m paramm)
  {
    g.a locala = new g.a();
    locala.title = paramm.title;
    locala.description = paramm.dzA;
    locala.type = 33;
    locala.dyS = paramm.dzD;
    locala.dyR = paramm.dzE;
    locala.dyT = paramm.dzH;
    locala.dyZ = paramm.dzG;
    locala.dza = paramm.dzF;
    locala.dyV = "";
    locala.dyU = 2;
    locala.url = paramm.url;
    locala.dzb = paramm.dzJ;
    locala.bZM = ("wxapp_" + paramm.dzH + paramm.dzE);
    locala.bZG = paramm.dzD;
    locala.bZH = paramm.dzK;
    paramm = new com.tencent.mm.y.a();
    paramm.dvC = false;
    paramm.dvD = "";
    locala.a(paramm);
    if (bi.oW(locala.thumburl))
    {
      paramString = q.KH().kc(paramString);
      if (paramString != null) {
        locala.thumburl = paramString.Kx();
      }
    }
    return locala;
  }
  
  public static void b(String paramString1, g.a parama, String paramString2)
  {
    Object localObject2 = null;
    for (;;)
    {
      try
      {
        byte[] arrayOfByte = new byte[0];
        Object localObject1 = localObject2;
        if (!bi.oW(paramString2)) {
          if (!paramString2.startsWith("http://"))
          {
            localObject1 = localObject2;
            if (!paramString2.startsWith("https://")) {}
          }
          else
          {
            localObject1 = b.Ka().a(paramString2, null);
          }
        }
        if ((localObject1 != null) && (!((Bitmap)localObject1).isRecycled()))
        {
          x.i("MicroMsg.ChattingEditModeSendToAppBrand", "thumb image is not null ");
          paramString2 = new ByteArrayOutputStream();
          ((Bitmap)localObject1).compress(Bitmap.CompressFormat.PNG, 100, paramString2);
          paramString2 = paramString2.toByteArray();
          if (s.fq(paramString1))
          {
            i = 1;
            com.tencent.mm.pluginsdk.model.app.l.a(parama, parama.dyT, parama.title, paramString1, null, paramString2);
            h.mEJ.h(14127, new Object[] { parama.dyT, parama.dyS, parama.dyR, parama.title, parama.description, "", parama.url, Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(i), paramString1 });
          }
        }
        else
        {
          x.e("MicroMsg.ChattingEditModeSendToAppBrand", "thumb image is null");
          paramString2 = arrayOfByte;
          continue;
        }
        int i = 0;
      }
      catch (Exception paramString1)
      {
        x.printErrStackTrace("MicroMsg.ChattingEditModeSendToAppBrand", paramString1, "", new Object[0]);
        x.e("MicroMsg.ChattingEditModeSendToAppBrand", "retransmit sigle app msg error : %s", new Object[] { paramString1.getLocalizedMessage() });
        return;
      }
    }
  }
  
  public static boolean e(bd parambd, int paramInt)
  {
    if (parambd == null) {}
    int i;
    do
    {
      do
      {
        do
        {
          return false;
        } while (!parambd.cky());
        parambd = ((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.biz.a.a.class)).wS(parambd.field_content).dzs;
      } while (bi.cX(parambd));
      if (paramInt >= 0)
      {
        i = paramInt;
        if (paramInt < parambd.size()) {}
      }
      else
      {
        i = 0;
      }
    } while (!i.gr(((m)parambd.get(i)).dzD));
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/chatting/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */