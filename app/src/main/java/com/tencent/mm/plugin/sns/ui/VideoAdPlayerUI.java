package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.model.m;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.ak.a.c;
import com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar;
import com.tencent.mm.plugin.sight.decode.ui.VideoPlayView;
import com.tencent.mm.plugin.sight.decode.ui.VideoPlayView.5;
import com.tencent.mm.plugin.sight.decode.ui.VideoPlayView.6;
import com.tencent.mm.plugin.sns.a.b.c;
import com.tencent.mm.plugin.sns.a.b.h;
import com.tencent.mm.plugin.sns.a.b.j;
import com.tencent.mm.plugin.sns.a.b.j.a;
import com.tencent.mm.plugin.sns.a.b.j.c;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.plugin.sns.model.b.a;
import com.tencent.mm.plugin.sns.model.b.b;
import com.tencent.mm.pluginsdk.ui.tools.f;
import com.tencent.mm.protocal.c.ate;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.av;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.y.g.a;
import com.tencent.mm.y.n.a;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@com.tencent.mm.ui.base.a(19)
public class VideoAdPlayerUI
  extends MMActivity
  implements b.a, b.b
{
  private String bOX = "";
  private String bZN;
  private String bssid;
  private String dXA = "";
  private String dyM = "";
  private String dyN = "";
  private String fvT = "";
  private com.tencent.mm.model.d gbl;
  private boolean hTT = false;
  private String mediaId = "";
  private String nAW = "";
  private com.tencent.mm.plugin.sns.storage.n nSE;
  private boolean nkG = false;
  private h oaT = new h("VideoAdPlayerUI");
  private VideoPlayView oid;
  private com.tencent.mm.modelsns.b oie = null;
  private String oif = "";
  private int oig = 0;
  private String oih = "";
  public String oii = "";
  public String oij = "";
  private int oik = 0;
  private int oil = 0;
  private String oim = "";
  private String oin;
  private String oio = "";
  private long oip = 0L;
  private int oiq = 0;
  private int oir = 0;
  private boolean ois = false;
  private boolean oit = false;
  private ate oiu = null;
  private String oiv;
  private int oiw;
  private String[] oix = null;
  private String[] oiy = null;
  private String ssid;
  private String thumbUrl = "";
  private String url = "";
  
  private void xy(int paramInt)
  {
    if (!this.nkG) {
      return;
    }
    this.oaT.wh(this.oid.getDuration());
    this.oaT.njs.nku = bi.VG();
    com.tencent.mm.plugin.sns.a.b.a.a locala = this.oaT.njs;
    if (paramInt == 2) {}
    for (paramInt = 2;; paramInt = 1)
    {
      locala.nkt = paramInt;
      this.oaT.njs.nks = 2;
      x.i("MicroMsg.VideoPlayerUI", "duration  orient " + this.oaT.njs.nkt);
      return;
    }
  }
  
  public final void LR(String paramString) {}
  
  public final void aS(String paramString, boolean paramBoolean) {}
  
  public final void aT(String paramString, boolean paramBoolean)
  {
    x.i("MicroMsg.VideoPlayerUI", "onSightFinish " + paramString);
    this.oid.setIsDownloading(false);
    this.oid.setVideoPath(this.dXA);
    this.oid.x(this.oid.getLastProgresstime());
    this.oid.setLoop(false);
    if ((this.nkG) && (!bi.oW(paramString)) && (this.oiu != null) && (paramString.equals(this.oiu.ksA)) && (FileOp.cn(this.dXA))) {
      this.oaT.njk = 1;
    }
  }
  
  public final void bxb() {}
  
  public final void ew(String paramString1, String paramString2)
  {
    x.i("MicroMsg.VideoPlayerUI", "isPlaying " + this.oid.isPlaying());
    if (this.oid.isPlaying()) {
      return;
    }
    this.oid.setLoop(false);
    if (paramString2.equals(this.oid.getVideoPath()))
    {
      this.oid.x(this.oid.getLastProgresstime());
      this.oid.start();
      x.i("MicroMsg.VideoPlayerUI", "onSightProgressstart " + paramString1 + " path: " + paramString2);
      return;
    }
    this.oid.setVideoPath(paramString2);
    this.oid.x(this.oid.getLastProgresstime());
    x.i("MicroMsg.VideoPlayerUI", "onSightProgresssetVideoPath " + paramString1 + " path: " + paramString2);
  }
  
  public void finish()
  {
    if (this.hTT) {
      this.oid.pause();
    }
    if ((this.oaT != null) && (this.nAW != null) && (this.nAW.length() > 0))
    {
      this.oaT.bwO();
      Intent localIntent = new Intent();
      localIntent.putExtra("KComponentCid", this.nAW);
      localIntent.putExtra("KStreamVideoPlayCount", this.oaT.njo);
      localIntent.putExtra("KStreamVideoPlayCompleteCount", this.oaT.njp);
      localIntent.putExtra("KStreamVideoTotalPlayTimeInMs", this.oaT.njq);
      setResult(-1, localIntent);
    }
    super.finish();
  }
  
  protected final int getForceOrientation()
  {
    if (this.oit) {
      return 0;
    }
    return 4;
  }
  
  protected final int getLayoutId()
  {
    return i.g.video_player_ui;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    x.i("MicroMsg.VideoPlayerUI", "onActivityResult %d", new Object[] { Integer.valueOf(paramInt1) });
    Object localObject1;
    if (4097 == paramInt1)
    {
      if (-1 == paramInt2)
      {
        localObject1 = paramIntent.getStringExtra("Select_Conv_User");
        String str1 = paramIntent.getStringExtra("custom_send_text");
        Iterator localIterator = bi.F(((String)localObject1).split(",")).iterator();
        while (localIterator.hasNext())
        {
          String str2 = (String)localIterator.next();
          x.i("MicroMsg.VideoPlayerUI", "send sight to %s", new Object[] { str2 });
          Object localObject2 = new g.a();
          ((g.a)localObject2).title = this.oih;
          ((g.a)localObject2).type = 4;
          label157:
          label179:
          label292:
          int j;
          label614:
          String str3;
          int k;
          String str4;
          String str5;
          String str6;
          long l;
          int m;
          int n;
          if (!bi.oW(this.oiu.jPK))
          {
            ((g.a)localObject2).url = this.oiu.jPK;
            if (!bi.oW(this.oiu.rVO)) {
              break label731;
            }
            localObject1 = this.oiu.rVE;
            ((g.a)localObject2).thumburl = ((String)localObject1);
            ((g.a)localObject2).dyJ = this.oiu.rVL;
            ((g.a)localObject2).dyK = this.oiu.oig;
            ((g.a)localObject2).dyL = this.oih;
            ((g.a)localObject2).dyN = this.dyN;
            ((g.a)localObject2).dyM = this.dyM;
            ((g.a)localObject2).dyO = this.thumbUrl;
            ((g.a)localObject2).dyP = this.oii;
            ((g.a)localObject2).dyQ = this.oij;
            ((g.a)localObject2).bZN = this.bZN;
            localObject1 = FileOp.e(this.bOX, 0, -1);
            if (localObject1 != null) {
              break label743;
            }
            i = 0;
            x.i("MicroMsg.VideoPlayerUI", "read buf size %d", new Object[] { Integer.valueOf(i) });
            if (n.a.FH() != null) {
              n.a.FH().a((g.a)localObject2, "", "", str2, "", (byte[])localObject1);
            }
            if (this.oiw != 0)
            {
              j = this.oaT.njs.nkq;
              i = j;
              if (this.hTT)
              {
                i = j;
                if (this.oaT.njs.nku != 0L) {
                  i = j + (int)(bi.bI(this.oaT.njs.nku) / 1000L);
                }
              }
              localObject1 = new com.tencent.mm.modelstat.i(13228, "1,3," + i + "," + this.ssid + "," + this.bssid + "," + bi.VE() + "," + this.oiv + "," + this.oig, (int)bi.VE());
              com.tencent.mm.kernel.g.Ek();
              com.tencent.mm.kernel.g.Eh().dpP.a((l)localObject1, 0);
            }
            com.tencent.mm.plugin.messenger.a.g.bcT().dF(str1, str2);
            if (this.nkG)
            {
              localObject1 = new c(this.fvT, 12, 6, "", 2, this.nSE.bAK());
              com.tencent.mm.kernel.g.Ek();
              com.tencent.mm.kernel.g.Eh().dpP.a((l)localObject1, 0);
            }
            if (this.oil == 0) {
              continue;
            }
            boolean bool = com.tencent.mm.model.s.fq(str2);
            if (!bool) {
              break label751;
            }
            localObject1 = j.c.nkb;
            localObject2 = this.oij;
            str3 = this.oii;
            j = this.oik;
            k = this.oil;
            str4 = this.oim;
            str5 = this.oin;
            str6 = this.oio;
            l = this.oip;
            m = this.oiq;
            n = this.oir;
            if (!bool) {
              break label759;
            }
          }
          label731:
          label743:
          label751:
          label759:
          for (int i = m.gK(str2);; i = 0)
          {
            j.a((j.c)localObject1, (String)localObject2, str3, j, k, str4, str5, str6, l, m, n, i);
            break;
            ((g.a)localObject2).url = this.oiu.rVL;
            break label157;
            localObject1 = this.oiu.rVO;
            break label179;
            i = localObject1.length;
            break label292;
            localObject1 = j.c.nka;
            break label614;
          }
        }
        com.tencent.mm.ui.widget.snackbar.b.h(this, getString(i.j.has_send));
      }
    }
    else if (4098 == paramInt1)
    {
      if (this.oil != 0) {
        j.a(j.c.nkc, this.oij, this.oii, this.oik, this.oil, this.oim, this.oin, this.oio, this.oip, this.oiq, this.oir, 0);
      }
      if (-1 != paramInt2) {
        break label955;
      }
      if (this.nkG)
      {
        localObject1 = new c(this.fvT, 15, 6, "", 2, this.nSE.bAK());
        com.tencent.mm.kernel.g.Ek();
        com.tencent.mm.kernel.g.Eh().dpP.a((l)localObject1, 0);
      }
    }
    for (;;)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
      if (!this.nkG) {
        break;
      }
      localObject1 = new c(this.fvT, 13, 6, "", 2, this.nSE.bAK());
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Eh().dpP.a((l)localObject1, 0);
      break;
      label955:
      if (this.nkG)
      {
        localObject1 = new c(this.fvT, 16, 6, "", 2, this.nSE.bAK());
        com.tencent.mm.kernel.g.Ek();
        com.tencent.mm.kernel.g.Eh().dpP.a((l)localObject1, 0);
      }
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    VideoPlayView localVideoPlayView = this.oid;
    x.i("MicroMsg.VideoPlayView", "onConfigurationChanged " + paramConfiguration.orientation + " " + localVideoPlayView.nep);
    if (localVideoPlayView.nep != paramConfiguration.orientation)
    {
      if (paramConfiguration.orientation != 1) {
        break label107;
      }
      localVideoPlayView.update(1);
    }
    for (;;)
    {
      localVideoPlayView.nep = paramConfiguration.orientation;
      if (localVideoPlayView.nep == 2) {
        localVideoPlayView.gFD.setVisibility(8);
      }
      xy(paramConfiguration.orientation);
      return;
      label107:
      localVideoPlayView.update(2);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.mController.hideTitleView();
    getWindow().setFlags(1024, 1024);
    this.oix = new String[] { getString(i.j.sns_ad_video_right_menu_send_friend), getString(i.j.sns_ad_video_right_menu_share_sns), getString(i.j.sns_ad_video_right_menu_fav) };
    this.oiy = new String[] { getString(i.j.sns_ad_video_right_menu_send_friend), getString(i.j.sns_ad_video_right_menu_share_sns) };
    paramBundle = getIntent().getStringExtra("KSta_SnSId");
    this.nSE = af.byo().Nk(com.tencent.mm.plugin.sns.data.i.LP(paramBundle));
    this.gbl = new com.tencent.mm.model.d();
    this.oie = com.tencent.mm.modelsns.b.p(getIntent());
    this.dXA = getIntent().getStringExtra("KFullVideoPath");
    this.oif = getIntent().getStringExtra("KStremVideoUrl");
    this.thumbUrl = getIntent().getStringExtra("KThumUrl");
    this.mediaId = getIntent().getStringExtra("KMediaId");
    this.nkG = getIntent().getBooleanExtra("IsAd", false);
    this.url = getIntent().getStringExtra("KUrl");
    this.oih = bi.aG(getIntent().getStringExtra("KMediaTitle"), "");
    this.oig = getIntent().getIntExtra("KMediaVideoTime", 0);
    this.ois = getIntent().getBooleanExtra("KBlockFav", false);
    this.oit = getIntent().getBooleanExtra("ForceLandscape", false);
    this.dyM = getIntent().getStringExtra("StreamWording");
    this.dyN = getIntent().getStringExtra("StremWebUrl");
    this.nAW = getIntent().getStringExtra("KComponentCid");
    this.oii = getIntent().getStringExtra("KSta_StremVideoAduxInfo");
    this.oij = getIntent().getStringExtra("KSta_StremVideoPublishId");
    this.oik = getIntent().getIntExtra("KSta_SourceType", 0);
    this.oil = getIntent().getIntExtra("KSta_Scene", 0);
    this.oim = getIntent().getStringExtra("KSta_FromUserName");
    this.oin = getIntent().getStringExtra("KSta_ChatName");
    this.oio = getIntent().getStringExtra("KSta_SnSId");
    this.oip = getIntent().getLongExtra("KSta_MsgId", 0L);
    this.oiq = getIntent().getIntExtra("KSta_FavID", 0);
    this.oir = getIntent().getIntExtra("KSta_ChatroomMembercount", 0);
    this.bZN = getIntent().getStringExtra("KSta_SnsStatExtStr");
    this.fvT = bi.aG(getIntent().getStringExtra("KViewId"), "");
    this.oiv = bi.aG(getIntent().getStringExtra("ReportArgs"), "");
    this.oiw = getIntent().getIntExtra("NeedReportData", 0);
    if (this.oiw != 0)
    {
      paramBundle = ((WifiManager)getSystemService("wifi")).getConnectionInfo();
      this.ssid = paramBundle.getSSID();
      this.bssid = paramBundle.getBSSID();
    }
    this.oiu = new ate();
    this.oiu.rVE = this.thumbUrl;
    this.oiu.rVL = this.oif;
    this.oiu.ksA = this.mediaId;
    this.oiu.jPK = this.url;
    this.oiu.rVD = 1;
    this.oiu.oig = this.oig;
    this.oaT.njm = bi.VG();
    x.i("MicroMsg.VideoPlayerUI", "init streamvideo " + this.oiu.ksA + " attachurl:" + this.oiu.rVL + " videoattachTotalTime:" + this.oiu.oig + " streamvideowording: " + this.dyM + " streamvideoweburl: " + this.dyN + " mediaTitle: " + this.oih + " thumburl " + this.thumbUrl + " streamvideoaduxinfo " + this.oii + " streamvideopublishid " + this.oij);
    Object localObject1;
    if (bi.oW(this.dXA))
    {
      paramBundle = an.s(af.getAccSnsPath(), this.oiu.ksA);
      localObject1 = com.tencent.mm.plugin.sns.data.i.k(this.oiu);
      this.dXA = (paramBundle + (String)localObject1);
    }
    if ((bi.oW(this.bOX)) || (!com.tencent.mm.a.e.cn(this.bOX)))
    {
      paramBundle = "attach" + this.oiu.ksA;
      localObject1 = an.s(af.getAccSnsPath(), paramBundle);
      this.bOX = ((String)localObject1 + com.tencent.mm.plugin.sns.data.i.LA(paramBundle));
    }
    if (!com.tencent.mm.a.e.cn(this.bOX)) {}
    try
    {
      paramBundle = new ate();
      paramBundle.aG(this.oiu.toByteArray());
      paramBundle.ksA = ("attach" + paramBundle.ksA);
      localObject1 = new com.tencent.mm.plugin.sns.data.e(this.oiu);
      ((com.tencent.mm.plugin.sns.data.e)localObject1).nkQ = 1;
      ((com.tencent.mm.plugin.sns.data.e)localObject1).kJG = this.oiu.ksA;
      af.byj().a(paramBundle, 7, (com.tencent.mm.plugin.sns.data.e)localObject1, av.tbu);
      getWindow().addFlags(128);
      this.oid = ((VideoPlayView)findViewById(i.f.video_play_view));
      paramBundle = this.oid;
      localObject1 = new AdVideoPlayerLoadingBar(this.mController.tml);
      Object localObject2 = new RelativeLayout.LayoutParams(-1, -2);
      ((RelativeLayout.LayoutParams)localObject2).addRule(12);
      ((RelativeLayout.LayoutParams)localObject2).bottomMargin = paramBundle.getContext().getResources().getDimensionPixelSize(a.c.NoPadding);
      paramBundle.nea = ((com.tencent.mm.plugin.sight.decode.ui.a)localObject1);
      paramBundle.hEl.setPlayProgressCallback(true);
      paramBundle.addView((View)paramBundle.nea, (ViewGroup.LayoutParams)localObject2);
      paramBundle.nea.setIplaySeekCallback(new VideoPlayView.5(paramBundle));
      paramBundle.nea.setOnPlayButtonClickListener(new VideoPlayView.6(paramBundle));
      paramBundle.nea.setIsPlay(paramBundle.hEl.isPlaying());
      if (paramBundle.nea != null) {
        ((View)paramBundle.nea).setVisibility(8);
      }
      ((com.tencent.mm.plugin.sight.decode.ui.a)localObject1).seek(0);
      this.oid.setVideoPlayViewEvent(new VideoAdPlayerUI.1(this));
      this.oid.setVideoTotalTime(this.oiu.oig);
      if (com.tencent.mm.a.e.cn(this.dXA))
      {
        this.oaT.njk = 1;
        this.oid.setVideoPath(this.dXA);
        this.oid.setLeftButtonOnClickListener(new VideoAdPlayerUI.2(this));
        this.oid.setRightButtonOnCliclListener(new VideoAdPlayerUI.3(this));
        paramBundle = this.oid;
        localObject1 = this.dyM;
        localObject2 = new VideoAdPlayerUI.4(this);
        paramBundle.ned = ((String)localObject1);
        paramBundle.nec.setText((CharSequence)localObject1);
        paramBundle.nec.setOnClickListener((View.OnClickListener)localObject2);
        this.oid.bvY();
        if (getIntent().getIntExtra("ShareBtnHidden", 0) != 0)
        {
          paramBundle = this.oid;
          if (paramBundle.tnq != null)
          {
            paramBundle.neg = false;
            paramBundle.tnq.setVisibility(8);
          }
        }
        return;
      }
    }
    catch (Exception paramBundle)
    {
      for (;;)
      {
        x.e("MicroMsg.VideoPlayerUI", "error for download thumb");
        continue;
        this.oid.bvW();
        this.oid.setIsDownloading(true);
        af.byj().a(this.oiu, 6, null, av.tbu);
      }
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    getWindow().clearFlags(128);
    if (this.oil != 0) {
      j.a(j.a.njP, this.oij, this.oii, this.oik, this.oil, this.oim, this.oin, this.oio, this.oip, this.oiq, this.oir);
    }
    if (this.nkG) {
      if (this.nSE != null) {
        break label416;
      }
    }
    label416:
    for (int i = 0;; i = this.nSE.bBq())
    {
      Object localObject = this.oaT.bwN();
      long l2 = this.oaT.njl - this.oaT.egP;
      long l1 = l2;
      if (l2 < 0L)
      {
        x.e("MicroMsg.VideoPlayerUI", "reportVideo minus staytime found! totaltime[%d], offscreenTime[%ld]", new Object[] { Integer.valueOf(this.oaT.njl), Long.valueOf(this.oaT.egP) });
        l1 = this.oaT.njl;
      }
      int j = (int)l1;
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Eh().dpP.a(new com.tencent.mm.plugin.sns.a.b.d(this.fvT, 6, 2, this.oaT.njl, null, null, 2, (String)localObject, -1, i, j, j, 0), 0);
      if (this.oiw != 0)
      {
        j = this.oaT.njs.nkq;
        i = j;
        if (this.hTT)
        {
          i = j;
          if (this.oaT.njs.nku != 0L) {
            i = j + (int)(bi.bI(this.oaT.njs.nku) / 1000L);
          }
        }
        localObject = new com.tencent.mm.modelstat.i(13228, "1,2," + i + "," + this.ssid + "," + this.bssid + "," + bi.VE() + "," + this.oiv + "," + this.oig, (int)bi.VE());
        com.tencent.mm.kernel.g.Ek();
        com.tencent.mm.kernel.g.Eh().dpP.a((l)localObject, 0);
      }
      setResult(-1, getIntent().putExtra("key_activity_browse_time", cql()));
      return;
    }
  }
  
  protected void onPause()
  {
    super.onPause();
    int i = getResources().getConfiguration().orientation;
    x.i("MicroMsg.VideoPlayerUI", "onpause  " + i);
    xy(i);
    if ((this.oid != null) && (this.oid.isPlaying())) {
      this.oid.pause();
    }
    if (this.oid != null)
    {
      x.i("MicroMsg.VideoPlayerUI", "onDetach");
      this.oid.onDetach();
    }
    af.byj().nmH.remove(this);
    af.byj().b(this);
    if (this.oaT != null) {
      this.oaT.egO = bi.VG();
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    af.byj().nmH.add(this);
    af.byj().a(this);
    if (this.oaT != null) {
      this.oaT.onResume();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/VideoAdPlayerUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */