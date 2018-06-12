package com.qq.wx.voice.embed.recognizer;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

final class g
{
  Handler b = new h(this);
  c bgu;
  
  public final void a(int paramInt)
  {
    Message localMessage = this.b.obtainMessage(100);
    Bundle localBundle = new Bundle();
    localBundle.putInt("errorCode", paramInt);
    localMessage.setData(localBundle);
    this.b.sendMessage(localMessage);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/qq/wx/voice/embed/recognizer/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */