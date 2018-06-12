package com.tencent.mm.plugin.ext.openapi.provider;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Looper;
import com.tencent.mm.aa.f;
import com.tencent.mm.aa.f.d;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.a.fh;
import com.tencent.mm.g.a.fh.b;
import com.tencent.mm.g.a.qx;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.au;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelvoice.i;
import com.tencent.mm.modelvoice.o;
import com.tencent.mm.plugin.ext.b;
import com.tencent.mm.plugin.ext.c.b.b;
import com.tencent.mm.plugin.ext.c.d.b;
import com.tencent.mm.plugin.ext.c.e.2;
import com.tencent.mm.plugin.ext.c.e.a;
import com.tencent.mm.plugin.ext.provider.ExtContentProviderBase;
import com.tencent.mm.plugin.ext.ui.RedirectToQrCodeStubUI;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.platformtools.ac;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bj;
import com.tencent.mm.storage.bk;
import com.tencent.mm.storage.bu;
import com.tencent.mm.storage.bv;
import java.io.File;

public class ExtControlProviderOpenApi
  extends ExtContentProviderBase
{
  private static final String[] iJA = { "retCode", "sportConfig" };
  private static final String[] iJB = { "openid", "avatar" };
  private static final String[] iJC = { "voiceType", "sampleRateInHz", "channelConfig", "audioFormat", "filePath" };
  private static final String[] iJD = { "ssid", "macAddress", "isSupportWechat", "name" };
  public static boolean iJy = false;
  private static final String[] iJz = { "retCode", "selfId" };
  private Context context;
  private ag handler;
  private String[] iJE = null;
  private int iJF = -1;
  
  public ExtControlProviderOpenApi() {}
  
  public ExtControlProviderOpenApi(String[] paramArrayOfString, int paramInt, Context paramContext)
  {
    this.iJE = paramArrayOfString;
    this.iJF = paramInt;
    this.context = paramContext;
  }
  
  private Cursor O(String paramString1, String paramString2, String paramString3)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtControlProviderOpenApi", "doRegisterMsgListener");
    if ((bi.oW(paramString1)) || (bi.oW(paramString2)) || (bi.oW(paramString3)))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ExtControlProviderOpenApi", "wrong args, scene = %s, msgType = %s, msgState = %s", new Object[] { paramString1, paramString2, paramString3 });
      cw(3, 2004);
      return com.tencent.mm.pluginsdk.d.a.a.BA(2004);
    }
    Object localObject = null;
    try
    {
      int i = Integer.parseInt(paramString3);
      int j = Integer.parseInt(paramString1);
      int k = Integer.parseInt(paramString2);
      if (i != 2)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ExtControlProviderOpenApi", "wrong msgState: " + i);
        cw(3, 2005);
        return com.tencent.mm.pluginsdk.d.a.a.BA(2005);
      }
      if (b.aIL().Zf(this.iJN) == null)
      {
        paramString1 = new bj();
        paramString1.field_appId = this.iJN;
        paramString1.field_packageName = aIW();
        paramString2 = this.iJN;
        boolean bool;
        if (bi.oW(paramString2))
        {
          bool = false;
          if (!bool) {
            break label305;
          }
        }
        label305:
        for (paramString1.field_status = 1;; paramString1.field_status = 0)
        {
          paramString1.field_sceneFlag = j;
          paramString1.field_msgTypeFlag = k;
          paramString1.field_msgState = i;
          bool = b.aIL().b(paramString1);
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtControlProviderOpenApi", "registerMsgReceiver ret = %s, pkgName = %s, scene = %s, msgType = %s, msgState = %s, appStatus = %s", new Object[] { Boolean.valueOf(bool), aIW(), Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(paramString1.field_status) });
          if (bool) {
            break label382;
          }
          return com.tencent.mm.pluginsdk.d.a.a.BA(2006);
          bool = com.tencent.mm.pluginsdk.model.app.g.i(com.tencent.mm.pluginsdk.model.app.g.bl(paramString2, true));
          break;
        }
        H(1, 4, 12);
      }
    }
    catch (Exception paramString1)
    {
      paramString2 = (String)localObject;
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ExtControlProviderOpenApi", "exception in doRegisterMsgListener, %s", new Object[] { paramString1.getMessage() });
      if (paramString2 != null) {
        paramString2.close();
      }
      return com.tencent.mm.pluginsdk.d.a.a.BA(12);
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ExtControlProviderOpenApi", "This app had already been registered, appId = %s, pkg = %s", new Object[] { this.iJN, aIW() });
      label382:
      paramString1 = new StringBuilder().append(com.tencent.mm.model.q.GF());
      au.HU();
      paramString1 = ac.ce(com.tencent.mm.model.c.Df());
      paramString2 = new MatrixCursor(iJz);
      try
      {
        paramString2.addRow(new Object[] { Integer.valueOf(1), bi.oV(paramString1) });
        H(0, 0, 1);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtControlProviderOpenApi", "return  code =%s ", new Object[] { Integer.valueOf(1) });
        return paramString2;
      }
      catch (Exception paramString1) {}
    }
  }
  
  private void aIT()
  {
    String str1 = (String)b.aIK().get(aa.a.sUa, null);
    String str2 = aIW();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtControlProviderOpenApi", "setSportBroadPkg: pkgNames: %s, pkg: %s", new Object[] { str1, str2 });
    if (str1 != null)
    {
      if (!com.tencent.mm.compatible.loader.a.a(str1.split(";"), str2)) {
        b.aIK().a(aa.a.sUa, str1 + ";" + aIW());
      }
      return;
    }
    b.aIK().a(aa.a.sUa, aIW());
  }
  
  private static int cm(String paramString)
  {
    if (paramString == null) {}
    do
    {
      return 0;
      paramString = new File(paramString);
    } while (!paramString.exists());
    return (int)paramString.length();
  }
  
  private Cursor i(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    int i = -1;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtControlProviderOpenApi", "registerMsgReceiver, op = %s", new Object[] { paramString1 });
    if (this.context == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ExtControlProviderOpenApi", "context == null return code = 2001");
      cw(4, 2001);
      return com.tencent.mm.pluginsdk.d.a.a.BA(2001);
    }
    if (bi.oW(paramString1))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ExtControlProviderOpenApi", "wrong args, op is null return code = 2002");
      cw(3, 2002);
      return com.tencent.mm.pluginsdk.d.a.a.BA(2002);
    }
    try
    {
      int j = bi.getInt(paramString1, -1);
      i = j;
    }
    catch (Exception paramString1)
    {
      boolean bool;
      for (;;) {}
    }
    if (i == 1) {
      return O(paramString2, paramString3, paramString4);
    }
    if (i == 2)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ExtControlProviderOpenApi", "doUnRegisterMsgListener");
      if (b.aIL().Zf(this.iJN) == null)
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ExtControlProviderOpenApi", "This app never been registered, appId = %s, pkg = %s", new Object[] { this.iJN, aIW() });
        return com.tencent.mm.pluginsdk.d.a.a.BA(2007);
      }
      paramString1 = b.aIL();
      paramString2 = this.iJN;
      if ((paramString2 == null) || (paramString2.length() <= 0)) {
        bool = false;
      }
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtControlProviderOpenApi", "doUnRegisterMsgListener ret = %s, appId = %s, pkg = %s", new Object[] { Boolean.valueOf(bool), this.iJN, aIW() });
        if (bool) {
          break;
        }
        return com.tencent.mm.pluginsdk.d.a.a.BA(2008);
        if (paramString1.diF.delete("OpenMsgListener", "appId=?", new String[] { bi.oU(paramString2) }) <= 0) {
          bool = false;
        } else {
          bool = true;
        }
      }
      H(0, 0, 1);
      return com.tencent.mm.pluginsdk.d.a.a.BA(1);
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ExtControlProviderOpenApi", "wrong args, no such op, %s", new Object[] { Integer.valueOf(i) });
    cw(3, 2003);
    return com.tencent.mm.pluginsdk.d.a.a.BA(2003);
  }
  
  private Cursor k(String[] paramArrayOfString)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtControlProviderOpenApi", "getUserAvatarByOpenId");
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ExtControlProviderOpenApi", "wrong args");
      cw(3, 3001);
      return com.tencent.mm.pluginsdk.d.a.a.BA(3001);
    }
    MatrixCursor localMatrixCursor = new MatrixCursor(iJB);
    int i = 0;
    for (;;)
    {
      ab localab;
      try
      {
        if ((i >= paramArrayOfString.length) || (i >= 5)) {
          break label388;
        }
        if (bi.oW(paramArrayOfString[i])) {
          break label402;
        }
        localObject = b.aIM().Zq(paramArrayOfString[i]);
        if ((localObject == null) || (bi.oW(((bu)localObject).field_openId)) || (bi.oW(((bu)localObject).field_username)))
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ExtControlProviderOpenApi", "openidInApp is null");
        }
        else
        {
          au.HU();
          localab = com.tencent.mm.model.c.FR().Yg(((bu)localObject).field_username);
          if ((localab == null) || (localab.field_username == null) || (localab.field_username.length() <= 0)) {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ExtControlProviderOpenApi", "contact is null");
          }
        }
      }
      catch (Exception paramArrayOfString)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ExtControlProviderOpenApi", "Exception occur, %s", new Object[] { paramArrayOfString.getMessage() });
        H(7, 4, 12);
        localMatrixCursor.close();
        return com.tencent.mm.pluginsdk.d.a.a.BA(12);
      }
      Object localObject = com.tencent.mm.aa.q.Kp().c(localab.field_username, false, false);
      if (bi.oW((String)localObject))
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ExtControlProviderOpenApi", "hy: get avatar sfs path is null or nil");
      }
      else
      {
        String str;
        if (((String)localObject).startsWith(com.tencent.mm.kernel.g.Ei().cachePath))
        {
          int j = com.tencent.mm.kernel.g.Ei().cachePath.length();
          str = com.tencent.mm.kernel.g.Ei().dqp + ((String)localObject).substring(j);
          FileOp.mL(new File(str).getParent());
          FileOp.y((String)localObject, str);
          localObject = str;
        }
        for (;;)
        {
          str = localab.field_username;
          f.d.jY((String)localObject);
          if (!FileOp.mH((String)localObject))
          {
            com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ExtControlProviderOpenApi", "hy: copy or replace avatar from sfs to file system failed");
            break;
          }
          localMatrixCursor.addRow(new Object[] { paramArrayOfString[i], localObject });
          break;
          label388:
          H(6, 0, 1);
          return localMatrixCursor;
        }
      }
      label402:
      i += 1;
    }
  }
  
  private Cursor l(String[] paramArrayOfString)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtControlProviderOpenApi", "decodeVoice");
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0) || (paramArrayOfString[0].length() <= 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ExtControlProviderOpenApi", "decodeVoice wrong args");
      cw(3, 3101);
      return com.tencent.mm.pluginsdk.d.a.a.BA(3101);
    }
    Object localObject3 = null;
    int i = 0;
    for (;;)
    {
      Object localObject2;
      if ((i < 5) && (i < paramArrayOfString.length))
      {
        String str2 = paramArrayOfString[i];
        Object localObject4 = localObject3;
        i locali;
        for (;;)
        {
          String str1;
          try
          {
            Object localObject1;
            if (!o.f(str2, 0, true))
            {
              localObject4 = localObject3;
              com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ExtControlProviderOpenApi", "wrong args : %s", new Object[] { paramArrayOfString[i] });
              localObject1 = localObject3;
            }
            else
            {
              localObject1 = localObject3;
              if (localObject3 == null)
              {
                localObject4 = localObject3;
                localObject1 = new MatrixCursor(iJC);
              }
              localObject4 = localObject1;
              locali = new i();
              localObject4 = localObject1;
              str1 = b.aIO() + "/" + ac.ce(str2);
              localObject4 = localObject1;
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtControlProviderOpenApi", "summerpcm pcmPath[%s]", new Object[] { str1 });
              localObject4 = localObject1;
              if (com.tencent.mm.a.e.cn(str1))
              {
                localObject4 = localObject1;
                if (cm(str1) != 0)
                {
                  localObject4 = localObject1;
                  com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ExtControlProviderOpenApi", "pcm already exist");
                  localObject3 = str1;
                  localObject4 = localObject1;
                  if (cm(str1) == 0)
                  {
                    localObject4 = localObject1;
                    localObject3 = locali.aB(str2, str1);
                  }
                  localObject4 = localObject1;
                  if (!bi.oW((String)localObject3)) {
                    break;
                  }
                  localObject4 = localObject1;
                  com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ExtControlProviderOpenApi", "wrong args targetFilePath is null");
                }
              }
            }
          }
          catch (Exception localException)
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ExtControlProviderOpenApi", "Exception in decodeVoice, %s", new Object[] { localException.getMessage() });
            localObject2 = localObject4;
          }
          localObject4 = localObject2;
          localObject3 = locali.aB(str2, str1);
        }
        localObject4 = localObject2;
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ExtControlProviderOpenApi", "decode to pcm success %d", new Object[] { Integer.valueOf(i) });
        localObject4 = localObject2;
        ((MatrixCursor)localObject2).addRow(new Object[] { Integer.valueOf(1), Integer.valueOf(locali.mSampleRate), Integer.valueOf(locali.bEf), Integer.valueOf(2), localObject3 });
      }
      else
      {
        if (localObject3 != null)
        {
          H(8, 0, 1);
          return (Cursor)localObject3;
        }
        H(9, 3, 4);
        return com.tencent.mm.pluginsdk.d.a.a.BA(4);
      }
      i += 1;
      localObject3 = localObject2;
    }
  }
  
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
  
  public String getType(Uri paramUri)
  {
    return null;
  }
  
  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    return null;
  }
  
  public boolean onCreate()
  {
    this.handler = new ag();
    return true;
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtControlProviderOpenApi", "query(), ApiId = %s", new Object[] { Integer.valueOf(this.iJF) });
    a(paramUri, this.context, this.iJF, this.iJE);
    paramArrayOfString1 = this.iJN;
    if (paramUri == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ExtControlProviderOpenApi", "uri == null return code = 5");
      cw(3, 5);
      return com.tencent.mm.pluginsdk.d.a.a.BA(5);
    }
    if (bi.oW(this.iJN))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ExtControlProviderOpenApi", "AppID == null return code = 7");
      cw(3, 7);
      return com.tencent.mm.pluginsdk.d.a.a.BA(7);
    }
    if (bi.oW(aIW()))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ExtControlProviderOpenApi", "PkgName == null return code = 6");
      cw(3, 6);
      return com.tencent.mm.pluginsdk.d.a.a.BA(6);
    }
    if (!atA())
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ExtControlProviderOpenApi", "not login return code = 3");
      cw(1, 3);
      return com.tencent.mm.pluginsdk.d.a.a.BA(3);
    }
    int i = 1;
    if (!iJy) {
      i = aIX();
    }
    if (i != 1)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ExtControlProviderOpenApi", "invalid appid ! return code = " + i);
      cw(2, i);
      return com.tencent.mm.pluginsdk.d.a.a.BA(i);
    }
    long l1;
    switch (this.iJF)
    {
    case 24: 
    case 26: 
    case 27: 
    case 28: 
    case 29: 
    case 30: 
    case 31: 
    case 32: 
    case 33: 
    case 39: 
    case 43: 
    case 44: 
    case 45: 
    case 47: 
    default: 
      cw(3, 15);
      return null;
    case 22: 
      return i(paramUri.getQueryParameter("op"), paramUri.getQueryParameter("scene"), paramUri.getQueryParameter("msgType"), paramUri.getQueryParameter("msgState"));
    case 23: 
      return k(paramArrayOfString2);
    case 25: 
      return l(paramArrayOfString2);
    case 34: 
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtControlProviderOpenApi", "sendSight ");
      if ((paramArrayOfString2 == null) || (paramArrayOfString2.length <= 0) || (paramArrayOfString2[0].length() <= 0))
      {
        if (paramArrayOfString2 == null) {}
        for (boolean bool = true;; bool = false)
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ExtControlProviderOpenApi", "sendSight wrong args,args == null:%s", new Object[] { Boolean.valueOf(bool) });
          cw(3, 3401);
          return com.tencent.mm.pluginsdk.d.a.a.BA(3401);
        }
      }
      paramUri = paramArrayOfString2[0];
      if ((bi.oW(paramUri)) || (!com.tencent.mm.a.e.cn(paramUri))) {
        i = 0;
      }
      while (i == 0)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ExtControlProviderOpenApi", "isSightOk wrong args");
        cw(3, 3402);
        return com.tencent.mm.pluginsdk.d.a.a.BA(3402);
        paramArrayOfString1 = new com.tencent.mm.plugin.sight.base.c();
        if (SightVideoJNI.isSightOk(paramUri, paramArrayOfString1.ncd, paramArrayOfString1.nce, paramArrayOfString1.ncf, paramArrayOfString1.nch, paramArrayOfString1.ncg, paramArrayOfString1.ncg.length) == 0) {
          i = 1;
        } else {
          i = 0;
        }
      }
      paramArrayOfString1 = new Intent();
      paramArrayOfString1.addFlags(268435456);
      paramArrayOfString1.addFlags(67108864);
      paramArrayOfString1.putExtra("sight_local_path", paramUri);
      d.e(this.context, ".ui.transmit.SightForwardUI", paramArrayOfString1);
      H(12, 0, 1);
      return com.tencent.mm.pluginsdk.d.a.a.BA(1);
    case 35: 
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtControlProviderOpenApi", "hy: start redirect to chatting by phone num");
      if ((paramArrayOfString2 == null) || (paramArrayOfString2.length <= 0) || (bi.oW(paramArrayOfString2[0])))
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ExtControlProviderOpenApi", "hy: args error: no phone num or phone num is null or nil");
        cw(3, 3201);
        return com.tencent.mm.pluginsdk.d.a.a.BA(3201);
      }
      paramUri = paramArrayOfString2[0];
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtControlProviderOpenApi", "hy: start searching for phone num: %s", new Object[] { paramUri });
      i = new com.tencent.mm.plugin.ext.b.c(this.context, paramUri).aIS();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtControlProviderOpenApi", " ret =  ", new Object[] { Integer.valueOf(i) });
      if (i != -1)
      {
        H(14, 0, i);
        i = 0;
      }
      for (;;)
      {
        return com.tencent.mm.pluginsdk.d.a.a.BA(i);
        H(15, 0, i);
      }
    case 36: 
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtControlProviderOpenApi", "hy: start redirect to wechat out by phone num");
      if ((paramArrayOfString2 == null) || (paramArrayOfString2.length < 3))
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ExtControlProviderOpenApi", "hy: wechat out args error: args length error");
        cw(3, 3301);
        return com.tencent.mm.pluginsdk.d.a.a.BA(3301);
      }
      paramUri = paramArrayOfString2[0];
      i = bi.getInt(paramArrayOfString2[1], -1);
      paramArrayOfString1 = paramArrayOfString2[2];
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtControlProviderOpenApi", "hy: start wechat out: contactid: %s, countrycode: %s,  phone num: %s", new Object[] { paramUri, Integer.valueOf(i), paramArrayOfString1 });
      if ((bi.oW(paramUri)) || (i < 0) || (bi.oW(paramArrayOfString1)))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtControlProviderOpenApi", "hy: param err");
        cw(3, 3302);
        return com.tencent.mm.pluginsdk.d.a.a.BA(3302);
      }
      paramString1 = new qx();
      paramString1.cbG.cbH = paramUri;
      paramString1.cbG.cbI = i;
      paramString1.cbG.cbJ = paramArrayOfString1;
      paramString1.cbG.bgn = com.tencent.mm.pluginsdk.a.h(paramUri, this.context);
      com.tencent.mm.sdk.b.a.sFg.m(paramString1);
      H(16, 0, 1);
      return com.tencent.mm.pluginsdk.d.a.a.BA(1);
    case 37: 
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ExtControlProviderOpenApi", "getWifiList");
      this.handler = new ag(Looper.getMainLooper());
      paramUri = (MatrixCursor)new ExtControlProviderOpenApi.1(this, paramArrayOfString2).a(this.handler);
      if (paramUri == null)
      {
        H(19, 4, 14);
        return com.tencent.mm.pluginsdk.d.a.a.BA(14);
      }
      H(18, 0, 1);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtControlProviderOpenApi", "returnMatrix syncTaskCur");
      return paramUri;
    case 38: 
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ExtControlProviderOpenApi", "connectWifi");
      this.handler = new ag(Looper.getMainLooper());
      paramUri = (Integer)new ExtControlProviderOpenApi.2(this, paramArrayOfString2).a(this.handler);
      if (paramUri == null)
      {
        H(21, 4, 14);
        return com.tencent.mm.pluginsdk.d.a.a.BA(14);
      }
      H(20, 0, paramUri.intValue());
      return com.tencent.mm.pluginsdk.d.a.a.BA(paramUri.intValue());
    case 42: 
      paramUri = new Intent();
      paramUri.addFlags(131072);
      paramUri.putExtra("key_from_scene", 4);
      if ((paramArrayOfString2 != null) && (paramArrayOfString2.length > 0) && (paramArrayOfString2[0].length() > 0))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtControlProviderOpenApi", "openOffline business_attach:%s,appid:%s", new Object[] { paramArrayOfString2[0], paramArrayOfString1 });
        paramUri.putExtra("key_business_attach", paramArrayOfString2[0]);
      }
      for (;;)
      {
        paramUri.putExtra("key_appid", paramArrayOfString1);
        d.b(this.context, "offline", ".ui.WalletOfflineEntranceUI", paramUri);
        h.mEJ.h(12097, new Object[] { Integer.valueOf(9), Integer.valueOf(0), Long.valueOf(System.currentTimeMillis()) });
        H(24, 0, 1);
        return com.tencent.mm.pluginsdk.d.a.a.BA(1);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtControlProviderOpenApi", "openOffline appid:%s", new Object[] { paramArrayOfString1 });
      }
    case 40: 
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtControlProviderOpenApi", "setSportStep start");
      if ((paramArrayOfString2 == null) || (paramArrayOfString2.length < 3))
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ExtControlProviderOpenApi", "args error: args length error");
        H(23, 3, 2);
        return com.tencent.mm.pluginsdk.d.a.a.BA(2);
      }
      l1 = bi.getLong(paramArrayOfString2[0], -1L);
      long l2 = bi.getLong(paramArrayOfString2[1], -1L);
      long l3 = bi.getLong(paramArrayOfString2[2], -1L);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtControlProviderOpenApi", "setSportStep: timestampe: %s, stepcount: %s,  version: %s", new Object[] { Long.valueOf(l2), Long.valueOf(l1), Long.valueOf(l3) });
      if ((l2 < 0L) || (l1 < 0L) || (l3 < 0L))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtControlProviderOpenApi", "param err");
        H(23, 3, 2);
        return com.tencent.mm.pluginsdk.d.a.a.BA(2);
      }
      aIT();
      paramUri = new fh();
      paramUri.bNx.action = 2;
      paramUri.bNx.bNz = l2;
      paramUri.bNx.bNA = l1;
      paramUri.bNx.bNB = l3;
      if ((com.tencent.mm.sdk.b.a.sFg.m(paramUri)) && (paramUri.bNy.bND))
      {
        H(22, 0, paramUri.bNy.bNE);
        return com.tencent.mm.pluginsdk.d.a.a.BA(paramUri.bNy.bNE);
      }
      H(23, 4, 8);
      return com.tencent.mm.pluginsdk.d.a.a.BA(8);
    case 41: 
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtControlProviderOpenApi", "getSportConfig start");
      aIT();
      paramUri = new fh();
      paramUri.bNx.action = 3;
      if ((com.tencent.mm.sdk.b.a.sFg.m(paramUri)) && (paramUri.bNy.bND))
      {
        paramArrayOfString1 = paramUri.bNy.bNC;
        paramString1 = new MatrixCursor(iJA);
        paramString1.addRow(new Object[] { Integer.valueOf(paramUri.bNy.bNE), bi.oV(paramArrayOfString1) });
        H(22, 0, paramUri.bNy.bNE);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtControlProviderOpenApi", "return  code =%s ", new Object[] { Integer.valueOf(paramUri.bNy.bNE) });
        return paramString1;
      }
      H(23, 4, 8);
      return com.tencent.mm.pluginsdk.d.a.a.BA(8);
    case 46: 
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ExtControlProviderOpenApi", "openClean appid:%s", new Object[] { paramArrayOfString1 });
      au.HU();
      if (!com.tencent.mm.model.c.isSDCardAvailable())
      {
        H(27, 5, 4);
        return com.tencent.mm.pluginsdk.d.a.a.BA(4101);
      }
      paramUri = new Intent();
      paramUri.putExtra("key_from_openapi", true);
      paramUri.putExtra("key_openapi_appid", paramArrayOfString1);
      d.b(this.context, "clean", ".ui.CleanUI", paramUri);
      H(26, 0, 1);
      return com.tencent.mm.pluginsdk.d.a.a.BA(1);
    }
    com.tencent.mm.plugin.ext.c.e.aJh().mContext = this.context;
    if ((paramArrayOfString2 == null) || (paramArrayOfString2.length <= 0))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ExtControlProviderOpenApi", "hy: invalid arg length!");
      return com.tencent.mm.pluginsdk.d.a.a.BA(4201);
    }
    i = bi.getInt(paramArrayOfString2[0], -1);
    if ((i < 0) || ((i != 0) && (i != 1) && (i != 2)))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ExtControlProviderOpenApi", "hy: invalid command!");
      H(32, 3, 2);
      return com.tencent.mm.pluginsdk.d.a.a.BA(4201);
    }
    paramArrayOfString1 = null;
    if ((i == 0) || (i == 1))
    {
      if (paramArrayOfString2.length < 2)
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ExtControlProviderOpenApi", "hy: invalid arg length when check or open!");
        return com.tencent.mm.pluginsdk.d.a.a.BA(4205);
      }
      paramUri = paramArrayOfString2[1];
      if (i == 1)
      {
        if (paramArrayOfString2.length < 3)
        {
          com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ExtControlProviderOpenApi", "hy: not providing md5!");
          return com.tencent.mm.pluginsdk.d.a.a.BA(4208);
        }
        paramArrayOfString1 = paramArrayOfString2[2];
      }
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtControlProviderOpenApi", "hy: cmdid: %d, yuvHandle: %s", new Object[] { Integer.valueOf(i), paramUri });
      switch (i)
      {
      default: 
        return null;
      case 0: 
        paramString1 = com.tencent.mm.plugin.ext.c.e.aJh();
        if (bi.oW(paramUri))
        {
          com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ExtQrCodeHandler", "hy: null handle in doHandleCheckQrCode");
          com.tencent.mm.plugin.ext.c.e.L(null, -1, 4205);
          return com.tencent.mm.pluginsdk.d.a.a.BA(4205);
        }
        paramArrayOfString1 = com.tencent.mm.plugin.ext.c.c.AL(paramUri);
        if ((paramArrayOfString1 != null) && (!bi.oW(paramArrayOfString1.url)))
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtQrCodeHandler", "hy: handled previously. yuvhandle: %s, url: %s. direct return", new Object[] { paramUri, paramArrayOfString1 });
          paramUri = paramArrayOfString1;
        }
        break;
      }
      for (;;)
      {
        if (paramUri.type == 19)
        {
          if (com.tencent.mm.plugin.ext.c.c.AN(paramUri.url))
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtQrCodeHandler", "hy: fastjudge wechat cannot open: %s", new Object[] { paramUri.url.toUpperCase() });
            com.tencent.mm.plugin.ext.c.e.L(paramUri.url, paramUri.type, 4207);
            return com.tencent.mm.pluginsdk.d.a.a.SI(paramUri.url);
            paramUri = com.tencent.mm.plugin.ext.c.e.as(paramUri, false);
            if (paramUri == null)
            {
              com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ExtQrCodeHandler", "hy: not retrieved yuv data in doHandleCheckQrCode");
              com.tencent.mm.plugin.ext.c.e.L(null, -1, 4206);
              return com.tencent.mm.pluginsdk.d.a.a.BA(4206);
            }
            paramUri = paramString1.a(paramUri);
            if ((paramUri == null) || (bi.oW(paramUri.url)))
            {
              com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ExtQrCodeHandler", "hy: not resolved model");
              return com.tencent.mm.pluginsdk.d.a.a.BA(4203);
            }
          }
          else
          {
            if (com.tencent.mm.plugin.ext.c.c.AM(paramUri.url))
            {
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtQrCodeHandler", "hy: wechat can open: %s", new Object[] { paramUri.url });
              com.tencent.mm.plugin.ext.c.e.L(paramUri.url, paramUri.type, 1);
              return com.tencent.mm.pluginsdk.d.a.a.BA(1);
            }
            l1 = bi.VG();
            paramArrayOfString1 = com.tencent.mm.plugin.ext.c.c.AO(paramUri.url);
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtQrCodeHandler", "hy: resolve config: %s, using: %d ms", new Object[] { paramArrayOfString1.toString(), Long.valueOf(bi.bI(l1)) });
            if (paramArrayOfString1 == b.b.iKI)
            {
              com.tencent.mm.plugin.ext.c.c.AJ(paramUri.url);
              com.tencent.mm.plugin.ext.c.e.L(paramUri.url, paramUri.type, 1);
              return com.tencent.mm.pluginsdk.d.a.a.BA(1);
            }
            if (paramArrayOfString1 != b.b.iKH)
            {
              paramArrayOfString1 = paramUri.url;
              i = paramUri.type;
              int j = paramUri.iKW;
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtQrCodeHandler", "hy: start remote judge url: %s", new Object[] { paramArrayOfString1 });
              l1 = System.currentTimeMillis();
              paramArrayOfString1 = (Boolean)new e.2(paramString1, Boolean.valueOf(true), paramArrayOfString1, i, j).a(com.tencent.mm.plugin.ext.c.e.aJj());
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtQrCodeHandler", "hy: can open: %b, using %d ms", new Object[] { paramArrayOfString1, Long.valueOf(System.currentTimeMillis() - l1) });
              if (paramArrayOfString1.booleanValue())
              {
                com.tencent.mm.plugin.ext.c.c.AJ(paramUri.url);
                com.tencent.mm.plugin.ext.c.e.L(paramUri.url, paramUri.type, 1);
                return com.tencent.mm.pluginsdk.d.a.a.BA(1);
              }
            }
            com.tencent.mm.plugin.ext.c.c.AK(paramUri.url);
            com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ExtQrCodeHandler", "hy: remote wechat cannot open: %s", new Object[] { paramUri.url });
            com.tencent.mm.plugin.ext.c.e.L(paramUri.url, paramUri.type, 4207);
            return com.tencent.mm.pluginsdk.d.a.a.SI(paramUri.url);
          }
        }
        else
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtQrCodeHandler", "hy: subapp code. can open");
          return com.tencent.mm.pluginsdk.d.a.a.BA(1);
          paramArrayOfString2 = com.tencent.mm.plugin.ext.c.e.aJh();
          if (bi.oW(paramUri))
          {
            com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ExtQrCodeHandler", "hy: null handle in doHandleOpenQrCode");
            com.tencent.mm.plugin.ext.c.e.M(null, -1, 4205);
            return com.tencent.mm.pluginsdk.d.a.a.BA(4205);
          }
          paramString1 = com.tencent.mm.plugin.ext.c.c.AL(paramUri);
          if ((paramString1 != null) && (!bi.oW(paramString1.url))) {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtQrCodeHandler", "hy: handled previously. yuvhandle: %s, url: %s. direct return", new Object[] { paramUri, paramString1 });
          }
          for (paramUri = paramString1; (paramUri.type == 19) && (com.tencent.mm.plugin.ext.c.c.AN(paramUri.url)); paramUri = paramArrayOfString1)
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtQrCodeHandler", "hy: fastjudge wechat cannot open: %s", new Object[] { paramUri.url });
            com.tencent.mm.plugin.ext.c.e.M(paramUri.url, paramUri.type, 4207);
            return com.tencent.mm.pluginsdk.d.a.a.BA(4207);
            if (bi.oW(paramArrayOfString1))
            {
              com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ExtQrCodeHandler", "hy: md5 not correct!!");
              com.tencent.mm.plugin.ext.c.e.M(null, -1, 4208);
              return com.tencent.mm.pluginsdk.d.a.a.BA(4208);
            }
            paramString1 = com.tencent.mm.plugin.ext.c.e.as(paramUri, true);
            if (paramString1 == null)
            {
              com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ExtQrCodeHandler", "hy: not retrieved yuv data in doHandleOpenQrCode");
              com.tencent.mm.plugin.ext.c.e.M(null, -1, 4206);
              return com.tencent.mm.pluginsdk.d.a.a.BA(4206);
            }
            if (bi.oW(paramString1.bKg))
            {
              com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ExtQrCodeHandler", "hy: cannot retrieve md5 from yuv!");
              com.tencent.mm.plugin.ext.c.e.M(null, -1, 4210);
              return com.tencent.mm.pluginsdk.d.a.a.BA(4210);
            }
            if (!paramString1.bKg.equalsIgnoreCase(paramArrayOfString1))
            {
              com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ExtQrCodeHandler", "hy: yuv data not match!!");
              com.tencent.mm.plugin.ext.c.e.M(null, -1, 4209);
              return com.tencent.mm.pluginsdk.d.a.a.BA(4209);
            }
            paramArrayOfString1 = paramArrayOfString2.a(paramString1);
            if ((paramArrayOfString1 == null) || (bi.oW(paramArrayOfString1.url)))
            {
              com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ExtQrCodeHandler", "hy: not resolved model");
              com.tencent.mm.plugin.ext.c.e.M(null, -1, 4203);
              return com.tencent.mm.pluginsdk.d.a.a.BA(4203);
            }
            com.tencent.mm.plugin.ext.c.c.a(paramUri, paramArrayOfString1);
          }
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtQrCodeHandler", "hy: do open");
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtQrCodeHandler", "hy: start open: %s", new Object[] { paramUri.toString() });
          paramArrayOfString1 = new Intent(paramArrayOfString2.mContext, RedirectToQrCodeStubUI.class);
          paramArrayOfString1.putExtra("K_STR", paramUri.url);
          paramArrayOfString1.putExtra("K_TYPE", paramUri.type);
          paramArrayOfString1.putExtra("K_VERSION", paramUri.iKW);
          paramArrayOfString1.addFlags(268435456);
          paramArrayOfString2.mContext.startActivity(paramArrayOfString1);
          com.tencent.mm.plugin.ext.c.e.M(paramUri.url, paramUri.type, 1);
          return com.tencent.mm.pluginsdk.d.a.a.BA(1);
          com.tencent.mm.plugin.ext.c.e.aJh();
          return com.tencent.mm.plugin.ext.c.e.aJi();
        }
      }
      continue;
      paramUri = null;
    }
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/ext/openapi/provider/ExtControlProviderOpenApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */