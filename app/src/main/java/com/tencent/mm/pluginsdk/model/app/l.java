package com.tencent.mm.pluginsdk.model.app;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory.Options;
import android.util.DisplayMetrics;
import com.tencent.mm.g.a.sc;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.q;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.mm.opensdk.modelmsg.WXDesignerSharedObject;
import com.tencent.mm.opensdk.modelmsg.WXEmojiObject;
import com.tencent.mm.opensdk.modelmsg.WXEmojiPageSharedObject;
import com.tencent.mm.opensdk.modelmsg.WXEmojiSharedObject;
import com.tencent.mm.opensdk.modelmsg.WXFileObject;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject;
import com.tencent.mm.opensdk.modelmsg.WXMusicObject;
import com.tencent.mm.opensdk.modelmsg.WXTextObject;
import com.tencent.mm.opensdk.modelmsg.WXVideoObject;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.KVStatHelper;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.y.g.a;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public final class l
{
  private static ac qzW;
  
  public static int BJ(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return paramInt;
    }
    return 49;
  }
  
  public static boolean SX(String paramString)
  {
    if (bi.oW(paramString)) {}
    while (paramString.equals("0:0")) {
      return false;
    }
    return true;
  }
  
  public static int SY(String paramString)
  {
    g.a locala = g.a.gp(paramString);
    if (locala == null) {
      return -1;
    }
    if (!SX(locala.bGP)) {
      return -1;
    }
    b localb = new b();
    long l = bi.getLong(locala.bGP, -1L);
    if (l != -1L)
    {
      ao.asF().b(l, localb);
      paramString = localb;
      if (localb.sKx != l)
      {
        localb = ao.asF().SR(locala.bGP);
        if (localb != null)
        {
          paramString = localb;
          if (localb.field_mediaSvrId.equals(locala.bGP)) {}
        }
        else
        {
          return -1;
        }
      }
    }
    else
    {
      localb = ao.asF().SR(locala.bGP);
      if (localb != null)
      {
        paramString = localb;
        if (localb.field_mediaSvrId.equals(locala.bGP)) {}
      }
      else
      {
        return -1;
      }
    }
    if (paramString.field_totalLen == 0L) {
      return -1;
    }
    return (int)(paramString.field_offset * 100L / paramString.field_totalLen);
  }
  
  public static b SZ(String paramString)
  {
    b localb2 = new b();
    if (bi.oW(paramString)) {
      return null;
    }
    x.i("MicroMsg.AppMsgLogic", "getAppAttachInfoByAttachId %s", new Object[] { paramString });
    long l = bi.getLong(paramString, -1L);
    b localb1;
    if (l != -1L)
    {
      ao.asF().b(l, localb2);
      localb1 = localb2;
      if (localb2.sKx != l)
      {
        localb2 = ao.asF().SR(paramString);
        if (localb2 != null)
        {
          localb1 = localb2;
          if (localb2.field_mediaSvrId.equals(paramString)) {}
        }
        else
        {
          x.i("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfoByAttachId set appAttachInfo null 1");
          localb1 = null;
        }
      }
    }
    for (;;)
    {
      x.i("MicroMsg.AppMsgLogic", "getAppAttachInfoByAttachId %s id %s", new Object[] { paramString, Long.valueOf(l) });
      return localb1;
      localb2 = ao.asF().SR(paramString);
      if (localb2 != null)
      {
        localb1 = localb2;
        if (localb2.field_mediaSvrId.equals(paramString)) {}
      }
      else
      {
        x.i("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfoByAttachId set appAttachInfo null 2");
        localb1 = null;
      }
    }
  }
  
  public static int a(long paramLong, String paramString, keep_SceneResult paramkeep_SceneResult)
  {
    au.HU();
    com.tencent.mm.storage.bd localbd = com.tencent.mm.model.c.FT().dW(paramLong);
    if (localbd.field_msgId != paramLong)
    {
      x.e("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Ac() + " getmsgFailed id:" + paramLong);
      return 0 - com.tencent.mm.compatible.util.g.getLine();
    }
    g.a locala = g.a.gp(localbd.field_content);
    if (locala == null)
    {
      x.e("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Ac() + " getmsgFailed id:" + paramLong);
      return 0 - com.tencent.mm.compatible.util.g.getLine();
    }
    locala.bGP = paramString;
    localbd.setContent(g.a.a(locala, locala.bGP, paramkeep_SceneResult));
    au.HU();
    com.tencent.mm.model.c.FT().a(localbd.field_msgId, localbd);
    paramkeep_SceneResult = ao.cbY().fI(paramLong);
    if (paramkeep_SceneResult != null)
    {
      paramkeep_SceneResult.field_xml = localbd.field_content;
      ao.cbY().c(paramkeep_SceneResult, new String[] { "msgId" });
    }
    paramkeep_SceneResult = ao.asF().fH(paramLong);
    paramkeep_SceneResult.field_mediaSvrId = paramString;
    paramkeep_SceneResult.field_offset = paramkeep_SceneResult.field_totalLen;
    ao.asF().c(paramkeep_SceneResult, new String[0]);
    return 0;
  }
  
  public static int a(WXMediaMessage paramWXMediaMessage, String paramString1, String paramString2, String paramString3, int paramInt, String paramString4)
  {
    return a(paramWXMediaMessage, paramString1, paramString2, paramString3, paramInt, paramString4, null);
  }
  
  public static int a(WXMediaMessage paramWXMediaMessage, String paramString1, String paramString2, String paramString3, int paramInt, String paramString4, String paramString5)
  {
    g.a locala = new g.a();
    locala.appId = paramString1;
    locala.appName = paramString2;
    locala.dwr = paramInt;
    return a(locala, paramWXMediaMessage, paramString3, paramString4, paramString5);
  }
  
  public static int a(g.a parama, WXMediaMessage paramWXMediaMessage, String paramString)
  {
    return a(parama, paramWXMediaMessage, paramString, null, null);
  }
  
  private static int a(g.a parama, WXMediaMessage paramWXMediaMessage, String paramString1, String paramString2, String paramString3)
  {
    Object localObject2 = b(parama, paramWXMediaMessage, paramString2);
    x.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Ac() + "summerbig content url:" + parama.url + " lowUrl:" + parama.dwn + " attachlen:" + parama.dwo + " attachid:" + parama.bGP + " attach file:" + (String)localObject2);
    Object localObject1 = System.currentTimeMillis();
    if (!bi.oW((String)localObject2))
    {
      localObject1 = a((String)localObject1, parama, (String)localObject2);
      if (localObject1 == null) {
        return 0 - com.tencent.mm.compatible.util.g.getLine();
      }
      localObject2 = com.tencent.mm.sdk.platformtools.c.VZ((String)localObject2);
      if (localObject2 != null)
      {
        parama.dwJ = ((BitmapFactory.Options)localObject2).outWidth;
        parama.dwI = ((BitmapFactory.Options)localObject2).outHeight;
      }
    }
    for (;;)
    {
      com.tencent.mm.storage.bd localbd = new com.tencent.mm.storage.bd();
      boolean bool;
      if ((paramWXMediaMessage.thumbData != null) && (paramWXMediaMessage.thumbData.length > 0))
      {
        if ((paramWXMediaMessage.thumbData.length <= 32768) || (paramWXMediaMessage.getType() == 36)) {
          break label488;
        }
        if (parama.type != 2) {
          break label482;
        }
        bool = true;
        localObject2 = com.tencent.mm.ak.o.Pf().a(6, paramWXMediaMessage.thumbData, bool, Bitmap.CompressFormat.JPEG);
        label238:
        x.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Ac() + " summerbig thumbData MsgInfo path:" + (String)localObject2);
        if (!bi.oW((String)localObject2)) {
          localbd.eq((String)localObject2);
        }
      }
      if (localObject1 != null) {
        parama.bGP = ((b)localObject1).sKx;
      }
      paramString1 = bi.F(paramString1.split(",")).iterator();
      for (;;)
      {
        if (!paramString1.hasNext()) {
          break label794;
        }
        localObject2 = (String)paramString1.next();
        parama.dwq = paramString2;
        localbd.setContent(g.a.a(parama, null, null));
        localbd.setStatus(1);
        localbd.ep((String)localObject2);
        localbd.ay(com.tencent.mm.model.bd.iD((String)localObject2));
        localbd.eX(1);
        localbd.setType(d(parama));
        if (com.tencent.mm.ac.f.eZ(localbd.field_talker)) {
          localbd.dt(com.tencent.mm.ac.a.e.Ir());
        }
        au.HU();
        long l = com.tencent.mm.model.c.FT().T(localbd);
        if (l < 0L)
        {
          x.e("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Ac() + " summerbig insert msg failed :" + l);
          return 0 - com.tencent.mm.compatible.util.g.getLine();
          label482:
          bool = false;
          break;
          label488:
          localObject2 = com.tencent.mm.ak.o.Pf().g(6, paramWXMediaMessage.thumbData);
          break label238;
        }
        x.i("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.getLine() + " summerbig new msg inserted to db , local id = " + l);
        localbd.setMsgId(l);
        localObject2 = new com.tencent.mm.y.g();
        ((com.tencent.mm.y.g)localObject2).field_xml = localbd.field_content;
        ((com.tencent.mm.y.g)localObject2).field_title = paramWXMediaMessage.title;
        ((com.tencent.mm.y.g)localObject2).field_type = paramWXMediaMessage.mediaObject.type();
        ((com.tencent.mm.y.g)localObject2).field_description = paramWXMediaMessage.description;
        ((com.tencent.mm.y.g)localObject2).field_msgId = l;
        ((com.tencent.mm.y.g)localObject2).field_source = parama.appName;
        ao.cbY().b((com.tencent.mm.sdk.e.c)localObject2);
        if (localObject1 != null)
        {
          ((b)localObject1).field_msgInfoId = l;
          ((b)localObject1).field_status = 101L;
          x.i("MicroMsg.AppMsgLogic", "summerbig sendAppMsg update attInfo field_msgInfoId[%d], field_status[%d], systemRowid[%d], type[%d]", new Object[] { Long.valueOf(((b)localObject1).field_msgInfoId), Long.valueOf(((b)localObject1).field_status), Long.valueOf(((b)localObject1).sKx), Integer.valueOf(((com.tencent.mm.y.g)localObject2).field_type) });
          ao.asF().c((com.tencent.mm.sdk.e.c)localObject1, new String[0]);
          if (!bi.oW(paramString3)) {
            ao.cca().u(((b)localObject1).field_msgInfoId, paramString3);
          }
          ao.cca().run();
        }
        else
        {
          x.i("MicroMsg.AppMsgLogic", "summerbig sendAppMsg dosceneSendAppMsg attInfo[%s], msgId[%d], sessionId[%s], type[%d]", new Object[] { localObject1, Long.valueOf(l), paramString3, Integer.valueOf(((com.tencent.mm.y.g)localObject2).field_type) });
          ao.cca();
          an.a.v(l, paramString3);
        }
      }
      label794:
      return 0;
      localObject1 = null;
    }
  }
  
  public static int a(g.a parama, String paramString1, String paramString2, String paramString3, String paramString4, byte[] paramArrayOfByte)
  {
    return a(parama, paramString1, paramString2, paramString3, paramString4, paramArrayOfByte, null);
  }
  
  public static int a(g.a parama, String paramString1, String paramString2, String paramString3, String paramString4, byte[] paramArrayOfByte, String paramString5)
  {
    return a(parama, paramString1, paramString2, paramString3, paramString4, paramArrayOfByte, paramString5, "");
  }
  
  public static int a(g.a parama, String paramString1, String paramString2, String paramString3, String paramString4, byte[] paramArrayOfByte, String paramString5, String paramString6)
  {
    x.i("MicroMsg.AppMsgLogic", "summerbig sendAppMsg attachFilePath[%s], content[%s]", new Object[] { paramString4, parama });
    String str = null;
    Object localObject = System.currentTimeMillis();
    if (!bi.oW(paramString4))
    {
      paramString4 = a((String)localObject, parama, paramString4);
      str = paramString4;
      if (paramString4 == null) {
        return 0 - com.tencent.mm.compatible.util.g.getLine();
      }
    }
    localObject = new com.tencent.mm.storage.bd();
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0))
    {
      if ((parama.type != 33) && (parama.type != 36)) {
        break label432;
      }
      int i = (int)(com.tencent.mm.sdk.platformtools.c.chu().density * 240.0F);
      int j = (int)(com.tencent.mm.sdk.platformtools.c.chu().density * 240.0F);
      paramString4 = com.tencent.mm.ak.o.Pf().a(paramArrayOfByte, Bitmap.CompressFormat.JPEG, i, j);
      x.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Ac() + " thumbData MsgInfo path:" + paramString4);
      if (!bi.oW(paramString4))
      {
        ((com.tencent.mm.storage.bd)localObject).eq(paramString4);
        x.d("MicroMsg.AppMsgLogic", "new thumbnail saved, path" + paramString4);
      }
    }
    if (str != null) {
      parama.bGP = str.sKx;
    }
    ((com.tencent.mm.storage.bd)localObject).setContent(g.a.a(parama, null, null));
    ((com.tencent.mm.storage.bd)localObject).setStatus(1);
    ((com.tencent.mm.storage.bd)localObject).ep(paramString3);
    ((com.tencent.mm.storage.bd)localObject).ay(com.tencent.mm.model.bd.iD(paramString3));
    ((com.tencent.mm.storage.bd)localObject).eX(1);
    ((com.tencent.mm.storage.bd)localObject).setType(d(parama));
    if (com.tencent.mm.ac.f.eZ(((cm)localObject).field_talker))
    {
      ((com.tencent.mm.storage.bd)localObject).dt(com.tencent.mm.ac.a.e.Ir());
      x.d("MicroMsg.AppMsgLogic", "NetSceneSendMsg:MsgSource:%s", new Object[] { ((cm)localObject).cqb });
    }
    au.HU();
    long l = com.tencent.mm.model.c.FT().T((com.tencent.mm.storage.bd)localObject);
    x.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Ac() + " msginfo insert id: " + l);
    label432:
    boolean bool;
    if (l < 0L)
    {
      x.e("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Ac() + "insert msg failed :" + l);
      return 0 - com.tencent.mm.compatible.util.g.getLine();
      if (parama.type == 2) {}
      for (bool = true;; bool = false)
      {
        paramString4 = com.tencent.mm.ak.o.Pf().a(6, paramArrayOfByte, bool, Bitmap.CompressFormat.PNG);
        break;
      }
    }
    x.i("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.getLine() + " new msg inserted to db , local id = " + l);
    ((com.tencent.mm.storage.bd)localObject).setMsgId(l);
    paramString3 = new com.tencent.mm.y.g();
    paramString3.field_xml = ((cm)localObject).field_content;
    paramString3.field_appId = paramString1;
    paramString3.field_title = parama.title;
    paramString3.field_type = parama.type;
    paramString3.field_description = parama.description;
    paramString3.field_msgId = l;
    paramString3.field_source = paramString2;
    ao.cbY().b(paramString3);
    if (str == null)
    {
      bool = true;
      x.i("MicroMsg.AppMsgLogic", "summerbig sendAppMsg attInfo is null[%b]", new Object[] { Boolean.valueOf(bool) });
      if (str == null) {
        break label674;
      }
      str.field_msgInfoId = l;
      str.field_status = 101L;
      ao.asF().c(str, new String[0]);
      if ((parama.type == 2) || (!bi.oW(paramString5))) {
        ao.cca().u(l, paramString5);
      }
      ao.cca().run();
    }
    for (;;)
    {
      return 0;
      bool = false;
      break;
      label674:
      ao.cca();
      an.a.d(l, paramString5, paramString6);
    }
  }
  
  public static b a(String paramString1, long paramLong, int paramInt1, String paramString2, String paramString3, int paramInt2)
  {
    b localb = new b();
    localb.field_fileFullPath = paramString1;
    localb.field_appId = paramString2;
    localb.field_sdkVer = paramInt1;
    localb.field_mediaSvrId = paramString3;
    localb.field_totalLen = paramInt2;
    localb.field_status = 101L;
    localb.field_isUpload = false;
    localb.field_createTime = bi.VF();
    localb.field_lastModifyTime = bi.VE();
    localb.field_msgInfoId = paramLong;
    localb.field_netTimes = 0L;
    return localb;
  }
  
  public static b a(String paramString1, g.a parama, String paramString2)
  {
    x.i("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Ac() + " summerbig buildUploadAttachInfo clientAppDataId:" + paramString1 + " attach file :" + paramString2);
    Object localObject = paramString2.replace("//", "/");
    if (((String)localObject).startsWith(com.tencent.mm.compatible.util.e.duM))
    {
      x.e("MicroMsg.AppMsgLogic", "summerbig Error attach path:%s", new Object[] { localObject });
      return null;
    }
    localObject = new b();
    ((b)localObject).field_totalLen = parama.dwo;
    ((b)localObject).field_fileFullPath = paramString2;
    ((b)localObject).field_sdkVer = parama.sdkVer;
    ((b)localObject).field_appId = parama.appId;
    ((b)localObject).field_clientAppDataId = paramString1;
    ((b)localObject).field_type = parama.type;
    ((b)localObject).field_status = 200L;
    ((b)localObject).field_isUpload = true;
    ((b)localObject).field_createTime = bi.VF();
    ((b)localObject).field_lastModifyTime = bi.VE();
    ((b)localObject).field_mediaSvrId = bi.VF();
    ao.asF().b((com.tencent.mm.sdk.e.c)localObject);
    x.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Ac() + " summerbig buildUploadAttachInfo file:" + ((b)localObject).field_fileFullPath + " rowid:" + ((b)localObject).sKx + " clientAppDataId:" + ((b)localObject).field_clientAppDataId);
    if (((b)localObject).sKx < 0L)
    {
      x.e("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Ac() + " summerbig uploadAttach insert appattach info failed :" + ((b)localObject).sKx);
      return null;
    }
    return (b)localObject;
  }
  
  public static String a(String paramString1, long paramLong, int paramInt1, String paramString2, String paramString3, int paramInt2, int paramInt3, int paramInt4)
  {
    b localb = new b();
    localb.field_fileFullPath = paramString1;
    localb.field_appId = paramString2;
    localb.field_sdkVer = paramInt1;
    localb.field_mediaSvrId = paramString3;
    localb.field_totalLen = paramInt2;
    localb.field_status = 101L;
    localb.field_isUpload = false;
    localb.field_createTime = bi.VF();
    localb.field_lastModifyTime = bi.VE();
    localb.field_msgInfoId = paramLong;
    localb.field_netTimes = 0L;
    localb.field_type = paramInt3;
    x.i("MicroMsg.AppMsgLogic", "summerbig initDownloadAttach ret[%b], rowid[%d], field_totalLen[%d], type[%d], isLargeFile[%d], destFile[%s], stack[%s]", new Object[] { Boolean.valueOf(ao.asF().b(localb)), Long.valueOf(localb.sKx), Long.valueOf(localb.field_totalLen), Long.valueOf(localb.field_type), Integer.valueOf(paramInt4), paramString1, bi.cjd() });
    return paramString3;
  }
  
  public static void a(com.tencent.mm.storage.bd parambd, a parama)
  {
    Object localObject = g.a.gp(parambd.field_content);
    if (localObject == null) {
      x.e("MicroMsg.AppMsgLogic", "parse msgContent error, %s", new Object[] { parambd.field_content });
    }
    do
    {
      return;
      if ((bi.oW(((g.a)localObject).bGP)) && (!bi.oW(((g.a)localObject).dwD)))
      {
        x.e("MicroMsg.AppMsgLogic", "msgContent format error, %s", new Object[] { parambd.field_content });
        ((g.a)localObject).bGP = ((g.a)localObject).dwD.hashCode();
      }
      localObject = ((g.a)localObject).bGP;
    } while ((a(parambd, am((String)localObject, parambd.field_msgId))) || (!e((String)localObject, parambd)));
    qzW = new ac(parambd.field_msgId, (String)localObject, new com.tencent.mm.ab.f()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, com.tencent.mm.ab.l paramAnonymousl)
      {
        if (this.qzX != null) {
          this.qzX.eu(paramAnonymousInt1, paramAnonymousInt2);
        }
      }
    });
    au.DF().a(qzW, 0);
  }
  
  public static boolean a(com.tencent.mm.storage.bd parambd, b paramb)
  {
    if ((paramb == null) || (!new File(paramb.field_fileFullPath).exists())) {}
    while ((!paramb.aSc()) && ((parambd.field_isSend != 1) || (!paramb.field_isUpload))) {
      return false;
    }
    return true;
  }
  
  public static void ae(com.tencent.mm.storage.bd parambd)
  {
    Object localObject4 = g.a.gp(parambd.field_content);
    if (localObject4 == null)
    {
      x.e("MicroMsg.AppMsgLogic", "resend app message error: app content null");
      return;
    }
    Object localObject5 = SZ(((g.a)localObject4).bGP);
    Object localObject2 = "";
    Object localObject1 = localObject2;
    if (localObject5 != null)
    {
      localObject1 = localObject2;
      if (((b)localObject5).field_fileFullPath != null)
      {
        localObject1 = localObject2;
        if (!((b)localObject5).field_fileFullPath.equals(""))
        {
          au.HU();
          localObject1 = al(com.tencent.mm.model.c.Gk(), ((g.a)localObject4).title, ((g.a)localObject4).dwp);
          j.q(((b)localObject5).field_fileFullPath, (String)localObject1, false);
        }
      }
    }
    if ((parambd.field_imgPath != null) && (!parambd.field_imgPath.equals(""))) {}
    String str;
    for (localObject2 = com.tencent.mm.ak.o.Pf().E(parambd.field_imgPath, true);; localObject3 = null) {
      try
      {
        localObject2 = com.tencent.mm.a.e.e((String)localObject2, 0, com.tencent.mm.a.e.cm((String)localObject2));
        localObject5 = g.a.a((g.a)localObject4);
        str = ((g.a)localObject4).appId;
        str = ((g.a)localObject4).appName;
        localObject4 = System.currentTimeMillis();
        if (bi.oW((String)localObject1)) {
          break;
        }
        localObject4 = a((String)localObject4, (g.a)localObject5, (String)localObject1);
        localObject1 = localObject4;
        if (localObject4 != null) {
          break label240;
        }
        com.tencent.mm.compatible.util.g.getLine();
        return;
      }
      catch (Exception localException) {}
    }
    localObject1 = null;
    label240:
    localObject4 = new com.tencent.mm.storage.bd();
    if ((localObject3 != null) && (localObject3.length > 0)) {
      if (((g.a)localObject5).type != 2) {
        break label567;
      }
    }
    long l;
    label567:
    for (boolean bool = true;; bool = false)
    {
      localObject3 = com.tencent.mm.ak.o.Pf().a(6, (byte[])localObject3, bool, Bitmap.CompressFormat.PNG);
      x.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Ac() + " thumbData MsgInfo path:" + (String)localObject3);
      if (!bi.oW((String)localObject3))
      {
        ((com.tencent.mm.storage.bd)localObject4).eq((String)localObject3);
        x.d("MicroMsg.AppMsgLogic", "new thumbnail saved, path" + (String)localObject3);
      }
      if (localObject1 != null) {
        ((g.a)localObject5).bGP = ((b)localObject1).sKx;
      }
      ((com.tencent.mm.storage.bd)localObject4).setContent(g.a.a((g.a)localObject5, null, null));
      ((com.tencent.mm.storage.bd)localObject4).setStatus(1);
      ((com.tencent.mm.storage.bd)localObject4).ep(parambd.field_talker);
      ((com.tencent.mm.storage.bd)localObject4).ay(com.tencent.mm.model.bd.iD(parambd.field_talker));
      ((com.tencent.mm.storage.bd)localObject4).eX(1);
      ((com.tencent.mm.storage.bd)localObject4).setType(d((g.a)localObject5));
      if (com.tencent.mm.ac.f.eZ(((cm)localObject4).field_talker))
      {
        ((com.tencent.mm.storage.bd)localObject4).dt(com.tencent.mm.ac.a.e.Ir());
        x.d("MicroMsg.AppMsgLogic", "NetSceneSendMsg:MsgSource:%s", new Object[] { ((cm)localObject4).cqb });
      }
      au.HU();
      l = com.tencent.mm.model.c.FT().T((com.tencent.mm.storage.bd)localObject4);
      x.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Ac() + " msginfo insert id: " + l);
      if (l >= 0L) {
        break;
      }
      x.e("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Ac() + "insert msg failed :" + l);
      com.tencent.mm.compatible.util.g.getLine();
      return;
    }
    x.i("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.getLine() + " new msg inserted to db , local id = " + l);
    ((com.tencent.mm.storage.bd)localObject4).setMsgId(l);
    Object localObject3 = new sc();
    ((sc)localObject3).ccT.ccU = parambd.field_msgId;
    ((sc)localObject3).ccT.ccV = l;
    com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject3);
    parambd = new com.tencent.mm.y.g();
    parambd.field_xml = ((cm)localObject4).field_content;
    parambd.field_title = ((g.a)localObject5).title;
    parambd.field_type = ((g.a)localObject5).type;
    parambd.field_description = ((g.a)localObject5).description;
    parambd.field_msgId = l;
    parambd.field_source = str;
    ao.cbY().b(parambd);
    if (localObject1 != null)
    {
      ((b)localObject1).field_msgInfoId = l;
      ((b)localObject1).field_status = 101L;
      ao.asF().c((com.tencent.mm.sdk.e.c)localObject1, new String[0]);
      ao.cca().run();
      return;
    }
    ao.cca();
    an.a.fM(l);
  }
  
  public static String al(String paramString1, String paramString2, String paramString3)
  {
    Object localObject;
    if (bi.oW(paramString2)) {
      localObject = paramString1 + "da_" + bi.VF();
    }
    for (;;)
    {
      paramString2 = (String)localObject;
      if (!bi.oW(paramString3))
      {
        paramString2 = (String)localObject;
        if (!((String)localObject).endsWith(paramString3)) {
          paramString2 = (String)localObject + "." + paramString3;
        }
      }
      paramString3 = paramString2;
      try
      {
        if (!new File(paramString2).getParentFile().getCanonicalPath().equalsIgnoreCase(new File(paramString1).getCanonicalPath()))
        {
          paramString3 = paramString1 + "da_" + bi.VF();
          x.w("MicroMsg.AppMsgLogic", "maybe DirTraversal attach. %s", new Object[] { paramString3 });
        }
        return paramString3;
      }
      catch (Exception paramString2)
      {
        String str;
        x.printErrStackTrace("MicroMsg.AppMsgLogic", paramString2, "", new Object[0]);
      }
      str = paramString1 + paramString2;
      localObject = str;
      if (com.tencent.mm.a.e.cn(str))
      {
        localObject = new File(paramString1 + "/" + bi.VF());
        if ((!((File)localObject).exists()) || (!((File)localObject).isDirectory())) {
          ((File)localObject).mkdirs();
        }
        localObject = ((File)localObject).getAbsolutePath() + "/" + paramString2;
      }
    }
    return paramString1 + "da_" + bi.VF();
  }
  
  public static b am(String paramString, long paramLong)
  {
    b localb = SZ(paramString);
    paramString = localb;
    if (localb == null) {
      paramString = ao.asF().fH(paramLong);
    }
    if (paramString != null)
    {
      x.i("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfo info[%s], rowid[%d], isUpload[%b], fullpath[%s], totallen[%d], offset[%d], mediaSvrId[%s], mediaid[%s], msgid[%d], type[%d], stack[%s]", new Object[] { paramString, Long.valueOf(paramString.sKx), Boolean.valueOf(paramString.field_isUpload), paramString.field_fileFullPath, Long.valueOf(paramString.field_totalLen), Long.valueOf(paramString.field_offset), paramString.field_mediaSvrId, paramString.field_mediaId, Long.valueOf(paramString.field_msgInfoId), Long.valueOf(paramString.field_type), ai.VI() });
      return paramString;
    }
    x.w("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfo is null stack[%s]", new Object[] { ai.VI() });
    return paramString;
  }
  
  public static String b(g.a parama, WXMediaMessage paramWXMediaMessage, String paramString)
  {
    x.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Ac() + "mediaMessageToContent sdkver:" + paramWXMediaMessage.sdkVer + " title:" + paramWXMediaMessage.title + " desc:" + paramWXMediaMessage.description + " type:" + paramWXMediaMessage.mediaObject.type());
    parama.sdkVer = paramWXMediaMessage.sdkVer;
    parama.title = paramWXMediaMessage.title;
    parama.description = paramWXMediaMessage.description;
    parama.mediaTagName = paramWXMediaMessage.mediaTagName;
    parama.messageAction = paramWXMediaMessage.messageAction;
    parama.messageExt = paramWXMediaMessage.messageExt;
    paramWXMediaMessage = paramWXMediaMessage.mediaObject;
    parama.type = paramWXMediaMessage.type();
    if (parama.type == 7)
    {
      paramWXMediaMessage = (WXAppExtendObject)paramWXMediaMessage;
      parama.extInfo = paramWXMediaMessage.extInfo;
      if (!bi.bC(paramWXMediaMessage.fileData))
      {
        x.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Ac() + " fileData:" + paramWXMediaMessage.fileData.length);
        parama.dwo = paramWXMediaMessage.fileData.length;
        return bh(paramWXMediaMessage.fileData);
      }
      parama.dwo = com.tencent.mm.a.e.cm(paramWXMediaMessage.filePath);
      x.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Ac() + " read file:" + paramWXMediaMessage.filePath + " len:" + parama.dwo);
      if (parama.dwo > 0)
      {
        parama.dwp = com.tencent.mm.a.e.cp(paramWXMediaMessage.filePath);
        return paramWXMediaMessage.filePath;
      }
      return null;
    }
    if (parama.type == 6)
    {
      paramWXMediaMessage = (WXFileObject)paramWXMediaMessage;
      if (!bi.bC(paramWXMediaMessage.fileData))
      {
        x.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Ac() + " fileData:" + paramWXMediaMessage.fileData.length);
        parama.dwo = paramWXMediaMessage.fileData.length;
        return bh(paramWXMediaMessage.fileData);
      }
      parama.dwo = com.tencent.mm.a.e.cm(paramWXMediaMessage.filePath);
      x.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Ac() + " read file:" + paramWXMediaMessage.filePath + " len:" + parama.dwo);
      if (parama.dwo > 0)
      {
        parama.dwp = com.tencent.mm.a.e.cp(paramWXMediaMessage.filePath);
        return paramWXMediaMessage.filePath;
      }
      return null;
    }
    if (parama.type == 2)
    {
      paramWXMediaMessage = (WXImageObject)paramWXMediaMessage;
      if (!bi.bC(paramWXMediaMessage.imageData))
      {
        x.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Ac() + " fileData:" + paramWXMediaMessage.imageData.length);
        parama.dwo = paramWXMediaMessage.imageData.length;
        return bh(paramWXMediaMessage.imageData);
      }
      if (!bi.oW(paramWXMediaMessage.imagePath))
      {
        parama.dwo = com.tencent.mm.a.e.cm(paramWXMediaMessage.imagePath);
        x.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Ac() + " read file:" + paramWXMediaMessage.imagePath + " len:" + parama.dwo);
        if (parama.dwo > 0)
        {
          parama.dwp = com.tencent.mm.a.e.cp(paramWXMediaMessage.imagePath);
          au.HU();
          parama = new File(com.tencent.mm.model.c.Gk(), "appmsg_img_" + System.currentTimeMillis()).getAbsolutePath();
          paramString = com.tencent.mm.sdk.platformtools.c.VZ(paramWXMediaMessage.imagePath);
          if ((paramString == null) || (paramString.outWidth <= 0) || (paramString.outHeight <= 0))
          {
            boolean bool;
            int i;
            if (paramString == null)
            {
              bool = true;
              if (paramString != null) {
                break label754;
              }
              i = -1;
              label704:
              if (paramString != null) {
                break label762;
              }
            }
            label754:
            label762:
            for (int j = -1;; j = paramString.outHeight)
            {
              x.e("MicroMsg.AppMsgLogic", "options is null! %B, bitmapWidth = %d, bitmapHeight = %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i), Integer.valueOf(j) });
              return null;
              bool = false;
              break;
              i = paramString.outWidth;
              break label704;
            }
          }
          if (q.a(paramWXMediaMessage.imagePath, "", true))
          {
            x.i("MicroMsg.AppMsgLogic", "this picture can send raw image but must copy [%s] to [%s]", new Object[] { paramWXMediaMessage.imagePath, parama });
            if (com.tencent.mm.a.e.y(paramWXMediaMessage.imagePath, parama) < 0L)
            {
              x.w("MicroMsg.AppMsgLogic", "copy file error path[%s, %s]", new Object[] { paramWXMediaMessage.imagePath, parama });
              return null;
            }
            return parama;
          }
          if ((paramString.outWidth > 960) || (paramString.outHeight > 960))
          {
            paramString = new MMBitmapFactory.DecodeResultLogger();
            localBitmap = com.tencent.mm.sdk.platformtools.c.a(paramWXMediaMessage.imagePath, 960, 960, false, paramString, 0);
            if (localBitmap == null) {}
          }
          while (com.tencent.mm.a.e.y(paramWXMediaMessage.imagePath, parama) >= 0L)
          {
            try
            {
              Bitmap localBitmap;
              com.tencent.mm.sdk.platformtools.c.a(localBitmap, 100, Bitmap.CompressFormat.JPEG, parama, true);
              return parama;
            }
            catch (IOException parama)
            {
              x.printErrStackTrace("MicroMsg.AppMsgLogic", parama, "", new Object[0]);
              return null;
            }
            if (paramString.getDecodeResult() >= 2000)
            {
              parama = MMBitmapFactory.KVStatHelper.getKVStatString(paramWXMediaMessage.imagePath, 6, paramString);
              h.mEJ.k(12712, parama);
            }
            return null;
          }
          return null;
        }
        return null;
      }
      return null;
    }
    if (parama.type == 3)
    {
      paramWXMediaMessage = (WXMusicObject)paramWXMediaMessage;
      parama.url = paramWXMediaMessage.musicUrl;
      parama.dwn = paramWXMediaMessage.musicLowBandUrl;
      parama.dwN = paramWXMediaMessage.musicDataUrl;
      parama.dwO = paramWXMediaMessage.musicLowBandDataUrl;
      return null;
    }
    if (parama.type == 4)
    {
      paramWXMediaMessage = (WXVideoObject)paramWXMediaMessage;
      parama.url = paramWXMediaMessage.videoUrl;
      parama.dwn = paramWXMediaMessage.videoLowBandUrl;
      return null;
    }
    if (parama.type == 5)
    {
      paramWXMediaMessage = (WXWebpageObject)paramWXMediaMessage;
      parama.url = paramWXMediaMessage.webpageUrl;
      if (!bi.oW(paramWXMediaMessage.extInfo)) {
        parama.extInfo = paramWXMediaMessage.extInfo;
      }
      if (!bi.oW(paramWXMediaMessage.canvasPageXml)) {
        parama.canvasPageXml = paramWXMediaMessage.canvasPageXml;
      }
      return null;
    }
    if (parama.type == 36)
    {
      paramWXMediaMessage = (WXMiniProgramObject)paramWXMediaMessage;
      parama.dyS = paramWXMediaMessage.userName;
      parama.dyR = paramWXMediaMessage.path;
      parama.url = paramWXMediaMessage.webpageUrl;
      paramWXMediaMessage = ((com.tencent.mm.plugin.appbrand.n.c)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.appbrand.n.c.class)).rR(paramWXMediaMessage.userName);
      if (paramWXMediaMessage != null)
      {
        if (paramWXMediaMessage.ael() != null) {
          parama.dza = paramWXMediaMessage.ael().cbu;
        }
        parama.dzb = paramWXMediaMessage.field_brandIconURL;
        x.i("MicroMsg.AppMsgLogic", "add appbrand version and appbrand icon url : %d, %s", new Object[] { Integer.valueOf(parama.dza), parama.dzb });
      }
    }
    do
    {
      for (;;)
      {
        return null;
        if (parama.type == 1)
        {
          parama.title = ((WXTextObject)paramWXMediaMessage).text;
          return null;
        }
        if (parama.type != 8) {
          break;
        }
        paramWXMediaMessage = (WXEmojiObject)paramWXMediaMessage;
        if (!bi.bC(paramWXMediaMessage.emojiData))
        {
          x.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Ac() + " fileData:" + paramWXMediaMessage.emojiData.length);
          parama.dwo = paramWXMediaMessage.emojiData.length;
          return bh(paramWXMediaMessage.emojiData);
        }
        if (!bi.oW(paramWXMediaMessage.emojiPath))
        {
          parama.dwo = com.tencent.mm.a.e.cm(paramWXMediaMessage.emojiPath);
          x.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Ac() + " read file:" + paramWXMediaMessage.emojiPath + " len:" + parama.dwo);
          if (parama.dwo > 0)
          {
            parama.dwp = com.tencent.mm.a.e.cp(paramWXMediaMessage.emojiPath);
            return paramWXMediaMessage.emojiPath;
          }
          return null;
        }
        parama.dwq = paramString;
      }
      if (parama.type == 15)
      {
        paramWXMediaMessage = (WXEmojiSharedObject)paramWXMediaMessage;
        parama.thumburl = paramWXMediaMessage.thumburl;
        parama.dxa = paramWXMediaMessage.packageflag;
        parama.dwZ = paramWXMediaMessage.packageid;
        parama.showType = 8;
        parama.url = paramWXMediaMessage.url;
        return null;
      }
      if (parama.type == 13)
      {
        paramWXMediaMessage = (WXEmojiSharedObject)paramWXMediaMessage;
        parama.thumburl = paramWXMediaMessage.thumburl;
        parama.dxa = paramWXMediaMessage.packageflag;
        parama.dwZ = paramWXMediaMessage.packageid;
        parama.showType = 8;
        parama.url = paramWXMediaMessage.url;
        return null;
      }
      if (parama.type == 25)
      {
        paramWXMediaMessage = (WXDesignerSharedObject)paramWXMediaMessage;
        parama.thumburl = paramWXMediaMessage.thumburl;
        parama.url = paramWXMediaMessage.url;
        parama.dyG = paramWXMediaMessage.designerUIN;
        parama.designerName = paramWXMediaMessage.designerName;
        parama.designerRediretctUrl = paramWXMediaMessage.designerRediretctUrl;
        parama.showType = 18;
        return null;
      }
    } while ((parama.type != 27) && (parama.type != 26));
    paramWXMediaMessage = (WXEmojiPageSharedObject)paramWXMediaMessage;
    parama.thumburl = paramWXMediaMessage.iconUrl;
    parama.url = paramWXMediaMessage.url;
    parama.tid = paramWXMediaMessage.tid;
    parama.dyH = paramWXMediaMessage.title;
    parama.desc = paramWXMediaMessage.desc;
    parama.iconUrl = paramWXMediaMessage.iconUrl;
    parama.secondUrl = paramWXMediaMessage.secondUrl;
    parama.pageType = paramWXMediaMessage.pageType;
    parama.showType = 20;
    return null;
  }
  
  public static String bh(byte[] paramArrayOfByte)
  {
    if (bi.bC(paramArrayOfByte))
    {
      x.e("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Ac() + " attachBuf is null");
      return null;
    }
    Object localObject = new StringBuilder();
    au.HU();
    localObject = com.tencent.mm.model.c.Gk() + "ua_" + bi.VF();
    x.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Ac() + " buildUploadAttachInfo file:" + (String)localObject);
    if (com.tencent.mm.a.e.b((String)localObject, paramArrayOfByte, paramArrayOfByte.length) != 0)
    {
      x.e("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Ac() + " writeFile error file:" + (String)localObject);
      return null;
    }
    return (String)localObject;
  }
  
  public static String c(long paramLong, String paramString1, String paramString2)
  {
    x.i("MicroMsg.AppMsgLogic", "summerbig initDownloadAttach msgLocalId[%d], msgXml[%s], downloadPath[%s]", new Object[] { Long.valueOf(paramLong), paramString1, paramString2 });
    g.a locala = g.a.gp(paramString1);
    if (locala == null) {
      return null;
    }
    if (paramString2 == null) {}
    for (paramString1 = al(com.tencent.mm.compatible.util.e.dgj, locala.title, locala.dwp);; paramString1 = paramString2)
    {
      if ((bi.oW(locala.bGP)) && (!bi.oW(locala.dwD))) {
        locala.bGP = locala.dwD.hashCode();
      }
      int i = locala.sdkVer;
      paramString2 = locala.appId;
      String str1 = locala.bGP;
      int j = locala.dwo;
      int k = locala.type;
      String str2 = locala.dwK;
      return a(paramString1, paramLong, i, paramString2, str1, j, k, locala.dws);
    }
  }
  
  public static int d(g.a parama)
  {
    int i = -1879048183;
    if (parama == null)
    {
      i = 49;
      return i;
    }
    int j = parama.type;
    int k = parama.showType;
    int m = parama.dwP;
    int n = parama.dwQ;
    int i1 = parama.dyl;
    x.d("MicroMsg.AppMsgLogic", "getLocalAppMsgType showType " + k + " atype " + j + ", itemShowType = " + m + ", c2cNewAAType = " + i1);
    if ((m == 4) || (n != 0)) {
      return 318767153;
    }
    if (j == 2001)
    {
      if (k == 1) {
        return 469762097;
      }
      if (i1 == 4) {
        return 503316529;
      }
      return 436207665;
    }
    if (j == 2002) {
      return 536870961;
    }
    switch (k)
    {
    default: 
      switch (j)
      {
      }
      break;
    }
    com.tencent.mm.y.a locala;
    do
    {
      return 49;
      if (j == 21) {
        return -1879048185;
      }
      return 285212721;
      if (j == 21) {
        break;
      }
      return 301989937;
      if (j == 21) {
        return -1879048176;
      }
      return -1879048189;
      if (j == 21) {
        break;
      }
      return -1879048190;
      return -1879048191;
      return -1879048186;
      return 268435505;
      return 16777265;
      return 1048625;
      return 335544369;
      return 402653233;
      return 369098801;
      return 452984881;
      return -1879048186;
      return 419430449;
      return 520093745;
      locala = (com.tencent.mm.y.a)parama.u(com.tencent.mm.y.a.class);
      if ((locala != null) && (locala.dvC) && ((parama.dyU == 2) || (parama.dyU == 3))) {
        return 553648177;
      }
    } while ((locala == null) || (!locala.dvF) || (parama.dyU != 3));
    return 587202609;
  }
  
  public static b d(com.tencent.mm.storage.bd parambd, String paramString)
  {
    b localb2 = SZ(paramString);
    b localb1 = localb2;
    if (localb2 == null)
    {
      c(parambd.field_msgId, parambd.field_content, null);
      localb1 = SZ(paramString);
    }
    return localb1;
  }
  
  public static boolean e(String paramString, com.tencent.mm.storage.bd parambd)
  {
    if (parambd == null) {
      return false;
    }
    boolean bool2 = true;
    String str3 = null;
    String str4 = null;
    String str2 = null;
    String str5 = null;
    String str1 = null;
    Object localObject1 = am(paramString, parambd.field_msgId);
    Object localObject2 = g.a.gp(parambd.field_content);
    if (localObject1 != null) {
      String str6 = ((b)localObject1).field_fileFullPath;
    }
    if (localObject2 != null)
    {
      str3 = ai.oV(((g.a)localObject2).title);
      str4 = ai.oV(((g.a)localObject2).dwp).toLowerCase();
      str2 = ai.oV(((g.a)localObject2).filemd5);
      str5 = ai.oV(((g.a)localObject2).bSS);
      str1 = ai.oV(((g.a)localObject2).dwK);
    }
    if (localObject1 == null)
    {
      c(parambd.field_msgId, parambd.field_content, null);
      parambd = am(paramString, parambd.field_msgId);
      paramString = parambd;
      bool1 = bool2;
      if (parambd != null)
      {
        l1 = parambd.sKx;
        l2 = parambd.field_totalLen;
        paramString = parambd.field_fileFullPath;
        l3 = parambd.field_type;
        localObject1 = parambd.field_mediaId;
        l4 = parambd.field_msgInfoId;
        bool1 = parambd.field_isUpload;
        if (parambd.field_signature != null) {
          break label348;
        }
        i = -1;
        x.i("MicroMsg.AppMsgLogic", "summerbig tryInitAttachInfo newInfo systemRowid [%d], totalLen[%d], field_fileFullPath[%s], type[%d], mediaId[%s], msgid[%d], upload[%b], signature len[%d]", new Object[] { Long.valueOf(l1), Long.valueOf(l2), paramString, Long.valueOf(l3), localObject1, Long.valueOf(l4), Boolean.valueOf(bool1), Integer.valueOf(i) });
        paramString = parambd;
        bool1 = bool2;
        if (localObject2 != null) {
          if (((g.a)localObject2).dws == 0)
          {
            paramString = parambd;
            bool1 = bool2;
            if (((g.a)localObject2).dwo <= 26214400) {}
          }
          else
          {
            if (ai.oW(parambd.field_signature)) {
              break label359;
            }
          }
        }
      }
      label348:
      label359:
      for (bool1 = true;; bool1 = false)
      {
        paramString = parambd;
        if (!bool1) {
          au.DF().a(new z(paramString, str1, str2, str3, str4, str5), 0);
        }
        return bool1;
        i = parambd.field_signature.length();
        break;
      }
    }
    paramString = new File(((b)localObject1).field_fileFullPath);
    if ((((b)localObject1).field_status == 199L) && (!paramString.exists()))
    {
      x.i("MicroMsg.AppMsgLogic", "summerbig tryInitAttachInfo info exist but file not!");
      c(parambd.field_msgId, parambd.field_content, null);
    }
    long l1 = ((b)localObject1).sKx;
    long l2 = ((b)localObject1).field_totalLen;
    parambd = ((b)localObject1).field_fileFullPath;
    long l3 = ((b)localObject1).field_type;
    localObject2 = ((b)localObject1).field_mediaId;
    long l4 = ((b)localObject1).field_msgInfoId;
    boolean bool1 = ((b)localObject1).field_isUpload;
    boolean bool3 = paramString.exists();
    long l5 = ((b)localObject1).field_status;
    if (((b)localObject1).field_signature == null) {}
    for (int i = -1;; i = ((b)localObject1).field_signature.length())
    {
      x.i("MicroMsg.AppMsgLogic", "summerbig tryInitAttachInfo info exist systemRowid [%d], totalLen[%d], field_fileFullPath[%s], type[%d], mediaId[%s], msgid[%d], upload[%b], file.exists[%b], status[%d], signature len[%d]", new Object[] { Long.valueOf(l1), Long.valueOf(l2), parambd, Long.valueOf(l3), localObject2, Long.valueOf(l4), Boolean.valueOf(bool1), Boolean.valueOf(bool3), Long.valueOf(l5), Integer.valueOf(i) });
      paramString = (String)localObject1;
      bool1 = bool2;
      break;
    }
  }
  
  public static void fJ(long paramLong)
  {
    b localb = ao.asF().fH(paramLong);
    if (localb != null) {
      x.i("MicroMsg.AppMsgLogic", "summerapp deleteAttachInfoAndFile deleteFile[%b] deleteInfo[%b] msgInfoId[%d] mediaSvrId[%s] path[%s] stack[%s]", new Object[] { Boolean.valueOf(com.tencent.mm.a.e.deleteFile(localb.field_fileFullPath)), Boolean.valueOf(ao.asF().a(localb, new String[] { "msgInfoId" })), Long.valueOf(localb.field_msgInfoId), localb.field_mediaSvrId, localb.field_fileFullPath, bi.cjd() });
    }
  }
  
  public static void fK(long paramLong)
  {
    Object localObject1 = ao.asF();
    Object localObject2 = " update appattach set status = 198 , lastModifyTime = " + bi.VE() + " where rowid = " + paramLong;
    ((c)localObject1).diF.fV("appattach", (String)localObject2);
    ((c)localObject1).doNotify();
    localObject1 = new b();
    ao.asF().b(paramLong, (com.tencent.mm.sdk.e.c)localObject1);
    if (((b)localObject1).field_msgInfoId <= 0L) {}
    do
    {
      return;
      au.HU();
      localObject2 = com.tencent.mm.model.c.FT().dW(((b)localObject1).field_msgInfoId);
    } while (((cm)localObject2).field_msgId != ((b)localObject1).field_msgInfoId);
    ((com.tencent.mm.storage.bd)localObject2).setStatus(5);
    au.HU();
    com.tencent.mm.model.c.FT().a(((cm)localObject2).field_msgId, (com.tencent.mm.storage.bd)localObject2);
  }
  
  public static abstract interface a
  {
    public abstract void eu(int paramInt1, int paramInt2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/model/app/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */