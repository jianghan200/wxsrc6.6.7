package com.tencent.mm.plugin.z;

import android.text.TextUtils;
import com.tencent.mm.a.e;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.backup.a.g;
import com.tencent.mm.sdk.platformtools.x;

public final class f
{
  public static String bfF()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    au.HU();
    return c.Gp() + "msgsynchronize/syncFile/";
  }
  
  public static String bfG()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    au.HU();
    return c.Gp() + "msgsynchronize/";
  }
  
  public static String bfH()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    au.HU();
    return c.Gp() + "msgsynchronize.zip";
  }
  
  public static void e(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    if ((TextUtils.isEmpty(paramString1)) || (paramArrayOfByte == null))
    {
      x.e("MicroMsg.MsgSynchronizeUtil", "appendFile dir:%s fileName:%s ", new Object[] { paramString1, paramString2 });
      return;
    }
    int j;
    for (int i = 3;; i = j)
    {
      j = i - 1;
      if (i <= 0) {
        break;
      }
      long l1 = g.ws(paramString1 + paramString2);
      i = e.b(paramString1, paramString2, paramArrayOfByte);
      long l2 = g.ws(paramString1 + paramString2);
      if ((i == 0) && (l2 >= paramArrayOfByte.length))
      {
        x.d("MicroMsg.MsgSynchronizeUtil", "appendFile retry:%d append:%d  old:%d  new:%d  data:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(paramArrayOfByte.length) });
        return;
      }
      x.e("MicroMsg.MsgSynchronizeUtil", "appendFile retry:%d append:%d  old:%d  new:%d  data:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(paramArrayOfByte.length) });
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/z/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */