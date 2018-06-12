package com.tencent.tencentmap.mapsdk.a;

import com.qq.navi.Handler;
import java.util.concurrent.LinkedBlockingQueue;

public class ba
  extends Handler
{
  private LinkedBlockingQueue<bb> a;
  
  public void a(bb parambb, bf parambf)
  {
    parambb.i = parambf;
    this.a.offer(parambb);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */