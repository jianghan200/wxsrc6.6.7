package com.tencent.mm.plugin.appbrand;

import android.os.Parcelable.Creator;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;

public class AppBrandMainProcessPrepareTask
  extends MainProcessTask
{
  public static final Parcelable.Creator<AppBrandMainProcessPrepareTask> CREATOR = new Parcelable.Creator() {};
  private Runnable fcn;
  
  AppBrandMainProcessPrepareTask(Runnable paramRunnable)
  {
    this.fcn = paramRunnable;
    ahA();
  }
  
  public final void aai()
  {
    ahH();
  }
  
  public final void aaj()
  {
    this.fcn.run();
    ahB();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/AppBrandMainProcessPrepareTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */