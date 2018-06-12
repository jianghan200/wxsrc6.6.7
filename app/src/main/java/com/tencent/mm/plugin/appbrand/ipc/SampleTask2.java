package com.tencent.mm.plugin.appbrand.ipc;

import android.os.Parcelable.Creator;
import com.tencent.mm.sdk.platformtools.x;

public class SampleTask2
  extends MainProcessTask
{
  public static final Parcelable.Creator<SampleTask2> CREATOR = new SampleTask2.1();
  
  public final void aai()
  {
    x.e("SampleTask2", "Run in Main Process");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ipc/SampleTask2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */