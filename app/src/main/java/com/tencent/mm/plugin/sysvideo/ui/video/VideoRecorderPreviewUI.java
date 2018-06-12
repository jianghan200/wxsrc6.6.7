package com.tencent.mm.plugin.sysvideo.ui.video;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ak;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.video.VideoView;

public class VideoRecorderPreviewUI
  extends MMActivity
{
  private long duration = -1L;
  private VideoView ouO;
  private String ouP = null;
  private final int ouQ = 3000;
  private ag ouR = new VideoRecorderPreviewUI.2(this);
  
  protected final void dealContentView(View paramView)
  {
    ak.d(ak.a(getWindow(), null), this.mController.tlX);
    ((ViewGroup)this.mController.tlX.getParent()).removeView(this.mController.tlX);
    ((ViewGroup)getWindow().getDecorView()).addView(this.mController.tlX, 0);
  }
  
  protected final int getLayoutId()
  {
    return R.i.video_recorder_preview;
  }
  
  protected final void initView()
  {
    this.ouO = ((VideoView)findViewById(R.h.video_recorder_play_view));
    this.ouO.setOnErrorListener(new VideoRecorderPreviewUI.3(this));
    this.ouO.setOnPreparedListener(new VideoRecorderPreviewUI.4(this));
    findViewById(R.h.video_recorder_play_area).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        VideoRecorderPreviewUI.b(VideoRecorderPreviewUI.this).removeMessages(0);
        if (VideoRecorderPreviewUI.this.mController.isTitleShowing())
        {
          VideoRecorderPreviewUI.this.getWindow().setFlags(1024, 1024);
          VideoRecorderPreviewUI.this.mController.hideTitleView();
          return;
        }
        VideoRecorderPreviewUI.this.getWindow().clearFlags(1024);
        VideoRecorderPreviewUI.this.mController.showTitleView();
        VideoRecorderPreviewUI.b(VideoRecorderPreviewUI.this).removeMessages(0);
        VideoRecorderPreviewUI.b(VideoRecorderPreviewUI.this).sendEmptyMessageDelayed(0, 3000L);
      }
    });
    this.ouO.setOnCompletionListener(new VideoRecorderPreviewUI.6(this));
    if (this.ouP != null)
    {
      this.ouO.stopPlayback();
      this.ouO.setVideoURI(this.ouP);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getWindow().setFlags(1024, 1024);
    this.mController.hideTitleView();
    this.ouP = getIntent().getStringExtra("VideoRecorder_VideoFullPath");
    setMMTitle(R.l.video_preview_title);
    setBackBtn(new VideoRecorderPreviewUI.1(this));
    initView();
  }
  
  protected void onPause()
  {
    super.onPause();
    if (this.ouO.isPlaying())
    {
      VideoView localVideoView = this.ouO;
      if ((localVideoView.ngO != null) && (localVideoView.qTW) && (localVideoView.ngO.isPlaying())) {
        localVideoView.ngO.pause();
      }
      localVideoView.qTX = false;
    }
    finish();
    overridePendingTransition(0, 0);
    this.ouR.removeMessages(0);
  }
  
  public void onStart()
  {
    super.onStart();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sysvideo/ui/video/VideoRecorderPreviewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */