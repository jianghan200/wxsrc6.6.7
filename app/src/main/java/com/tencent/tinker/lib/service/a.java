package com.tencent.tinker.lib.service;

import java.io.Serializable;

public final class a
  implements Serializable
{
  public boolean bLW;
  public long grC;
  public Throwable vhq;
  public String vso;
  public String vsp;
  
  public final String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("\nPatchResult: \n");
    localStringBuffer.append("isSuccess:" + this.bLW + "\n");
    localStringBuffer.append("rawPatchFilePath:" + this.vso + "\n");
    localStringBuffer.append("costTime:" + this.grC + "\n");
    if (this.vsp != null) {
      localStringBuffer.append("patchVersion:" + this.vsp + "\n");
    }
    if (this.vhq != null) {
      localStringBuffer.append("Throwable:" + this.vhq.getMessage() + "\n");
    }
    return localStringBuffer.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tinker/lib/service/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */