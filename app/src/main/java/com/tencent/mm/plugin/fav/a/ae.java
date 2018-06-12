package com.tencent.mm.plugin.fav.a;

import com.tencent.mm.kernel.b.d;
import com.tencent.mm.protocal.c.wd;
import com.tencent.mm.protocal.c.wo;
import java.util.List;

public abstract interface ae
  extends d
{
  public abstract void checkFavItem(wo paramwo);
  
  public abstract void checkFavItem(List<wd> paramList);
  
  public abstract r getCheckCdnService();
  
  public abstract u getEditService();
  
  public abstract o getFavCdnService();
  
  public abstract q getFavCdnStorage();
  
  public abstract s getFavConfigStorage();
  
  public abstract t getFavEditInfoStorage();
  
  public abstract x getFavItemInfoStorage();
  
  public abstract aa getFavSearchStorage();
  
  public abstract l getFavTagSetMgr();
  
  public abstract z getModService();
  
  public abstract ac getSendService();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/fav/a/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */