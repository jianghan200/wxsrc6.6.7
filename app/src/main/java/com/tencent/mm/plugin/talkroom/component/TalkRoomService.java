package com.tencent.mm.plugin.talkroom.component;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.IBinder;
import com.tencent.mm.sdk.platformtools.x;

public class TalkRoomService
  extends Service
{
  private g ovU;
  
  static
  {
    x.i("MicroMsg.TalkRoomService", Thread.currentThread().getId());
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    x.d("MicroMsg.TalkRoomService", "onBind~~~ threadID:" + Thread.currentThread());
    return this.ovU;
  }
  
  public void onCreate()
  {
    x.d("MicroMsg.TalkRoomService", "onCreate~~~threadID:" + Thread.currentThread());
    super.onCreate();
    if (Build.VERSION.SDK_INT < 18) {
      startForeground(9999, new Notification());
    }
    if (this.ovU == null) {
      this.ovU = new g();
    }
  }
  
  public void onDestroy()
  {
    x.d("MicroMsg.TalkRoomService", "onDestroy~~~ threadID:" + Thread.currentThread());
    super.onDestroy();
  }
  
  public void onRebind(Intent paramIntent)
  {
    x.d("MicroMsg.TalkRoomService", "onRebind~~~ threadID:" + Thread.currentThread());
    super.onRebind(paramIntent);
  }
  
  public boolean onUnbind(Intent paramIntent)
  {
    x.d("MicroMsg.TalkRoomService", "onUnbind~~~ threadID:" + Thread.currentThread());
    return super.onUnbind(paramIntent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/talkroom/component/TalkRoomService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */