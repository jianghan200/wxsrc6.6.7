package com.tencent.mm.plugin.ext.voicecontrol;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.ext.provider.ExtContentProviderBase;
import com.tencent.mm.protocal.c.dk;
import com.tencent.mm.protocal.c.dm;
import com.tencent.mm.protocal.c.dn;
import com.tencent.mm.protocal.c.do;
import com.tencent.mm.protocal.c.dp;
import com.tencent.mm.protocal.c.dq;
import com.tencent.mm.protocal.c.dr;
import com.tencent.mm.protocal.c.ds;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import java.util.LinkedList;

public class ExtControlProviderVoiceControl
  extends ExtContentProviderBase
  implements com.tencent.mm.ab.e
{
  private static final String[] iJr = { "retCode" };
  private Context context;
  private String[] iJE = null;
  private int iJF = -1;
  private int iLb = 4;
  private long iLc;
  private long iLd;
  private long iLe;
  com.tencent.mm.pluginsdk.d.a.b iLf = new com.tencent.mm.pluginsdk.d.a.b();
  private long iLg = 0L;
  private boolean iLh;
  private com.qq.wx.voice.embed.recognizer.c iLi = new ExtControlProviderVoiceControl.5(this);
  
  public ExtControlProviderVoiceControl(String[] paramArrayOfString, int paramInt, Context paramContext)
  {
    this.iJE = paramArrayOfString;
    this.iJF = paramInt;
    this.context = paramContext;
  }
  
  private void AP(String paramString)
  {
    au.HU();
    ab localab = com.tencent.mm.model.c.FR().Yg(paramString);
    if ((localab == null) || (!com.tencent.mm.l.a.gd(localab.field_type)))
    {
      x.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] username is not contact, countDown");
      this.iLb = 3505;
      this.iLf.countDown();
      return;
    }
    com.tencent.mm.compatible.a.a.a(11, new ExtControlProviderVoiceControl.6(this, paramString));
    this.iLb = 1;
    x.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] jump to chattingUI : %s, countDown", new Object[] { paramString });
    this.iLf.countDown();
  }
  
  private static boolean a(a parama, int paramInt1, int paramInt2)
  {
    if (parama == null)
    {
      x.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadVoiceContinue netscene null");
      return false;
    }
    if (parama.iLt == null)
    {
      x.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadVoiceContinue uploadCmd null");
      return false;
    }
    if (parama.iLt.rdN == null)
    {
      x.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadVoiceContinue UploadCtx null");
      return false;
    }
    new dq();
    Object localObject = parama.iLt;
    ((dq)localObject).rdN.rdW = paramInt1;
    ((dq)localObject).rdN.rdX = paramInt2;
    byte[] arrayOfByte = com.tencent.mm.a.e.f(parama.iLs, paramInt1, paramInt2);
    x.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadVoiceContinue %s, startPos=%s, dataLen=%s", new Object[] { Integer.valueOf(parama.iLq), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((arrayOfByte == null) || (arrayOfByte.length <= 0))
    {
      x.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] buf empty, %s", new Object[] { parama.iLs });
      return false;
    }
    ((dq)localObject).rdU = com.tencent.mm.bk.b.bi(arrayOfByte);
    localObject = new a(parama.iLq, parama.appId, parama.dHI, parama.iLs, (dq)localObject);
    ((a)localObject).dHJ = parama.dHJ;
    au.DF().a((l)localObject, 0);
    return true;
  }
  
  public static boolean b(String paramString1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString2)
  {
    x.i("MicroMsg.ext.ExtControlProviderVoiceControl", "uploadVoiceStart ");
    Object localObject1;
    if (paramInt1 != 4)
    {
      localObject2 = paramString2 + ".speex";
      new com.tencent.mm.e.c.d();
      localObject1 = localObject2;
      if (!com.tencent.mm.e.c.d.C(paramString2, (String)localObject2))
      {
        x.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] decodePCMToSpeex error,pcmPath:%s,speexFilePath:%s", new Object[] { paramString2, localObject2 });
        return false;
      }
    }
    else
    {
      localObject1 = paramString2;
    }
    int i = com.tencent.mm.a.e.cm((String)localObject1);
    Object localObject2 = new ds();
    ((ds)localObject2).rdY = 4;
    ((ds)localObject2).rdZ = 4;
    ((ds)localObject2).rea = paramInt3;
    ((ds)localObject2).reb = paramInt4;
    dr localdr = new dr();
    localdr.rdV = i;
    localdr.rdW = 0;
    if (i <= 16384) {
      localdr.rdX = i;
    }
    for (paramString2 = com.tencent.mm.a.e.f((String)localObject1, 0, i);; paramString2 = com.tencent.mm.a.e.f((String)localObject1, 0, 16384))
    {
      x.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadVoice appId=%s, FileType=%s, EncodeType=%s, sampleRate=%s, bps=%s, fileLen=%s, limit=%s", new Object[] { paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(i), Integer.valueOf(16384) });
      if ((paramString2 != null) && (paramString2.length > 0)) {
        break;
      }
      x.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] buf empty");
      return false;
      localdr.rdX = 16384;
    }
    dq localdq = new dq();
    localdq.rdT = ((ds)localObject2);
    localdq.rdN = localdr;
    localdq.rdU = com.tencent.mm.bk.b.bi(paramString2);
    paramInt1 = bi.VF().hashCode();
    if (paramInt1 != Integer.MIN_VALUE) {}
    for (paramInt1 = Math.abs(paramInt1);; paramInt1 = Integer.MIN_VALUE)
    {
      paramString1 = new a(paramInt1, paramString1, i, (String)localObject1, localdq);
      au.DF().a(paramString1, 0);
      return true;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, final String paramString, l paraml)
  {
    x.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] onSceneEnd errType=%s, errCode=%s, errMsg=%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (paraml == null)
    {
      x.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] scene null, countDown");
      this.iLb = 3506;
      this.iLf.countDown();
    }
    final a locala;
    label333:
    label338:
    do
    {
      do
      {
        do
        {
          return;
          if ((paramInt1 != 0) || (paramInt2 != 0))
          {
            x.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] errType、errCode not ok, countDown");
            this.iLb = 3507;
            this.iLf.countDown();
            return;
          }
          x.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] scene.getType()=%s", new Object[] { Integer.valueOf(paraml.getType()) });
        } while (paraml.getType() != 985);
        if (this.iLh)
        {
          x.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] localVoiceControlSucess, no need to process");
          return;
        }
        locala = (a)paraml;
        paramString = (a)paraml;
        if ((paramString.diG != null) && (paramString.diG.dIE.dIL != null)) {}
        for (paramString = (dm)paramString.diG.dIE.dIL; paramString == null; paramString = null)
        {
          x.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] resp null, countDown");
          this.iLb = 3508;
          this.iLf.countDown();
          return;
        }
        locala.iLr = paramString.rdG;
        paramInt1 = locala.bNI;
        if (paramString.rdG == null)
        {
          paraml = "null";
          x.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] opCode=%s, resp.Cookies=%s", new Object[] { Integer.valueOf(paramInt1), paraml });
          if (locala.bNI != 1) {
            break label333;
          }
        }
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          if (paramInt1 == 0) {
            break label604;
          }
          if (paramString.rdN != null) {
            break label338;
          }
          x.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] resp.UploadCtx is null");
          this.iLb = 3508;
          this.iLf.countDown();
          return;
          paraml = new String(paramString.rdG.lR);
          break;
        }
        x.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadMode resp: Interval=%s, Timeout=%s, StartPos=%s, DataLen=%s", new Object[] { Integer.valueOf(paramString.rdL), Integer.valueOf(paramString.rdM), Integer.valueOf(paramString.rdN.rdW), Integer.valueOf(paramString.rdN.rdX) });
        if (paramString.rdN.rdW >= locala.dHI)
        {
          ah.i(new Runnable()
          {
            public final void run()
            {
              x.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] getResultMode getVoiceControlResult");
              a locala = locala;
              int i = paramString.rdM;
              x.i("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] setGetResultTimeOut %s", new Object[] { Integer.valueOf(i) });
              locala.iLv = i;
              ExtControlProviderVoiceControl.this.a(locala.iLq, locala.appId, locala.iLr);
            }
          }, paramString.rdL);
          return;
        }
        x.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] continue upload voice");
        if ((paramString.rdN.rdW != 0) && (paramString.rdN.rdW == locala.dHJ))
        {
          x.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] avoid duplicate doscene");
          return;
        }
        locala.dHJ = paramString.rdN.rdW;
        if (paramString.rdN.rdW + paramString.rdN.rdX >= locala.dHI) {
          break;
        }
      } while (a(locala, paramString.rdN.rdW, paramString.rdN.rdX));
      x.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadVoiceContinue fail1, countDown");
      this.iLb = 3510;
      this.iLf.countDown();
      return;
    } while (a(locala, paramString.rdN.rdW, locala.dHI - paramString.rdN.rdW));
    x.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadVoiceContinue fail2, countDown");
    this.iLb = 3510;
    this.iLf.countDown();
    return;
    label604:
    label615:
    long l1;
    if (locala.bNI == 2)
    {
      paramInt1 = 1;
      if (paramInt1 == 0) {
        break label706;
      }
      x.i("MicroMsg.ext.ExtControlProviderVoiceControl", "");
      l1 = System.currentTimeMillis() - locala.iLw;
      if (l1 <= locala.iLv) {
        break label708;
      }
      x.w("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] isGetResultTimeOut %s, %s", new Object[] { Long.valueOf(l1), Integer.valueOf(locala.iLv) });
    }
    for (paramInt1 = 1;; paramInt1 = 0)
    {
      if (paramInt1 == 0) {
        break label745;
      }
      this.iLb = 3509;
      this.iLf.countDown();
      return;
      paramInt1 = 0;
      break label615;
      label706:
      break;
      label708:
      x.i("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] time %s, %s", new Object[] { Long.valueOf(l1), Integer.valueOf(locala.iLv) });
    }
    label745:
    if (paramString.rdO != null) {
      x.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] getResultMode resp VoiceId=%s, RecognizeRet=%s", new Object[] { Integer.valueOf(paramString.rdO.rdH), Integer.valueOf(paramString.rdO.rdP) });
    }
    if ((paramString.rdO == null) || (paramString.rdO.rdP != 0))
    {
      if (System.currentTimeMillis() - this.iLe >= paramString.rdL)
      {
        ah.A(new ExtControlProviderVoiceControl.3(this, locala));
        return;
      }
      long l2 = paramString.rdL - (System.currentTimeMillis() - this.iLe);
      l1 = l2;
      if (l2 > paramString.rdL) {
        l1 = paramString.rdL;
      }
      ah.i(new ExtControlProviderVoiceControl.4(this, locala), l1);
      return;
    }
    if (paramString.rdO.rdQ == null)
    {
      x.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] SearchContactResultInfo null, countDown");
      this.iLb = 3511;
      this.iLf.countDown();
      return;
    }
    if ((paramString.rdO.rdQ.rdR == null) || (paramString.rdO.rdQ.rdR.size() <= 0))
    {
      x.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] SearchContactResultInfo.Items null, countDown");
      this.iLb = 3511;
      this.iLf.countDown();
      return;
    }
    if (paramString.rdO.rdQ.rdR.size() == 0)
    {
      this.iLb = 3511;
      this.iLf.countDown();
      return;
    }
    if (paramString.rdO.rdQ.rdR.size() == 1)
    {
      AP(((dp)paramString.rdO.rdQ.rdR.get(0)).rdS);
      return;
    }
    paraml = new String[paramString.rdO.rdQ.rdR.size()];
    paramInt1 = 0;
    while (paramInt1 < paraml.length)
    {
      paraml[paramInt1] = ((dp)paramString.rdO.rdQ.rdR.get(paramInt1)).rdS;
      x.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] resp result item: %s", new Object[] { paraml[paramInt1] });
      paramInt1 += 1;
    }
    paramString = new Intent();
    paramString.putExtra("VoiceSearchResultUI_Resultlist", paraml);
    paramString.putExtra("VoiceSearchResultUI_VoiceId", locala.iLq);
    paramString.putExtra("VoiceSearchResultUI_IsVoiceControl", true);
    paramString.setFlags(67108864);
    paramString.putExtra("VoiceSearchResultUI_ShowType", 1);
    com.tencent.mm.bg.d.e(this.context, ".ui.voicesearch.VoiceSearchResultUI", paramString);
    x.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] scene end countDown");
    this.iLb = 1;
    this.iLf.countDown();
  }
  
  public final boolean a(int paramInt, String paramString, com.tencent.mm.bk.b paramb)
  {
    x.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] getVoiceControlResult voiceId=%s, appId=%s", new Object[] { Integer.valueOf(paramInt), paramString });
    if (this.iLd == 0L) {
      this.iLd = System.currentTimeMillis();
    }
    this.iLe = System.currentTimeMillis();
    dk localdk = new dk();
    localdk.rdG = paramb;
    paramString = new a(paramInt, paramString, localdk, this.iLd);
    au.DF().a(paramString, 0);
    return true;
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    x.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] query(), ApiId=%s", new Object[] { Integer.valueOf(this.iJF) });
    this.iLc = 0L;
    this.iLd = 0L;
    a(paramUri, this.context, this.iJF, this.iJE);
    if (paramUri == null)
    {
      x.e("MicroMsg.ext.ExtControlProviderVoiceControl", "uri == null");
      cw(3, 5);
      return com.tencent.mm.pluginsdk.d.a.a.BA(5);
    }
    long l1 = System.currentTimeMillis();
    if (bi.oW(this.iJN))
    {
      x.e("MicroMsg.ext.ExtControlProviderVoiceControl", "AppID == null");
      cw(3, 7);
      return com.tencent.mm.pluginsdk.d.a.a.BA(7);
    }
    if (bi.oW(aIW()))
    {
      x.e("MicroMsg.ext.ExtControlProviderVoiceControl", "PkgName == null");
      cw(3, 6);
      return com.tencent.mm.pluginsdk.d.a.a.BA(6);
    }
    long l2 = System.currentTimeMillis();
    long l3 = System.currentTimeMillis();
    long l4 = System.currentTimeMillis();
    int i = aIX();
    if (i != 1)
    {
      x.e("MicroMsg.ext.ExtControlProviderVoiceControl", "invalid appid ! return code = " + i);
      cw(2, i);
      return com.tencent.mm.pluginsdk.d.a.a.BA(i);
    }
    x.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[extApiCost][voiceControl] getAppIdAndPkg = %s, checkIsLogin = %s", new Object[] { Long.valueOf(l2 - l1), Long.valueOf(l4 - l3) });
    switch (this.iJF)
    {
    default: 
      cw(3, 15);
      return com.tencent.mm.pluginsdk.d.a.a.BA(15);
    }
    x.i("MicroMsg.ext.ExtControlProviderVoiceControl", "voiceControl");
    if ((paramArrayOfString2 == null) || (paramArrayOfString2.length < 4))
    {
      x.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] wrong args");
      cw(3, 3501);
      this.iLb = 3501;
      return com.tencent.mm.pluginsdk.d.a.a.BA(3501);
    }
    paramUri = paramArrayOfString2[0];
    paramArrayOfString1 = paramArrayOfString2[1];
    paramString1 = paramArrayOfString2[2];
    paramString2 = paramArrayOfString2[3];
    paramArrayOfString2 = paramArrayOfString2[4];
    x.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] args: %s, %s, %s, %s %s", new Object[] { paramUri, paramArrayOfString1, paramString1, paramString2, paramArrayOfString2 });
    if ((bi.oW(paramUri)) || (bi.oW(paramArrayOfString1)) || (bi.oW(paramString1)) || (bi.oW(paramString2)) || (bi.oW(paramArrayOfString2)))
    {
      cw(3, 3502);
      x.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] wrong args");
      return com.tencent.mm.pluginsdk.d.a.a.BA(3502);
    }
    if (!com.tencent.mm.a.e.cn(paramArrayOfString2))
    {
      x.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] speex file not exist");
      cw(3, 3503);
      return com.tencent.mm.pluginsdk.d.a.a.BA(3503);
    }
    this.iLc = System.currentTimeMillis();
    au.DF().a(985, this);
    this.iLf.b(13000L, new ExtControlProviderVoiceControl.1(this, paramUri, paramArrayOfString2, paramArrayOfString1, paramString1, paramString2));
    x.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[extApiCost][voiceControl] finish uploadVoice = %s, getResult = %s", new Object[] { Long.valueOf(this.iLd - this.iLc), Long.valueOf(System.currentTimeMillis() - this.iLd) });
    au.DF().b(985, this);
    H(10, 0, 1);
    if (1 != this.iLb) {
      H(11, 4, 1);
    }
    for (;;)
    {
      pr(0);
      return com.tencent.mm.pluginsdk.d.a.a.BA(this.iLb);
      H(10, 0, 1);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/ext/voicecontrol/ExtControlProviderVoiceControl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */