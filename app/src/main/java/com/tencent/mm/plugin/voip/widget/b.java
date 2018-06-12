package com.tencent.mm.plugin.voip.widget;

import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.Process;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.Toast;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;
import com.tencent.mm.a.o;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.at;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.voip.model.i;
import com.tencent.mm.plugin.voip.ui.VideoActivity;
import com.tencent.mm.plugin.voip.video.CaptureView;
import com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog;
import com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.e;
import com.tencent.mm.storage.ab;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class b
  implements com.tencent.mm.plugin.voip.ui.b
{
  private static final String byN;
  private static final String byO;
  private int mStatus = -1;
  private CaptureView oLP;
  private ab oLT;
  private boolean oLU;
  private boolean oLV;
  private int oLZ = 1;
  private long oMa = -1L;
  private boolean oNm = false;
  private int oRO;
  private com.tencent.mm.sdk.platformtools.al oSP;
  private com.tencent.mm.plugin.voip.ui.c oVZ;
  private BaseSmallView oWa;
  private com.tencent.mm.sdk.platformtools.al oWb;
  private PowerManager.WakeLock oWc;
  private long oWd = -1L;
  private boolean oWe = false;
  private View.OnClickListener oWf = new View.OnClickListener()
  {
    public final void onClick(View paramAnonymousView)
    {
      if (b.a(b.this) != null) {
        b.a(b.this).setOnClickListener(null);
      }
      b.a(b.this, new com.tencent.mm.sdk.platformtools.al(new b.1.1(this), false));
      b.c(b.this).J(2000L, 2000L);
      paramAnonymousView = new Intent(ad.getContext(), VideoActivity.class);
      paramAnonymousView.setFlags(268435456);
      ad.getContext().startActivity(paramAnonymousView);
    }
  };
  private com.tencent.mm.sdk.platformtools.al oWg;
  
  static
  {
    String str = q.zz();
    byN = str;
    byO = o.getString(str.hashCode());
  }
  
  public b(com.tencent.mm.plugin.voip.ui.c paramc, int paramInt, ab paramab, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Voip.VoipSmallWindow", "initState: %s, talker: %s, isVideoCall: %b", new Object[] { com.tencent.mm.plugin.voip.b.b.yR(paramInt), paramab.field_username, Boolean.valueOf(paramBoolean1) });
    this.oLT = paramab;
    this.oVZ = paramc;
    this.oLV = paramBoolean1;
    this.oLU = paramBoolean2;
    this.oNm = paramBoolean3;
    dQ(0, paramInt);
    this.oWc = ((PowerManager)ad.getContext().getSystemService("power")).newWakeLock(536870922, "MicroMsg.Voip.VoipSmallWindow");
    this.oWc.acquire();
  }
  
  private void bMp()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Voip.VoipSmallWindow", "show mini..");
    bMt();
    Object localObject = ad.getContext();
    i.bJI();
    this.oWa = new a((Context)localObject, com.tencent.mm.plugin.voip.model.r.iS(false));
    this.oWa.setConnectSec(this.oMa);
    this.oWa.setVoipUIListener(this.oVZ);
    localObject = ad.getContext();
    i.bJI();
    float f1 = com.tencent.mm.plugin.voip.model.r.iS(true);
    int i = ((WindowManager)((Context)localObject).getSystemService("window")).getDefaultDisplay().getHeight() / 5 + BackwardSupportUtil.b.b((Context)localObject, 7.0F);
    float f2 = i;
    int j = (int)(BackwardSupportUtil.b.b((Context)localObject, 7.0F) + f1 * f2);
    this.oWa.dV(j, i);
    this.oWa.setOnClickListener(this.oWf);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Voip.VoipSmallWindow", "now add to view..");
    Point localPoint = new Point(j, i);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Voip.VoipSmallWindow", "addViewToWindowManager");
    if ((!com.tencent.mm.plugin.voip.b.b.yW(this.mStatus)) && (!com.tencent.mm.plugin.voip.b.b.yU(this.mStatus)))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Voip.VoipSmallWindow", "not in voip talking or inviting,now return..");
      setHWDecMode(this.oRO);
      return;
    }
    if (this.oWb != null) {
      this.oWb.SO();
    }
    if (this.oWg != null) {
      this.oWg.SO();
    }
    if (this.oSP != null) {
      this.oSP.SO();
    }
    au.getNotification().cancel(40);
    localObject = (WindowManager)ad.getContext().getSystemService("window");
    WindowManager.LayoutParams localLayoutParams = new WindowManager.LayoutParams();
    localLayoutParams.type = 2002;
    localLayoutParams.format = 1;
    localLayoutParams.flags = 40;
    localLayoutParams.gravity = 51;
    Context localContext = ad.getContext();
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    ((WindowManager)localObject).getDefaultDisplay().getMetrics(localDisplayMetrics);
    localLayoutParams.width = localPoint.x;
    localLayoutParams.height = localPoint.y;
    localPoint = i.bJI().oNj;
    if (localPoint == null)
    {
      au.HU();
      i = com.tencent.mm.model.c.DT().getInt(327947, 0);
      j = BackwardSupportUtil.b.b(localContext, 5.0F);
      localLayoutParams.x = (localDisplayMetrics.widthPixels - localLayoutParams.width - j);
    }
    for (localLayoutParams.y = (j + i);; localLayoutParams.y = localPoint.y)
    {
      if (this.oLP != null)
      {
        if ((this.oLP.getParent() != null) && ((this.oLP.getParent() instanceof ViewGroup))) {
          ((ViewGroup)this.oLP.getParent()).removeView(this.oLP);
        }
        this.oWa.setCaptureView(this.oLP);
      }
      this.oWa.setTag(Integer.valueOf(this.mStatus));
      try
      {
        ((WindowManager)localObject).addView(this.oWa, localLayoutParams);
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Voip.VoipSmallWindow", "addViewToWindowManager failed: %s", new Object[] { localException.getMessage() });
      }
      break;
      localLayoutParams.x = localPoint.x;
    }
  }
  
  private void bMr()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Voip.VoipSmallWindow", "showMini");
    boolean bool = false;
    if ((this.mStatus == 261) || (this.mStatus == 7))
    {
      this.oWg = new com.tencent.mm.sdk.platformtools.al(new b.4(this), true);
      this.oWg.J(1000L, 1000L);
      bool = true;
    }
    Intent localIntent = new Intent();
    localIntent.setClass(ad.getContext(), VideoActivity.class);
    localIntent.setFlags(268435456);
    localIntent.putExtra("Voip_User", this.oLT.field_username);
    localIntent.putExtra("Voip_Outcall", this.oLU);
    localIntent.putExtra("Voip_VideoCall", this.oLV);
    localIntent.putExtra("Voip_Is_Talking", bool);
    i.bJJ().a(localIntent, new b.5(this));
  }
  
  private String bMs()
  {
    int i = (int)(System.currentTimeMillis() / 1000L - this.oMa);
    if (this.oMa == -1L) {
      i = 0;
    }
    String str = ad.getContext().getString(R.l.voip_voice_is_talking_tip);
    if (i >= 3600) {
      return str + String.format(Locale.US, "    %d:%02d:%02d", new Object[] { Integer.valueOf(i / 3600), Integer.valueOf(i % 3600 / 60), Integer.valueOf(i % 60) });
    }
    return str + String.format(Locale.US, "    %d:%02d", new Object[] { Integer.valueOf(i / 60), Integer.valueOf(i % 60) });
  }
  
  private void bMt()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Voip.VoipSmallWindow", "removeSmallView");
    if (this.oWb != null) {
      this.oWb.SO();
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Voip.VoipSmallWindow", "remove small view..cancel notification first..");
    au.getNotification().cancel(40);
    Object localObject;
    if (this.oWa != null)
    {
      localObject = (WindowManager.LayoutParams)this.oWa.getLayoutParams();
      i.bJI().oNj = new Point(((WindowManager.LayoutParams)localObject).x, ((WindowManager.LayoutParams)localObject).y);
      this.oWa.uninit();
      localObject = (WindowManager)ad.getContext().getSystemService("window");
    }
    try
    {
      ((WindowManager)localObject).removeView(this.oWa);
      this.oWa = null;
      i.bJJ().OI(ad.getContext().getString(R.l.multitalk_end_wording));
      if (this.oWg != null) {
        this.oWg.SO();
      }
      i.bJJ().dismiss();
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Voip.VoipSmallWindow", "remove failed", new Object[] { localIllegalArgumentException });
      }
    }
  }
  
  private static void yY(int paramInt)
  {
    Context localContext = ad.getContext();
    Toast.makeText(localContext, localContext.getString(paramInt), 1).show();
  }
  
  public final void OH(String paramString) {}
  
  public final void a(byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    if ((260 != this.mStatus) && (6 != this.mStatus)) {}
    while (this.oWa == null) {
      return;
    }
    this.oWa.a(paramArrayOfByte, paramLong, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public final void aL(int paramInt, String paramString)
  {
    if (paramInt == 241) {
      Toast.makeText(ad.getContext(), paramString, 1).show();
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.Voip.VoipSmallWindow", "getHintByErrorCode " + paramInt);
    if (paramInt == 235) {
      paramInt = R.l.voip_errorhint_notsupport;
    }
    while (paramInt == 0)
    {
      yY(R.l.voip_disconnect_tip);
      return;
      if (paramInt == 233)
      {
        i.bJI().bKX();
        paramInt = R.l.voip_errorhint_notcontact;
      }
      else if (paramInt == 237)
      {
        if ((!com.tencent.mm.al.b.PD()) || (this.oLV)) {
          paramInt = R.l.voip_errorhint_plugclose;
        } else {
          paramInt = R.l.voip_errorhint_voice_plugclose_for_oversea;
        }
      }
      else if (paramInt == 236)
      {
        paramInt = R.l.voip_inblacklist;
      }
      else if (paramInt == 211)
      {
        paramInt = R.l.voip_errorhint_userbusy;
      }
      else
      {
        paramInt = 0;
      }
    }
    yY(paramInt);
  }
  
  public final void aYv() {}
  
  public final void bKB()
  {
    if (this.oWa != null) {
      this.oWa.bKB();
    }
  }
  
  public final Context bLD()
  {
    return null;
  }
  
  public final void bLE()
  {
    Toast.makeText(ad.getContext(), R.l.voip_net_status_warning_hint, 1).show();
  }
  
  public final String bMq()
  {
    int i = (int)(System.currentTimeMillis() / 1000L - this.oMa);
    if (this.oMa == -1L) {
      i = 0;
    }
    if (i >= 3600) {}
    for (String str1 = String.format(Locale.US, "%d:%02d:%02d", new Object[] { Integer.valueOf(i / 3600), Integer.valueOf(i % 3600 / 60), Integer.valueOf(i % 60) });; str1 = String.format(Locale.US, "%d:%02d", new Object[] { Integer.valueOf(i / 60), Integer.valueOf(i % 60) }))
    {
      String str2 = str1;
      if (com.tencent.pb.common.c.g.isEmpty(str1)) {
        str2 = "00:00";
      }
      return str2;
    }
  }
  
  public final void c(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    if ((260 != this.mStatus) && (6 != this.mStatus)) {}
    while (this.oWa == null) {
      return;
    }
    this.oWa.c(paramInt1, paramInt2, paramArrayOfInt);
  }
  
  public final void dQ(int paramInt1, int paramInt2)
  {
    Object localObject2 = null;
    Object localObject1 = null;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Voip.VoipSmallWindow", "newState: %s ", new Object[] { com.tencent.mm.plugin.voip.b.b.yR(paramInt2) });
    if (paramInt2 == this.mStatus) {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Voip.VoipSmallWindow", "state unchange");
    }
    do
    {
      do
      {
        return;
        this.mStatus = paramInt2;
        switch (paramInt2)
        {
        default: 
          return;
        case 0: 
        case 2: 
        case 4: 
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Voip.VoipSmallWindow", "showVideoInviting");
          if (this.oWa == null) {}
          while ((localObject1 == null) || ((((Integer)localObject1).intValue() != 0) && (2 != ((Integer)localObject1).intValue()) && (4 != ((Integer)localObject1).intValue())))
          {
            localObject1 = ad.getContext().getString(R.l.voip_video_is_talking_tip);
            g((String)localObject1, (String)localObject1, "", true);
            if (this.oVZ == null) {
              break;
            }
            this.oVZ.a(this, 2);
            return;
            localObject1 = (Integer)this.oWa.getTag();
          }
        case 6: 
        case 260: 
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Voip.VoipSmallWindow", "showVideoTalking");
          this.oWe = true;
          if (-1L == this.oWd) {
            this.oWd = System.currentTimeMillis();
          }
          if (this.oVZ != null) {
            this.oVZ.a(this, 2);
          }
          if (!com.tencent.mm.compatible.f.b.bv(ad.getContext()))
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Voip.VoipSmallWindow", "showVideoTalking, permission denied");
            localObject1 = ad.getContext();
            RequestFloatWindowPermissionDialog.a(ad.getContext(), ((Context)localObject1).getString(R.l.voip_float_permission_alert_content), new RequestFloatWindowPermissionDialog.a()
            {
              public final void a(RequestFloatWindowPermissionDialog paramAnonymousRequestFloatWindowPermissionDialog)
              {
                paramAnonymousRequestFloatWindowPermissionDialog.finish();
                paramAnonymousRequestFloatWindowPermissionDialog = ad.getContext().getString(R.l.voip_video_is_talking_tip);
                b.this.g(paramAnonymousRequestFloatWindowPermissionDialog, com.tencent.mm.model.r.gT(b.d(b.this).field_username), paramAnonymousRequestFloatWindowPermissionDialog, false);
                if ((com.tencent.mm.plugin.voip.b.b.yW(b.e(b.this))) || (com.tencent.mm.plugin.voip.b.b.yU(b.e(b.this)))) {
                  b.f(b.this);
                }
              }
              
              public final void b(RequestFloatWindowPermissionDialog paramAnonymousRequestFloatWindowPermissionDialog)
              {
                paramAnonymousRequestFloatWindowPermissionDialog.finish();
              }
            });
            if (!i.bJI().oNk)
            {
              i.bJI().oNk = true;
              au.HU();
              long l = com.tencent.mm.model.c.DT().Dj(327950);
              if (System.currentTimeMillis() - l > 86400000L)
              {
                au.HU();
                com.tencent.mm.model.c.DT().setLong(327950, System.currentTimeMillis());
                com.tencent.mm.sdk.platformtools.x.d("MicroMsg.Voip.VoipSmallWindow", "reportRawMessage, len: " + "have not permission to showing floating window\n".length());
                StringBuilder localStringBuilder = new StringBuilder();
                localStringBuilder.append("\n#client.version=").append(com.tencent.mm.protocal.d.qVN).append("\n");
                localStringBuilder.append("#accinfo.revision=").append(com.tencent.mm.sdk.platformtools.d.REV).append("\n");
                localStringBuilder.append("#accinfo.uin=").append(at.dBv.I("last_login_uin", byO)).append("\n");
                localStringBuilder.append("#accinfo.dev=").append(byN).append("\n");
                localStringBuilder.append("#accinfo.build=").append(com.tencent.mm.sdk.platformtools.d.TIME).append(":").append(com.tencent.mm.sdk.platformtools.d.HOSTNAME).append(":").append(e.bxk).append("\n");
                localObject1 = new Date();
                localObject2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.getDefault());
                localStringBuilder.append("#accinfo.uploadTime=" + ((SimpleDateFormat)localObject2).format((Date)localObject1)).append("\n");
                localStringBuilder.append("#accinfo.content:\n");
                Intent localIntent = new Intent();
                localIntent.setClassName(ad.getPackageName(), "com.tencent.mm.sandbox.monitor.ExceptionMonitorService");
                localIntent.setAction("uncatch_exception");
                localIntent.putExtra("exceptionWriteSdcard", false);
                localIntent.putExtra("exceptionPid", Process.myPid());
                localObject2 = at.dBv.I("login_weixin_username", "");
                localObject1 = localObject2;
                if (bi.oW((String)localObject2)) {
                  localObject1 = at.dBv.I("login_user_name", "never_login_crash");
                }
                localIntent.putExtra("userName", (String)localObject1);
                localIntent.putExtra("tag", "float_window_permission");
                localIntent.putExtra("exceptionMsg", Base64.encodeToString((localStringBuilder.toString() + "have not permission to showing floating window\n").getBytes(), 2));
                ad.getContext().startService(localIntent);
              }
            }
          }
          for (;;)
          {
            localObject1 = ad.getContext().getString(R.l.voip_video_is_talking_tip);
            g((String)localObject1, com.tencent.mm.model.r.gT(this.oLT.field_username), (String)localObject1, false);
            return;
            bMp();
          }
        case 256: 
        case 258: 
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Voip.VoipSmallWindow", "showCalledVideoInviting");
          if (this.oWa == null) {}
          for (localObject1 = localObject2; (localObject1 == null) || ((256 != ((Integer)localObject1).intValue()) && (258 != ((Integer)localObject1).intValue())); localObject1 = (Integer)this.oWa.getTag())
          {
            localObject1 = ad.getContext().getString(R.l.voip_video_is_talking_tip);
            g((String)localObject1, (String)localObject1, "", true);
            if (this.oVZ == null) {
              break;
            }
            this.oVZ.a(this, 2);
            return;
          }
        case 8: 
        case 262: 
          switch (paramInt1)
          {
          default: 
            bMt();
            return;
          case 4106: 
            paramInt1 = R.l.voip_shutdown_tip;
          }
          for (;;)
          {
            yY(paramInt1);
            break;
            paramInt1 = R.l.voip_no_resp;
            continue;
            if (this.oLV) {
              paramInt1 = R.l.voip_video_call_rejected;
            } else {
              paramInt1 = R.l.voip_audio_call_rejected;
            }
          }
        case 1: 
        case 3: 
        case 5: 
        case 257: 
        case 259: 
          if (2 == this.oLZ) {
            yY(R.l.voip_audio_talking_hint);
          }
          bMt();
          localObject1 = ad.getContext().getString(R.l.voip_voice_is_talking_tip);
          g((String)localObject1, com.tencent.mm.model.r.gT(this.oLT.field_username), (String)localObject1, true);
          bMr();
        }
      } while (this.oVZ == null);
      this.oVZ.a(this, 2);
      return;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Voip.VoipSmallWindow", "showVoiceTalking");
      if (-1L == this.oWd) {
        this.oWd = System.currentTimeMillis();
      }
      if (2 == this.oLZ) {
        yY(R.l.voip_audio_talking_hint);
      }
      bMt();
      if (this.oVZ != null) {
        this.oVZ.a(this, 2);
      }
      this.oWb = new com.tencent.mm.sdk.platformtools.al(new b.3(this), true);
      this.oWb.J(5000L, 5000L);
      localObject1 = bMs();
      g((String)localObject1, com.tencent.mm.model.r.gT(this.oLT.field_username), (String)localObject1, false);
      bMr();
    } while (4101 != paramInt1);
    yY(R.l.voip_switch_to_voice_hint);
  }
  
  public final void g(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Voip.VoipSmallWindow", "showNotification..show notification..tickContent:" + paramString1 + ",title:" + paramString2 + ",content:" + paramString3 + ",breathEffect:" + paramBoolean);
    com.tencent.mm.sdk.platformtools.x.k("MicroMsg.Voip.VoipSmallWindow", "breathEffect " + paramBoolean, new Object[0]);
    if (paramBoolean)
    {
      this.oWb = new com.tencent.mm.sdk.platformtools.al(new b.6(this, paramString1, paramString2, paramString3), true);
      this.oWb.J(5000L, 5000L);
    }
    Object localObject = new Intent();
    ((Intent)localObject).setClass(ad.getContext(), VideoActivity.class);
    ((Intent)localObject).putExtra("Voip_User", this.oLT.field_username);
    ((Intent)localObject).putExtra("Voip_Outcall", this.oLU);
    ((Intent)localObject).putExtra("Voip_VideoCall", this.oLV);
    localObject = PendingIntent.getActivity(ad.getContext(), 40, (Intent)localObject, 134217728);
    paramString1 = com.tencent.mm.plugin.voip.b.d.a(new Notification.Builder(ad.getContext()).setTicker(paramString1).setWhen(System.currentTimeMillis()).setContentTitle(paramString2).setContentText(paramString3).setContentIntent((PendingIntent)localObject).setOngoing(true));
    if (Build.VERSION.SDK_INT < 19) {}
    for (int i = R.g.notification_icon;; i = R.g.notification_icon_gray)
    {
      paramString1.icon = i;
      au.getNotification().a(40, paramString1, false);
      return;
    }
  }
  
  public final void setCaptureView(CaptureView paramCaptureView)
  {
    this.oLP = paramCaptureView;
    if ((this.oWa != null) && (this.oLP != null))
    {
      if ((this.oLP.getParent() != null) && ((this.oLP.getParent() instanceof ViewGroup))) {
        ((ViewGroup)this.oLP.getParent()).removeView(this.oLP);
      }
      this.oWa.setCaptureView(paramCaptureView);
    }
  }
  
  public final void setConnectSec(long paramLong)
  {
    this.oMa = paramLong;
    if (this.oWa != null) {
      this.oWa.setConnectSec(paramLong);
    }
    while ((261 != this.mStatus) && (7 != this.mStatus)) {
      return;
    }
    String str = bMs();
    g(str, com.tencent.mm.model.r.gT(this.oLT.field_username), str, false);
  }
  
  public final void setHWDecMode(int paramInt)
  {
    if (this.oWa != null) {
      this.oWa.setHWDecMode(paramInt);
    }
    this.oRO = paramInt;
  }
  
  public final void setMute(boolean paramBoolean) {}
  
  public final void setScreenEnable(boolean paramBoolean) {}
  
  public final void uninit()
  {
    int i = 3;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Voip.VoipSmallWindow", "uninit");
    h localh;
    long l;
    if (-1L != this.oWd)
    {
      localh = h.mEJ;
      if (this.oWe) {
        i = 2;
      }
      l = (System.currentTimeMillis() - this.oWd) / 1000L;
      if (!this.oNm) {
        break label170;
      }
    }
    label170:
    for (int j = 1;; j = 2)
    {
      localh.h(11620, new Object[] { Integer.valueOf(i), Long.valueOf(l), Integer.valueOf(j) });
      if ((this.oWc != null) && (this.oWc.isHeld())) {
        this.oWc.release();
      }
      bMt();
      if (this.oWb != null) {
        this.oWb.SO();
      }
      if (this.oWg != null) {
        this.oWg.SO();
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Voip.VoipSmallWindow", "uninit..cancel notification..");
      au.getNotification().cancel(40);
      this.oLP = null;
      return;
    }
  }
  
  public final void yN(int paramInt) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/voip/widget/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */