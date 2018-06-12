package com.tencent.mm.plugin.h.a.c;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import com.tencent.mm.plugin.h.a.e.a;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.x;

public final class b
{
  public BluetoothDevice fNN;
  public long hiL;
  public c.a hiM;
  public c.b hiN;
  public c.c hiO;
  public long mSessionId;
  public int mState;
  
  public b(long paramLong)
  {
    this.hiL = paramLong;
    this.mSessionId = paramLong;
    this.hiM = null;
    this.hiN = null;
    this.hiO = null;
    this.mState = 0;
    this.fNN = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(a.bZ(paramLong));
  }
  
  public final void disconnect()
  {
    x.i("MicroMsg.exdevice.BluetoothChatSession", "disconnect");
    this.mState = 0;
    if (this.hiM != null)
    {
      this.hiM.disconnect();
      this.hiM = null;
    }
    if (this.hiN != null)
    {
      this.hiN.cancel();
      e.S(this.hiN);
      this.hiN = null;
    }
    if (this.hiO != null)
    {
      this.hiO.cancel();
      e.S(this.hiN);
      this.hiO = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/h/a/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */