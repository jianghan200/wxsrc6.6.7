package com.google.android.gms.tagmanager;

import com.google.android.gms.c.b.a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

final class ak
{
  private static v<b.a> a(v<b.a> paramv)
  {
    try
    {
      v localv = new v(ai.ao(URLEncoder.encode(ai.b((b.a)paramv.bbK), "UTF-8").replaceAll("\\+", "%20")), paramv.bbL);
      return localv;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      m.rc();
    }
    return paramv;
  }
  
  static v<b.a> a(v<b.a> paramv, int... paramVarArgs)
  {
    int j = paramVarArgs.length;
    int i = 0;
    if (i < j)
    {
      int k = paramVarArgs[i];
      if ((ai.d((b.a)paramv.bbK) instanceof String)) {}
      switch (k)
      {
      default: 
        m.rb();
      }
      for (;;)
      {
        i += 1;
        break;
        paramv = a(paramv);
      }
    }
    return paramv;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/tagmanager/ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */