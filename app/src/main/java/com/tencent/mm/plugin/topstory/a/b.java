package com.tencent.mm.plugin.topstory.a;

import com.tencent.mm.kernel.b.d;
import com.tencent.mm.protocal.c.bth;

public abstract interface b
  extends d
{
  public abstract e getRedDotMgr();
  
  public abstract f getReporter();
  
  public abstract void onVideoListUICreate();
  
  public abstract void onVideoListUIDestroy(bth parambth);
  
  public abstract void onVideoListUIPause();
  
  public abstract void onVideoListUIResume();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/topstory/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */