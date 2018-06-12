package com.qq.wx.voice.embed.recognizer;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

final class h
  extends Handler
{
  h(g paramg) {}
  
  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return;
    case 100: 
      int i = paramMessage.getData().getInt("errorCode");
      this.bgt.bgu.ej(i);
      return;
    }
    paramMessage = (a)paramMessage.obj;
    this.bgt.bgu.a(paramMessage);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/qq/wx/voice/embed/recognizer/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */