package com.tencent.mm.plugin.brandservice.ui.base;

import com.tencent.mm.plugin.brandservice.ui.c.b;
import java.util.List;

public abstract class a
  extends com.tencent.mm.ui.base.sortview.a
{
  protected c.b hoA;
  public List<String> hqc;
  protected int hqd;
  protected int position;
  
  public a(int paramInt, Object paramObject)
  {
    super(paramInt, paramObject);
  }
  
  public final c.b avb()
  {
    return this.hoA;
  }
  
  public final int avc()
  {
    return this.hqd;
  }
  
  public final int getPosition()
  {
    return this.position;
  }
  
  public final void ny(int paramInt)
  {
    this.hqd = paramInt;
  }
  
  public final void setPosition(int paramInt)
  {
    this.position = paramInt;
  }
  
  public final void setReporter(c.b paramb)
  {
    this.hoA = paramb;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/brandservice/ui/base/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */