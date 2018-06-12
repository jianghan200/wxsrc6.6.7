package com.tencent.recovery;

import com.tencent.recovery.config.Express;
import com.tencent.recovery.config.ExpressItem;
import com.tencent.recovery.option.CommonOptions;
import com.tencent.recovery.option.CommonOptions.Builder;
import com.tencent.recovery.option.ProcessOptions;
import com.tencent.recovery.option.ProcessOptions.Builder;
import java.util.ArrayList;
import java.util.List;

public class ConstantsRecovery
{
  public static final class DefaultCommonOptions
  {
    public static final CommonOptions vgS;
    
    static
    {
      CommonOptions.Builder localBuilder = new CommonOptions.Builder();
      localBuilder.fMk = "";
      localBuilder.clientVersion = "";
      localBuilder.vhv = "";
      localBuilder.vhz = "";
      localBuilder.vhA = "";
      vgS = localBuilder.cEZ();
    }
  }
  
  public static final class DefaultExpress
  {
    public static final Express vgT = new Express();
    public static final Express vgU;
    public static final Express vgV;
    
    static
    {
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(new ExpressItem(17, 1114112));
      vgT.ef(localArrayList);
      vgU = new Express();
      localArrayList = new ArrayList();
      localArrayList.add(new ExpressItem(1, 1118208));
      vgU.ef(localArrayList);
      vgV = new Express();
      localArrayList = new ArrayList();
      localArrayList.add(new ExpressItem(1, 1114112));
      vgV.ef(localArrayList);
    }
  }
  
  public static final class DefaultProcessOptions
  {
    public static final ProcessOptions vgW;
    public static final ProcessOptions vgX;
    public static final ProcessOptions vgY;
    
    static
    {
      ProcessOptions.Builder localBuilder = new ProcessOptions.Builder();
      localBuilder.vhF = ConstantsRecovery.DefaultExpress.vgT;
      localBuilder.cFa();
      vgW = localBuilder.cFb();
      localBuilder = new ProcessOptions.Builder();
      localBuilder.vhF = ConstantsRecovery.DefaultExpress.vgU;
      localBuilder.cFa();
      vgX = localBuilder.cFb();
      localBuilder = new ProcessOptions.Builder();
      localBuilder.vhF = ConstantsRecovery.DefaultExpress.vgV;
      localBuilder.cFa();
      vgY = localBuilder.cFb();
    }
  }
  
  public static final class IntentAction {}
  
  public static final class IntentKeys {}
  
  public static final class Message {}
  
  public static final class ProcessStage {}
  
  public static final class ProcessStartFlag {}
  
  public static final class ProcessStatus {}
  
  public static final class ReportType {}
  
  public static final class SpKeys {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/recovery/ConstantsRecovery.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */