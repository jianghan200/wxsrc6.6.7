package com.tencent.tencentmap.mapsdk.a;

public class bj
  extends RuntimeException
{
  int a;
  
  public bj() {}
  
  public bj(int paramInt)
  {
    super("server error code :" + paramInt);
    this.a = paramInt;
  }
  
  public bj(String paramString)
  {
    super(paramString);
  }
  
  public bj(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
  
  public static bj a(int paramInt)
  {
    return a(paramInt, "");
  }
  
  public static bj a(int paramInt, String paramString)
  {
    if (paramInt == -1) {
      return new bo(paramInt);
    }
    if (paramInt == -2) {
      return new bp(paramInt);
    }
    if (paramInt == -3) {
      return new bq(paramInt);
    }
    if (paramInt == -4) {
      return new br(paramInt);
    }
    if (paramInt == -6) {
      return new bs(paramInt);
    }
    if (paramInt == -5) {
      return new bt(paramInt);
    }
    return new bu(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */