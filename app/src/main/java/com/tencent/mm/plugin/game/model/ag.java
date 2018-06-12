package com.tencent.mm.plugin.game.model;

import com.tencent.mm.bk.a;
import com.tencent.mm.plugin.game.d.as;
import com.tencent.mm.plugin.game.d.bh;
import com.tencent.mm.plugin.game.d.p;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;

public final class ag
  extends ac
{
  private bh jNL;
  
  public ag(a parama)
  {
    if (parama == null)
    {
      this.jNL = new bh();
      return;
    }
    this.jNL = ((bh)parama);
  }
  
  public ag(byte[] paramArrayOfByte)
  {
    this.jNL = new bh();
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      return;
    }
    try
    {
      this.jNL.aG(paramArrayOfByte);
      return;
    }
    catch (IOException paramArrayOfByte)
    {
      x.e("MicroMsg.GamePBDataDownloadGuidance", "Parsing Failed: %s", new Object[] { paramArrayOfByte.getMessage() });
    }
  }
  
  public final p aUr()
  {
    if (this.jNL != null) {
      return this.jNL.jRU;
    }
    return null;
  }
  
  public final as aUs()
  {
    if (this.jNL != null) {
      return this.jNL.jRV;
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/model/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */