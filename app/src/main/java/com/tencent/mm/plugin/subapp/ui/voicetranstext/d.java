package com.tencent.mm.plugin.subapp.ui.voicetranstext;

import com.tencent.mm.modelvoice.MediaRecorder;
import com.tencent.mm.modelvoice.g;
import com.tencent.mm.modelvoice.h;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.protocal.c.byo;

public final class d
{
  public static byo aI(int paramInt, String paramString)
  {
    byo localbyo = new byo();
    switch (paramInt)
    {
    case 2: 
    case 3: 
    default: 
      localbyo.rea = 0;
      localbyo.reb = 0;
      localbyo.rdY = 0;
      localbyo.rdZ = 0;
      return localbyo;
    case 0: 
      localbyo.rea = 8000;
      localbyo.reb = 16;
      localbyo.rdY = 5;
      localbyo.rdZ = 5;
      return localbyo;
    case 1: 
      localbyo.rea = 16000;
      localbyo.reb = 16;
      localbyo.rdY = 4;
      localbyo.rdZ = 4;
      return localbyo;
    }
    localbyo.rea = 16000;
    paramString = q.ok(paramString);
    if (paramString != null)
    {
      paramInt = MediaRecorder.SilkGetEncSampleRate(((h)paramString).br(0, 1).buf);
      if (paramInt >= 8000) {
        localbyo.rea = paramInt;
      }
    }
    localbyo.reb = 16;
    localbyo.rdY = 6;
    localbyo.rdZ = 6;
    return localbyo;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/subapp/ui/voicetranstext/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */