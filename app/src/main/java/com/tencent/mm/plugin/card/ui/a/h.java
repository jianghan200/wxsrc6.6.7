package com.tencent.mm.plugin.card.ui.a;

import android.text.TextUtils;
import com.tencent.mm.plugin.card.ui.e.a;
import com.tencent.mm.protocal.c.lf;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;

public final class h
  extends a
{
  public h(MMActivity paramMMActivity)
  {
    super(paramMMActivity);
  }
  
  public final boolean azC()
  {
    return false;
  }
  
  public final boolean azD()
  {
    return false;
  }
  
  public final boolean azE()
  {
    if (super.azE()) {}
    while ((azF()) || ((this.htQ.avS()) && (this.hHc))) {
      return true;
    }
    return false;
  }
  
  public final boolean azF()
  {
    return (!this.hHc) && (this.htQ.awm().rod == 1);
  }
  
  protected final void azg()
  {
    super.azg();
  }
  
  public final boolean azq()
  {
    ArrayList localArrayList = com.tencent.mm.plugin.card.sharecard.a.b.xv(this.htQ.awr());
    if (((!this.hCv.hvg) || (this.hCv.hop == 4)) && (!TextUtils.isEmpty(this.htQ.aws()))) {}
    while (((this.hCv.hvg) && (localArrayList != null) && (localArrayList.size() > 0)) || ((!TextUtils.isEmpty(this.htQ.aws())) && (azr()))) {
      return true;
    }
    return false;
  }
  
  public final boolean azr()
  {
    return this.hCv.hop == 3;
  }
  
  public final boolean azs()
  {
    return false;
  }
  
  public final boolean azu()
  {
    return this.hHc;
  }
  
  public final boolean azv()
  {
    return false;
  }
  
  public final boolean azx()
  {
    return false;
  }
  
  public final boolean azy()
  {
    return (this.hHc) && (super.azy());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/card/ui/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */