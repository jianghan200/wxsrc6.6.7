package com.tencent.mm.plugin.sns.model;

import com.tencent.mm.sdk.platformtools.ag;
import junit.framework.Assert;

public abstract class h<Params, Progress, Result>
{
  private boolean bTv = false;
  ag handler = af.aRu();
  
  public abstract ag bxH();
  
  public abstract Result bxI();
  
  public final boolean o(Params... paramVarArgs)
  {
    if (this.bTv) {
      Assert.assertTrue("MicroMsg.MMAsyncTask Should construct a new Task", false);
    }
    this.bTv = true;
    ag localag = bxH();
    if (localag == null) {
      return false;
    }
    localag.post(new h.1(this, paramVarArgs));
    return true;
  }
  
  public void onPostExecute(Result paramResult) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sns/model/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */