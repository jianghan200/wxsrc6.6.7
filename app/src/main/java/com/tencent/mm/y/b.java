package com.tencent.mm.y;

import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Map;

public class b
  extends d
{
  public String bXu;
  public String dvN;
  public String dvO;
  public String dvP;
  public String dvQ;
  public String dvR;
  public String dvS;
  public String dvT;
  public String dvU;
  public String dvV;
  public String dvW;
  public String dvX;
  public String dvY;
  public String dvZ;
  public String dwa;
  public String dwb;
  public String dwc;
  public String dwd;
  public String dwe;
  public String dwf;
  
  private static String e(Map<String, String> paramMap, String paramString)
  {
    return bi.oV((String)paramMap.get(".msg.appmsg.wcpaythirdinfo." + paramString));
  }
  
  public final d FD()
  {
    return new b();
  }
  
  public final void a(StringBuilder paramStringBuilder, g.a parama, String paramString, keep_SceneResult paramkeep_SceneResult, int paramInt1, int paramInt2) {}
  
  public final void a(Map<String, String> paramMap, g.a parama)
  {
    if (parama.type == 2002)
    {
      this.dvN = e(paramMap, "templateid");
      this.dvO = e(paramMap, "senderurl");
      this.dvP = e(paramMap, "sendernativeurl");
      this.dvQ = e(paramMap, "receiverurl");
      this.dvR = e(paramMap, "receivernativeurl");
      this.dvS = e(paramMap, "iconurl");
      this.dvT = e(paramMap, "miniiconurl");
      this.dvU = e(paramMap, "backgroundurl");
      this.dvV = e(paramMap, "backgroundname");
      this.dvW = e(paramMap, "backgroundcolor");
      this.dvX = e(paramMap, "receivertitle");
      this.dvY = e(paramMap, "sendertitle");
      this.dvZ = e(paramMap, "titlecolor");
      this.dwa = e(paramMap, "senderscenetext");
      this.dwb = e(paramMap, "receiverscenetext");
      this.dwc = e(paramMap, "senderdes");
      this.dwd = e(paramMap, "receiverdes");
      this.dwe = e(paramMap, "descolor");
      this.dwf = e(paramMap, "sceneid");
      this.bXu = e(paramMap, "paymsgid");
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/y/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */