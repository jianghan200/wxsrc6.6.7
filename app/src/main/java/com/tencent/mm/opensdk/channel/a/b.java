package com.tencent.mm.opensdk.channel.a;

public final class b
{
  public static byte[] a(String paramString1, int paramInt, String paramString2)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    if (paramString1 != null) {
      localStringBuffer.append(paramString1);
    }
    localStringBuffer.append(paramInt);
    localStringBuffer.append(paramString2);
    localStringBuffer.append("mMcShCsTr");
    return com.tencent.mm.opensdk.utils.b.c(localStringBuffer.toString().substring(1, 9).getBytes()).getBytes();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/opensdk/channel/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */