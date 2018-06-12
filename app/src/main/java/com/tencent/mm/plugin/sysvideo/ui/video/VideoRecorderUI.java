package com.tencent.mm.plugin.sysvideo.ui.video;

import android.app.ProgressDialog;
import android.content.Intent;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.ActionBar;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.e.d;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.e.v;
import com.tencent.mm.model.ad;
import com.tencent.mm.model.au;
import com.tencent.mm.pluginsdk.i.a;
import com.tencent.mm.pluginsdk.i.b;
import com.tencent.mm.pluginsdk.i.e;
import com.tencent.mm.pluginsdk.i.f;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ak;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.s.b;

public class VideoRecorderUI
  extends MMActivity
{
  private static VideoRecorderUI ovi;
  private ProgressDialog eHw = null;
  private SurfaceView fAd = null;
  private long hng = -1L;
  private al hnz = new al(new VideoRecorderUI.1(this), true);
  private boolean mNn;
  private String ouP = null;
  private SurfaceHolder ouT = null;
  private b ouU;
  private ImageButton ouV;
  private boolean ouW = false;
  private boolean ouX = false;
  private TextView ouY;
  private LinearLayout ouZ;
  private ImageView ova;
  private ImageButton ovb = null;
  private ImageView ovc;
  private TextView ovd;
  private TextView ove;
  private TextView ovf;
  private int ovg = 0;
  private ImageButton ovh;
  private boolean ovj = false;
  private boolean ovk = true;
  private String ovl = null;
  private String ovm = null;
  private View ovn;
  private View ovo;
  private ag ovp = new ag()
  {
    public final void handleMessage(Message paramAnonymousMessage)
    {
      super.handleMessage(paramAnonymousMessage);
      VideoRecorderUI.o(VideoRecorderUI.this).setEnabled(true);
    }
  };
  SurfaceHolder.Callback ovq = new VideoRecorderUI.3(this);
  private String talker = null;
  private String videoPath = null;
  
  private void aXL()
  {
    getSupportActionBar().hide();
    this.ovd.setText(e.iR(0));
    this.ovn.setVisibility(8);
    this.ovo.setVisibility(8);
    this.ovc.setVisibility(0);
    this.ouW = false;
    this.ouZ.setVisibility(0);
    this.fAd.setVisibility(0);
    this.ouY.setVisibility(8);
    this.ovb.setVisibility(8);
    this.ovd.setText(e.iR(0));
    this.ova.setVisibility(8);
    this.ouV.setEnabled(true);
    this.ovh.setVisibility(0);
  }
  
  private void bGL()
  {
    if (this.ouW)
    {
      h.a(this, getString(R.l.video_recorder_cancel), getString(R.l.app_tip), new VideoRecorderUI.11(this), new VideoRecorderUI.12(this));
      return;
    }
    finish();
  }
  
  private void bGM()
  {
    h.a(this, R.l.video_dev_create_failed, R.l.app_tip, new VideoRecorderUI.4(this));
  }
  
  private void releaseWakeLock()
  {
    this.fAd.setKeepScreenOn(false);
  }
  
  protected final void dealContentView(View paramView)
  {
    ak.d(ak.a(getWindow(), null), this.mController.tlX);
    ((ViewGroup)this.mController.tlX.getParent()).removeView(this.mController.tlX);
    ((ViewGroup)getWindow().getDecorView()).addView(this.mController.tlX, 0);
  }
  
  protected final int getLayoutId()
  {
    if (d.zf()) {}
    for (boolean bool = true;; bool = false)
    {
      this.mNn = bool;
      if (this.mNn) {
        break;
      }
      return R.i.video_recorder;
    }
    getWindow().setFlags(1024, 1024);
    setRequestedOrientation(0);
    return R.i.video_recorder_land;
  }
  
  protected final void initView()
  {
    int j = 1;
    this.fAd = ((SurfaceView)findViewById(R.h.surface_camera));
    this.ouZ = ((LinearLayout)findViewById(R.h.video_recorder_preview_area));
    this.ouT = this.fAd.getHolder();
    this.ouT.addCallback(this.ovq);
    this.ouT.setType(3);
    this.ovc = ((ImageView)findViewById(R.h.video_recorder_recording_icon));
    this.ovh = ((ImageButton)findViewById(R.h.videorecord_camera_switch));
    this.ovd = ((TextView)findViewById(R.h.video_recorder_recorded_time));
    this.ovn = findViewById(R.h.video_recorder_recorded_time_area);
    this.ovo = findViewById(R.h.video_recorder_data_area);
    this.ovd.setText(e.iR(0));
    this.ouU = new b();
    this.ouY = ((TextView)findViewById(R.h.videorecord_time_limit_tv));
    this.ove = ((TextView)findViewById(R.h.video_recorder_size));
    this.ovf = ((TextView)findViewById(R.h.video_recorder_length));
    this.ouV = ((ImageButton)findViewById(R.h.videorecord_control_btn));
    this.ouV.setOnClickListener(new VideoRecorderUI.7(this));
    b localb;
    label308:
    Object localObject;
    if (d.getNumberOfCameras() > 1)
    {
      this.ovh.setVisibility(0);
      this.ovh.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          VideoRecorderUI.o(VideoRecorderUI.this).setEnabled(false);
          VideoRecorderUI.p(VideoRecorderUI.this).sendEmptyMessageDelayed(0, 3000L);
          VideoRecorderUI.a(VideoRecorderUI.this, true);
          VideoRecorderUI.h(VideoRecorderUI.this).ccP();
          if ((VideoRecorderUI.h(VideoRecorderUI.this).a(VideoRecorderUI.this, VideoRecorderUI.q(VideoRecorderUI.this)) != 0) || (VideoRecorderUI.h(VideoRecorderUI.this).b(VideoRecorderUI.r(VideoRecorderUI.this)) != 0)) {
            VideoRecorderUI.s(VideoRecorderUI.this);
          }
        }
      });
      this.ovb = ((ImageButton)findViewById(R.h.video_play_btn));
      this.ova = ((ImageView)findViewById(R.h.video_recorder_play_view));
      this.ovb.setOnClickListener(new VideoRecorderUI.10(this));
      localb = this.ouU;
      if (this.mNn) {
        break label567;
      }
      i = 1;
      localObject = this.videoPath;
      String str1 = this.ouP;
      String str2 = this.ovl;
      String str3 = this.ovm;
      localb.elY = 0;
      if (1 != localb.elY) {
        break label572;
      }
      localb.ngs = a.ccO();
      label352:
      if (q.deO.dfq)
      {
        localb.ngs.lgR = q.deO.mVideoHeight;
        localb.ngs.lgS = q.deO.mVideoWidth;
        localb.ngs.lgQ = q.deO.dfs;
      }
      localb.filename = str3;
      localb.ngs.lgZ = str1;
      localb.ngs.lgX = str2;
      localb.ngs.lgW = ((String)localObject + "temp.pcm");
      localb.ngs.lgV = ((String)localObject + "temp.yuv");
      localb.ngs.lgY = ((String)localObject + "temp.vid");
      localb.ngs.lhb = d.getNumberOfCameras();
      localObject = localb.ngs;
      if (i == 0) {
        break label582;
      }
    }
    label567:
    label572:
    label582:
    for (int i = j;; i = 0)
    {
      ((a)localObject).bYE = i;
      localb.ngs.enM = 0;
      localb.qDR = new f();
      return;
      this.ovh.setVisibility(4);
      break;
      i = 0;
      break label308;
      localb.ngs = a.ccN();
      break label352;
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 != -1) {
      return;
    }
    if (paramInt1 == 0)
    {
      setResult(-1, paramIntent);
      finish();
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    s.initLanguage(this);
    ovi = this;
    getWindow().setFlags(1024, 1024);
    getSupportActionBar().hide();
    setMMTitle(R.l.video_recorder_title);
    a(0, getString(R.l.app_send), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        paramAnonymousMenuItem = new Intent();
        paramAnonymousMenuItem.putExtra("VideoRecorder_FileName", VideoRecorderUI.h(VideoRecorderUI.this).filename);
        paramAnonymousMenuItem.putExtra("VideoRecorder_VideoLength", VideoRecorderUI.h(VideoRecorderUI.this).ngs.enM);
        paramAnonymousMenuItem.putExtra("VideoRecorder_ToUser", VideoRecorderUI.i(VideoRecorderUI.this));
        VideoRecorderUI.this.setResult(-1, paramAnonymousMenuItem);
        VideoRecorderUI.this.finish();
        return true;
      }
    }, s.b.tmX);
    setBackBtn(new VideoRecorderUI.6(this));
    this.talker = getIntent().getStringExtra("VideoRecorder_ToUser");
    this.videoPath = getIntent().getStringExtra("VideoRecorder_VideoPath");
    this.ouP = getIntent().getStringExtra("VideoRecorder_VideoFullPath");
    this.ovl = getIntent().getStringExtra("VideoRecorder_VideoThumbPath");
    this.ovm = getIntent().getStringExtra("VideoRecorder_FileName");
    x.d("MicroMsg.VideoRecorderUI", "talker :" + this.talker);
    x.d("MicroMsg.VideoRecorderUI", "videoPath :" + this.videoPath + " videoFullPath " + this.ouP + " videoThumbPath " + this.ovl + " KFileName " + this.ovm);
    initView();
    aXL();
    au.vv().xv();
  }
  
  protected void onDestroy()
  {
    ovi = null;
    x.v("MicroMsg.VideoRecorderUI", "on destroy");
    au.vv().xu();
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      x.d("MicroMsg.VideoRecorderUI", "KEYCODE_BACK");
      if (this.ouX) {
        return true;
      }
      bGL();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
    if (this.ouX)
    {
      b localb = this.ouU;
      if (localb.lik != null)
      {
        localb.lik.stop();
        localb.lik.release();
        localb.lik = null;
      }
      aXL();
      this.ouX = false;
      releaseWakeLock();
      this.ouV.setImageResource(R.g.video_recorder_start_btn);
      this.hnz.SO();
      this.ouY.setVisibility(8);
      this.ouZ.setVisibility(0);
      this.fAd.setVisibility(0);
    }
    this.ouU.ccP();
    x.v("MicroMsg.VideoRecorderUI", "onPause");
    super.onPause();
  }
  
  protected void onResume()
  {
    if ((!this.ovk) && ((this.ouU.a(this, false) != 0) || (this.ouU.b(this.ouT) != 0))) {
      bGM();
    }
    this.ovk = false;
    x.v("MicroMsg.VideoRecorderUI", "onResume");
    super.onResume();
  }
  
  public void onStart()
  {
    super.onStart();
    if (this.mNn)
    {
      setRequestedOrientation(0);
      return;
    }
    setRequestedOrientation(1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/sysvideo/ui/video/VideoRecorderUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */