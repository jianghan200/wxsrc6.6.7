package com.tencent.wecall.talkroom.model;

import com.tencent.mm.plugin.multi.talk;
import com.tencent.pb.common.a.a;
import com.tencent.pb.common.c.c;
import java.util.concurrent.atomic.AtomicInteger;

public final class b
{
  talk vwZ = new talk();
  
  public b()
  {
    c.d("simon:TalkRoomContext", new Object[] { "construct" });
  }
  
  public final int Close()
  {
    if (!a.vbD) {
      return 0;
    }
    try
    {
      i = this.vwZ.close();
      c.d("simon:TalkRoomContext", new Object[] { "Close ret: ", Integer.valueOf(i) });
      return i;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        c.x("simon:TalkRoomContext", new Object[] { "Close ", localThrowable });
        int i = 0;
      }
    }
  }
  
  public final void OnMembersChanged(int[] paramArrayOfInt)
  {
    if (!a.vbD) {
      return;
    }
    this.vwZ.OnMembersChanged(paramArrayOfInt);
  }
  
  public final byte[] cHE()
  {
    if (!a.vbD) {
      return new byte[0];
    }
    return this.vwZ.field_capInfo;
  }
  
  public final int cHF()
  {
    try
    {
      if (!a.vbD) {
        return 0;
      }
      AtomicInteger localAtomicInteger1 = new AtomicInteger();
      AtomicInteger localAtomicInteger2 = new AtomicInteger();
      this.vwZ.getChannelBytes(localAtomicInteger1, localAtomicInteger2);
      int i = localAtomicInteger2.get();
      return i;
    }
    catch (Throwable localThrowable)
    {
      c.x("simon:TalkRoomContext", new Object[] { "getTotalWWANBytes: ", localThrowable });
    }
    return 0;
  }
  
  public final int uninitLive()
  {
    if (!a.vbD) {
      return 0;
    }
    try
    {
      i = this.vwZ.uninit();
      c.d("simon:TalkRoomContext", new Object[] { "uninitLive ret: ", Integer.valueOf(i) });
      return i;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        c.x("simon:TalkRoomContext", new Object[] { "uninitLive ", localThrowable });
        int i = 0;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/wecall/talkroom/model/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */