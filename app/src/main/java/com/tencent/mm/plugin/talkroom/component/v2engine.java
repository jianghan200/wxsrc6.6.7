package com.tencent.mm.plugin.talkroom.component;

import com.tencent.mm.compatible.b.f;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ad;

public class v2engine
{
  private static f dBy;
  
  public static f HV()
  {
    if (dBy == null) {
      dBy = new f(ad.getContext());
    }
    return dBy;
  }
  
  public native int Close();
  
  public native int GetAudioData(PByteArray paramPByteArray, int paramInt, PInt paramPInt1, PInt paramPInt2);
  
  public native int GetStatis(PByteArray paramPByteArray, String paramString);
  
  public native int IsSilenceFrame();
  
  public native int Open(b paramb, int paramInt1, int paramInt2, int paramInt3, long paramLong, int[] paramArrayOfInt, short[] paramArrayOfShort, int paramInt4);
  
  public native int Send(byte[] paramArrayOfByte, short paramShort);
  
  public native int SetCurrentMicId(int paramInt);
  
  public native int initLive(int paramInt, String paramString);
  
  public native int uninitLive();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/talkroom/component/v2engine.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */