package com.tencent.mm.plugin.ipcall;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.R.g;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.b.f.a;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.ipcall.a.b.a.1;
import com.tencent.mm.plugin.ipcall.a.b.b.a;
import com.tencent.mm.plugin.ipcall.a.b.c.a;
import com.tencent.mm.plugin.ipcall.a.g.a;
import com.tencent.mm.plugin.ipcall.a.g.k;
import com.tencent.mm.plugin.ipcall.a.g.l;
import com.tencent.mm.plugin.ipcall.a.g.m;
import com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver.a;
import com.tencent.mm.plugin.voip.model.p;
import com.tencent.mm.plugin.voip.model.p.a;
import com.tencent.mm.plugin.voip.model.r;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.plugin.voip.video.i.7;
import com.tencent.mm.plugin.voip.video.i.8;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;

public final class c
  implements com.tencent.mm.plugin.ipcall.a.c.a.a, g.a, p.a
{
  public static ag dvh = new ag(Looper.getMainLooper());
  private com.tencent.mm.sdk.platformtools.al bAZ;
  public Object iVA = new Object();
  public e knQ;
  public k knR;
  public boolean knS = false;
  public TelephonyManager knT;
  public PhoneStateListener knU = new c.1(this);
  public com.tencent.mm.sdk.b.c knV = new c.2(this);
  public Runnable knW = new c.3(this);
  public Runnable knX = new Runnable()
  {
    /* Error */
    public final void run()
    {
      // Byte code:
      //   0: iconst_0
      //   1: istore_1
      //   2: iconst_1
      //   3: istore 4
      //   5: invokestatic 27	com/tencent/mm/plugin/ipcall/a/i:aXz	()Lcom/tencent/mm/plugin/voip/video/i;
      //   8: astore 6
      //   10: getstatic 33	com/tencent/mm/R$k:ipcall_phonering	I
      //   13: istore_2
      //   14: aload 6
      //   16: iconst_0
      //   17: putfield 38	com/tencent/mm/plugin/voip/video/i:oVe	I
      //   20: iload_2
      //   21: ifne +10 -> 31
      //   24: aload 6
      //   26: iconst_1
      //   27: invokevirtual 42	com/tencent/mm/plugin/voip/video/i:iY	(Z)V
      //   30: return
      //   31: ldc2_w 43
      //   34: ldc2_w 45
      //   37: lcmp
      //   38: ifeq +230 -> 268
      //   41: invokestatic 52	com/tencent/mm/model/au:HU	()Lcom/tencent/mm/model/c;
      //   44: pop
      //   45: invokestatic 58	com/tencent/mm/model/c:DT	()Lcom/tencent/mm/storage/x;
      //   48: ldc 59
      //   50: iconst_1
      //   51: invokestatic 65	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
      //   54: invokevirtual 71	com/tencent/mm/storage/x:get	(ILjava/lang/Object;)Ljava/lang/Object;
      //   57: checkcast 61	java/lang/Boolean
      //   60: invokevirtual 75	java/lang/Boolean:booleanValue	()Z
      //   63: istore_3
      //   64: ldc 77
      //   66: ldc 79
      //   68: iconst_3
      //   69: anewarray 4	java/lang/Object
      //   72: dup
      //   73: iconst_0
      //   74: iload_3
      //   75: invokestatic 65	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
      //   78: aastore
      //   79: dup
      //   80: iconst_1
      //   81: invokestatic 84	com/tencent/mm/k/a:Am	()Z
      //   84: invokestatic 65	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
      //   87: aastore
      //   88: dup
      //   89: iconst_2
      //   90: iconst_1
      //   91: invokestatic 65	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
      //   94: aastore
      //   95: invokestatic 90	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   98: iload 4
      //   100: istore_3
      //   101: iload_3
      //   102: ifeq -72 -> 30
      //   105: aload 6
      //   107: getfield 94	com/tencent/mm/plugin/voip/video/i:bwu	Z
      //   110: ifne -80 -> 30
      //   113: aload 6
      //   115: invokestatic 100	java/lang/System:currentTimeMillis	()J
      //   118: putfield 104	com/tencent/mm/plugin/voip/video/i:oVf	J
      //   121: aload 6
      //   123: new 106	com/tencent/mm/compatible/b/j
      //   126: dup
      //   127: invokespecial 107	com/tencent/mm/compatible/b/j:<init>	()V
      //   130: putfield 111	com/tencent/mm/plugin/voip/video/i:oVd	Landroid/media/MediaPlayer;
      //   133: ldc 77
      //   135: ldc 113
      //   137: iconst_2
      //   138: anewarray 4	java/lang/Object
      //   141: dup
      //   142: iconst_0
      //   143: invokestatic 117	com/tencent/mm/model/au:HV	()Lcom/tencent/mm/compatible/b/f;
      //   146: invokevirtual 122	com/tencent/mm/compatible/b/f:yE	()Z
      //   149: invokestatic 65	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
      //   152: aastore
      //   153: dup
      //   154: iconst_1
      //   155: invokestatic 117	com/tencent/mm/model/au:HV	()Lcom/tencent/mm/compatible/b/f;
      //   158: invokevirtual 125	com/tencent/mm/compatible/b/f:yK	()Z
      //   161: invokestatic 65	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
      //   164: aastore
      //   165: invokestatic 128	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   168: getstatic 134	com/tencent/mm/compatible/e/q:deN	Lcom/tencent/mm/compatible/e/b;
      //   171: getfield 139	com/tencent/mm/compatible/e/b:dce	I
      //   174: iflt +10 -> 184
      //   177: getstatic 134	com/tencent/mm/compatible/e/q:deN	Lcom/tencent/mm/compatible/e/b;
      //   180: getfield 139	com/tencent/mm/compatible/e/b:dce	I
      //   183: istore_1
      //   184: aload 6
      //   186: iconst_0
      //   187: invokevirtual 142	com/tencent/mm/plugin/voip/video/i:iX	(Z)V
      //   190: aload 6
      //   192: iload_2
      //   193: ldc2_w 43
      //   196: iconst_1
      //   197: iload_1
      //   198: invokevirtual 146	com/tencent/mm/plugin/voip/video/i:a	(IJZI)V
      //   201: aload 6
      //   203: iconst_1
      //   204: putfield 94	com/tencent/mm/plugin/voip/video/i:bwu	Z
      //   207: return
      //   208: astore 5
      //   210: ldc 77
      //   212: new 148	java/lang/StringBuilder
      //   215: dup
      //   216: ldc -106
      //   218: invokespecial 153	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   221: aload 5
      //   223: invokevirtual 157	java/lang/Exception:toString	()Ljava/lang/String;
      //   226: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   229: invokevirtual 162	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   232: invokestatic 166	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   235: return
      //   236: astore 5
      //   238: iconst_1
      //   239: istore_3
      //   240: ldc 77
      //   242: new 148	java/lang/StringBuilder
      //   245: dup
      //   246: ldc -88
      //   248: invokespecial 153	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   251: aload 5
      //   253: invokevirtual 171	java/lang/Exception:getMessage	()Ljava/lang/String;
      //   256: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   259: invokevirtual 162	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   262: invokestatic 166	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   265: goto -164 -> 101
      //   268: aload 6
      //   270: iload_2
      //   271: iconst_2
      //   272: iconst_1
      //   273: invokevirtual 175	com/tencent/mm/plugin/voip/video/i:m	(IIZ)V
      //   276: return
      //   277: astore 5
      //   279: goto -39 -> 240
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	282	0	this	4
      //   1	197	1	i	int
      //   13	258	2	j	int
      //   63	177	3	bool1	boolean
      //   3	96	4	bool2	boolean
      //   208	14	5	localException1	Exception
      //   236	16	5	localException2	Exception
      //   277	1	5	localException3	Exception
      //   8	261	6	locali	com.tencent.mm.plugin.voip.video.i
      // Exception table:
      //   from	to	target	type
      //   113	168	208	java/lang/Exception
      //   168	184	208	java/lang/Exception
      //   184	207	208	java/lang/Exception
      //   41	64	236	java/lang/Exception
      //   64	98	277	java/lang/Exception
    }
  };
  public boolean knY;
  public com.tencent.mm.plugin.voip.ui.a knZ = new c.5(this);
  private long koa = 0L;
  
  public static boolean EL(String paramString)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.IPCallManager", "dialWhenTalking, dialButton: %s", new Object[] { paramString });
    if (!com.tencent.mm.plugin.ipcall.a.i.aXt().aXm()) {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallManager", "ipcall not connect, cannot call dialWhenTalking now");
    }
    for (;;)
    {
      return false;
      if ((!bi.oW(paramString)) && (paramString.length() == 1))
      {
        int i;
        if ((!bi.oW(paramString)) && (paramString.length() == 1))
        {
          i = paramString.charAt(0);
          if ((i >= 48) && (i <= 57)) {
            i -= 48;
          }
        }
        while (i != -1)
        {
          paramString = com.tencent.mm.plugin.ipcall.a.i.aXq();
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.IPCallEngineManager", "sendDTMF: %d", new Object[] { Integer.valueOf(i) });
          com.tencent.mm.plugin.ipcall.a.c.b localb = com.tencent.mm.plugin.ipcall.a.i.aXr();
          localb.kre += 1;
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallReportHelper", "now addCallClickCnt %d", new Object[] { Integer.valueOf(localb.kre) });
          i = paramString.kqx.SendDTMF(i);
          if (i < 0) {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallEngineManager", "sendDTMF failed, ret: %d", new Object[] { Integer.valueOf(i) });
          }
          return true;
          if (i == 42) {
            i = 10;
          } else if (i == 35) {
            i = 11;
          } else if ((i >= 65) && (i <= 68)) {
            i = i - 65 + 12;
          } else {
            i = -1;
          }
        }
      }
    }
  }
  
  private boolean L(int paramInt1, int paramInt2, int paramInt3)
  {
    ??? = com.tencent.mm.plugin.ipcall.a.i.aXp().koG;
    if (!com.tencent.mm.plugin.ipcall.a.i.aXt().rv(paramInt1))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallManager", "finishIPCall, cannot finish now, currentState: %s", new Object[] { com.tencent.mm.plugin.ipcall.a.f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aXt().mCurrentState) });
      if (??? != null) {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallManager", "finishIPCall, cannot finish now inviteId:%d, roomId:%d, state:%d,errStatus:%d, pstnErrCode:%d", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.ipcall.a.a.c)???).kpr), Integer.valueOf(((com.tencent.mm.plugin.ipcall.a.a.c)???).kpo), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      }
      return false;
    }
    if (??? != null) {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallManager", "finishIPCall inviteId:%d, roomId:%d, state:%d, errStatus:%d, pstnErrCode:%d", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.ipcall.a.a.c)???).kpr), Integer.valueOf(((com.tencent.mm.plugin.ipcall.a.a.c)???).kpo), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallManager", "closeDeviceEngine");
    p.bKK().bKM();
    p.bKK().oMP = null;
    ??? = com.tencent.mm.plugin.ipcall.a.i.aXr();
    ??? = com.tencent.mm.plugin.ipcall.a.i.aXs();
    label312:
    Object localObject6;
    if (((com.tencent.mm.plugin.ipcall.a.b.b)???).kqc != null)
    {
      ??? = ((com.tencent.mm.plugin.ipcall.a.b.b)???).kqc;
      if (((com.tencent.mm.plugin.ipcall.a.b.c)???).kql != null)
      {
        i = ((com.tencent.mm.plugin.ipcall.a.b.c)???).kql.bDF;
        if (((com.tencent.mm.plugin.ipcall.a.c.b)???).krb == 0) {
          ((com.tencent.mm.plugin.ipcall.a.c.b)???).krb = i;
        }
        ??? = com.tencent.mm.plugin.ipcall.a.i.aXr();
        ??? = com.tencent.mm.plugin.ipcall.a.i.aXs();
        if (((com.tencent.mm.plugin.ipcall.a.b.b)???).kqb == null) {
          break label1735;
        }
        ??? = ((com.tencent.mm.plugin.ipcall.a.b.b)???).kqb;
        if (((com.tencent.mm.plugin.ipcall.a.b.a)???).kpV == null) {
          break label1729;
        }
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.IPCallAudioPlayer", "AudioPlayer  mAudioPlayErrState:" + ((com.tencent.mm.plugin.ipcall.a.b.a)???).kpV.bJw());
        i = ((com.tencent.mm.plugin.ipcall.a.b.a)???).kpV.bJw();
        if (((com.tencent.mm.plugin.ipcall.a.c.b)???).krc == 0) {
          ((com.tencent.mm.plugin.ipcall.a.c.b)???).krc = i;
        }
        ??? = com.tencent.mm.plugin.ipcall.a.i.aXs();
        ??? = com.tencent.mm.plugin.ipcall.a.i.aXq();
        i = 0;
        if (((com.tencent.mm.plugin.ipcall.a.b.b)???).kqb != null)
        {
          localObject6 = ((com.tencent.mm.plugin.ipcall.a.b.b)???).kqb;
          if ((((com.tencent.mm.plugin.ipcall.a.b.a)localObject6).kpV == null) || (!((com.tencent.mm.plugin.ipcall.a.b.a)localObject6).bTv)) {
            break label1741;
          }
          i = ((com.tencent.mm.plugin.ipcall.a.b.a)localObject6).kpV.bJx();
        }
        label381:
        if (i != -1) {
          break label1747;
        }
        i = 0;
        label390:
        ((com.tencent.mm.plugin.ipcall.a.c.a)???).kqx.oOK = i;
        ((com.tencent.mm.plugin.ipcall.a.b.b)???).epT.zY();
        localObject6 = ((com.tencent.mm.plugin.ipcall.a.b.b)???).kqb;
        if (((com.tencent.mm.plugin.ipcall.a.b.a)localObject6).bTv) {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallAudioPlayer", "stopPlay");
        }
        synchronized (((com.tencent.mm.plugin.ipcall.a.b.a)localObject6).kpW)
        {
          com.tencent.mm.sdk.f.e.post(new com.tencent.mm.plugin.ipcall.a.b.a.a((com.tencent.mm.plugin.ipcall.a.b.a)localObject6, ((com.tencent.mm.plugin.ipcall.a.b.a)localObject6).kpV), "IPCallAudioPlayer_stop");
          ((com.tencent.mm.plugin.ipcall.a.b.a)localObject6).bTv = false;
          ((com.tencent.mm.plugin.ipcall.a.b.a)localObject6).kpV = null;
          ((com.tencent.mm.plugin.ipcall.a.b.b)???).bGc = null;
          ((com.tencent.mm.plugin.ipcall.a.b.b)???).kqe.ej(ad.getContext());
          au.HV().yC();
          au.HV().b((f.a)???);
          ((com.tencent.mm.plugin.ipcall.a.b.b)???).kqh = null;
          ((com.tencent.mm.plugin.ipcall.a.b.b)???).kqf = null;
          ??? = com.tencent.mm.plugin.ipcall.a.i.aXs();
          localObject6 = ((com.tencent.mm.plugin.ipcall.a.b.b)???).kqc;
          if (((com.tencent.mm.plugin.ipcall.a.b.c)localObject6).bTv) {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallRecorder", "stop record");
          }
        }
      }
    }
    for (;;)
    {
      synchronized (((com.tencent.mm.plugin.ipcall.a.b.c)localObject6).kqm)
      {
        if (((com.tencent.mm.plugin.ipcall.a.b.c)localObject6).kql != null)
        {
          com.tencent.mm.sdk.f.e.post(new c.a((com.tencent.mm.plugin.ipcall.a.b.c)localObject6, ((com.tencent.mm.plugin.ipcall.a.b.c)localObject6).kql), "IPCallRecorder_stopRecord");
          ((com.tencent.mm.plugin.ipcall.a.b.c)localObject6).kql = null;
          ((com.tencent.mm.plugin.ipcall.a.b.c)localObject6).bTv = false;
          ((com.tencent.mm.plugin.ipcall.a.b.c)localObject6).hEj = false;
        }
        ((com.tencent.mm.plugin.ipcall.a.b.b)???).bGc = null;
        ??? = com.tencent.mm.plugin.ipcall.a.i.aXq();
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallEngineManager", "close engine");
        ((com.tencent.mm.plugin.ipcall.a.c.a)???).kqx.iT(true);
        ??? = com.tencent.mm.plugin.ipcall.a.i.aXr();
        boolean bool;
        if ((bi.oW(((com.tencent.mm.plugin.ipcall.a.c.b)???).kqW)) && (bi.oW(((com.tencent.mm.plugin.ipcall.a.c.b)???).kqV)))
        {
          Object localObject7 = com.tencent.mm.plugin.ipcall.a.i.aXp().koG;
          localObject6 = com.tencent.mm.plugin.ipcall.a.i.aXq().kqx;
          if (((com.tencent.mm.plugin.ipcall.a.c.b)???).kqL == 1)
          {
            i = 1;
            int j = ((com.tencent.mm.plugin.ipcall.a.a.c)localObject7).kpK;
            localObject7 = ((v2protocal)localObject6).oPM;
            int k = ((v2protocal)localObject6).oPM.length;
            if (i == 0) {
              break label1802;
            }
            i = 1;
            ((v2protocal)localObject6).getPstnChannelInfo((byte[])localObject7, k, i, j);
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.Voip", "field_pstnChannelInfoLength: %d", new Object[] { Integer.valueOf(((v2protocal)localObject6).field_pstnChannelInfoLength) });
            ((com.tencent.mm.plugin.ipcall.a.c.b)???).kqW = new String(((v2protocal)localObject6).oPM, 0, ((v2protocal)localObject6).field_pstnChannelInfoLength);
            localObject6 = com.tencent.mm.plugin.ipcall.a.i.aXq().kqx;
            ((v2protocal)localObject6).getPstnEngineInfo(((v2protocal)localObject6).oPN, ((v2protocal)localObject6).oPN.length);
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.Voip", "field_pstnEngineInfoLength: %d", new Object[] { Integer.valueOf(((v2protocal)localObject6).field_pstnEngineInfoLength) });
            ((com.tencent.mm.plugin.ipcall.a.c.b)???).kqV = new String(((v2protocal)localObject6).oPN, 0, ((v2protocal)localObject6).field_pstnEngineInfoLength);
            localObject6 = com.tencent.mm.plugin.ipcall.a.i.aXq().kqx;
            i = v2protocal.ovW;
            ((com.tencent.mm.plugin.ipcall.a.c.b)???).kqX = (v2protocal.bLs() + "," + ((v2protocal)localObject6).oOL + "," + (i & 0xFF) + ((v2protocal)localObject6).bLx() + "," + ((v2protocal)localObject6).oOK);
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.IPCallReportHelper", "nativeChannelReportString: %s", new Object[] { ((com.tencent.mm.plugin.ipcall.a.c.b)???).kqW });
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.IPCallReportHelper", "nativeEngineReportString: %s", new Object[] { ((com.tencent.mm.plugin.ipcall.a.c.b)???).kqV });
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.IPCallReportHelper", "clientReportExString: %s", new Object[] { ((com.tencent.mm.plugin.ipcall.a.c.b)???).kqX });
          }
        }
        else
        {
          ((com.tencent.mm.plugin.ipcall.a.c.a)???).kqx.reset();
          ((com.tencent.mm.plugin.ipcall.a.c.a)???).aXL();
          com.tencent.mm.plugin.ipcall.a.i.aXz().stop();
          ??? = com.tencent.mm.plugin.ipcall.a.i.aXz();
          i = R.k.playend;
          com.tencent.mm.plugin.ipcall.a.i.aXs();
          bool = au.HV().daT.isSpeakerphoneOn();
          ((com.tencent.mm.plugin.voip.video.i)???).mContext.getSharedPreferences(ad.chY(), 0).getBoolean("settings_shake", true);
          au.HV().setSpeakerphoneOn(bool);
          if (!bool) {
            break label1808;
          }
          au.HV().setMode(0);
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RingPlayer", "playSound, shake: %s, isSpeakerOn: %s, type: %s", new Object[] { Boolean.valueOf(false), Boolean.valueOf(bool), Integer.valueOf(2) });
          ((com.tencent.mm.plugin.voip.video.i)???).oVg = System.currentTimeMillis();
          ??? = new com.tencent.mm.compatible.b.j();
        }
        try
        {
          ((MediaPlayer)???).setDataSource(((com.tencent.mm.plugin.voip.video.i)???).mContext, Uri.parse("android.resource://" + ((com.tencent.mm.plugin.voip.video.i)???).mContext.getPackageName() + "/" + i));
          ((MediaPlayer)???).setOnCompletionListener(new i.7((com.tencent.mm.plugin.voip.video.i)???));
          ((MediaPlayer)???).setOnErrorListener(new i.8((com.tencent.mm.plugin.voip.video.i)???));
          if (au.HV().yE()) {
            break label2324;
          }
          if (bool) {
            break label1818;
          }
        }
        catch (Throwable localThrowable)
        {
          long l2;
          long l3;
          float f;
          com.tencent.mm.sdk.platformtools.x.w("MicroMsg.RingPlayer", "playSound Failed Throwable t = ", new Object[] { localThrowable });
          ((com.tencent.mm.plugin.voip.video.i)localObject2).oVe = 6;
          ((MediaPlayer)localObject5).stop();
          ((MediaPlayer)localObject5).release();
          continue;
          if (paramInt1 != 12) {
            break label1964;
          }
          com.tencent.mm.plugin.ipcall.a.i.aXp().aXn();
          com.tencent.mm.plugin.ipcall.a.i.aXr().aXN();
          if (paramInt2 != 11) {
            break label1899;
          }
          m.b(this.knR);
          continue;
          Object localObject3 = this.knR;
          if (localObject3 == null) {
            continue;
          }
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.IPCallRecordStorageLogic", "recordCallFailed, localId: %d", new Object[] { Long.valueOf(((k)localObject3).sKx) });
          if (((k)localObject3).sKx == -1L) {
            continue;
          }
          ((k)localObject3).field_status = 6;
          com.tencent.mm.plugin.ipcall.a.i.aXw().a((k)localObject3);
          continue;
          if (paramInt1 != 9) {
            break label2000;
          }
          com.tencent.mm.plugin.ipcall.a.i.aXp().rw(1);
          com.tencent.mm.plugin.ipcall.a.i.aXr().aXM();
          m.a(this.knR, com.tencent.mm.plugin.ipcall.a.i.aXr().kqM);
          continue;
          if (paramInt1 != 10) {
            break label2119;
          }
          com.tencent.mm.plugin.ipcall.a.i.aXp().rw(1);
          localObject3 = com.tencent.mm.plugin.ipcall.a.i.aXr();
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallReportHelper", "otherSideUserShutdown");
          ((com.tencent.mm.plugin.ipcall.a.c.b)localObject3).kqG = 1;
          localObject3 = this.knR;
          long l1 = com.tencent.mm.plugin.ipcall.a.i.aXr().kqM;
          if (localObject3 == null) {
            continue;
          }
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.IPCallRecordStorageLogic", "recordOthersideShutdownCall, localId: %d, talkTime: %d", new Object[] { Long.valueOf(((k)localObject3).sKx), Long.valueOf(l1) });
          if (((k)localObject3).sKx == -1L) {
            continue;
          }
          ((k)localObject3).field_status = 5;
          ((k)localObject3).field_duration = l1;
          com.tencent.mm.plugin.ipcall.a.i.aXw().a((k)localObject3);
          continue;
          if (paramInt1 != 11) {
            continue;
          }
          if (paramInt2 != 5) {
            break label2160;
          }
          com.tencent.mm.plugin.ipcall.a.i.aXp().rw(3);
          for (;;)
          {
            com.tencent.mm.plugin.ipcall.a.i.aXr().aXM();
            if (paramInt2 != 11) {
              break label2186;
            }
            m.b(this.knR);
            break;
            if (paramInt2 == 11) {
              com.tencent.mm.plugin.ipcall.a.i.aXp().rw(1);
            } else {
              com.tencent.mm.plugin.ipcall.a.i.aXp().rw(2);
            }
          }
          m.a(this.knR, com.tencent.mm.plugin.ipcall.a.i.aXr().kqM);
          continue;
          if (l3 - l2 >= 1800L) {
            break label2227;
          }
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallPluginUtil", "tryShowFeedbackDialog not reach INTERVAL_TIMES_TRY_SHOW_WCO_FEEDBACK_MAIN");
          continue;
          au.HU();
          com.tencent.mm.model.c.DT().a(aa.a.sRu, Integer.valueOf(paramInt1 + 1));
          au.HU();
          com.tencent.mm.model.c.DT().a(aa.a.sRt, Long.valueOf(l3));
          Intent localIntent = new Intent();
          localIntent.putExtra("IPCallFeedbackDialogUI_KRoomId", paramInt2);
          localIntent.putExtra("IPCallFeedbackDialogUI_KCallseq", l1);
          com.tencent.mm.bg.d.b((Context)localObject3, "ipcall", ".ui.IPCallFeedbackDialogUI", localIntent);
          continue;
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.IPCallManager", "roomId = 0,ignore feedback");
          continue;
          continue;
          i = 0;
          continue;
        }
        ((MediaPlayer)???).setAudioStreamType(i);
        ((MediaPlayer)???).prepare();
        ((MediaPlayer)???).setLooping(false);
        ((MediaPlayer)???).start();
        if (System.currentTimeMillis() - ((com.tencent.mm.plugin.voip.video.i)???).oVg > 2000L) {
          ((com.tencent.mm.plugin.voip.video.i)???).oVe = 7;
        }
        dvh.removeCallbacks(this.knX);
        dvh.removeCallbacks(this.knW);
        if (this.bAZ != null)
        {
          this.bAZ.SO();
          this.bAZ = null;
        }
        com.tencent.mm.plugin.ipcall.a.i.aXr().kqN = paramInt3;
        ??? = com.tencent.mm.plugin.ipcall.a.i.aXr();
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.IPCallReportHelper", "markEndTalk");
        if ((((com.tencent.mm.plugin.ipcall.a.c.b)???).kqU == 0L) && (((com.tencent.mm.plugin.ipcall.a.c.b)???).kqT != 0L))
        {
          ((com.tencent.mm.plugin.ipcall.a.c.b)???).kqU = System.currentTimeMillis();
          ((com.tencent.mm.plugin.ipcall.a.c.b)???).kqM = ((((com.tencent.mm.plugin.ipcall.a.c.b)???).kqU - ((com.tencent.mm.plugin.ipcall.a.c.b)???).kqT) / 1000L);
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.IPCallReportHelper", "callTime: %d", new Object[] { Long.valueOf(((com.tencent.mm.plugin.ipcall.a.c.b)???).kqM) });
        }
        if (paramInt1 != 8) {
          break label1864;
        }
        com.tencent.mm.plugin.ipcall.a.i.aXp().aXn();
        com.tencent.mm.plugin.ipcall.a.i.aXr().aXN();
        ??? = this.knR;
        if (??? != null)
        {
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.IPCallRecordStorageLogic", "recordCancelCall, localId: %d", new Object[] { Long.valueOf(((k)???).sKx) });
          if (((k)???).sKx != -1L)
          {
            ((k)???).field_status = 2;
            com.tencent.mm.plugin.ipcall.a.i.aXw().a((k)???);
          }
        }
        if (com.tencent.mm.plugin.ipcall.a.i.aXp().bXc)
        {
          if ((this.knY) || (com.tencent.mm.plugin.ipcall.a.i.aXp().koG.kpo == 0) || (com.tencent.mm.plugin.ipcall.a.i.aXp().koG.kpq == 0L)) {
            break label2310;
          }
          ??? = ad.getContext();
          paramInt2 = com.tencent.mm.plugin.ipcall.a.i.aXp().koG.kpo;
          l1 = com.tencent.mm.plugin.ipcall.a.i.aXp().koG.kpq;
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallPluginUtil", "tryShowFeedbackDialog");
          if (d.aWV())
          {
            paramInt3 = com.tencent.mm.k.g.AT().getInt("WCOMaxTimesForShowFeedback", 0);
            au.HU();
            paramInt1 = ((Integer)com.tencent.mm.model.c.DT().get(aa.a.sRu, Integer.valueOf(0))).intValue();
            au.HU();
            l2 = ((Long)com.tencent.mm.model.c.DT().get(aa.a.sRt, Long.valueOf(0L))).longValue();
            l3 = bi.VE();
            if (l3 - l2 <= 86400L) {
              break label2321;
            }
            paramInt1 = 0;
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallPluginUtil", "tryShowFeedbackDialog reset time");
            if (paramInt1 < paramInt3) {
              break label2203;
            }
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallPluginUtil", "tryShowFeedbackDialog reach max time" + paramInt3);
          }
        }
        com.tencent.mm.plugin.ipcall.a.i.aXp().kox = null;
        com.tencent.mm.plugin.ipcall.a.i.aXq().kqC = null;
        com.tencent.mm.plugin.ipcall.a.i.aXt().mCurrentState = -1;
        aWS();
        aEI();
        return true;
        i = 0;
        break;
        i = 0;
        break;
        label1729:
        i = 0;
        break label312;
        label1735:
        i = 0;
        break label312;
        label1741:
        i = -1;
        break label381;
        label1747:
        f = au.HV().getStreamMaxVolume(i);
        i = (int)(au.HV().getStreamVolume(i) / f * 100.0F);
        break label390;
        localObject2 = finally;
        throw ((Throwable)localObject2);
      }
      i = 0;
      continue;
      label1802:
      i = 0;
      continue;
      label1808:
      au.HV().setMode(2);
      continue;
      label1818:
      i = 2;
    }
  }
  
  private void YN()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallManager", "startTimeCount");
    if (this.bAZ != null)
    {
      this.bAZ.SO();
      return;
    }
    if (this.bAZ == null) {
      this.bAZ = new com.tencent.mm.sdk.platformtools.al(Looper.getMainLooper(), new c.6(this), true);
    }
    this.bAZ.J(1000L, 1000L);
  }
  
  public final void A(String paramString1, String paramString2, int paramInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallManager", "onCallRestricted, currentState: %s", new Object[] { com.tencent.mm.plugin.ipcall.a.f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aXt().mCurrentState) });
    if (cK(10, 0)) {
      d(10, paramString1, paramString2, paramInt);
    }
  }
  
  public final void B(String paramString1, String paramString2, int paramInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallManager", "onCallPhoneNumberInvalid, currentState: %s", new Object[] { com.tencent.mm.plugin.ipcall.a.f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aXt().mCurrentState) });
    if (cK(11, 0)) {
      d(11, paramString1, paramString2, paramInt);
    }
  }
  
  public final void aEI()
  {
    if (this.knT != null)
    {
      this.knT.listen(this.knU, 0);
      this.knT = null;
    }
    com.tencent.mm.sdk.b.a.sFg.c(this.knV);
  }
  
  public final void aWH()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallManager", "onInviteSuccess");
    if (!com.tencent.mm.plugin.ipcall.a.i.aXt().rv(3)) {}
    do
    {
      return;
      Object localObject = com.tencent.mm.plugin.ipcall.a.i.aXr();
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.IPCallReportHelper", "markStartInvite");
      if (((com.tencent.mm.plugin.ipcall.a.c.b)localObject).kqR == 0L) {
        ((com.tencent.mm.plugin.ipcall.a.c.b)localObject).kqR = System.currentTimeMillis();
      }
      localObject = com.tencent.mm.plugin.ipcall.a.i.aXp().koG;
      com.tencent.mm.plugin.ipcall.a.c.b localb = com.tencent.mm.plugin.ipcall.a.i.aXr();
      int i = ((com.tencent.mm.plugin.ipcall.a.a.c)localObject).kpr;
      String str1 = ((com.tencent.mm.plugin.ipcall.a.a.c)localObject).bZR;
      String str2 = ((com.tencent.mm.plugin.ipcall.a.a.c)localObject).kpQ;
      int j = ((com.tencent.mm.plugin.ipcall.a.a.c)localObject).kpo;
      long l1 = ((com.tencent.mm.plugin.ipcall.a.a.c)localObject).kpp;
      long l2 = ((com.tencent.mm.plugin.ipcall.a.a.c)localObject).kpq;
      localb.kpr = i;
      localb.kqQ = str1;
      localb.eNQ = str2;
      localb.kpo = j;
      localb.kpp = l1;
      localb.kqO = l2;
    } while (this.knQ == null);
    this.knQ.aWH();
  }
  
  public final void aWI()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallManager", "onStartRing, currentState: %s", new Object[] { com.tencent.mm.plugin.ipcall.a.f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aXt().mCurrentState) });
    if (!com.tencent.mm.plugin.ipcall.a.i.aXt().rv(4)) {}
    do
    {
      return;
      com.tencent.mm.plugin.ipcall.a.c.b localb = com.tencent.mm.plugin.ipcall.a.i.aXr();
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.IPCallReportHelper", "markStartRing");
      if (localb.kqS == 0L)
      {
        localb.kqS = System.currentTimeMillis();
        localb.kqJ = (localb.kqS - localb.kqR);
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.IPCallReportHelper", "ringTime: %d", new Object[] { Long.valueOf(localb.kqJ) });
      }
      com.tencent.mm.plugin.ipcall.a.i.aXq().aXK();
      localb = com.tencent.mm.plugin.ipcall.a.i.aXr();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallReportHelper", "startRing");
      localb.kqE = 1;
    } while (this.knQ == null);
    this.knQ.aWI();
  }
  
  public final void aWJ()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallManager", "onAccept, currentState: %s", new Object[] { com.tencent.mm.plugin.ipcall.a.f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aXt().mCurrentState) });
    if (!com.tencent.mm.plugin.ipcall.a.i.aXt().rv(5)) {}
    do
    {
      return;
      com.tencent.mm.plugin.ipcall.a.c.b localb = com.tencent.mm.plugin.ipcall.a.i.aXr();
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.IPCallReportHelper", "markUserAccept");
      if (localb.koa == 0L)
      {
        localb.koa = System.currentTimeMillis();
        localb.kqK = (localb.koa - localb.kqR);
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.IPCallReportHelper", "answerTime: %d", new Object[] { Long.valueOf(localb.kqK) });
      }
      com.tencent.mm.plugin.ipcall.a.i.aXq().aXK();
      localb = com.tencent.mm.plugin.ipcall.a.i.aXr();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallReportHelper", "userAccept");
      localb.kqF = 1;
      dvh.removeCallbacks(this.knW);
      com.tencent.mm.plugin.ipcall.a.i.aXz().stop();
      dvh.removeCallbacks(this.knX);
      com.tencent.mm.plugin.ipcall.a.i.aXs().aiN();
    } while ((!com.tencent.mm.plugin.ipcall.a.i.aXq().kqA) || (this.knS));
    com.tencent.mm.plugin.ipcall.a.i.aXr().aXO();
    com.tencent.mm.plugin.ipcall.a.i.aXr().aXR();
    this.knS = true;
    this.koa = bi.VE();
    YN();
    com.tencent.mm.plugin.ipcall.a.i.aXq().aXJ();
    if (this.knQ != null) {
      this.knQ.aWW();
    }
    com.tencent.mm.plugin.ipcall.a.i.aXr().aXQ();
    p.bKK().bKL();
    p.bKK().oMP = this;
  }
  
  public final void aWK()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallManager", "onShutdownByOtherSide, currentState: %s", new Object[] { com.tencent.mm.plugin.ipcall.a.f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aXt().mCurrentState) });
    if (L(10, 0, 32))
    {
      if (this.knQ != null) {
        this.knQ.aWX();
      }
    }
    else {
      return;
    }
    Toast.makeText(ad.getContext(), ad.getContext().getString(R.l.ip_call_status_other_side_shutdown), 1).show();
  }
  
  public final void aWL()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallManager", "onHeartbeatFailed");
    if (cK(7, 29)) {
      d(7, null, ad.getContext().getString(R.l.calling_failed_network), 1);
    }
  }
  
  public final void aWM()
  {
    do
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallManager", "onDisasterHappen, currentState: %s", new Object[] { com.tencent.mm.plugin.ipcall.a.f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aXt().mCurrentState) });
    } while (cK(12, 0));
  }
  
  public final void aWN()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallManager", "onStartEngineFailed, currentState: %s", new Object[] { com.tencent.mm.plugin.ipcall.a.f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aXt().mCurrentState) });
    if (cK(6, 0)) {
      d(6, null, ad.getContext().getString(R.l.callout_failed_network), 1);
    }
  }
  
  public final void aWO()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallManager", "onChannelConnected, currentState: %s", new Object[] { com.tencent.mm.plugin.ipcall.a.f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aXt().mCurrentState) });
    com.tencent.mm.plugin.ipcall.a.i.aXz().stop();
    dvh.removeCallbacks(this.knX);
    Object localObject;
    com.tencent.mm.plugin.ipcall.a.b.a locala;
    if (com.tencent.mm.plugin.ipcall.a.i.aXt().aXk())
    {
      localObject = com.tencent.mm.plugin.ipcall.a.i.aXs();
      ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).kqe.a(ad.getContext(), (HeadsetPlugReceiver.a)localObject);
      au.HV().a((f.a)localObject);
      au.HV().yB();
      ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).kqj = au.HV().yK();
      ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).kqi = au.HV().yE();
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.IPCallDeviceManager", "startPlay, isHeadsetPlugged: %b, isBluetoothConnected: %b", new Object[] { Boolean.valueOf(((com.tencent.mm.plugin.ipcall.a.b.b)localObject).kqj), Boolean.valueOf(((com.tencent.mm.plugin.ipcall.a.b.b)localObject).kqi) });
      ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).epT.requestFocus();
      locala = ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).kqb;
      if (!locala.bTv) {
        break label369;
      }
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.IPCallAudioPlayer", "startPlay, already start");
    }
    for (;;)
    {
      if ((((com.tencent.mm.plugin.ipcall.a.b.b)localObject).kqj) && (!((com.tencent.mm.plugin.ipcall.a.b.b)localObject).kqi) && (((com.tencent.mm.plugin.ipcall.a.b.b)localObject).kqh != null)) {
        ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).kqh.fW(true);
      }
      if ((((com.tencent.mm.plugin.ipcall.a.b.b)localObject).kqi) && (!((com.tencent.mm.plugin.ipcall.a.b.b)localObject).kqj) && (((com.tencent.mm.plugin.ipcall.a.b.b)localObject).kqh != null)) {
        ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).kqh.fX(true);
      }
      com.tencent.mm.plugin.ipcall.a.i.aXr().aXO();
      com.tencent.mm.plugin.ipcall.a.i.aXs().aiN();
      if ((com.tencent.mm.plugin.ipcall.a.i.aXt().aXm()) && (!this.knS))
      {
        com.tencent.mm.plugin.ipcall.a.i.aXr().aXR();
        com.tencent.mm.plugin.ipcall.a.i.aXq().aXJ();
        this.knS = true;
        this.koa = bi.VE();
        YN();
        if (this.knQ != null) {
          this.knQ.aWW();
        }
        localObject = this.knR;
        if (localObject != null)
        {
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.IPCallRecordStorageLogic", "recordStartTalk, localId: %d", new Object[] { Long.valueOf(((k)localObject).sKx) });
          if (((k)localObject).sKx != -1L)
          {
            ((k)localObject).field_status = 3;
            com.tencent.mm.plugin.ipcall.a.i.aXw().a((k)localObject);
          }
        }
        com.tencent.mm.plugin.ipcall.a.i.aXr().aXQ();
        p.bKK().bKL();
        p.bKK().oMP = this;
      }
      return;
      label369:
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallAudioPlayer", "startPlay");
      if (locala.kpV == null)
      {
        locala.kpV = new com.tencent.mm.plugin.voip.model.b();
        locala.kpV.X(v2protocal.lsT, 20, 1);
      }
      locala.kpX = locala.kpV.r(ad.getContext(), false);
      locala.kpV.oHi = new a.1(locala);
      if (locala.kpV.bJt() <= 0) {
        com.tencent.mm.plugin.ipcall.a.i.aXr().aXP();
      }
      locala.fT(locala.kpY);
      locala.bTv = true;
    }
  }
  
  public final void aWP()
  {
    if (com.tencent.mm.plugin.ipcall.a.i.aXt().mCurrentState != 5) {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallManager", "onBadNetStatus currentState != accept:%d", new Object[] { Integer.valueOf(com.tencent.mm.plugin.ipcall.a.i.aXt().mCurrentState) });
    }
    com.tencent.mm.plugin.ipcall.a.b.b localb;
    long l;
    do
    {
      do
      {
        return;
        localb = com.tencent.mm.plugin.ipcall.a.i.aXs();
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallDeviceManager", "onBadNetStatus");
        if (localb.kqf != null)
        {
          com.tencent.mm.plugin.ipcall.ui.j localj = localb.kqf;
          if (localj.kzI != null) {
            localj.kzI.setVisibility(0);
          }
          if (localj.kzJ != null) {
            localj.kzJ.setVisibility(0);
          }
        }
      } while (au.HV().daT.isSpeakerphoneOn());
      l = System.currentTimeMillis();
    } while (l - localb.kqk <= 30000L);
    localb.kqk = l;
    com.tencent.mm.plugin.voip.model.i.bJI().yJ(R.k.voip_bad_netstatus_hint);
  }
  
  public final void aWQ()
  {
    if (com.tencent.mm.plugin.ipcall.a.i.aXt().mCurrentState != 5) {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallManager", "onResumeGoodNetStatus currentState != accept:%d", new Object[] { Integer.valueOf(com.tencent.mm.plugin.ipcall.a.i.aXt().mCurrentState) });
    }
    com.tencent.mm.plugin.ipcall.a.b.b localb;
    do
    {
      return;
      localb = com.tencent.mm.plugin.ipcall.a.i.aXs();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallDeviceManager", "onResumeGoodNetStatus");
    } while (localb.kqf == null);
    localb.kqf.aYv();
  }
  
  public final void aWR()
  {
    if (com.tencent.mm.plugin.ipcall.a.i.aXt().aXm()) {}
    for (Object localObject1 = ad.getContext().getString(R.l.ip_call_minimize_wording_with_time, new Object[] { String.format("%02d:%02d", new Object[] { Long.valueOf(bi.bG(this.koa) / 60L), Long.valueOf(bi.bG(this.koa) % 60L) }) });; localObject1 = ad.getContext().getString(R.l.ip_call_minimize_wording))
    {
      Object localObject2 = new Intent(ad.getContext(), IPCallTalkUI.class);
      ((Intent)localObject2).putExtra("IPCallTalkUI_isFromMiniNotification", true);
      localObject2 = PendingIntent.getActivity(ad.getContext(), 42, (Intent)localObject2, 134217728);
      int i = R.g.notification_icon_gray;
      if (com.tencent.mm.compatible.util.d.fS(19)) {
        i = R.g.notification_icon;
      }
      localObject1 = new Notification.Builder(ad.getContext()).setTicker(ad.getContext().getString(R.l.ip_call_minimize_wording)).setWhen(System.currentTimeMillis()).setContentTitle(ad.getContext().getString(R.l.ip_call_func_name)).setContentText((CharSequence)localObject1).setContentIntent((PendingIntent)localObject2).getNotification();
      ((Notification)localObject1).icon = i;
      ((Notification)localObject1).flags |= 0x20;
      au.getNotification().a(42, (Notification)localObject1, false);
      if (com.tencent.mm.plugin.ipcall.a.i.aXt().aXm()) {
        break;
      }
      com.tencent.mm.plugin.voip.model.i.bJJ().OI(ad.getContext().getString(R.l.multitalk_waiting_wording));
      return;
    }
    com.tencent.mm.plugin.voip.model.i.bJJ().wQ(aWT());
  }
  
  public final void aWS()
  {
    synchronized (this.iVA)
    {
      this.knY = false;
      com.tencent.mm.plugin.voip.model.i.bJJ().dismiss();
      ((NotificationManager)ad.getContext().getSystemService("notification")).cancel(42);
      return;
    }
  }
  
  public final int aWT()
  {
    int i = (int)bi.bG(this.koa);
    if (i > 0) {
      return i;
    }
    return 0;
  }
  
  public final void bu(String paramString, int paramInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallManager", "onUnAvaliable, currentState: %s", new Object[] { com.tencent.mm.plugin.ipcall.a.f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aXt().mCurrentState) });
    if (cK(3, 5)) {
      d(3, null, paramString, paramInt);
    }
  }
  
  public final void bv(String paramString, int paramInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallManager", "onBusy, currentState: %s", new Object[] { com.tencent.mm.plugin.ipcall.a.f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aXt().mCurrentState) });
    if (cK(1, 4)) {
      d(1, null, paramString, paramInt);
    }
  }
  
  public final void bw(String paramString, int paramInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallManager", "onSyncFailed");
    if (cK(7, 35)) {
      d(7, null, paramString, paramInt);
    }
  }
  
  public final boolean cK(int paramInt1, int paramInt2)
  {
    if (com.tencent.mm.plugin.ipcall.a.i.aXt().aXm())
    {
      if (paramInt1 == 0) {
        return L(9, paramInt1, paramInt2);
      }
      return L(11, paramInt1, paramInt2);
    }
    if (paramInt1 == 0) {
      return L(8, paramInt1, paramInt2);
    }
    return L(12, paramInt1, paramInt2);
  }
  
  public final void d(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    if (this.knQ != null)
    {
      this.knQ.d(paramInt1, paramString1, paramString2, paramInt2);
      return;
    }
    Toast.makeText(ad.getContext(), paramString2, 1).show();
  }
  
  public final void rt(int paramInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallManager", "onChannelConnectFailed, currentState: %s", new Object[] { com.tencent.mm.plugin.ipcall.a.f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aXt().mCurrentState) });
    if (com.tencent.mm.plugin.ipcall.a.i.aXq().kqA)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallManager", "onChannelConnectFailed, channel already connected");
      if (cK(5, paramInt)) {
        d(5, null, ad.getContext().getString(R.l.calling_failed_network), 1);
      }
    }
    do
    {
      return;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallManager", "onChannelConnectFailed, channel not connet, may be request connect failed");
    } while (!cK(4, paramInt));
    d(4, null, ad.getContext().getString(R.l.calling_failed_network), 1);
  }
  
  public final void y(String paramString1, String paramString2, int paramInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallManager", "onInviteFailed, currentState: %s", new Object[] { com.tencent.mm.plugin.ipcall.a.f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aXt().mCurrentState) });
    if (cK(2, 0)) {
      d(2, paramString1, paramString2, paramInt);
    }
  }
  
  public final void z(String paramString1, String paramString2, int paramInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallManager", "onAccountOverdue, currentState: %s", new Object[] { com.tencent.mm.plugin.ipcall.a.f.stateToString(com.tencent.mm.plugin.ipcall.a.i.aXt().mCurrentState) });
    if (cK(8, 9)) {
      d(8, paramString1, paramString2, paramInt);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/ipcall/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */