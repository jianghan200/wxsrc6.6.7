package com.tencent.mm.ui.chatting;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.media.ToneGenerator;
import android.os.Vibrator;
import android.widget.Toast;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.i.a;
import com.tencent.mm.ab.i.b;
import com.tencent.mm.ac.d.b;
import com.tencent.mm.g.a.mx;
import com.tencent.mm.g.a.su;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.q;
import com.tencent.mm.model.s;
import com.tencent.mm.modelvoice.n;
import com.tencent.mm.pluginsdk.o.a;
import com.tencent.mm.pluginsdk.o.c;
import com.tencent.mm.pluginsdk.ui.chat.AppPanel.a;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.pluginsdk.ui.tools.l;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.chatting.b.b.aa;
import com.tencent.mm.ui.chatting.b.b.ac;
import com.tencent.mm.ui.chatting.b.b.ag;
import com.tencent.mm.ui.chatting.b.b.y;
import com.tencent.mm.ui.tools.k;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class p
  implements com.tencent.mm.pluginsdk.ui.chat.b
{
  public static boolean tJa = true;
  private final al erD = new al(new p.8(this), true);
  private ab guS;
  private final i.a hnC = new p.1(this);
  private ToneGenerator hnf;
  private Vibrator hni;
  private final al hnz = new al(new p.9(this), true);
  private ChatFooter laA;
  private final i.b laF = new p.4(this);
  private AppPanel.a lbl = new p.10(this);
  private Object lock = new Object();
  private boolean tGg;
  private com.tencent.mm.ab.i tJb;
  private String tJc;
  private String tJd;
  private boolean tJe;
  private boolean tJf;
  public boolean tJg;
  com.tencent.mm.ui.chatting.c.a tJh;
  private volatile boolean tJi = false;
  private volatile boolean tJj = false;
  private boolean tJk = false;
  
  public p(com.tencent.mm.ui.chatting.c.a parama, ChatFooter paramChatFooter, String paramString)
  {
    this.tJh = parama;
    this.laA = paramChatFooter;
    this.tJc = paramString;
    au.HU();
    this.guS = c.FR().Yg(paramString);
    this.tJe = this.tJh.getTalkerUserName().endsWith("@chatroom");
    this.tJf = s.ha(this.tJh.getTalkerUserName());
    boolean bool;
    if ((this.tJe) || (this.tJf))
    {
      bool = true;
      this.tGg = bool;
      this.hni = ((Vibrator)this.tJh.tTq.getContext().getSystemService("vibrator"));
      if (!s.hB(this.tJc)) {
        break label282;
      }
      this.tJb = new com.tencent.mm.plugin.subapp.c.i();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingFooterEventImpl", "initRecorder new VoiceRemindRecorder().");
    }
    for (;;)
    {
      this.tJb.a(this.laF);
      this.tJb.a(this.hnC);
      paramChatFooter.setAppPanelListener(this.lbl);
      return;
      bool = false;
      break;
      label282:
      parama = this.tJc;
      int i;
      if (s.hM(parama)) {
        i = 1;
      }
      for (;;)
      {
        if (i == 0) {
          break label463;
        }
        this.tJb = new com.tencent.mm.e.b.h(this.tJh.tTq.getContext(), true);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingFooterEventImpl", "initRecorder new SceneVoiceRecorder, use Speex");
        break;
        parama = ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(parama);
        if ((parama != null) && (parama.ckW()))
        {
          paramString = com.tencent.mm.ac.f.kH(parama.field_username);
          if (paramString != null)
          {
            paramString = paramString.bG(false);
            if (paramString != null)
            {
              if (paramString.dKT != null) {
                paramString.dKX = "1".equals(paramString.dKT.optString("CanReceiveSpeexVoice"));
              }
              if (paramString.dKX)
              {
                com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BizInfoStorageLogic", "bizinfo name=" + parama.field_username + " canReceiveSpeexVoice");
                i = 1;
                continue;
              }
            }
          }
        }
        i = 0;
      }
      label463:
      this.tJb = new com.tencent.mm.e.b.h(this.tJh.tTq.getContext(), false);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingFooterEventImpl", "initRecorder new SceneVoiceRecorder, not use Speex");
    }
  }
  
  private static void EM(int paramInt)
  {
    mx localmx = new mx();
    localmx.bXZ.state = paramInt;
    com.tencent.mm.sdk.b.a.sFg.m(localmx);
  }
  
  private void ctk()
  {
    com.tencent.mm.ui.chatting.c.a locala = this.tJh;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingContext", "[smoothScrollBy] dis:%s duration:%s", new Object[] { Integer.valueOf(0), Integer.valueOf(0) });
    locala.tTr.ctY();
  }
  
  @Deprecated
  @SuppressLint({"NewApi"})
  private void ctl()
  {
    com.tencent.mm.ui.chatting.c.a locala = this.tJh;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingContext", "[scrollToLast] force:%b", new Object[] { Boolean.valueOf(true) });
    locala.tTr.Y(true, true);
  }
  
  private boolean ctm()
  {
    this.tJh.tTq.enableOptionMenu(true);
    this.tJh.tTq.enableBackMenu(true);
    if (this.tJb != null)
    {
      int i;
      label75:
      boolean bool;
      long l;
      if (this.tJb.isRecording()) {
        if ((this.guS.field_username.equals("medianote")) && ((q.GJ() & 0x4000) == 0))
        {
          i = 1;
          if (i == 0) {
            break label244;
          }
          i = 1;
          bool = this.tJb.wk();
          this.erD.SO();
          this.hnz.SO();
          if (i != 0)
          {
            com.tencent.mm.storage.bd localbd = new com.tencent.mm.storage.bd();
            localbd.ep("medianote");
            localbd.setType(34);
            localbd.eX(1);
            localbd.eq(this.tJd);
            localbd.setStatus(2);
            localbd.setContent(n.b(q.GF(), this.tJb.wt(), false));
            localbd.ay(com.tencent.mm.model.bd.iD("medianote"));
            if (this.tJb.ww() == 2) {
              localbd.dt("SOURCE_SILK_FILE");
            }
            au.HU();
            l = c.FT().T(localbd);
            if (l > 0L) {
              break label249;
            }
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChattingFooterEventImpl", "insertLocalMsg fail");
          }
        }
      }
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.af.Wq("keep_app_silent");
        return bool;
        i = 0;
        break;
        label244:
        i = 0;
        break label75;
        label249:
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingFooterEventImpl", "insertLocalMsg success, msgId = " + l);
      }
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingFooterEventImpl", "stopRecording recorder == null");
    return false;
  }
  
  private void releaseWakeLock()
  {
    this.tJh.setKeepScreenOn(false);
  }
  
  public final void EN(int paramInt)
  {
    boolean bool = com.tencent.mm.pluginsdk.permission.a.a(this.tJh.tTq.getContext(), "android.permission.CAMERA", 18, "", "");
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bi.cjd(), this.tJh.tTq.getContext() });
    if (!bool) {}
    do
    {
      do
      {
        return;
        bool = com.tencent.mm.pluginsdk.permission.a.a(this.tJh.tTq.getContext(), "android.permission.RECORD_AUDIO", 18, "", "");
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bi.cjd(), this.tJh.tTq.getContext() });
      } while (!bool);
      if ((com.tencent.mm.sdk.a.b.chp()) || (com.tencent.mm.platformtools.af.eyf))
      {
        k localk = new k(this.tJh.tTq.getContext());
        localk.ofp = new p.2(this);
        localk.ofq = new p.3(this, paramInt);
        localk.bEo();
        return;
      }
    } while (com.tencent.mm.platformtools.af.eyg);
    com.tencent.mm.plugin.report.service.h.mEJ.h(13822, new Object[] { Integer.valueOf(1), Integer.valueOf(1) });
    l.a(this.tJh.tTq, new Intent(), getTalkerUserName(), paramInt);
  }
  
  public final boolean Gk(String paramString)
  {
    ctl();
    ctk();
    return ((aa)this.tJh.O(aa.class)).aaq(paramString);
  }
  
  public final boolean bcq()
  {
    synchronized (this.lock)
    {
      this.tJi = true;
      if (!this.tJj)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingFooterEventImpl", "jacks in voice rcd stop but not begin.");
        return false;
      }
    }
    this.tJj = false;
    releaseWakeLock();
    if (!ctm())
    {
      this.laA.cen();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingFooterEventImpl", "record stop on stop request setRcdTooShort");
    }
    for (;;)
    {
      ((ag)this.tJh.O(ag.class)).cwl().csM();
      ((y)this.tJh.O(y.class)).Fe(4);
      ((y)this.tJh.O(y.class)).stopSignalling();
      EM(1);
      ((ag)this.tJh.O(ag.class)).a(this.tJh.tTq, false);
      return true;
      this.laA.aMo();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingFooterEventImpl", "record stop on stop request resetRcdStatus");
    }
  }
  
  public final boolean bcs()
  {
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.ChattingFooterEventImpl", "record cancel on cancel request");
    synchronized (this.lock)
    {
      this.tJi = true;
      if (!this.tJj)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingFooterEventImpl", "jacks in voice rcd stop but not begin.");
        return false;
      }
    }
    this.tJj = false;
    releaseWakeLock();
    this.tJh.tTq.enableOptionMenu(true);
    this.tJh.tTq.enableBackMenu(true);
    if (this.tJb != null)
    {
      this.tJb.cancel();
      this.erD.SO();
      this.hnz.SO();
    }
    this.laA.aMo();
    ((ag)this.tJh.O(ag.class)).cwl().csM();
    ((y)this.tJh.O(y.class)).Fe(4);
    ((y)this.tJh.O(y.class)).stopSignalling();
    EM(1);
    ((ag)this.tJh.O(ag.class)).a(this.tJh.tTq, false);
    return true;
  }
  
  /* Error */
  public final boolean bct()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 92	com/tencent/mm/ui/chatting/p:tJh	Lcom/tencent/mm/ui/chatting/c/a;
    //   4: getfield 145	com/tencent/mm/ui/chatting/c/a:tTq	Lcom/tencent/mm/ui/chatting/e;
    //   7: invokevirtual 151	com/tencent/mm/ui/chatting/e:getContext	()Landroid/app/Activity;
    //   10: invokestatic 781	com/tencent/mm/p/a:by	(Landroid/content/Context;)Z
    //   13: ifne +19 -> 32
    //   16: aload_0
    //   17: getfield 92	com/tencent/mm/ui/chatting/p:tJh	Lcom/tencent/mm/ui/chatting/c/a;
    //   20: getfield 145	com/tencent/mm/ui/chatting/c/a:tTq	Lcom/tencent/mm/ui/chatting/e;
    //   23: invokevirtual 151	com/tencent/mm/ui/chatting/e:getContext	()Landroid/app/Activity;
    //   26: invokestatic 784	com/tencent/mm/p/a:bw	(Landroid/content/Context;)Z
    //   29: ifeq +13 -> 42
    //   32: ldc -83
    //   34: ldc_w 786
    //   37: invokestatic 788	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   40: iconst_0
    //   41: ireturn
    //   42: invokestatic 102	com/tencent/mm/model/au:HU	()Lcom/tencent/mm/model/c;
    //   45: pop
    //   46: invokestatic 791	com/tencent/mm/model/c:isSDCardAvailable	()Z
    //   49: ifne +26 -> 75
    //   52: aload_0
    //   53: getfield 92	com/tencent/mm/ui/chatting/p:tJh	Lcom/tencent/mm/ui/chatting/c/a;
    //   56: getfield 145	com/tencent/mm/ui/chatting/c/a:tTq	Lcom/tencent/mm/ui/chatting/e;
    //   59: invokevirtual 151	com/tencent/mm/ui/chatting/e:getContext	()Landroid/app/Activity;
    //   62: invokestatic 796	com/tencent/mm/ui/base/s:gH	(Landroid/content/Context;)V
    //   65: ldc -83
    //   67: ldc_w 798
    //   70: invokestatic 576	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   73: iconst_0
    //   74: ireturn
    //   75: invokestatic 803	com/tencent/mm/compatible/f/b:zT	()Z
    //   78: ifne +74 -> 152
    //   81: aload_0
    //   82: getfield 92	com/tencent/mm/ui/chatting/p:tJh	Lcom/tencent/mm/ui/chatting/c/a;
    //   85: getfield 145	com/tencent/mm/ui/chatting/c/a:tTq	Lcom/tencent/mm/ui/chatting/e;
    //   88: invokevirtual 151	com/tencent/mm/ui/chatting/e:getContext	()Landroid/app/Activity;
    //   91: aload_0
    //   92: getfield 92	com/tencent/mm/ui/chatting/p:tJh	Lcom/tencent/mm/ui/chatting/c/a;
    //   95: getfield 145	com/tencent/mm/ui/chatting/c/a:tTq	Lcom/tencent/mm/ui/chatting/e;
    //   98: invokevirtual 606	com/tencent/mm/ui/chatting/e:getMMResources	()Landroid/content/res/Resources;
    //   101: getstatic 806	com/tencent/mm/R$l:app_special_no_record_audio_permission	I
    //   104: invokevirtual 616	android/content/res/Resources:getString	(I)Ljava/lang/String;
    //   107: aload_0
    //   108: getfield 92	com/tencent/mm/ui/chatting/p:tJh	Lcom/tencent/mm/ui/chatting/c/a;
    //   111: getfield 145	com/tencent/mm/ui/chatting/c/a:tTq	Lcom/tencent/mm/ui/chatting/e;
    //   114: invokevirtual 606	com/tencent/mm/ui/chatting/e:getMMResources	()Landroid/content/res/Resources;
    //   117: getstatic 809	com/tencent/mm/R$l:app_need_audio_title	I
    //   120: invokevirtual 616	android/content/res/Resources:getString	(I)Ljava/lang/String;
    //   123: aload_0
    //   124: getfield 92	com/tencent/mm/ui/chatting/p:tJh	Lcom/tencent/mm/ui/chatting/c/a;
    //   127: getfield 145	com/tencent/mm/ui/chatting/c/a:tTq	Lcom/tencent/mm/ui/chatting/e;
    //   130: invokevirtual 606	com/tencent/mm/ui/chatting/e:getMMResources	()Landroid/content/res/Resources;
    //   133: getstatic 812	com/tencent/mm/R$l:app_need_show_settings_button	I
    //   136: invokevirtual 616	android/content/res/Resources:getString	(I)Ljava/lang/String;
    //   139: iconst_1
    //   140: new 814	com/tencent/mm/ui/chatting/p$5
    //   143: dup
    //   144: aload_0
    //   145: invokespecial 815	com/tencent/mm/ui/chatting/p$5:<init>	(Lcom/tencent/mm/ui/chatting/p;)V
    //   148: invokestatic 820	com/tencent/mm/ui/base/h:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroid/content/DialogInterface$OnClickListener;)Lcom/tencent/mm/ui/widget/a/c;
    //   151: pop
    //   152: aload_0
    //   153: getfield 171	com/tencent/mm/ui/chatting/p:tJb	Lcom/tencent/mm/ab/i;
    //   156: ifnull +113 -> 269
    //   159: aload_0
    //   160: getfield 642	com/tencent/mm/ui/chatting/p:hnf	Landroid/media/ToneGenerator;
    //   163: ifnonnull +59 -> 222
    //   166: aload_0
    //   167: getfield 92	com/tencent/mm/ui/chatting/p:tJh	Lcom/tencent/mm/ui/chatting/c/a;
    //   170: getfield 145	com/tencent/mm/ui/chatting/c/a:tTq	Lcom/tencent/mm/ui/chatting/e;
    //   173: iconst_3
    //   174: invokevirtual 824	com/tencent/mm/ui/x:getStreamMaxVolume	(I)I
    //   177: istore_1
    //   178: aload_0
    //   179: getfield 92	com/tencent/mm/ui/chatting/p:tJh	Lcom/tencent/mm/ui/chatting/c/a;
    //   182: getfield 145	com/tencent/mm/ui/chatting/c/a:tTq	Lcom/tencent/mm/ui/chatting/e;
    //   185: iconst_3
    //   186: invokevirtual 827	com/tencent/mm/ui/x:getStreamVolume	(I)I
    //   189: istore_2
    //   190: iload_1
    //   191: i2f
    //   192: iload_2
    //   193: i2f
    //   194: fdiv
    //   195: ldc_w 828
    //   198: fmul
    //   199: f2i
    //   200: istore_1
    //   201: aload_0
    //   202: new 830	android/media/ToneGenerator
    //   205: dup
    //   206: iconst_3
    //   207: iload_1
    //   208: invokespecial 833	android/media/ToneGenerator:<init>	(II)V
    //   211: putfield 642	com/tencent/mm/ui/chatting/p:hnf	Landroid/media/ToneGenerator;
    //   214: ldc -83
    //   216: ldc_w 835
    //   219: invokestatic 181	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   222: aload_0
    //   223: getfield 642	com/tencent/mm/ui/chatting/p:hnf	Landroid/media/ToneGenerator;
    //   226: ifnull +21 -> 247
    //   229: aload_0
    //   230: getfield 642	com/tencent/mm/ui/chatting/p:hnf	Landroid/media/ToneGenerator;
    //   233: bipush 24
    //   235: invokevirtual 839	android/media/ToneGenerator:startTone	(I)Z
    //   238: pop
    //   239: ldc -83
    //   241: ldc_w 841
    //   244: invokestatic 181	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   247: aload_0
    //   248: getfield 92	com/tencent/mm/ui/chatting/p:tJh	Lcom/tencent/mm/ui/chatting/c/a;
    //   251: invokevirtual 845	com/tencent/mm/ui/chatting/c/a:getListView	()Landroid/widget/ListView;
    //   254: new 847	com/tencent/mm/ui/chatting/p$7
    //   257: dup
    //   258: aload_0
    //   259: invokespecial 848	com/tencent/mm/ui/chatting/p$7:<init>	(Lcom/tencent/mm/ui/chatting/p;)V
    //   262: ldc2_w 849
    //   265: invokevirtual 856	android/widget/ListView:postDelayed	(Ljava/lang/Runnable;J)Z
    //   268: pop
    //   269: aload_0
    //   270: getfield 68	com/tencent/mm/ui/chatting/p:lock	Ljava/lang/Object;
    //   273: astore_3
    //   274: aload_3
    //   275: monitorenter
    //   276: aload_0
    //   277: iconst_0
    //   278: putfield 64	com/tencent/mm/ui/chatting/p:tJi	Z
    //   281: aload_3
    //   282: monitorexit
    //   283: new 858	com/tencent/mm/sdk/platformtools/ag
    //   286: dup
    //   287: invokestatic 864	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   290: invokespecial 867	com/tencent/mm/sdk/platformtools/ag:<init>	(Landroid/os/Looper;)V
    //   293: new 869	com/tencent/mm/ui/chatting/p$6
    //   296: dup
    //   297: aload_0
    //   298: invokespecial 870	com/tencent/mm/ui/chatting/p$6:<init>	(Lcom/tencent/mm/ui/chatting/p;)V
    //   301: ldc2_w 849
    //   304: invokevirtual 871	com/tencent/mm/sdk/platformtools/ag:postDelayed	(Ljava/lang/Runnable;J)Z
    //   307: pop
    //   308: iconst_1
    //   309: ireturn
    //   310: astore_3
    //   311: ldc -83
    //   313: ldc_w 873
    //   316: invokestatic 576	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   319: goto -97 -> 222
    //   322: astore 4
    //   324: aload_3
    //   325: monitorexit
    //   326: aload 4
    //   328: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	329	0	this	p
    //   177	31	1	i	int
    //   189	4	2	j	int
    //   310	15	3	localException	Exception
    //   322	5	4	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   201	222	310	java/lang/Exception
    //   276	283	322	finally
    //   324	326	322	finally
  }
  
  public final void bcu()
  {
    ctl();
    ctk();
  }
  
  public final void bcv()
  {
    ctl();
    ctk();
  }
  
  public final void bcw()
  {
    ctl();
    ctk();
  }
  
  public final void bny()
  {
    boolean bool = com.tencent.mm.pluginsdk.permission.a.a(this.tJh.tTq.getContext(), "android.permission.RECORD_AUDIO", 82, "", "");
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bi.cjd(), this.tJh.tTq.getContext() });
    if (!bool) {
      return;
    }
    su localsu = new su();
    localsu.cdE.bOh = 5;
    localsu.cdE.talker = getTalkerUserName();
    localsu.cdE.context = this.tJh.tTq.getContext();
    localsu.cdE.cdz = 4;
    if (this.laA.ceI()) {
      this.laA.setBottomPanelVisibility(8);
    }
    com.tencent.mm.sdk.b.a.sFg.m(localsu);
  }
  
  public final void bnz()
  {
    boolean bool = com.tencent.mm.pluginsdk.permission.a.a(this.tJh.tTq.getContext(), "android.permission.CAMERA", 19, "", "");
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bi.cjd(), this.tJh.tTq.getContext() });
    if (!bool) {}
    do
    {
      return;
      bool = com.tencent.mm.pluginsdk.permission.a.a(this.tJh.tTq.getContext(), "android.permission.RECORD_AUDIO", 19, "", "");
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bi.cjd(), this.tJh.tTq.getContext() });
    } while (!bool);
    su localsu = new su();
    localsu.cdE.bOh = 5;
    localsu.cdE.talker = getTalkerUserName();
    localsu.cdE.context = this.tJh.tTq.getContext();
    localsu.cdE.cdz = 2;
    if (this.laA.ceI()) {
      this.laA.setBottomPanelVisibility(8);
    }
    com.tencent.mm.sdk.b.a.sFg.m(localsu);
  }
  
  public final void ctn()
  {
    boolean bool = com.tencent.mm.pluginsdk.permission.a.a(this.tJh.tTq.getContext(), "android.permission.CAMERA", 22, "", "");
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bi.cjd(), this.tJh.tTq.getContext() });
    if (!bool) {}
    do
    {
      return;
      bool = com.tencent.mm.pluginsdk.permission.a.a(this.tJh.tTq.getContext(), "android.permission.RECORD_AUDIO", 22, "", "");
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bi.cjd(), this.tJh.tTq.getContext() });
    } while (!bool);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk");
    Intent localIntent = new Intent();
    if (com.tencent.mm.ay.d.elh.nt(getTalkerUserName()))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk, but now is in share location!");
      Toast.makeText(ad.getContext(), R.l.in_share_location_tip, 0).show();
      return;
    }
    List localList;
    if (getTalkerUserName() != null)
    {
      localList = o.a.qyi.HE(getTalkerUserName());
      au.HU();
      String str1 = (String)c.DT().get(2, null);
      bool = o.a.qyi.HC(getTalkerUserName());
      Iterator localIterator = localList.iterator();
      String str2;
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        str2 = (String)localIterator.next();
      } while ((str1 == null) || (!str1.equals(str2)));
    }
    for (int i = 1;; i = 0)
    {
      if ((localList.size() >= 9) && (i == 0))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk, but > max 9 members!");
        Toast.makeText(ad.getContext(), ad.getContext().getString(R.l.multitalk_members_reach_max_limit, new Object[] { Integer.valueOf(9) }), 0).show();
        return;
      }
      if (i != 0)
      {
        if (o.a.qyi.bgl())
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk, but already in it!");
          Toast.makeText(ad.getContext(), ad.getContext().getString(R.l.multitalk_exit_tip), 0).show();
          return;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk, already inlist, but in fact not multitalking now!");
      }
      if (o.a.qyi.bgA())
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk, but already in VoIP or multitalk!");
        Toast.makeText(ad.getContext(), ad.getContext().getString(R.l.multitalk_exit_tip), 0).show();
        return;
      }
      if (bool)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk, but this group already in multitalk, alter take in or not tips!");
        com.tencent.mm.ui.base.h.a(this.tJh.tTq.getContext(), this.tJh.tTq.getMMResources().getString(R.l.multitalk_talking_chose_enter), "", this.tJh.tTq.getMMResources().getString(R.l.multitalk_enter), this.tJh.tTq.getMMResources().getString(R.l.multitalk_cancel), new p.11(this), null);
        return;
      }
      localIntent.putExtra("chatroomName", getTalkerUserName());
      localIntent.putExtra("key_need_gallery", true);
      localIntent.putExtra("titile", this.tJh.tTq.getMMResources().getString(R.l.multitalk_select_contact));
      com.tencent.mm.bg.d.b(this.tJh.tTq.getContext(), "multitalk", ".ui.MultiTalkSelectContactUI", localIntent);
      return;
    }
  }
  
  public final void cto()
  {
    boolean bool = com.tencent.mm.pluginsdk.permission.a.a(this.tJh.tTq.getContext(), "android.permission.RECORD_AUDIO", 83, "", "");
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bi.cjd(), this.tJh.tTq.getContext() });
    if (!bool) {
      return;
    }
    if (this.laA.ceI()) {
      this.laA.setBottomPanelVisibility(8);
    }
    su localsu = new su();
    localsu.cdE.bOh = 5;
    localsu.cdE.talker = getTalkerUserName();
    localsu.cdE.context = this.tJh.tTq.getContext();
    localsu.cdE.cdz = 3;
    com.tencent.mm.sdk.b.a.sFg.m(localsu);
    com.tencent.mm.plugin.report.service.h.mEJ.h(11033, new Object[] { Integer.valueOf(4), Integer.valueOf(2), Integer.valueOf(0) });
  }
  
  public final void ctp()
  {
    boolean bool = com.tencent.mm.pluginsdk.permission.a.a(this.tJh.tTq.getContext(), "android.permission.CAMERA", 21, "", "");
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bi.cjd(), this.tJh.tTq.getContext() });
    if (!bool) {}
    do
    {
      return;
      bool = com.tencent.mm.pluginsdk.permission.a.a(this.tJh.tTq.getContext(), "android.permission.RECORD_AUDIO", 21, "", "");
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bi.cjd(), this.tJh.tTq.getContext() });
    } while (!bool);
    if (this.laA.ceI()) {
      this.laA.setBottomPanelVisibility(8);
    }
    su localsu = new su();
    localsu.cdE.bOh = 5;
    localsu.cdE.talker = getTalkerUserName();
    localsu.cdE.context = this.tJh.tTq.getContext();
    localsu.cdE.cdz = 2;
    com.tencent.mm.sdk.b.a.sFg.m(localsu);
  }
  
  public final void ctq()
  {
    ((ac)this.tJh.O(ac.class)).lX(false);
    this.laA.setBottomPanelVisibility(8);
  }
  
  public final void ctr()
  {
    if (!l.a(this.tJh.tTq, com.tencent.mm.compatible.util.e.dgl, "microMsg." + System.currentTimeMillis() + ".jpg")) {
      Toast.makeText(this.tJh.tTq.getContext(), this.tJh.tTq.getMMResources().getString(R.l.selectcameraapp_none), 1).show();
    }
  }
  
  public final String getTalkerUserName()
  {
    if ((this.guS != null) && (ab.gY(this.guS.field_username))) {
      return this.tJc;
    }
    if (this.guS == null) {
      return null;
    }
    return this.guS.field_username;
  }
  
  public final void gq(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      ((y)this.tJh.O(y.class)).keepSignalling();
      return;
    }
    ((y)this.tJh.O(y.class)).stopSignalling();
  }
  
  public final void onPause()
  {
    if (this.hnf != null)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingFooterEventImpl", "release");
      this.hnf.release();
      this.hnf = null;
    }
    ctm();
    this.erD.SO();
    this.hnz.SO();
  }
  
  public final void release()
  {
    if (this.hnf != null)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingFooterEventImpl", "release");
      this.hnf.release();
      this.hnf = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/chatting/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */