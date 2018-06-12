package com.tencent.pb.common.c;

import java.util.HashMap;
import java.util.Map;

public final class b
{
  public static <E> Map<E, E> A(E... paramVarArgs)
  {
    if (paramVarArgs.length % 2 != 0) {
      throw new IllegalArgumentException("length of map is " + paramVarArgs.length);
    }
    HashMap localHashMap = new HashMap();
    int i = 0;
    while (i < paramVarArgs.length)
    {
      localHashMap.put(paramVarArgs[i], paramVarArgs[(i + 1)]);
      i += 2;
    }
    return localHashMap;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/pb/common/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */