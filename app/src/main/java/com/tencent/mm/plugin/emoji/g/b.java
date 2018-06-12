package com.tencent.mm.plugin.emoji.g;

import com.tencent.mm.protocal.c.ta;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public final class b
{
  public static ArrayList<ta> zF(String paramString)
  {
    if (bi.oW(paramString)) {
      x.w("MicroMsg.emoji.EmojiBackupXMLParser", "[backup emotion parser] parse xml faild. xml is null.");
    }
    for (;;)
    {
      return null;
      Object localObject1 = DocumentBuilderFactory.newInstance();
      try
      {
        paramString = ((DocumentBuilderFactory)localObject1).newDocumentBuilder().parse(new InputSource(new ByteArrayInputStream(paramString.getBytes())));
        paramString.normalize();
        paramString = paramString.getDocumentElement().getElementsByTagName("EmojiMd5");
        if ((paramString != null) && (paramString.getLength() > 0))
        {
          localObject1 = new ArrayList();
          int j = paramString.getLength();
          int i = 0;
          while (i < j)
          {
            Object localObject2 = paramString.item(i);
            ta localta = new ta();
            String str = ((Node)localObject2).getTextContent().toLowerCase();
            localObject2 = ((Node)localObject2).getAttributes();
            Node localNode = ((NamedNodeMap)localObject2).getNamedItem("thumburl");
            if (localNode != null) {
              localta.lPl = localNode.getNodeValue();
            }
            localNode = ((NamedNodeMap)localObject2).getNamedItem("cdnurl");
            if (localNode != null) {
              localta.jPK = localNode.getNodeValue();
            }
            localNode = ((NamedNodeMap)localObject2).getNamedItem("productid");
            if (localNode != null) {
              localta.rem = localNode.getNodeValue();
            }
            localNode = ((NamedNodeMap)localObject2).getNamedItem("designerid");
            if (localNode != null) {
              localta.rwl = localNode.getNodeValue();
            }
            localNode = ((NamedNodeMap)localObject2).getNamedItem("aeskey");
            if (localNode != null) {
              localta.rwn = localNode.getNodeValue();
            }
            localNode = ((NamedNodeMap)localObject2).getNamedItem("encrypturl");
            if (localNode != null) {
              localta.rwm = localNode.getNodeValue();
            }
            localObject2 = ((NamedNodeMap)localObject2).getNamedItem("activityid");
            if (localObject2 != null) {
              localta.rwq = ((Node)localObject2).getNodeValue();
            }
            localta.rwk = str;
            ((ArrayList)localObject1).add(localta);
            i += 1;
          }
          return (ArrayList<ta>)localObject1;
        }
      }
      catch (Exception paramString)
      {
        x.e("MicroMsg.emoji.EmojiBackupXMLParser", "[parser] parseXML exception:%s", new Object[] { paramString.toString() });
      }
    }
    return null;
  }
  
  public static ArrayList<String> zG(String paramString)
  {
    if (bi.oW(paramString)) {
      x.w("MicroMsg.emoji.EmojiBackupXMLParser", "[backup emotion parser] parse xml faild. xml is null.");
    }
    for (;;)
    {
      return null;
      Object localObject = DocumentBuilderFactory.newInstance();
      try
      {
        paramString = ((DocumentBuilderFactory)localObject).newDocumentBuilder().parse(new InputSource(new ByteArrayInputStream(paramString.getBytes())));
        paramString.normalize();
        paramString = paramString.getDocumentElement().getElementsByTagName("ProductID");
        if ((paramString != null) && (paramString.getLength() > 0))
        {
          localObject = new ArrayList();
          int j = paramString.getLength();
          int i = 0;
          while (i < j)
          {
            ((ArrayList)localObject).add(paramString.item(i).getTextContent());
            i += 1;
          }
          return (ArrayList<String>)localObject;
        }
      }
      catch (Exception paramString)
      {
        x.e("MicroMsg.emoji.EmojiBackupXMLParser", "[parser] parseXML exception:%s", new Object[] { paramString.toString() });
      }
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/emoji/g/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */