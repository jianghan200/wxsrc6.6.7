package com.tencent.tinker.a.b.b;

public final class a
{
  public static String HM(int paramInt)
  {
    char[] arrayOfChar = new char[8];
    int j = 0;
    int i = paramInt;
    paramInt = j;
    while (paramInt < 8)
    {
      arrayOfChar[(7 - paramInt)] = Character.forDigit(i & 0xF, 16);
      i >>= 4;
      paramInt += 1;
    }
    return new String(arrayOfChar);
  }
  
  public static String HN(int paramInt)
  {
    char[] arrayOfChar = new char[4];
    int j = 0;
    int i = paramInt;
    paramInt = j;
    while (paramInt < 4)
    {
      arrayOfChar[(3 - paramInt)] = Character.forDigit(i & 0xF, 16);
      i >>= 4;
      paramInt += 1;
    }
    return new String(arrayOfChar);
  }
  
  public static String HO(int paramInt)
  {
    if (paramInt == (char)paramInt) {
      return HN(paramInt);
    }
    return HM(paramInt);
  }
  
  public static String HP(int paramInt)
  {
    int i = 0;
    char[] arrayOfChar = new char[9];
    if (paramInt < 0)
    {
      arrayOfChar[0] = '-';
      paramInt = -paramInt;
    }
    while (i < 8)
    {
      arrayOfChar[(8 - i)] = Character.forDigit(paramInt & 0xF, 16);
      paramInt >>= 4;
      i += 1;
      continue;
      arrayOfChar[0] = '+';
    }
    return new String(arrayOfChar);
  }
  
  public static String gW(long paramLong)
  {
    char[] arrayOfChar = new char[16];
    int i = 0;
    while (i < 16)
    {
      arrayOfChar[(15 - i)] = Character.forDigit((int)paramLong & 0xF, 16);
      paramLong >>= 4;
      i += 1;
    }
    return new String(arrayOfChar);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tinker/a/b/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */