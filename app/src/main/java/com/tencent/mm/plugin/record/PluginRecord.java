package com.tencent.mm.plugin.record;

import com.tencent.mm.kernel.a.b.b;
import com.tencent.mm.kernel.api.bucket.c;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.plugin.record.a.a;
import com.tencent.mm.plugin.record.a.d;

public class PluginRecord
  extends f
  implements b, c, a
{
  private com.tencent.mm.plugin.record.a.e mrI;
  private d mrJ;
  
  public void execute(com.tencent.mm.kernel.b.g paramg) {}
  
  public d getRecordMsgCDNStorage()
  {
    return this.mrJ;
  }
  
  public com.tencent.mm.plugin.record.a.e getRecordMsgInfoStorage()
  {
    return this.mrI;
  }
  
  public void onAccountInitialized(e.c paramc)
  {
    this.mrI = new com.tencent.mm.plugin.record.b.g(com.tencent.mm.kernel.g.Ei().dqq);
    this.mrJ = new com.tencent.mm.plugin.record.b.e(com.tencent.mm.kernel.g.Ei().dqq);
  }
  
  public void onAccountRelease() {}
  
  public void parallelsDependency() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/record/PluginRecord.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */