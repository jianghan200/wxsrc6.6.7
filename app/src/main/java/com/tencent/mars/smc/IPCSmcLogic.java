package com.tencent.mars.smc;

import com.tencent.mm.plugin.report.f;
import java.util.ArrayList;

public class IPCSmcLogic
{
  private static void reportGroupIDKey(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int[] paramArrayOfInt3, int paramInt, boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < paramInt)
    {
      localArrayList.add(new IDKey(paramArrayOfInt1[i], paramArrayOfInt2[i], paramArrayOfInt3[i]));
      i += 1;
    }
    f.mDy.b(localArrayList, paramBoolean);
  }
  
  private static void reportIDKey(long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean)
  {
    f.mDy.a(paramLong1, paramLong2, paramLong3, paramBoolean);
  }
  
  private static void reportKV(long paramLong, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    f.mDy.a((int)paramLong, paramString, paramBoolean2, paramBoolean1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mars/smc/IPCSmcLogic.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */