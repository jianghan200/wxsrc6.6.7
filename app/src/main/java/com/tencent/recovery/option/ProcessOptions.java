package com.tencent.recovery.option;

import com.tencent.recovery.config.Express;

public class ProcessOptions
{
  public int dkb;
  private Express vhF;
  
  public static final class Builder
  {
    private int dkb;
    public Express vhF;
    
    public final Builder cFa()
    {
      this.dkb = 10000;
      return this;
    }
    
    public final ProcessOptions cFb()
    {
      ProcessOptions localProcessOptions = new ProcessOptions();
      ProcessOptions.a(localProcessOptions, this.dkb);
      ProcessOptions.a(localProcessOptions, this.vhF);
      return localProcessOptions;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/recovery/option/ProcessOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */