package com.tencent.wecall.talkroom.a;

import com.google.a.a.e;
import com.tencent.pb.common.b.a.a.ai;
import com.tencent.pb.common.b.d;
import com.tencent.pb.common.c.c;

public final class j
  extends d
{
  public String jTX;
  
  protected final Object bI(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {
      try
      {
        paramArrayOfByte = (a.ai)e.a(new a.ai(), paramArrayOfByte, paramArrayOfByte.length);
        return paramArrayOfByte;
      }
      catch (Exception paramArrayOfByte)
      {
        c.x(this.TAG2, new Object[] { "data2Resp", paramArrayOfByte });
        return null;
      }
    }
    return null;
  }
  
  protected final String cEm()
  {
    return "CsCmd.Cmd_V_CSVoiceMemberWhisperReq";
  }
  
  public final int getType()
  {
    return 213;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/wecall/talkroom/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */