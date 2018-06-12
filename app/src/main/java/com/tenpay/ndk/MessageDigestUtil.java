package com.tenpay.ndk;

public class MessageDigestUtil
{
  public static String bytesToHex(byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new StringBuilder("");
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0)) {
      return null;
    }
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      String str = Integer.toHexString(paramArrayOfByte[i] & 0xFF);
      if (str.length() < 2) {
        localStringBuilder.append(0);
      }
      localStringBuilder.append(str.toUpperCase());
      i += 1;
    }
    return localStringBuilder.toString();
  }
  
  private native byte[] doSHA256(byte[] paramArrayOfByte);
  
  public String getSHA256Hex(byte[] paramArrayOfByte)
  {
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (paramArrayOfByte != null) {}
    try
    {
      paramArrayOfByte = doSHA256(paramArrayOfByte);
      localObject1 = localObject2;
      if (paramArrayOfByte != null) {
        localObject1 = bytesToHex(paramArrayOfByte);
      }
      return (String)localObject1;
    }
    catch (Exception paramArrayOfByte) {}
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tenpay/ndk/MessageDigestUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */