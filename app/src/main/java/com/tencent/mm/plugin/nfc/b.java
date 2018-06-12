package com.tencent.mm.plugin.nfc;

public final class b
{
  public static String aE(byte[] paramArrayOfByte)
  {
    String str1 = "";
    String str2 = str1;
    if (paramArrayOfByte != null)
    {
      if (paramArrayOfByte.length != 0) {
        break label24;
      }
      str2 = str1;
    }
    label24:
    int i;
    do
    {
      return str2;
      i = 0;
      str2 = str1;
    } while (i >= paramArrayOfByte.length);
    int k = paramArrayOfByte[i];
    int m = k & 0xF;
    int j;
    label56:
    int n;
    if (m < 10)
    {
      j = 48;
      n = (k & 0xF0) >> 4;
      if (n >= 10) {
        break label121;
      }
    }
    label121:
    for (k = 48;; k = 55)
    {
      str1 = str1 + (char)(k + n) + (char)(m + j);
      i += 1;
      break;
      j = 55;
      break label56;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/nfc/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */