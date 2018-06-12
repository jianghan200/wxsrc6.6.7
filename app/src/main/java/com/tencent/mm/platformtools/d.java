package com.tencent.mm.platformtools;

import android.app.Activity;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.Set;

public final class d
{
  private o evD;
  private p evE;
  private q evF;
  private m evG;
  private n evH;
  private l evI;
  
  private static void a(e parame)
  {
    if (parame != null)
    {
      Iterator localIterator = parame.evJ.iterator();
      while (localIterator.hasNext())
      {
        Integer localInteger = (Integer)localIterator.next();
        g.DF().b(localInteger.intValue(), parame);
      }
      parame.activity = null;
    }
  }
  
  public final boolean a(Activity paramActivity, ah paramah)
  {
    if ((paramah.type == 0) || (paramah.action == 0)) {
      return false;
    }
    if (this.evI == null) {
      this.evI = new l(paramActivity);
    }
    if (this.evI.a(paramah)) {
      return true;
    }
    switch (paramah.type)
    {
    default: 
      x.e("MicroMsg.BaseErrorHelper", "Unkown error type");
      return false;
    case 1: 
      if (this.evD == null) {
        this.evD = new o(paramActivity);
      }
      this.evD.a(paramah);
      return false;
    case 2: 
      if (this.evE == null) {
        this.evE = new p(paramActivity);
      }
      this.evE.a(paramah);
      return false;
    case 3: 
      if (this.evF == null) {
        this.evF = new q(paramActivity);
      }
      this.evF.a(paramah);
      return false;
    case 4: 
      if (this.evG == null) {
        this.evG = new m(paramActivity);
      }
      this.evG.a(paramah);
      return false;
    case 5: 
      if (this.evH == null) {
        this.evH = new n(paramActivity);
      }
      this.evH.a(paramah);
      return false;
    }
    if (this.evI == null) {
      this.evI = new l(paramActivity);
    }
    this.evI.a(paramah);
    return false;
  }
  
  public final void close()
  {
    a(this.evD);
    a(this.evE);
    a(this.evF);
    a(this.evG);
    a(this.evH);
    a(this.evI);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/platformtools/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */