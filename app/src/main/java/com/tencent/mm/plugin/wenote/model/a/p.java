package com.tencent.mm.plugin.wenote.model.a;

import java.io.Serializable;

public final class p
  implements Serializable
{
  public boolean qpf = false;
  public long qpg = -1L;
  public long qph = -1L;
  public boolean qpi = false;
  public String qpj = "";
  public String qpk = "";
  public int qpl = 0;
  public int qpm = 0;
  
  public final String bZi()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("topIsOpenFromSession=").append(this.qpf).append(" topLocalId=").append(this.qpg).append(" topMsgId=").append(this.qph).append(" topTitle=").append(this.qpj).append(" topNoteXml=").append(this.qpk).append(" topLastPosition=").append(this.qpl).append(" topLastOffset=").append(this.qpm);
    return localStringBuilder.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wenote/model/a/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */