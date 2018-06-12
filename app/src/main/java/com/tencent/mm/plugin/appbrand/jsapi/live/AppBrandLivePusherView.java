package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.rtmp.ITXLivePushListener;
import com.tencent.rtmp.TXLivePusher;
import com.tencent.rtmp.TXLivePusher.ITXSnapshotListener;
import com.tencent.rtmp.ui.TXCloudVideoView;

public class AppBrandLivePusherView
  extends TXCloudVideoView
{
  m fRF;
  private ITXLivePushListener fRG;
  
  public AppBrandLivePusherView(Context paramContext)
  {
    super(paramContext);
    init(paramContext);
  }
  
  public AppBrandLivePusherView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  private void init(Context paramContext)
  {
    this.fRF = new m(paramContext);
    setBackgroundColor(-16777216);
  }
  
  public void setOnPushEventListener(ITXLivePushListener paramITXLivePushListener)
  {
    this.fRG = paramITXLivePushListener;
    this.fRF.fSl = this.fRG;
  }
  
  public void setSnapshotListener(TXLivePusher.ITXSnapshotListener paramITXSnapshotListener)
  {
    this.fRF.fSp = paramITXSnapshotListener;
  }
  
  public final boolean tB(String paramString)
  {
    paramString = this.fRF.tD(paramString);
    x.i("MicroMsg.AppBrandLivePusherView", "onOperate code:%d info:%s", new Object[] { Integer.valueOf(paramString.errorCode), paramString.fRT });
    return paramString.errorCode == 0;
  }
  
  public final void u(Bundle paramBundle)
  {
    m localm = this.fRF;
    if (paramBundle == null) {
      paramBundle = new j(-1, "invalid params");
    }
    for (;;)
    {
      x.i("MicroMsg.AppBrandLivePusherView", "onUpdate code:%d info:%s", new Object[] { Integer.valueOf(paramBundle.errorCode), paramBundle.fRT });
      return;
      m.d("updateLivePusher", paramBundle);
      if (!localm.dni)
      {
        paramBundle = new j(-3, "uninited livePusher");
      }
      else
      {
        localm.c(paramBundle, false);
        String str = paramBundle.getString("pushUrl", localm.fSm);
        if ((str != null) && (!str.isEmpty()) && (localm.fSm != null) && (!localm.fSm.equalsIgnoreCase(str)) && (localm.fSk.isPushing()))
        {
          x.i("TXLivePusherJSAdapter", "updateLivePusher: stopPusher");
          localm.fSk.stopCameraPreview(true);
          localm.fSk.stopPusher();
        }
        localm.fSm = str;
        localm.fSq = paramBundle.getBoolean("autopush", localm.fSq);
        if ((localm.fSq) && (localm.fSm != null) && (!localm.fSm.isEmpty()) && (!localm.fSk.isPushing()))
        {
          x.i("TXLivePusherJSAdapter", "updateLivePusher: startPusher");
          localm.fRV.setVisibility(0);
          if (localm.fSv) {
            localm.fSk.startCameraPreview(localm.fRV);
          }
          localm.fSk.startPusher(localm.fSm);
        }
        paramBundle = new j();
      }
    }
  }
  
  public final void ua()
  {
    Object localObject = this.fRF;
    if (!((m)localObject).dni) {}
    for (localObject = new j(-3, "uninited livePusher");; localObject = new j())
    {
      x.i("MicroMsg.AppBrandLivePusherView", "onDestroy code:%d info:%s", new Object[] { Integer.valueOf(((j)localObject).errorCode), ((j)localObject).fRT });
      return;
      ((m)localObject).fSk.stopCameraPreview(true);
      ((m)localObject).fSk.stopPusher();
      ((m)localObject).fSk.setPushListener(null);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/live/AppBrandLivePusherView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */