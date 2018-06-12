package com.tencent.mm.model;

import com.tencent.mm.ab.d;
import com.tencent.mm.ab.d.a;
import com.tencent.mm.ab.d.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.ar.k;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import java.io.ByteArrayInputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public final class bz
  implements d
{
  public final d.b b(d.a parama)
  {
    parama = parama.dIN;
    if ((parama == null) || (parama.rcl == null))
    {
      x.f("MicroMsg.UpdatePackageMsgExtension", "[oneliang]UpdatePackageMsgExtension failed, invalid cmdAM");
      return null;
    }
    x.i("MicroMsg.UpdatePackageMsgExtension", "[oneliang]UpdatePackageMsgExtension start");
    parama = ab.a(parama.rcl);
    Object localObject = DocumentBuilderFactory.newInstance();
    for (;;)
    {
      int i;
      try
      {
        parama = ((DocumentBuilderFactory)localObject).newDocumentBuilder().parse(new InputSource(new ByteArrayInputStream(parama.getBytes("utf-8"))));
        parama.normalize();
        parama = parama.getDocumentElement().getElementsByTagName("updatepackage");
        if ((parama != null) && (parama.getLength() == 1))
        {
          parama = parama.item(0).getChildNodes();
          int j = parama.getLength();
          i = 0;
          if (i < j)
          {
            localObject = parama.item(i);
            if ((localObject == null) || (((Node)localObject).getNodeName() == null) || (!((Node)localObject).getNodeName().equals("pack"))) {
              break label270;
            }
            localObject = ((Node)localObject).getAttributes();
            if (localObject == null) {
              break label270;
            }
            localObject = ((NamedNodeMap)localObject).getNamedItem("type");
            if (localObject == null) {
              break label270;
            }
            localObject = new k(bi.getInt(((Node)localObject).getNodeValue(), 0));
            g.Eh().dpP.a((l)localObject, 0);
            break label270;
          }
        }
        x.i("MicroMsg.UpdatePackageMsgExtension", "[oneliang]UpdatePackageMsgExtension end");
        return null;
      }
      catch (Exception parama)
      {
        x.e("MicroMsg.UpdatePackageMsgExtension", "exception:%s", new Object[] { bi.i(parama) });
        return null;
      }
      label270:
      i += 1;
    }
  }
  
  public final void h(bd parambd) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/model/bz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */