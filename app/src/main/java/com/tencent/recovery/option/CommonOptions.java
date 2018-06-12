package com.tencent.recovery.option;

public class CommonOptions
{
  public String clientVersion;
  public String fMk;
  public String vhA;
  private boolean vhB;
  public long vhC;
  public long vhD;
  public String vhv;
  public String vhz;
  
  public static final class Builder
  {
    public String clientVersion;
    public String fMk;
    public String vhA;
    public boolean vhB;
    public long vhC;
    public long vhD;
    public String vhv;
    public String vhz;
    
    public final CommonOptions cEZ()
    {
      CommonOptions localCommonOptions = new CommonOptions((byte)0);
      CommonOptions.a(localCommonOptions, this.vhz);
      CommonOptions.b(localCommonOptions, this.vhA);
      CommonOptions.c(localCommonOptions, this.clientVersion);
      CommonOptions.d(localCommonOptions, this.vhv);
      CommonOptions.e(localCommonOptions, this.fMk);
      CommonOptions.a(localCommonOptions, this.vhB);
      CommonOptions.a(localCommonOptions, this.vhC);
      CommonOptions.b(localCommonOptions, this.vhD);
      return localCommonOptions;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/recovery/option/CommonOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */