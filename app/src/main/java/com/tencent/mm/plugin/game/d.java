package com.tencent.mm.plugin.game;

import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.a.b;
import com.tencent.mm.plugin.game.model.am;
import com.tencent.mm.plugin.game.model.v;
import com.tencent.mm.plugin.game.model.y;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;

public final class d
  implements com.tencent.mm.kernel.api.bucket.c, b
{
  private com.tencent.mm.plugin.game.model.c jFN;
  private am jFO;
  private y jFP;
  private v jFQ;
  
  public final com.tencent.mm.plugin.game.model.c aSf()
  {
    g.Eg().Ds();
    if (this.jFN == null) {
      this.jFN = new com.tencent.mm.plugin.game.model.c();
    }
    return this.jFN;
  }
  
  public final am aSg()
  {
    g.Eg().Ds();
    if (this.jFO == null) {
      this.jFO = new am();
    }
    return this.jFO;
  }
  
  public final y aSh()
  {
    g.Eg().Ds();
    if (this.jFP == null) {
      this.jFP = new y();
    }
    return this.jFP;
  }
  
  public final v aSi()
  {
    g.Eg().Ds();
    if (this.jFQ == null) {
      this.jFQ = new v();
    }
    return this.jFQ;
  }
  
  public final void onAccountInitialized(e.c paramc)
  {
    x.i("MicroMsg.GameService", "GameService onAccountInitialized");
    this.jFN = new com.tencent.mm.plugin.game.model.c();
    this.jFO = new am();
    this.jFP = new y();
    this.jFQ = new v();
  }
  
  public final void onAccountRelease()
  {
    x.i("MicroMsg.GameService", "GameService onAccountRelease");
    Object localObject;
    if (this.jFO != null)
    {
      localObject = this.jFO;
      if (((am)localObject).jOe != null) {
        ((am)localObject).jOe.clear();
      }
      g.DF().b(427, (e)localObject);
    }
    if (this.jFP != null)
    {
      localObject = this.jFP;
      g.DF().b(1223, (e)localObject);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */