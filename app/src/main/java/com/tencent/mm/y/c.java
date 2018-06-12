package com.tencent.mm.y;

import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;

public class c
  extends d
{
  public String dwg;
  public String dwh;
  public String dwi;
  
  public final d FD()
  {
    return new c();
  }
  
  public final void a(StringBuilder paramStringBuilder, g.a parama, String paramString, keep_SceneResult paramkeep_SceneResult, int paramInt1, int paramInt2) {}
  
  public final void a(Map<String, String> paramMap, g.a parama)
  {
    if (parama.type == 2001)
    {
      this.dwg = bi.oV((String)paramMap.get(".msg.appmsg.wcpayinfo.locallogoicon"));
      this.dwh = bi.oV((String)paramMap.get(".msg.appmsg.wcpayinfo.localbubbleicon"));
      this.dwi = bi.oV((String)paramMap.get(".msg.appmsg.wcpayinfo.effectresource"));
      x.i("MicroMsg.AppContentC2cMsgPiece", "locallogoicon: %s, localbubbleicon: %s, effectResource: %s", new Object[] { this.dwg, this.dwh, this.dwi });
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/y/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */