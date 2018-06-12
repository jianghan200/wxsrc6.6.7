package com.tencent.mm.plugin.fav.ui.detail;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap.CompressFormat;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.tencent.mm.a.e;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.q;
import com.tencent.mm.plugin.fav.ui.h.5;
import com.tencent.mm.plugin.fav.ui.m.d;
import com.tencent.mm.plugin.fav.ui.m.e;
import com.tencent.mm.plugin.fav.ui.m.f;
import com.tencent.mm.plugin.fav.ui.m.i;
import com.tencent.mm.plugin.fav.ui.widget.FavVideoView;
import com.tencent.mm.plugin.fav.ui.widget.FavVideoView.5;
import com.tencent.mm.plugin.webview.ui.tools.widget.m;
import com.tencent.mm.pluginsdk.ui.tools.l;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import java.util.Iterator;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class FavoriteVideoPlayUI
  extends MMActivity
{
  private String bOX;
  private boolean bUY = true;
  private String dXA;
  private Bundle hDg;
  private boolean hDh = false;
  private com.tencent.mm.ui.tools.f hDi;
  private int hDj = 0;
  private int hDk = 0;
  private int hDl = 0;
  private int hDm = 0;
  private View.OnClickListener iZP = new FavoriteVideoPlayUI.1(this);
  private View.OnLongClickListener jcS = new FavoriteVideoPlayUI.2(this);
  private int jdD;
  private String jdE;
  private RelativeLayout jdF;
  private ImageView jdG;
  private FavVideoView jdH;
  private LinearLayout jdI;
  private boolean jdJ = true;
  private int jdK;
  private boolean jdL = false;
  private String jdM = "";
  private boolean jdl = true;
  
  private void b(ImageView paramImageView)
  {
    FavVideoView localFavVideoView = this.jdH;
    String str1 = this.dXA;
    boolean bool = this.jdL;
    String str2 = this.jdM;
    localFavVideoView.dXA = str1;
    if (bool)
    {
      localFavVideoView.hDf.post(new FavVideoView.5(localFavVideoView));
      localFavVideoView.jdM = str2;
    }
    if (paramImageView != null)
    {
      if (!e.cn(this.bOX)) {
        break label88;
      }
      paramImageView.setImageBitmap(BackwardSupportUtil.b.e(this.bOX, 1.0F));
    }
    for (;;)
    {
      x.i("MicroMsg.FavoriteVideoPlayUI", "VideoPlay: fullPath is not null,but not exist videoView.setVideoData(null)");
      return;
      label88:
      paramImageView.setImageResource(m.d.chat_video_nf_mask_from);
    }
  }
  
  public static void f(String paramString, Context paramContext)
  {
    String str = t.nX(paramString);
    x.i("MicroMsg.FavoriteVideoPlayUI", "save video now video path %s out path %s", new Object[] { paramString, str });
    if (bi.oW(str))
    {
      Toast.makeText(paramContext, paramContext.getString(m.i.video_file_save_failed), 1).show();
      return;
    }
    Toast.makeText(paramContext, paramContext.getString(m.i.video_file_saved, new Object[] { str }), 1).show();
    l.a(str, paramContext);
  }
  
  public final void ayH()
  {
    this.jdI.setVisibility(8);
    int k = this.jdF.getWidth();
    int j = this.jdF.getHeight();
    int i = j;
    if (this.hDl != 0)
    {
      i = j;
      if (this.hDm != 0) {
        i = (int)(k / this.hDl * this.hDm);
      }
    }
    this.hDi.fh(k, i);
    this.hDi.u(this.hDk, this.hDj, this.hDl, this.hDm);
    this.hDi.a(this.jdH, this.jdG, new FavoriteVideoPlayUI.5(this), null);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  protected final int getLayoutId()
  {
    return m.f.fav_video_play_ui;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 == 1) && (-1 == paramInt2))
    {
      if (paramIntent == null)
      {
        localObject = null;
        if (paramIntent != null) {
          break label73;
        }
      }
      FavoriteVideoPlayUI.3 local3;
      label73:
      for (paramIntent = null;; paramIntent = paramIntent.getStringExtra("custom_send_text"))
      {
        local3 = new FavoriteVideoPlayUI.3(this, h.a(this.mController.tml, getString(m.i.favorite_forward_tips), false, null));
        if (!bi.oW((String)localObject)) {
          break label84;
        }
        return;
        localObject = paramIntent.getStringExtra("Select_Conv_User");
        break;
      }
      label84:
      Object localObject = bi.F(((String)localObject).split(",")).iterator();
      label283:
      while (((Iterator)localObject).hasNext())
      {
        String str1 = (String)((Iterator)localObject).next();
        ActionBarActivity localActionBarActivity = this.mController.tml;
        String str2 = this.dXA;
        String str3 = this.bOX;
        paramInt1 = this.jdD;
        String str4 = this.jdE;
        if (localActionBarActivity == null) {
          x.w("MicroMsg.FavSendLogic", "want to send fav video, but context is null");
        }
        for (;;)
        {
          if (bi.oW(paramIntent)) {
            break label283;
          }
          com.tencent.mm.plugin.messenger.a.g.bcT().D(str1, paramIntent, com.tencent.mm.model.s.hQ(str1));
          break;
          if (bi.oW(str1))
          {
            x.w("MicroMsg.FavSendLogic", "want to send fav video, but to user is null");
          }
          else
          {
            com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(str2);
            if ((bi.oW(str2)) && (!localb.exists())) {
              x.w("MicroMsg.FavSendLogic", "want to send fav video, but datapath is null or is not exist ");
            } else {
              com.tencent.mm.kernel.g.Em().H(new h.5(localActionBarActivity, str1, str2, str3, paramInt1, str4, local3));
            }
          }
        }
      }
      com.tencent.mm.ui.widget.snackbar.b.h(this, getString(m.i.fav_finish_sent));
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onBackPressed()
  {
    ayH();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.mController.hideTitleView();
    if (com.tencent.mm.compatible.util.d.fR(19)) {
      getWindow().setFlags(201327616, 201327616);
    }
    for (;;)
    {
      this.hDg = paramBundle;
      getWindow().addFlags(128);
      this.jdJ = getIntent().getBooleanExtra("key_detail_data_valid", true);
      this.dXA = getIntent().getStringExtra("key_detail_fav_path");
      this.bOX = getIntent().getStringExtra("key_detail_fav_thumb_path");
      this.jdD = getIntent().getIntExtra("key_detail_fav_video_duration", 0);
      this.jdE = getIntent().getStringExtra("key_detail_statExtStr");
      this.jdK = getIntent().getIntExtra("key_detail_fav_video_scene_from", 0);
      this.bUY = getIntent().getBooleanExtra("show_share", true);
      this.jdL = getIntent().getBooleanExtra("key_detail_fav_video_show_download_status", false);
      this.jdM = getIntent().getStringExtra("key_detail_data_id");
      if (!e.cn(this.bOX))
      {
        paramBundle = com.tencent.mm.plugin.fav.ui.c.By(this.dXA);
        if (paramBundle == null) {}
      }
      try
      {
        x.i("MicroMsg.FavoriteVideoPlayUI", "VideoPlay: create thumbpath bitmap, saveBitmapToImage ");
        com.tencent.mm.sdk.platformtools.c.a(paramBundle, 60, Bitmap.CompressFormat.JPEG, this.bOX, true);
        boolean bool = this.jdJ;
        if (bi.oW(this.bOX))
        {
          paramBundle = "";
          if (!bi.oW(this.dXA)) {
            break label507;
          }
          str = "";
          x.i("MicroMsg.FavoriteVideoPlayUI", "VideoPlay: init data, isVideoValid: %B. thumbPath: %s, fullPath: %s", new Object[] { Boolean.valueOf(bool), paramBundle, str });
          this.jdF = ((RelativeLayout)findViewById(m.e.video_ui_root));
          this.jdH = ((FavVideoView)findViewById(m.e.video_view));
          paramBundle = (ImageView)findViewById(m.e.video_thumb);
          this.jdG = ((ImageView)findViewById(m.e.gallery_bg));
          this.jdI = ((LinearLayout)findViewById(m.e.fav_expired_btn));
          if ((!this.jdJ) && (this.jdI != null)) {
            this.jdI.setVisibility(0);
          }
          if (this.jdG != null) {
            this.jdG.setLayerType(2, null);
          }
          if (bi.oW(this.dXA)) {
            break label523;
          }
          if (!FileOp.cn(this.dXA)) {
            break label515;
          }
          this.jdH.setVideoData(this.dXA);
          x.i("MicroMsg.FavoriteVideoPlayUI", "VideoPlay:  videoView.setVideoData(fullPath)");
          this.jdH.setOnClickListener(this.iZP);
          if (this.bUY) {
            this.jdH.setOnLongClickListener(this.jcS);
          }
          this.hDi = new com.tencent.mm.ui.tools.f(null);
          return;
          getWindow().setFlags(1024, 1024);
        }
      }
      catch (Exception paramBundle)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.FavoriteVideoPlayUI", paramBundle, "", new Object[0]);
          continue;
          paramBundle = this.bOX;
          continue;
          label507:
          String str = this.dXA;
          continue;
          label515:
          b(paramBundle);
          continue;
          label523:
          b(paramBundle);
        }
      }
    }
  }
  
  protected void onDestroy()
  {
    setResult(0, getIntent().putExtra("key_activity_browse_time", cql()));
    FavVideoView localFavVideoView = this.jdH;
    x.i("MicroMsg.FavVideoView", "VideoPlay:   onDestroy()");
    localFavVideoView.hEl.stop();
    ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage().b(localFavVideoView.jfR);
    ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().b(localFavVideoView.jfR);
    getWindow().clearFlags(128);
    super.onDestroy();
  }
  
  protected void onPause()
  {
    if (Build.VERSION.SDK_INT >= 21) {
      getWindow().setFlags(2048, 2048);
    }
    FavVideoView localFavVideoView = this.jdH;
    x.i("MicroMsg.FavVideoView", "VideoPlay:   onPause()");
    if (localFavVideoView.hEl.isPlaying())
    {
      x.i("MicroMsg.FavVideoView", "VideoPlay: pausePlay()");
      localFavVideoView.hEl.pause();
    }
    super.onPause();
    m.Bk(2);
  }
  
  protected void onResume()
  {
    if (Build.VERSION.SDK_INT >= 21) {
      getWindow().clearFlags(2048);
    }
    x.i("MicroMsg.FavoriteVideoPlayUI", "VideoPlay:  onResume,hadOnStart is %B", new Object[] { Boolean.valueOf(this.jdl) });
    if (!this.jdl) {
      this.jdH.onResume();
    }
    this.jdl = false;
    super.onResume();
    m.Bk(1);
  }
  
  public void onStart()
  {
    Bundle localBundle = this.hDg;
    if (!this.hDh)
    {
      this.hDh = true;
      if (Build.VERSION.SDK_INT >= 12)
      {
        this.hDj = getIntent().getIntExtra("img_gallery_top", 0);
        this.hDk = getIntent().getIntExtra("img_gallery_left", 0);
        this.hDl = getIntent().getIntExtra("img_gallery_width", 0);
        this.hDm = getIntent().getIntExtra("img_gallery_height", 0);
        this.hDi.u(this.hDk, this.hDj, this.hDl, this.hDm);
        if (localBundle == null) {
          this.jdH.getViewTreeObserver().addOnPreDrawListener(new FavoriteVideoPlayUI.4(this));
        }
      }
    }
    super.onStart();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/fav/ui/detail/FavoriteVideoPlayUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */