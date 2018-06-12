package com.tencent.mm.plugin.card.b;

import com.tencent.mm.a.o;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.y.g.a;
import java.util.Map;

public final class h
{
  public int dxI;
  public String dxJ;
  public String dxK;
  public String dxL;
  public String dxM;
  public String dxN;
  public String dxO;
  public String dxP;
  public int ver;
  
  public static h b(g.a parama)
  {
    parama = parama.dzf;
    h localh = new h();
    localh.dxJ = bi.aG((String)parama.get(".msg.appmsg.giftcard_info.order_id"), "");
    localh.dxI = o.cx((String)parama.get(".msg.appmsg.giftcard_info.biz_uin"));
    localh.dxK = bi.aG((String)parama.get(".msg.appmsg.giftcard_info.app_name"), "");
    localh.dxL = bi.aG((String)parama.get(".msg.appmsg.giftcard_info.recv_digest"), "");
    localh.dxM = bi.aG((String)parama.get(".msg.appmsg.giftcard_info.send_digest"), "");
    localh.dxN = bi.aG((String)parama.get(".msg.appmsg.giftcard_info.background_pic_url"), "");
    localh.dxO = bi.aG((String)parama.get(".msg.appmsg.giftcard_info.title_color"), "");
    localh.dxP = bi.aG((String)parama.get(".msg.appmsg.giftcard_info.des_color"), "");
    localh.ver = o.cx((String)parama.get(".msg.appmsg.giftcard_info.ver"));
    return localh;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/card/b/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */